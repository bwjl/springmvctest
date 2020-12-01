package com.bear.springmvctest.entity;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/1 下午11:13
 * Description:
 */

public class People {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
