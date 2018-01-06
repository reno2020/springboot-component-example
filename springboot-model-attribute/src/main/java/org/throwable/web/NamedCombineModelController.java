package org.throwable.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.throwable.entity.User;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/6 18:10
 */
@Slf4j
@Controller
public class NamedCombineModelController {

    @ModelAttribute(value = "namedUser")
    public User populateModel(@RequestParam(value = "name") String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    @GetMapping(value = "/named/combine")
    public String user(@ModelAttribute(value = "namedUser") User user, Model model) {
        log.info("user name --> {}", user.getName());
        model.addAttribute("namedUser", user);
        return "named_combine";
    }
}
