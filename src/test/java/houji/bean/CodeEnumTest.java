package houji.bean;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Administrator on 2017/3/8.
 */
public class CodeEnumTest {
    @Test
    public void testGetCode() throws Exception {
        CodeEnum code = CodeEnum.ERROR;
        String cc = code.getCode();
        System.out.println(cc);
    }

}