package com.hunau.mydatauser.entity;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.List;
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty(message="名字不能为空")
    @Column(length=40)
    private String name;
    @NotEmpty(message="密码不能为空")
    @Column(length=50)
    private String pwd;
    private String sexy;
    private Date birthday;
    private boolean isuse;
    private int age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isIsuse() {
        return isuse;
    }

    public void setIsuse(boolean isuse) {
        this.isuse = isuse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sexy='" + sexy + '\'' +
                ", birthday=" + birthday +
                ", isuse=" + isuse +
                ", age=" + age +
                '}';
    }
}
