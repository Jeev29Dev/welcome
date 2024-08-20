from eclipse-temurin:17
copy target/welcome.jar welcome.jar
cmd ["java","-jar","welcome.jar"]