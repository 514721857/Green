package com.example.sgr.green.dbBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/1/23/023.
 */
@Entity
public class Test {
    String account;
    String testname;
    public String getTestname() {
        return this.testname;
    }
    public void setTestname(String testname) {
        this.testname = testname;
    }
    public String getAccount() {
        return this.account;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    @Generated(hash = 1946155518)
    public Test(String account, String testname) {
        this.account = account;
        this.testname = testname;
    }
    @Generated(hash = 372557997)
    public Test() {
    }

}
