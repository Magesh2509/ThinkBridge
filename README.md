# ThinkBridge

Framework used to build the test script : TestNG

Reporting framework used in the test script: ExtentReport V3.1.2

Build management tool: Maven

Framework design:

I have created this use case in a framework for that I have created all the predefined functions which are needed by the user to complete the sign up form. All those predefined functions are converted into a jar so that the person who is going to use this framework can use the below listed functions to automate the form.

Functions created for this use case:

OpenURL - Example( flow.OpenURL("https://google.com"))

ClickButton - Example( flow.ClickButton("Get Started"))

ClickCheckBox - Example ( flow.ClickCheckBox())

ValidateDropDown - Example ( flow.ValidateDropDown("English,Dutch"))

VerifyTextPresentinUI - Example ( flow.VerifyTextPresentinUI("Success message"))

TypeTextBasedonPlaceholderName - Example ( flow.TypeTextBasedonPlaceholderName("Full Name","magesh"))


Some of the utiities methods:

CreateDirectory

StartDriver

Explicitwait

QuitDriver

Preqrequistes to run the test script:

Java above 1.8 version

TestNG above 6 version

Chrome Browser

Steps to run the test script:
1. Import the test package into an IDE (Eclipse is preferred)
2. Right click on the TestNG.xml and run it as TestNG Suite
3. Refresh the test package and open the report folder there should be a report with the recent timestamp

Note: Since I have used WebDriverManager and TESTNG, User don't need to worry about driver initiation and quiting the driver.
