package houji.dao;

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
}
