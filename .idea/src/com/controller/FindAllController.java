package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/my")
public class FindAllController {
    @Autowired
    INewsService newsService;
    @RequestMapping("/person4")
    public ModelAndView findAll()
    {
        ModelAndView modelAndView=new ModelAndView();
        List<NewsEntity> list;
        list=newsService.findAll();
        modelAndView.addObject("list",list);
        modelAndView.setViewName("findall");
        return modelAndView;
    }
}
