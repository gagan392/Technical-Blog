package com.gagan.technicalblog.controller;

import com.gagan.technicalblog.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWorldController {

    public static final String template = "Hello %s!";
    public static AtomicLong counter = new AtomicLong();

    //    @RequestMapping(value = "/", method = RequestMethod.GET)

    //    @ResponseBody annotation tells Spring MVC not to render a model into a view,
    //    but rather to write the returned object into the response body.

    @GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name = "name", required = false, defaultValue = "Stranger")
                                     String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
