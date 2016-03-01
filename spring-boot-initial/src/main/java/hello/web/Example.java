package hello.web;

import hello.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
@EnableAutoConfiguration
public class Example {

    @Autowired
    MyService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    String home() {
        return "Hello Spring Boot World!";
    }

    @RequestMapping(value = "/{pathParam}", method = RequestMethod.GET)
    String parameterized(@PathVariable String pathParam) {
        return "Hello Spring Boot World 7! PathParam: " + pathParam + ", services " + service.getNames();
    }
}