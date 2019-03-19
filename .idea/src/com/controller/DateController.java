package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import com.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;


@Controller
@RequestMapping("/my")
public class DateController {
    @Autowired
    IPersonService personService;
    @Autowired
    INewsService newsService;
    @Autowired
    NewsEntity newsEntity;
    @RequestMapping("/person6")
    public ModelAndView shenhe()
    {
        List<NewsEntity> list;
        ModelAndView mv=new ModelAndView();
        list=newsService.findAll();

        List<String>  date1=new ArrayList<String>();
        for(int i=0;i<list.size();i++)
        {
            date1.add(i,list.get(i).getDate());


            }
        for(int i=0;i<date1.size();i++)
        {
            System.out.println(date1.get(i));
        }

        List<NewsEntity> list1=new ArrayList<NewsEntity>();
        List<NewsEntity> list2=new ArrayList<NewsEntity>();
        List<NewsEntity> list3=new ArrayList<NewsEntity>();
        List<NewsEntity> list4=new ArrayList<NewsEntity>();
        List<NewsEntity> list5=new ArrayList<NewsEntity>();

        for(int i=0;i<date1.size()-1;i++){
            System.out.println(date1.get(i)+date1.get(i+1));

            if(date1.get(i+1).equals(date1.get(i)))
            {
                System.out.println("1");
                date1.remove(i);
                if(i!=0&&date1.get(i-1).equals(date1.get(i)))
                    date1.remove(i-1);
            }

        }
        for(int i=0;i<date1.size();i++)
        {
            System.out.println(date1.get(i));
        }


        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getDate().equals(date1.get(0)))
            list1.add(list.get(i));
        }

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getDate().equals(date1.get(1)))
                list2.add(list.get(i));
        }

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getDate().equals(date1.get(2)))
                list3.add(list.get(i));
        }

        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getDate().equals(date1.get(3)))
                list4.add(list.get(i));
        }
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getDate().equals(date1.get(4)))
                list5.add(list.get(i));
        }

        long con1=(long)list1.size();
        long con2=(long)list2.size();
        long con3=(long)list3.size();
        long con4=(long)list4.size();
        long con5=(long)list5.size();
        //ModelAndView modelAndView;
        mv.addObject("con1",con1);
        mv.addObject("con2",con2);
        mv.addObject("con3",con3);
        mv.addObject("con4",con4);
        mv.addObject("con5",con5);
       // mv.addObject("list",list);
        mv.addObject("list1",list1);
        mv.addObject("list2",list2);
        mv.addObject("list3",list3);
        mv.addObject("list4",list4);
        mv.addObject("list5",list5);







        mv.setViewName("date");


        return mv;
    }

}
