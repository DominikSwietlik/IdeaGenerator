package ideagenerator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {

    @GetMapping("hhh")
    public String sayHello() {
        return "test";
    }
}