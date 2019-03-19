package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/my")
public class person2 {
    @RequestMapping("/person2")
    public ModelAndView tiaozhuan()
    {
        ModelAndView mv=new ModelAndView();
        mv.setViewName("success");
        return mv;
    }
}
