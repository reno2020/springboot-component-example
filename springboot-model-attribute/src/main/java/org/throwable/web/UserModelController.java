package org.throwable.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.throwable.entity.User;

/**
 * @author throwable
 * @version v1.0
 * @description
 * @since 2018/1/6 18:00
 */
@Controller
public class UserModelController {

    @ModelAttribute
    public User populateModel(@RequestParam(value = "name") String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    @GetMapping(value = "/user")
    public String user() {
        return "user";
    }
}
