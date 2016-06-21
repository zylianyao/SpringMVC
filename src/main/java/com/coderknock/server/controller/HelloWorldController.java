package com.coderknock.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 拿客 www.coderknock.com
 * 三产 创建于 2016年06月19日 21:47:13。
 */
@Controller
public class HelloWorldController {
    /**
     * 1、用@RequestMapping来映射请求的URL
     * 2、返回值会通过视图解析器解析为实际的物理视图，对于org.springframework.web.servlet.view.
     * InternalResourceViewResolver视图解析器，会做如下解析：
     *     prefix【在springmvc.xml中配置的prefix值】+下面return返回的值+suffix【在springmvc.xml中配置的suffix值】
     * @return
     */
    @RequestMapping("/helloworld")
    public String hello() {
        return "hello";
    }


    /**
     * 1、用@RequestMapping来映射请求的URL
     * 2、返回值会通过视图解析器解析为实际的物理视图，对于org.springframework.web.servlet.view.
     * InternalResourceViewResolver视图解析器，会做如下解析：
     *     prefix【在springmvc.xml中配置的prefix值】+下面return返回的值+suffix【在springmvc.xml中配置的suffix值】
     * @return
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("abc")
    public String abc(){ return "abc";}
}
