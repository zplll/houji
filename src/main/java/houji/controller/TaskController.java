package houji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zipon on 2017/3/12.
 */
@Controller
@RequestMapping("task")
public class TaskController {
    @RequestMapping(value = "selectbyleader",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String selectTasks(HttpServletRequest request, HttpServletResponse response){
        return "sss";
    }
}
