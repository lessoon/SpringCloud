package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lidu
 * @version 2018-06-23 01:58
 */
@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumer-index",method = RequestMethod.GET)
    public String index(){
        String producer = "http://PRODUCER/hello";
        return restTemplate.getForEntity(producer,String.class).getBody();
    }

}

