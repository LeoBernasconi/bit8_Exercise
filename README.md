## INTRO

- In order to complete both exercises some logic validation were created and used (mostly for negative tests cases). 
- Some state were used for mange different entities . These states were commented in the code for a better understanding.
- The automated test cases names were created using: # of user story + test case id + test case scenario title.

## HOW TO EXECUTE THE TESTS?
- From command line
    1. Download the file "bit8_testPlan.jar" to a directory. 
    2. Open the console and go to the selected directory.
    3. Type "java -jar bit8_testPlan.jar" and press ENTER.
- From IDE as Java Application
    1. Open an IDE (eg: Eclipse).
    2. Open "src/test/java/testCases/RunTests.java" file. 
    3. Select "Run As / Java Application".
- From IDE as test
    1. Open an IDE (eg:Eclipse).
    2. Open "src/test/java/testCases/Test.java" file. 
    3. Select "Run as / jUnit Test". 
    
## TECHNOLOGIES
- Java.
- Junit.
- Maven.

## NOTE
Since the endpoints does not really exist, I tried using mockserver and wiremock to generate the API mocks -as well as rest-assured 
for the API testing- but unfortunately I was not able to implement them -at least not in the given time. That's why I "mocked" the 
APIs through ordinary Java methods.
