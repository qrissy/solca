package com.example.solarcalculator2;

public class Energy {

    private String name;
    String count;
    String watt;

    public Energy(String name, String count, String watt) {
        this.name = name;
        this.count = count;
        this.watt = watt;
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
