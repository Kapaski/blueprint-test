About
=====

This project contains a light-weight sample project for working with OSGi Blueprint Services.

Contents
--------

greetings: The greetings project contains the source for building a simple OSGi-bundle 
that exports a single service (IGreetingService).

distribution: The distribution project is used for building a single ZIP file 
containing the greetings bundle as well as Eclipse Gemini Blueprint.

If your OSGi-enabled application server does not come with OSGi blueprint support out of the box, 
you will need to deploy Gemini Blueprint along with the greetings.jar.

Application Server Notes
------------------------

JBoss AS 7: On AS 7, you will need to configure the OSGi subsystem first. 
In the XML configuration file, set the org.osgi.framework.startlevel.beginning to 2. 
Then, set the startlevel of org.jboss.osgi.blueprint to 2 as well. Now you are set!