package NhomChuyenCan.testDA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class XeController {

    @GetMapping("/xe")
    public String show(){
        return "list";
    }
    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/detail")
    public String xe(){
        return "photo-detail";
    }
}
