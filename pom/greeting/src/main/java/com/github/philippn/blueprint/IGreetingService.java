package com.github.philippn.blueprint;

/**
 * @author Philipp
 */
public interface IGreetingService {

	/**
	 * Returns a greeting
	 * @param name the name of the person to greet.
	 * @return the greeting line
	 */
	String greet(String name);
}
