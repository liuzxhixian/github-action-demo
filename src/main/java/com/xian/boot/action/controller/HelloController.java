package com.xian.boot.action.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xian
 * @description
 * @createTime 2021/9/13 18:57
 */
@RequestMapping("/hello")
@RestController
public class HelloController {


    @RequestMapping
    public Object hello() {
        Map<String,Object> map = new HashMap<>(4);
        map.put("name","lzx");
        map.put("age","22");
        map.put("gender","boy");
        map.put("job","IT");
        return JSONObject.toJSONString(map);
    }

}
