package com.owl.SpringBootProject.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private short age;

    public User() {}

    public User(String name, String surname, short age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Id = " + getId() + "; Имя = " + getName() + "; Фамилия = " + getSurname() + "; Возраст = " + getAge() + "\n";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }
}
