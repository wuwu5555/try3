package com.weather;

//package com.controller;
//package com.rmi;
import com.entity.NewsEntity;
import com.rmi.remoteBriefNews;
import com.service.INewsService;
import com.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.*;


@Controller
@RequestMapping("/my")
public class weather {
    @Autowired
    IPersonService personService;
    @Autowired
    INewsService newsService;
    @Autowired
    NewsEntity newsEntity;

    @RequestMapping("/person8")
    public ModelAndView weather() {
        WeatherUtil weath = new WeatherUtil();

        ModelAndView mv=new ModelAndView();
        String weather = weath.getWeather("青岛");

        String len[] = weather.split("#");
        List<String> list=new ArrayList<String>();
        for (int i = 0; i < len.length; i++) {
            list.add(len[i]);
            System.out.println(len[i]);

        }

        mv.addObject("list",list);
        mv.setViewName("weather");


        return mv;


    }
}

