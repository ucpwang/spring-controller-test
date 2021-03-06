package com.springapp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "hello";
    }

    @RequestMapping(value = "/test1", method = RequestMethod.GET)
    public String test1(@RequestParam(value = "name", required = true) String name) {

        helloService.hello(name);

        return "test1";
    }
}