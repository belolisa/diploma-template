package com.mkyong.common.model;

import java.io.Serializable;

/**
 * Created by elizaveta on 01.03.2015.
 */
public class Movie implements Serializable {

    private String name;

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                '}';
    }
}
