package houji.dao;

import houji.bean.UserInfo;

import static org.testng.Assert.*;

/**
 * Created by zipon on 2017/3/7.
 */
public class UserInfoOperatorTest {
    @org.testng.annotations.Test
    public void testSelectUserByName() throws Exception {
        UserInfo user = UserInfoOperator.getInstance().selectUserByName("zipon");
        if(user!=null) {
            System.out.println(user.toString());
        }else{
            System.out.println("没有该用户");
        }
    }

}