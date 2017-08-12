package com.imooc.demoweb.controller;

import com.imooc.demoweb.properties.GrilProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class HelloController {

    @Value("${cupSize}")
    private String cupSize;

    @Value("${gril.age}")
    private int age;

    @Value("${comtent}")
    private String content;

    @Autowired
    private GrilProperties grilProperties;

    //restful风格：http://localhost:8081/demoweb/say/213
    @RequestMapping(value={"/say/{id}"},method = RequestMethod.GET)
        public String say(@PathVariable("id") Integer id){
        return "index"+id;
       // return "Hello SpringBoot"+content+age+"===="+grilProperties.getName();
    }

    //http://localhost:8081/demoweb/say?id=12
    //required是否为必传，defaultValue：id默认值为0
    @RequestMapping(value={"/say"},method = RequestMethod.GET)
    @GetMapping(value="/say")
    public String hi(@RequestParam(value="id",required=false,defaultValue = "0") Integer id){
        return ""+id;
        // return "Hello SpringBoot"+content+age+"===="+grilProperties.getName();
    }


}
