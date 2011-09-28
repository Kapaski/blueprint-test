About
=====

This project contains a light-weight sample project for working with OSGi Blueprint Services.

Contents
--------

greetings: The greetings project contains the source for building a simple OSGi-bundle 
that exports a single service (IGreetingService).

distribution: The distribution project is used for building a single ZIP file 
containing the greetings bundle and all its dependencies.

If your OSGi-enabled application server does not come with OSGi blueprint support out of the box, 
you will need to deploy all of the JAR files from the distribution.zip.

This has been tested successfully on JBoss AS 7.0.2