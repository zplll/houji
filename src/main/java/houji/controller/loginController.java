package houji.controller;

import com.alibaba.fastjson.JSONObject;
import houji.dao.UserInfoOperator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/3/7.
 */
@Controller
public class loginController {

    @RequestMapping(value = "/login",produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String login(HttpServletRequest request, HttpServletResponse response){
        String result;
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String passwd = request.getParameter("password");
        session.setAttribute("username",username);
        session.setAttribute("password",passwd);
        result = String.valueOf(UserInfoOperator.getInstance().loginCheck(username,passwd));

        return result;
    }
}
