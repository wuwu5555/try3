package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/my")
public class AddNewsController {
    @Autowired
    INewsService newsService;
    @Autowired
    NewsEntity news;
    @RequestMapping("/addnews")
    public ModelAndView AddNews(String id,String name,String content,String author) {
        //模型和视图
        System.out.println(content);
        ModelAndView mv = new ModelAndView();
        news.setId(id);
        news.setName(name);
        news.setContent(content);
        news.setAuthor(author);
        news.setDate("2018-01-01");
        news.setState("0");
        if(content.equals("")||author.equals("")||name.equals("")){
            mv.setViewName("addnews");
            System.out.println("信息填写不正确！");
        }else{

            newsService.save(news);
            mv.setViewName("check");
        }

        //返回模型和视图
        return mv;
    }

}
