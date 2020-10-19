package models;

import java.util.ArrayList;

public class Squad {

    private int squadId;
    private String squadName;
    private int squadSize;
    private String cause;
    private ArrayList<Hero> squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();


    public Squad(String name, int size, String cause ){
        squadName = name;
        squadSize = size;
        this.cause = cause;
        this.squadMembers = new ArrayList<>();
        instances.add(this);
        this.squadId = instances.size();

    }
