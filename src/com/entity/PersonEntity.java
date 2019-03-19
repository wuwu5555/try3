package com.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;
@Component
@Entity
@Table(name = "person", schema = "zhanghuan")
public class PersonEntity {
    private String name;
    private String password;

    @Id
    @Column(name = "name", nullable = false, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return Objects.equals(name, that.name) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, password);
    }
}
