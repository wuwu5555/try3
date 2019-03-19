package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class AddController {
    @Autowired
    INewsService newsService;
    @Autowired

    NewsEntity newsEntity;
    @RequestMapping("/shenhe")
    public ModelAndView zengjia(String id)
    {
        ModelAndView modelAndView =new ModelAndView();
        newsEntity=newsService.findById(id);

        //System.out.println(newsEntity.getState());
        if(newsEntity!=null)
        {
            modelAndView.setViewName("manager");
            newsEntity.setState("1");
            newsService.update(newsEntity);
        }
        else
        {
            modelAndView.setViewName("shenhe");
        }

        return modelAndView;
    }
}
