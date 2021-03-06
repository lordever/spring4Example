package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {
    @RequestMapping(value = {"/", "/hello"}, method = GET)
    public String hello(Model model){
        model.addAttribute("msg", "Message is done");
        return "hello";
    }
}
