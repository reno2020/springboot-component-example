package org.throwable.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/6 17:54
 */
@Controller
public class HelloModelController {

    @ModelAttribute
    public void populdateModel(@RequestParam("name")String name, Model model){
        model.addAttribute("name", name);
    }

    @GetMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
