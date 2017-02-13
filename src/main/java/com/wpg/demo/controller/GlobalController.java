package com.wpg.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author ChangWei Li
 * @version 2017-02-13 08:49
 */
@RestController
public class GlobalController {

    @RequestMapping("/")
    public String hello(HttpServletResponse response) {
        response.setHeader("Server", "Spring Boot");
        return "Spring Boot Powered !";
    }

}
