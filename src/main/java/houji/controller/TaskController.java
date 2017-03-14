package houji.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import houji.bean.Task;
import houji.dao.TaskOperator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zipon on 2017/3/12.
 */
@Controller
@RequestMapping("task")
public class TaskController {
    @RequestMapping(value = "selectbyleader",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String selectTasks(HttpServletRequest request, HttpServletResponse response){
        TypeUtils.compatibleWithJavaBean = true;
        HttpSession session = request.getSession();
        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        String username = (String) session.getAttribute("username");
        List<Task> tasks = TaskOperator.getInstance().selectTasksByLeader(username);
        List<String> columns = new ArrayList<String>();

        //利用反射取类中的属性字段
        try {
            Class  clazz = Class.forName("houji.bean.Task");
            Field[] fields = clazz.getDeclaredFields();
            for(Field field:fields){
                columns.add(field.getName());
            }
            //System.out.println(columns);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //组装result
        result.put("columns",columns);
        if(tasks!=null){
            result.put("details",tasks);
        }
        //String temp = String.valueOf(result);
        //System.out.println(temp);
        return String.valueOf(result);
    }
}
