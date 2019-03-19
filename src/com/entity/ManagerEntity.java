package com.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;
@Component
@Entity
@Table(name = "manager", schema = "zhanghuan")
public class ManagerEntity {
    private String name;
    private String password;
    private String state;

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

    @Basic
    @Column(name = "state", nullable = true, length = 45)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManagerEntity that = (ManagerEntity) o;
        return Objects.equals(name, that.name) && Objects.equals(password, that.password) && Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, password, state);
    }
}
