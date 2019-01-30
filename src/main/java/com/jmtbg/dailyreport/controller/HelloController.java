package com.jmtbg.dailyreport.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

import static com.jmtbg.dailyreport.common.constant.ControllerUrls.CLIENT_API_URI;

/**
 * @author sjw
 * @date 2019/1/18
 */


@Api(value = "Hello", tags = "Hello")
@RestController
@RequestMapping(CLIENT_API_URI)
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public synchronized void hello() {
        try {
            System.out.println("开始睡眠");
            Thread t = Thread.currentThread();
            System.out.println(t.getName());
            TimeUnit.SECONDS.sleep(10);
            System.out.println("结束睡眠");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

