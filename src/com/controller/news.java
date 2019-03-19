package com.controller;

import com.entity.NewsEntity;
import com.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class news {
    @Autowired
    INewsService newsService;
    @WebMethod
    public List<NewsEntity> newpublish(){
        List<NewsEntity> list;
        list=newsService.findAll();
        return  list;
    }



}
