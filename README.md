# openexchange-java-9

**Java 9 new features tutorial**

## Maven and related tooling readiness 

https://cwiki.apache.org/confluence/display/MAVEN/Java+9+-+Jigsaw

## Modules support

Tooling as `maven-surefire-plugin` has yet behind Java 9 modularisation's adoption complete. 
To demonstrate the dynamic loading of modules following CLI commands need to be invoked:

1. cd </path/to/openexchange-java-9>
2. mvn clean install
3. To run application with "git" implementation run: java -p 'api/target/api-1.0.0-SNAPSHOT.jar;consumer/target/consumer-1.0.0-SNAPSHOT.jar;git/target/git-1.0.0-SNAPSHOT.jar' -m event.registry.cli/io.openexchange.schema.consumer.Application
4. To run application with "hortonwork" implementation run: java -p 'api/target/api-1.0.0-SNAPSHOT.jar;consumer/target/consumer-1.0.0-SNAPSHOT.jar;hortonworks/target/hortonworks-1.0.0-SNAPSHOT.jar' -m event.registry.cli/io.openexchange.schema.consumer.Application