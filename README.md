<<<<<<< HEAD
# Setup

To be able to run this project you will need:

1 - Eclipse IDE
2 - Java version 1.8
3 - Cucumber dependencies (it's at pom file)
4 - Íf necessary, update the libraries needed to run the tests.
5 - Chromedriver must be able to work with your chrome(this one is v79)

## Runing the tests

Open the project at Eclipse.
     >> Open the file runTest.java, change the feature path to your directory and as a Junit test (//src//test//java//io.cucumber.skeleton)
	 >> Be sure the file compra.feature is inside (//src//test//resources//io//cucumber//skeleton)
	 
	 
## The pom must be

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cucumber</groupId>
    <artifactId>cucumber-java-skeleton</artifactId>
    <version>0.0.1</version>
    <packaging>jar</packaging>
    <name>Cucumber-Java Skeleton</name>

    <properties>
        <java.version>1.8</java.version>
        <junit.version>4.12</junit.version>
        <cucumber.version>4.3.1</cucumber.version>
        <maven.compiler.version>3.3</maven.compiler.version>
    </properties>

    <dependencies>
   

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-java</artifactId>
			<version>1.2.5</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-jvm</artifactId>
			<version>1.2.5</version>
			<type>pom</type>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-junit</artifactId>
			<version>1.2.5</version>
			<scope>test</scope>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-jvm-deps</artifactId>
			<version>1.0.5</version>
		</dependency>

		<dependency>
			<groupId>net.masterthought</groupId>
			<artifactId>cucumber-reporting</artifactId>
			<version>1.0.0</version>
		</dependency>

		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>gherkin</artifactId>
			<version>2.12.2</version>
		</dependency>

		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>



		<dependency>
			<groupId>org.seleniumhq.selenium</groupId>
			<artifactId>selenium-java</artifactId>
			<version>3.5.3</version>
		</dependency>

		<!-- https://mvnrepository.com/artifact/info.cukes/cucumber-picocontainer -->
		<dependency>
			<groupId>info.cukes</groupId>
			<artifactId>cucumber-picocontainer</artifactId>
			<version>1.2.5</version>
			<scope>test</scope>
		</dependency>



	</dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>${maven.compiler.version}</version>
                <configuration>
                    <encoding>UTF-8</encoding>
                    <source>${java.version}</source>
                    <target>${java.version}</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
=======
# americanasneurotech
Challenge
>>>>>>> 93e85e15e3e9e93a518546edfbcc028826a0727b