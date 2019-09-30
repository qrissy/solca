package com.example.solarcalculator2;

public class Energy {

    private int id;
    private String name;
    private String count;
    private String watt;

    public Energy(String name, String count, String watt) {
        this.name = name;
        this.count = count;
        this.watt = watt;
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

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getWatt() {
        return watt;
    }

    public void setWatt(String watt) {
        this.watt = watt;
    }
}
