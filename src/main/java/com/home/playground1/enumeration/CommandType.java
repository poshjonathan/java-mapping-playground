package com.home.playground1.enumeration;

import com.home.playground1.model.FlyTo;

public enum CommandType {
        FLY_TO( "class com.home.playground1.model.FlyTo",FlyTo.class),
    TAKE_OFF( "class com.home.playground1.model.FlyTo",FlyTo.class),
    LAND( "class com.home.playground1.model.FlyTo",FlyTo.class);

        private final Class classType;
         private final String gwClassString;


    CommandType( String gwClassString, Class classType) {
        this.classType = classType;
        this.gwClassString = gwClassString;
    }

    public Class getClassType() {
        return classType;
    }

    public String getGwClassString() {
        return gwClassString;
    }
}
