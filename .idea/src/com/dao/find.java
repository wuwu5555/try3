package com.dao;

import com.entity.PersonEntity;

public class find {
    public void find(String name){
        PersonEntity d=new PersonEntity();
        PersonDao personDao=new PersonDao();
        //String name="zhangmin";
        d=personDao.findByName(name);
        System.out.println(d.getName());
        System.out.println(d.getPassword());
    }

}
