package com.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author suyiming3333
 * @version 1.0
 * @className: HelloController
 * @description: TODO
 * @date 2022/1/14 22:59
 */

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hallo")
    public String sayHallo(){
        return "hallo docker";
    }

    @GetMapping("/hallo2")
    public String sayHallo2(){
        return "hallo docker222344";
    }
}
