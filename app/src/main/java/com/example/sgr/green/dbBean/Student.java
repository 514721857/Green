package com.example.sgr.green.dbBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/1/23/023.
 */
@Entity
public class Student {
    private String name;
    private String age;
    private String password;
    public String getAge() {
        return this.age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Generated(hash = 59296827)
    public Student(String name, String age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
}
