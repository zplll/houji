package houji.dao;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import houji.bean.CodeEnum;
import houji.bean.UserInfo;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zipon on 2017/3/7.
 */
public class UserInfoOperator extends BaseOperator {
    private static UserInfoOperator instance = new UserInfoOperator();
    private UserInfoOperator(){

    }
    public static UserInfoOperator getInstance(){
        return  instance;
    }

    public UserInfo selectUserByName(String name){
        SqlSession ss = ssf.openSession();
        UserInfo user = null;
        try {
            user = ss.selectOne("houji.mapper.UserInfo.selectUserByName", name);
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
        return  user;
    }

    public JSONObject loginCheck(String nameOrEmail, String password){
        SqlSession ss = ssf.openSession();
        JSONObject result =new JSONObject();
        UserInfo user = null;
        try {
            user = ss.selectOne("houji.mapper.UserInfo.selectUserByName", nameOrEmail);
            if(user==null){
                user = ss.selectOne("houji.mapper.UserInfo.selectUserByEmail", nameOrEmail);
            }
            if (user==null){
                result.put("code", CodeEnum.ERROR.getCode());
                result.put("message","用户不存在，请仔细检查账户信息！");
                return result;
            }else if(!user.getPassword().equals(password)){
                result.put("code", CodeEnum.ERROR.getCode());
                result.put("message","密码不正确！");
                return result;
            }else{
                result.put("code",CodeEnum.SUCCESS.getCode());
                result.put("message","登录成功！");
                result.put("data" , JSON.toJSON(user));
                return result;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            ss.close();
        }
        return  result;
    }
}
