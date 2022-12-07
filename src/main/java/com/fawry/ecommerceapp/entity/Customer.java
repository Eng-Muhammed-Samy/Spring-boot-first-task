package com.fawry.ecommerceapp.entity;

import com.fawry.ecommerceapp.base.BaseEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "fawry_customer")
public class Customer extends BaseEntity<Long> {

    @Column
    private String name;

    @Column
    private String imgPath;

    @OneToOne
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
