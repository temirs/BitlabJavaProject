package shop.spirng.bitlab.kz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnimalController {

    @GetMapping(value = "/")
    public String home(Model model) {
        return "home";
    }
}
