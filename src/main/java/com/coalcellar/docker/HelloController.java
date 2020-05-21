package com.coalcellar.docker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello, world";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name, Model model) {
        return "helloName";
    }
}
