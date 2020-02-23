package com.task5.maven_pro.maven_pro;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest {

	private static final Logger LOGGER = LogManager.getLogger(InterestApplication.class);
	
	public double SimpleInterest(double Principal, double rate, double time) {
		LOGGER.info("Control entered the SimpleInterest method");
		double simpleInterest = (Principal*time*rate)/100;
		LOGGER.info("Control exited the SimpleInterest method");
		return simpleInterest;
	}
	
	public double CompoundInterest(int Principal, int rate, int time) {
		LOGGER.info("Control entered the CompoundInterest method");
		double Amount = Principal*Math.pow((1.0+(rate/100.0)),time);
		double compoundInterest = Amount - Principal;
		LOGGER.info("Control exited the CompoundInterest method");
		return compoundInterest;
	}
	
}