# Spark Java Hello World Archetype for Maven
This Archetype helps people interested in trying spark for the first to get a working demo up in seconds.

## Build the Archetype
If you wish to build the Archetype rather then download the jar from a repository you can simply run the maven command

        mvn install

This will compile the Archetype sources and install them into your local maven repository.

##Generate a Project from the archetype
Navigate to the directory where the new program will be created and run the following maven command:

    mvn archetype:generate 
        -DarchetypeGroupId=com.sparkjava 
        -DarchetypeArtifactId=spark-helloworld-archetype 
        -DarchetypeVersion=1.0-SNAPSHOT 
        -DgroupId=your.groupid.here
        -DartifactId=your-artifactid-her 
        -Dversion=1.0-SNAPSHOT
        -Dpackage=your.package.here
