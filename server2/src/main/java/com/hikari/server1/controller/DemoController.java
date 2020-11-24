package com.hikari.server1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${server.port}")
    private String port;

    @Value("${info}")
    private String info;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return "port: " + port + ",Hello Nacos Discovery " + string + "||" + info;
    }
}
