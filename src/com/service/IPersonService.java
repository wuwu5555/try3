package com.service;

import com.entity.PersonEntity;

public interface IPersonService {
    public Boolean save(PersonEntity personEntity);
    public  PersonEntity findByName(String name);
}
