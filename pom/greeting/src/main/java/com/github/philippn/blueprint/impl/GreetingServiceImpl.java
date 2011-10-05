package com.github.philippn.blueprint.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.philippn.blueprint.IGreetingService;

/**
 * @author Philipp
 */
public class GreetingServiceImpl implements IGreetingService {

	private Logger logger = LoggerFactory.getLogger(GreetingServiceImpl.class);

	/**
	 * This method is called by the Blueprint subsystem.
	 */
	public void setup() {
		logger.info("Initializing Greeting service...");
	}

	/* (non-Javadoc)
	 * @see com.github.philippn.blueprint.IGreetingService#greet(java.lang.String)
	 */
	public String greet(String name) {
		return "Hello " + name + "!";
	}
}
