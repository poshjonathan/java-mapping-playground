package com.home.playground1;

import com.home.playground1.enumeration.CommandType;
import com.home.playground1.model.Db;
import com.home.playground1.model.DbCommandTypes;
import com.home.playground1.model.FlyTo;
import com.home.playground1.service.MappingService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private static Logger logger = LogManager.getLogger(CommandLineAppStartupRunner.class);

    @Autowired
    private MappingService mappingService;

    @Override
    public void run(String...args) throws Exception{
        // to mock gw flyTo object
        Object mockGwFlyToObject = new FlyTo("flyToId 1");

        Class classT = CommandType.values()[0].getClassType();
        logger.info("this is class type from enumeration {} ", classT);

        Object convertedObject =  mappingService.mapThisToThat(classT, mockGwFlyToObject);

        // to be implemented in dto helper
        DbCommandTypes dbCommandTypes = new DbCommandTypes(convertedObject);

        logger.info("this is dbCommandTypes object {} ", dbCommandTypes);

        // to be implemented in dto helper
        Db db = new Db(dbCommandTypes);

        logger.info("this is db object {} ", db);


    }

}
