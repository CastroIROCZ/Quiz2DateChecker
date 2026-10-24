Overview:
This project was developed for CS 5800 Advanced Software Engineering Quiz 2 section 2 datechecker. It demonstrates the use of TDD and JUnit 5 to implement
and test for Java class that determines whether a calender month contains 31 days.

Used in project
Java 17
Apache Maven
Junit 5
Git and Github

Contains 2 classes DateChecker.java and DateCheckerTest.java

DateChecker.java contains all the logic for determining if a month has 31 days, or if the input is valid

DateTester.java contains all test cases created for the program

DateChecker.java returns true for January, March, July, August, October, and December
False for February, April, June, September, and Novemeber
if null it throws an illegalargumentexception

DateCheckerTest.java has 5 JUnit tests 
1. checks for months that has 31 days
2. checks for months that dont have 31 days
3. February returns false
4. Null input throws IllegalArgumentException using assertThrows()

Running Tests
Navigate to the project directory containing pom.xml
Execute
mvn clean test
Maven compiles the project and executes the 5 JUnit tests 