package com.dao;
import com.entity.PersonEntity;
import org.springframework.stereotype.Component;

@Component
public class PersonDao extends BaseHibernateDAO {
    public void save(PersonEntity transientInstance) {

        try {
            getSession().beginTransaction();
            getSession().save(transientInstance);
            getSession().beginTransaction().commit();

        } catch (RuntimeException re) {

            throw re;
        }
    }
    public PersonEntity findByName(String name) {
        try {
            System.out.println(name);
            getSession().beginTransaction();
            System.out.println("ok");
            PersonEntity instance = (PersonEntity) getSession().get("com.entity.PersonEntity", name);
            getSession().beginTransaction().commit();
            return instance;

        } catch (RuntimeException re) {
            throw re;
        }
    }



}
