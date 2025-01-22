package com.example.myjsfapp;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class GreetingBean implements Serializable {
    String name = null;

    @PostConstruct
    public void init() {
        name = "bob";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

