package com.service;

import com.entity.NewsEntity;

import java.util.List;

public interface INewsService {
    public boolean save(NewsEntity news);
    public NewsEntity findById(String id);
    public List findByState();
    public List findByState1();
    public List findAll();
    public  Boolean update(NewsEntity newsEntity);
}
