package spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/first")
    public String showFirstPage(Model model) {
        model.addAttribute("username", "Клиент");
        return "first_page";
    }
}
