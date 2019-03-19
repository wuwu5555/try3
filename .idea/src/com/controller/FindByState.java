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
public class FindByState {
    @Autowired
    IPersonService personService;
    @Autowired
    INewsService newsService;
    @Autowired
    NewsEntity newsEntity;
    @RequestMapping("/person5")
    public ModelAndView shenhe()
    {
        List<NewsEntity> list,list1;
        ModelAndView mv=new ModelAndView();

        list=newsService.findByState();
        list1=newsService.findByState1();
       // NewsEntity n=new NewsEntity();
        long con1=(long)list.size();
        long con2=(long)list1.size();

        //ModelAndView modelAndView;
        mv.addObject("con1",con1);
        mv.addObject("con2",con2);

        mv.addObject("list",list);
        mv.addObject("list1",list1);
        mv.setViewName("state");


        return mv;
    }

}
