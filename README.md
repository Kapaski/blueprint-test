About
=====

This project contains a light-weight sample project for working with OSGi Blueprint Services.

Contents
--------

greeting: The greeting project contains the source for building a simple OSGi bundle 
that exports a single service (IGreetingService).

distribution: The distribution project is used for building a single ZIP file 
containing the greeting bundle as well as the Eclipse Gemini Blueprint bundles.

If your application server does not come with OSGi blueprint support out of the box, 
you will need to deploy the Gemini Blueprint bundles along with the greeting bundle.

Application Server Notes
------------------------

JBoss AS 7: AS 7 comes with Blueprint support out-of-the-box, but you will need 
to configure the OSGi subsystem first. To do so, locate the XML configuration file 
and go to the OSGi subsystem (hint: search for "urn:jboss:domain:osgi:1.0").
In there, set the org.osgi.framework.startlevel.beginning to 2 and the startlevel of 
org.jboss.osgi.blueprint to 2 as well. Now you are ready to deploy the greeting bundle!