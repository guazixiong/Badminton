package com.pd.Domain;

import org.springframework.stereotype.Component;

@Component
public class UserDomain {

    //姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
