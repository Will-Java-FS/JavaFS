package com.revature.models;

import javax.persistence.*;
import java.util.List;

public class ActorForm {

    private int id;
    private String name;
    private short age;
    private int worth;
    private List<String> movies;

    public ActorForm() {
    }

    public ActorForm(int id, String name, short age, int worth, List<String> movies) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.worth = worth;
        this.movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public int getWorth() {
        return worth;
    }

    public void setWorth(int worth) {
        this.worth = worth;
    }

    public List<String> getMovies() {
        return movies;
    }

    public void setMovies(List<String> movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "ActorForm{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", worth=" + worth +
                ", movies=" + movies +
                '}';
    }
}