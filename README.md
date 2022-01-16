
# About Project 

Problem Statement
Create a test automation project that validates weather information from different
sources and enables a comparison between them

UI Layer
Use https://www.accuweather.com/ as the UI source and get weather information for
any city

API layer
Use any rest-client to automate the API listed at https://openweathermap.org/current to
get current weather information for any city. Use
“7fe67bf08c80ded756e598d6f8fedaea'” as the API key

Create Comparator
1. Create a comparator logic that matches the temperature information from the
UI against that from the API
2. Add a variance logic that returns a success if temperature difference between 2
sources is within a specified range, else return a custom exception


## Technologies Used

Java

Rest Assured

Selenium


## Run Locally

Go to a directory in your system

Clone the project

```bash
  git clone https://github.com/gunjan2k8/APIAutomation.git
```
Go  to Eclipse( or any IDE) and open project APIAutomation from filesystem

Right click on project and select Maven -> Update Project to download all dependencies required to run the project.



## Running Tests

Once all dependencies downloaded.

Now right click pn testng.xml file and select RunAS-> TestNGSuite

Test method will execute on chrome browser. 

To execute test on Firefox browser then change the value="firefox" in testng.xml file like 

<parameter name="browser" value="firefox" />


## Author

- [Gunjan Agarwal](https://github.com/gunjan2k8/APIAutomation)

