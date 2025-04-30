### This is a simple Java project built with Gradle, which contains a class SumCalculator and corresponding unit tests

### 📘 Task Description

##### Create a Gradle project that includes a class SumCalculator with the following method:

`int sum(int n)`

This method should return the sum of all integers from 1 to n, inclusive.

For example, calling sum(3) should return 6(1 + 2 + 3 = 6)

### ✅ Unit Tests

Write a test class for SumCalculator to verify the following behavior of the sum() method. Each point below should be tested in a separate test case:

Calling sum(1) should return 1

Calling sum(3) should return 6

Calling sum(0) should throw an IllegalArgumentException

Use the @BeforeEach annotation to construct an instance of SumCalculator before each test method.

Make sure your code runs from the terminal by calling the gradle test command.