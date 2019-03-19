package com.controller;

import com.entity.PersonEntity;
import com.service.IPersonService;
import com.service.impl.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebMethod;
import javax.jws.WebService;

@Controller
@RequestMapping("/my")
//@WebService
public class LoginController {
    @Autowired
    IPersonService personService=new PersonService();
    @Autowired
    PersonEntity personEntity;
    @RequestMapping("/login")
   // @WebMethod
    public ModelAndView Login(String name,String password)
    {
        System.out.println(name);
        System.out.println(password);
        ModelAndView modelAndView =new ModelAndView();
        personEntity=personService.findByName(name);
        String n=personEntity.getName();
        String p=personEntity.getPassword();
        System.out.println(n);
        System.out.println(p);
        if(password.equals(p))
        {
            if(name.equals("zhang"))
            {
                modelAndView.setViewName("manager");
            }
            else {
                modelAndView.setViewName("person");
            }
        }
        else
        {
            modelAndView.setViewName("login");
        }

        return modelAndView;
    }

}
