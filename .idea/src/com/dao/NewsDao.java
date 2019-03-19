package com.dao;


import com.entity.NewsEntity;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NewsDao extends BaseHibernateDAO{
    public void save(NewsEntity transientInstance) {

        try {
            getSession().beginTransaction();
            getSession().save(transientInstance);
            getSession().beginTransaction().commit();

        } catch (RuntimeException re) {

            throw re;
        }
    }
    public Boolean updateState(NewsEntity newsEntity)
    {
        try {
            getSession().beginTransaction();
            getSession().update(newsEntity);
            getSession().beginTransaction().commit();
            return true;
        } catch (RuntimeException re) {
            throw re;
        }
    }
    public List findAll() {
        try {
            String queryString = "from com.entity.NewsEntity ";
            Query queryObject = getSession().createQuery(queryString);
            return queryObject.list();
        } catch (RuntimeException re) {
            throw re;
        }
    }


    public NewsEntity findById(String id) {
        try {
            getSession().beginTransaction();
            NewsEntity instance = (NewsEntity) getSession().get("com.entity.NewsEntity", id);
            getSession().beginTransaction().commit();
            return instance;

        } catch (RuntimeException re) {
            throw re;
        }
    }

    public List<NewsEntity> findByState() {
        try {
            String state ="0";
            getSession().beginTransaction();
            Query query =  getSession().createQuery("from NewsEntity where state = ? ");
            query.setParameter(0, state);
            List<NewsEntity> list = query.list();
            System.out.println(list);
            getSession().beginTransaction().commit();
            return list;
            //3、遍历集合获取数据
            // NewsEntity instance = (NewsEntity) getSession().get("com.entity.NewsEntity", title);



        } catch (RuntimeException re) {
            throw re;
        }


    }
    public List<NewsEntity> findByState1() {
        try {
            String state ="1";
            getSession().beginTransaction();
            Query query =  getSession().createQuery("from NewsEntity where state = ? ");
            query.setParameter(0, state);
            List<NewsEntity> list = query.list();
            System.out.println(list);
            getSession().beginTransaction().commit();
            return list;
            //3、遍历集合获取数据
            // NewsEntity instance = (NewsEntity) getSession().get("com.entity.NewsEntity", title);



        } catch (RuntimeException re) {
            throw re;
        }


    }
    public void delete(NewsEntity persistentInstance) {
        try {
            getSession().beginTransaction();
            getSession().delete(persistentInstance);
            getSession().beginTransaction().commit();
        } catch (RuntimeException re) {
            throw re;
        }
    }

}
