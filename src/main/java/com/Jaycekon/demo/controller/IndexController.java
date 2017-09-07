package com.Jaycekon.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weijie_huang on 2017/9/7.
 */
@RestController
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "hello world!";
    }
}
