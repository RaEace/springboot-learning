package myfirstwebapp.controller;

import myfirstwebapp.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger log = LoggerFactory.getLogger(getClass());

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String goToLoginPage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(loginService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMsg", "invalidCredential");
        return "login";
    }
}
