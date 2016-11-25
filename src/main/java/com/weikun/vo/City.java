package com.weikun.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/11/25.
 */
public class City implements Serializable {
    private String name;
    private String value;
    public City(){

    }
    public City(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
