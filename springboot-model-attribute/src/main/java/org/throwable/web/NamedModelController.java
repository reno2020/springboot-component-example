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
 * @since 2018/1/6 18:05
 */
@Controller
public class NamedModelController {

    @ModelAttribute(value = "namedUser")
    public User populateModel(@RequestParam(name = "name") String name) {
        User user = new User();
        user.setName(name);
        return user;
    }

    @GetMapping(value = "/named")
    public String user(){
        return "named";
    }
}
