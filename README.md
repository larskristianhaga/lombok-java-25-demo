# Lombok Java 25 demo

After upgrading to Java 25 the annotation `@AllArgsConstructor` on enum classes will stop the application from compiling.

Example:
```java
[ERROR] COMPILATION ERROR :
[INFO] -------------------------------------------------------------
[ERROR] lombok-java-25-demo/src/main/java/no/haga/EnumExample.java:[7,14] constructor EnumExample in enum no.haga.EnumExample cannot be applied to given types;
required: no arguments
found:    java.lang.String
reason: actual and formal argument lists differ in length
```
