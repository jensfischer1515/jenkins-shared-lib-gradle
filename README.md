# Maven POM

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.bmuschko.jenkins</groupId>
    <artifactId>jenkins-shared-lib</artifactId>
    <name>jenkins-shared-lib</name>
    <version>1.0.0</version>

    <properties>
        <jdk.version>8</jdk.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
        <groovy.cps.version>1.30</groovy.cps.version>
        <groovy.version>2.4.12</groovy.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>com.cloudbees</groupId>
            <artifactId>groovy-cps</artifactId>
            <version>${groovy.cps.version}</version>
        </dependency>
        <dependency>
            <groupId>org.codehaus.groovy</groupId>
            <artifactId>groovy</artifactId>
            <version>${groovy.version}</version>
        </dependency>
    </dependencies>

    <build>
        <sourceDirectory>src</sourceDirectory>
        <resources>
            <resource>
                <directory>resources</directory>
            </resource>
        </resources>

        <plugins>
            <plugin>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <compilerId>groovy-eclipse-compiler</compilerId>
                    <source>${jdk.version}</source>
                    <target>${jdk.version}</target>
                    <encoding>${project.build.sourceEncoding}</encoding>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.codehaus.groovy</groupId>
                        <artifactId>groovy-eclipse-compiler</artifactId>
                        <version>3.5.0-01</version>
                    </dependency>
                    <dependency>
                        <groupId>org.codehaus.groovy</groupId>
                        <artifactId>groovy-eclipse-batch</artifactId>
                        <version>2.5.8-02</version>
                    </dependency>
                </dependencies>
            </plugin>
        </plugins>
    </build>
</project>
```
