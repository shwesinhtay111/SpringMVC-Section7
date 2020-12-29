package ssh.study.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping({"","/", "/index"})
    public String getIndexPage(){
        return "index" ;
    }
}
