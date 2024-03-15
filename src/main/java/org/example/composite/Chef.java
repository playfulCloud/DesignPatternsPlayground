package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class Chef implements KitchenStaff{

    private String name;
    private String role;


    // inside there is list of super type Kitchen staff no the Chef type
    private List<KitchenStaff> chefList;

    public Chef(String name, String role) {
        this.name = name;
        this.role = role;
        chefList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void fire(Chef chef){
        chefList.remove(chef);
    }

    public void add(Chef chef){
        chefList.add(chef);
    }

    @Override
    public String getDetails() {
        return this.name + " is designed for role " + this.role;
    }
}
