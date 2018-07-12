package com.bfeng.normal.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@Slf4j
public class CommonController {


    @GetMapping("/normal")
    public String normal() {
        return "Hello world!";
    }

    @GetMapping("/special")
    public String special() {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "Current time is: " + sdf.format(d);
    }

}
