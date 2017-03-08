package houji.dao;

import com.alibaba.fastjson.JSONObject;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Administrator on 2017/3/8.
 */
public class UserInfoOperatorForLoginTest {
    @Test
    public void testLoginCheck() throws Exception {
        JSONObject json = null;
        json = UserInfoOperator.getInstance().loginCheck("zipon","123");
        System.out.println(json);
    }

}