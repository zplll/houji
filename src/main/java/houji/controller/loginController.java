package houji.controller;

import com.sun.deploy.net.HttpResponse;
import houji.bean.BaseResponse;
import org.springframework.http.HttpRequest;
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

    @RequestMapping("/login")
    @ResponseBody
    public BaseResponse login(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        BaseResponse baseResponse = null ;
        String username = request.getParameter("username");
        String passwd = request.getParameter("password");
    }
}
