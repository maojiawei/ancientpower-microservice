package io.jovi.ancientpower.sentinel.controller;

import io.jovi.ancientpower.sentinel.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Title:
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * Copyright: Copyright (c) 2020
 * </p>
 *
 * @author MaoJiaWei
 * @version 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService service;

    @GetMapping("hello")
    public String hello(String msg){
        return service.sayhello(msg);
    }
}
