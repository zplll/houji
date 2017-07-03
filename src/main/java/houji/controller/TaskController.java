package houji.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.TypeUtils;
import houji.bean.Task;
import houji.bean.UserInfo;
import houji.bean.model.TaskModel;
import houji.dao.BaseOperator;
import houji.dao.TaskModelMapper;
import houji.dao.TaskOperator;
import houji.dao.UserInfoOperator;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;

/**
 * Created by zipon on 2017/3/12.
 */
@Controller
@RequestMapping("task")
public class TaskController {
    @RequestMapping(value = "selectbyleader",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String selectTasks(HttpServletRequest request){
        TypeUtils.compatibleWithJavaBean = true;
        HttpSession session = request.getSession();
        JSONObject result = new JSONObject();
        //JSONObject data = new JSONObject();
        String username = (String) session.getAttribute("username");
        UserInfo user = UserInfoOperator.getInstance().selectUserByName(username);
        String roleId = user.getRoleId();

        List<TaskModel> tasks = TaskOperator.getInstance().selectTasksByLeader(username);
        List<String> columns = new ArrayList<String>();

        if(roleId!=null&&roleId.equals("admin")){
            tasks = TaskOperator.getInstance().selectAll();
        }

        //利用反射取类中的属性字段
        try {
            Class  clazz = Class.forName("houji.bean.model.TaskModel");
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

    @RequestMapping(value = "updatetask",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    @ResponseBody
    public String updateTask(@RequestBody TaskModel taskModel){
        //@RequestBody
        SqlSessionFactory sqlSessionFactory = BaseOperator.ssf;
        SqlSession ss = sqlSessionFactory.openSession();

        TaskModelMapper taskModelMapper = ss.getMapper(TaskModelMapper.class);
        int sqlresult=taskModelMapper.updateByPrimaryKey(taskModel);
        System.out.println(getType(taskModel.getBonus()));
        //System.out.println(taskModel.getBonus());
        ss.commit();
        JSONObject result = new JSONObject();
        if (sqlresult==1){
            result.put("message","success");
        }else {
            result.put("message","failed");
        }
        return String.valueOf(result);
    }

    @RequestMapping(value = "inserttask",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    @ResponseBody
    public String insertTask(@RequestBody TaskModel taskModel){
        //@RequestBody
        SqlSessionFactory sqlSessionFactory = BaseOperator.ssf;
        SqlSession ss = sqlSessionFactory.openSession();

        TaskModelMapper taskModelMapper = ss.getMapper(TaskModelMapper.class);
        int sqlresult=taskModelMapper.insert(taskModel);
        System.out.println(getType(taskModel.getBonus()));
        //System.out.println(taskModel.getBonus());
        ss.commit();
        JSONObject result = new JSONObject();
        if (sqlresult==1){
            result.put("message","success");
        }else {
            result.put("message","failed");
        }
        return String.valueOf(result);
    }
}
