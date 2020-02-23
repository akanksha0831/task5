package com.task5.maven_pro.maven_pro;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestApplication {
	
	private static final Logger LOGGER = LogManager.getLogger(InterestApplication.class);
	
    public static void main(String[] args) {
    	
        Interest obj1 = new Interest();
        double output = obj1.SimpleInterest(6000, 15, 7);
        LOGGER.info("Simple Interest is "+output);
        
        Interest obj2 = new Interest();
        output = obj2.CompoundInterest(6000, 5, 2);
        LOGGER.info("Compound Interest is "+output);
        
    }

}