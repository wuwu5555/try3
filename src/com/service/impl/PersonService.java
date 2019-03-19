package com.service.impl;

import com.dao.PersonDao;
import com.entity.PersonEntity;
import com.service.IPersonService;
import org.springframework.stereotype.Component;

@Component
public class PersonService implements IPersonService {
    @Override
    public Boolean save(PersonEntity personEntity) {
        PersonDao personDao=new PersonDao();
        personDao.save(personEntity);
        return true;
    }

    @Override
    public PersonEntity findByName(String name) {
        System.out.println(name);
        PersonDao personDao=new PersonDao();
        PersonEntity personEntity=null;
        personEntity= personDao.findByName(name);
        return personEntity;
    }
}
