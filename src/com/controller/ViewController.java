package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("ViewController")
@RequestMapping("/my")
public class ViewController {
    @Autowired
    INewsService newsService;
    @RequestMapping("/success")
    public ModelAndView View(String id) {
        //模型和视图
        ModelAndView mv = new ModelAndView();
        NewsEntity newsEntity;
                newsEntity=newsService.findById(id);
        if(newsEntity!=null)
        {
            String name=newsEntity.getName();
            String content=newsEntity.getContent();
            System.out.println("从数据库中显示：");
            System.out.println(id);
            System.out.println(name);
            System.out.println(content);
            mv.addObject("lid",id);
            mv.addObject("lname",name);
            mv.addObject("lcontent",content);
            mv.setViewName("find");
        }
        else {
            mv.setViewName("success");
        }
        //视图逻辑名称为index

        //返回模型和视图
        return mv;
    }
}
