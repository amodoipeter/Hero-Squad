package models;

import java.util.ArrayList;

public class Hero {

    private String name;
    private int age;
    private int id;
    private String power;
    private String weakness;

    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
}
