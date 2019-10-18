package com.home.playground1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.home.playground1.Playground1Application;
import com.home.playground1.enumeration.CommandType;
import com.home.playground1.model.DbFlyTo;
import com.home.playground1.model.FlyTo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MappingService {

    private static Logger logger = LogManager.getLogger(MappingService.class);

    ObjectMapper mapper = new ObjectMapper();

    public <T> Object mapThisToThat(T tClass, Object canBeAnyObject) {

        if (tClass.toString().contentEquals(CommandType.FLY_TO.getGwClassString())) {
            FlyTo flyTo = mapper.convertValue(canBeAnyObject, FlyTo.class);

            // to be implemented in dto helper
            DbFlyTo dbFlyTo = new DbFlyTo(flyTo);
            logger.info("this is flyTo's id {} ", flyTo.getFlyToId());
            return dbFlyTo;
        }
        if (tClass.toString().contentEquals(CommandType.LAND.getGwClassString())) {


        }
        return null;
    }
}
