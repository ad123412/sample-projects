package com.ada.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ADA on 8/5/2017.
 */

@RefreshScope
@RestController
public class MessageRestController {

    @Value("${message}")
    private String message;

    @RequestMapping(value = {"/hi/{name}"}, method = {RequestMethod.GET})
    public String hello(@PathVariable(value = "name") String name){
        return message + " " + name;
    }
}
