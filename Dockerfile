from eclipse-temurin:17
copy target/welcome1.jar welcome1.jar
cmd ["java","-jar","welcome1.jar"]