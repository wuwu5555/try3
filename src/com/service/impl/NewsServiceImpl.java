package com.service.impl;

import com.dao.NewsDao;
import com.entity.NewsEntity;
import com.service.INewsService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NewsServiceImpl implements INewsService {
    @Override
    public boolean save(NewsEntity news) {
        NewsDao nd = new NewsDao();
        nd.save(news);
        return true;
    }
    @Override
    public NewsEntity findById(String id) {
        NewsDao newsDao=new NewsDao();
      NewsEntity newsEntity=null;
              newsEntity= newsDao.findById(id);
        return newsEntity;
    }
   
    @Override
    public List findByState() {
        NewsDao news=new NewsDao();
        List<NewsEntity> list;
        list=news.findByState();
        return list;
    }
    @Override
    public List findByState1() {
        NewsDao news=new NewsDao();
        List<NewsEntity> list;
        list=news.findByState1();
        return list;
    }

    @Override
    public List findAll() {
        NewsDao newsDao=new NewsDao();
        List<NewsEntity> list;
        list=newsDao.findAll();
        return list;
    }

    @Override
    public Boolean update(NewsEntity newsEntity) {
        NewsDao newsDao=new NewsDao();
        newsDao.updateState(newsEntity);
        return true;
    }


}
