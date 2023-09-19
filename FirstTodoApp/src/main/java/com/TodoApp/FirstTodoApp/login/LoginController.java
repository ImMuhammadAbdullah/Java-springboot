package com.TodoApp.FirstTodoApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

//    private Logger logger = LoggerFactory.getLogger(getClass());
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String gotoLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotoWelcome(@RequestParam String password, @RequestParam String name, ModelMap model) {
        if (authenticationService.authenticate(name,password)) {
            model.put("name", name);
            return "welcome";
        }
        model.put("errorMessage", "Invalid credentials");
        return  "login";
    }
}
