package com.myfirstproject.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtils {
    /*
    This reusable class is used for logging info in the test classes
    just call the methods that you want to log info : LoggerUtils.info("Navigation to the home page");
     */
    private static Logger logger = LogManager.getLogger(LoggerUtils.class.getName());

    public static void info(String message){
        logger.info(message);
    }
    public static void warn(String message){
        logger.warn(message);
    }
    public static void error(String message){
        logger.error(message);
    }
    public static void fatal(String message){
        logger.fatal(message);
    }

}
