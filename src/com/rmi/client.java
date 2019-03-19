//package com.controller;
package com.rmi;
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
public class client {
    @Autowired
    IPersonService personService;
    @Autowired
    INewsService newsService;
    @Autowired
    NewsEntity newsEntity;
    @RequestMapping("/person7")
    public ModelAndView zhaiyao() throws RemoteException, NotBoundException, MalformedURLException {
        ModelAndView mv=new ModelAndView();
        //获取远程服务,这里注意一下端口必须跟服务端设置的一致
        remoteBriefNews remote = (remoteBriefNews) Naming.lookup("rmi://127.0.0.1:6600/remotebreifnews");
        //调用远程方法
        List<String> list= remote.getBriefNews();
        System.out.println(list);
       mv.addObject("list",list);
        mv.setViewName("newszhaiyao");


        return mv;
    }

}
