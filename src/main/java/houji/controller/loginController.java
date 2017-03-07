package houji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/3/7.
 */
@Controller
public class loginController {

    @RequestMapping("/login")
    @ResponseBody
    public void login(){}
}
