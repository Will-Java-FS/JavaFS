package com.revature.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "actors")
public class Actor {
    @Id //makes this a primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="a_id",updatable = false)
    private int id;

    @Column(nullable = false,unique = true)
    private String name;

    @Column(columnDefinition = "smallint CHECK (age>=0)")
    private short age;

    //Not putting @Column is OK, so long as there is nothing left to specify!
    private int worth;

    /*@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "actor_movie",
        joinColumns = @JoinColumn(name = "actor_id"),
        inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<Movie> movies;*/

    public Actor(){

    }

    public Actor(int id, String name, short age, int worth) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.worth = worth;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return getId() == actor.getId() && getAge() == actor.getAge() && getWorth() == actor.getWorth() && Objects.equals(getName(), actor.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getWorth());
    }

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", worth=" + worth +
                '}';
    }
}
