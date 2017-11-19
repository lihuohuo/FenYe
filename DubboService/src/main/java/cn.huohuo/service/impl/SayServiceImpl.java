package cn.huohuo.service.impl;

import cn.huohuo.service.ISayService;

/**
 * Created by lenovo on 2017/8/21.
 */
public class SayServiceImpl implements ISayService {

    public String say(String name) {
        System.out.println("世界你好"+name);
        return "hello";
    }
}
