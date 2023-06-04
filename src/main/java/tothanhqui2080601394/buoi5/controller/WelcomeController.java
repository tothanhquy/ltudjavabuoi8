package tothanhqui2080601394.buoi5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String greeting() {
        return "welcome";
    }
    @GetMapping("/")
    public String index() {
        return "welcome";
    }
//    @GetMapping("/product")
//    public String product() {
//        return "product/index";
//    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
