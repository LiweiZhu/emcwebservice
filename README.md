# emc-web-service
This web service can calculate given number of fibonacci numbers, starting from 0. 
For example, given n = 5, output will be '0, 1, 1, 2, 3'.

## build
The build is done using Gradle. In case someone doesn't have gradle installed, I had gradle wrapper checked in, which provide the necessary script to build the project. Just run the following command in project folder.
```
./gradlew build
```
The war file can be found at: `build/libs/emc-web-service-1.0.war`

## deploy & run
To deploy the web service, we need to start a tomcat server and deploy the war to it. This can be easily done using [Spring Boot](http://projects.spring.io/spring-boot/).
```
./gradlew bootRun
```
The service will be run on port 8080.

## API
The path is `/fibonacci/{n}`.

For example, given n = 5. Visit [localhost:8080/fibonacci/5](http://localhost:8080/fibonacci/5) and the result you get is
```
[0, 1, 1, 2, 3]
```

## Issues
* Negative input. If a negative number if given, an error will be returned.
* Number overflow. The fibonacci numbers increase over 2^64 very soon. So I use BigInteger to represente it, which can store up to Integer.MAX_VALUE bits of number. This will make the overflow rarely happen.

