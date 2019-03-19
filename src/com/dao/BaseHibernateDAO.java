package com.dao;

import org.hibernate.Session;

public class BaseHibernateDAO implements IBaseHibernateDAO {
    @Override
    public Session getSession() {
        return HibernateSessionFactory.getSession();
    }
}
