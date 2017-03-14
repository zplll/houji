package houji.bean;

import org.testng.annotations.Test;

import java.lang.reflect.Field;

import static org.testng.Assert.*;

/**
 * Created by zipon on 2017/3/13.
 */
public class TaskTest {
    @Test
    public void testGetCustomer() throws Exception {
        Class clazz = Class.forName("houji.bean.Task");
        Field[] fs = clazz.getDeclaredFields();
        for(Field f:fs){
            System.out.println(f.getName());
        }
    }

}