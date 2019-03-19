package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import com.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("/my")
public class ShenHeController {
    @Autowired
    IPersonService personService;
    @Autowired
    INewsService newsService;
    @Autowired
    NewsEntity newsEntity;
    @RequestMapping("/person3")
    public ModelAndView shenhe()
    {
        List<NewsEntity> list;
        ModelAndView mv=new ModelAndView();
       list=newsService.findByState();
       mv.addObject("list",list);
        mv.setViewName("shenhe");
        return mv;
    }

}
