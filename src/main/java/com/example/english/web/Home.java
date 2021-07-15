package com.example.english.web;

import com.example.english.entity.Kaoyan;
import com.example.english.service.impl.KaoyanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @Autowired
    KaoyanServiceImpl kaoyanService;

    @RequestMapping("/test")
    @ResponseBody
    public Object index(Integer id){
        if(id==null){
            return "输入参数错误！";
        }
        Kaoyan kaoyan=kaoyanService.selectById(id);
        return kaoyan!=null?kaoyan:"未查询到数据！";
    }
}
