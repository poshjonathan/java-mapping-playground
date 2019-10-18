package com.home.playground1.model;

public class DbFlyTo {
    private String id;

    public DbFlyTo(String id) {
        this.id = id;
    }

    public DbFlyTo(FlyTo flyTo){
        this.id = flyTo.getFlyToId();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DbFlyTo{" +
                "id='" + id + '\'' +
                '}';
    }
}
