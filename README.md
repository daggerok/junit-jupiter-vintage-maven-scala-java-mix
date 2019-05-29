# junit-jupiter (+vintage), maven, java, scala [![Build Status](https://travis-ci.org/daggerok/junit-jupiter-vintage-maven-scala-java-mix.svg?branch=master)](https://travis-ci.org/daggerok/junit-jupiter-vintage-maven-scala-java-mix)
Mixing Java and Kotlin test classes with JUnit 5 Jupiter and JUnit 4 Vintage test engines. Supported JDK 1.8 and JDK 11.

The `junit-jupiter-vintage-maven-scala-java-mix` sample demonstrates how to execute JUnit 4 Vintage test together
with JUnit 5 Jupiter tests by using Maven build tool in mixed java / scala test classes in the project

Please note that this project is uses the [Maven Wrapper](https://github.com/takari/maven-wrapper)
3.6.1 version. This helps you ensure that already tested versions are not going to be failed if
locally installed different maven version. 

```
src/
  test/
    scala/
      **/*Tests.java  +
      **/*Tests.java  +
      **/*Tests.scala +
      **/*Tests.scala +
```

Here `+` means that marked type of tests classes by language and engine are going to be executed
