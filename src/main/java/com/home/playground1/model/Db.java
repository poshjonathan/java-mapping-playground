package com.home.playground1.model;

import com.home.playground1.enumeration.CommandType;

public class Db {
    private DbCommandTypes dbCommandTypes;

    public Db(DbCommandTypes dbCommandTypes) {
        this.dbCommandTypes = dbCommandTypes;
    }

    public DbCommandTypes getDbCommandTypes() {
        return dbCommandTypes;
    }

    public void setDbCommandTypes(DbCommandTypes dbCommandTypes) {
        this.dbCommandTypes = dbCommandTypes;
    }

    @Override
    public String toString() {
        return "Db{" +
                "dbCommandTypes=" + dbCommandTypes +
                '}';
    }
}
