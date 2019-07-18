TestNG
- open source unit test framework
- TDD Test Driven Development

Purpose
- design test cases in proper way
- Generate html report
- annotations
- priorities
- dependencies
- grouping
- data provider

Java testing framework - works only for java

Installation

Download TestNG plugin for eclipse from “http://beust.com/eclipse/”
Go to Help in eclipse.
Add the URL in the “Work with” field - TestNG option will be displayed below.
Check the checkbox and also check last option “Contact *****” and click Next & Finish.

Annotations

> Executed in below order:
@BeforeSuite @AfterSuite
@BeforeTest @AfterTest
@BeforeClass @AfterClass
@BeforeMethod @AfterMethod
@Test - No of test cases

> Each annotation should be associated with a method

> If there are 2 test cases, it will be executed in the below order:
@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod @Test1 @AfterMethod
@BeforeMethod @Test2 @AfterMethod
@AfterClass
@AfterTest
@AfterSuite
> Can also add priority to execute test cases in priority order
@Test1(priority=1)
@Test2(priority=2)

Create a testcase

Create a package
Create a class - Do not select main method option
Run it as TestNG
