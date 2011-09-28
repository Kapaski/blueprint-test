/**
 * 
 */
package com.github.philippn.blueprint.impl;

import com.github.philippn.blueprint.IGreetingService;

/**
 * @author Philipp
 *
 */
public class GreetingServiceImpl implements IGreetingService {

	/* (non-Javadoc)
	 * @see com.github.philippn.blueprint.IGreetingService#greet(java.lang.String)
	 */
	public String greet(String name) {
		return "Hello " + name + "!";
	}

}
