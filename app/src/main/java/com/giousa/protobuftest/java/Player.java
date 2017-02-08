package com.giousa.protobuftest.java;

import java.io.Serializable;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/2/8
 * Time:下午10:03
 */

public class Player implements Serializable{

    private int age;
    private String name;
    private long skills;
    private long playId;

    public Player(int age, String name, long skills) {
        this.age = age;
        this.name = name;
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSkills() {
        return skills;
    }

    public void setSkills(long skills) {
        this.skills = skills;
    }

    public long getPlayId() {
        return playId;
    }

    public void setPlayId(long playId) {
        this.playId = playId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", skills=" + skills +
                ", playId=" + playId +
                '}';
    }
}
