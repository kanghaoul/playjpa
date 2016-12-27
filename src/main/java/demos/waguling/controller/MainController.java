package demos.waguling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kikig on 2016-12-26.
 */
@Controller
public class MainController {


    @RequestMapping("/")
    public String Index(Model model) throws Exception {

        System.out.println("index");

        return "home";
    }


    @RequestMapping("/main.do")
    public String Main(Model model) throws Exception {

        System.out.println("main");

        return "home";
    }


}
