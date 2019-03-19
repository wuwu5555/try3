package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class persson1 {
    @RequestMapping("/person1")
    public ModelAndView tiaozhuan()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("addnews");
        return mv;
    }
}
