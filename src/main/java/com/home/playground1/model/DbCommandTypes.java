package com.home.playground1.model;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DbCommandTypes {
    private DbFlyTo dbFlyTo;
    private DbLand dbLand;
    private DbTakeOff dbTakeOff;

    public DbCommandTypes(DbFlyTo dbFlyTo, DbLand dbLand, DbTakeOff dbTakeOff) {
        this.dbFlyTo = dbFlyTo;
        this.dbLand = dbLand;
        this.dbTakeOff = dbTakeOff;
    }

    public DbCommandTypes(Object object){
        ObjectMapper mapper = new ObjectMapper();

       // System.out.println(object.getClass());
        switch (object.getClass().toString()){
            case "class com.home.playground1.model.DbFlyTo":
                DbFlyTo convertValue =  mapper.convertValue(object,DbFlyTo.class);
                this.dbFlyTo = convertValue;
        }
    }


    public DbFlyTo getDbFlyTo() {
        return dbFlyTo;
    }

    public void setDbFlyTo(DbFlyTo dbFlyTo) {
        this.dbFlyTo = dbFlyTo;
    }

    public DbLand getDbLand() {
        return dbLand;
    }

    public void setDbLand(DbLand dbLand) {
        this.dbLand = dbLand;
    }

    public DbTakeOff getDbTakeOff() {
        return dbTakeOff;
    }

    public void setDbTakeOff(DbTakeOff dbTakeOff) {
        this.dbTakeOff = dbTakeOff;
    }

    @Override
    public String toString() {
        return "DbCommandTypes{" +
                "dbFlyTo=" + dbFlyTo +
                ", dbLand=" + dbLand +
                ", dbTakeOff=" + dbTakeOff +
                '}';
    }
}
