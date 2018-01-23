package com.example.sgr.green.dbBean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by Administrator on 2018/1/23/023.
 */
@Entity
public class Users {
        @Id(autoincrement = true)
        private Long id;
        private String name;
        private String age;
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
        public Long getId() {
                return this.id;
        }
        public void setId(Long id) {
                this.id = id;
        }
        @Generated(hash = 1780254931)
        public Users(Long id, String name, String age) {
                this.id = id;
                this.name = name;
                this.age = age;
        }
        @Generated(hash = 2146996206)
        public Users() {
        }
       
}
