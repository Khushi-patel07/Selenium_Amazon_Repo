#Amazon.in Website Automation Suite Information :

<h4>To run the Amazon.in Automation Suite from command line in the project folder:</h4>

1. mvn clean test -DsuiteXmlfile= NewUserAccountTest.xml.<br>
2. mvn clean test -DsuiteXmlfile= SignInTest.xml.<br>
3. mvn clean test -DsuiteXmlfile= SearchboxTest.xml.<br>
4. mvn clean test -DsuiteXmlfile= ShoppingCartTest.xml.<br>
5. mvn clean test -DsuiteXmlfile= HelpTest.xml.</h4></h4>

<h4>Testng files description:</h4>

- **NewUserAccountTest.xml**- define the tests related to new user account page.<br>
- **SignInTest.xml**- define the tests related to Sign in page.<br> 
- **SearchboxTest**- define the test related to search text box to search products.<br>
- **ShoppingCartTest.xml**- define the test to add product to the cart.<br>
- **HelpTest.xml**- define the test to get customer services.

<h4>Packages description:<br></h4>

- **.com.SeleniumMavenAssignment.pages**:- Defining all the pages actions and the respective object repository.<br> 
- **.com.SeleniumMavenAssignment.tests**:- Defining all the pages tests and assertions.<br>
- **.com.SeleniumMavenAssignment.utils**:- Defining all the utilities needed for the tests.<br>

##### Tests.java files description:

- **Base Test**:-The main class which defines @BeforeMethod - to open the browser and get the name of the text-@AfterMethod - to quit the browser- After Test-to close the extent report.<br>
- **NewUserAccount Test**:- To register new user on website.<br>
- **SignIn Test**:-Includes test- to verify valid sign in , invalid sign in and blankusername sign in.<br>
- **Searchbox Test**:- To Search Products.<br>
- **ShoppingCart Test**:-To add products to the cart.<br>
- **Help Test**:-To test customer service page.<br>

#####Other files description:

- Screenshot.java:- defines function to take screenshots.<br>


#####Reports and Screenshots:

- Extent report gets generated after the run under Reports/ExtentReport.html.<br>
- Screenshots gets placed under failedscreenshot folder.<br>

#####Headless Mode:
- Headless Chrome is a way to run Chrome browser without the actual browser UI being spawned. its running Chrome without showing chrome.In headless mode there is no need a visible UI shell.<br>

#####Logger Implementation:
- Logging is an important feature that helps developers to trace out the errors.It is use for tracking events that happen when some software runs.<br>
- Logs gets placed under Logs folder. 

