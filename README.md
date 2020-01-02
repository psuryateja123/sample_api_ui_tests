# sample_api_ui_tests
# Test guidence 

#### The tests in this framework are written in BDD (behave) pattern using feature file.

#### Folder structure:
* There is a [src](/master/src) folder and it has [test](/master/src/test) folder.
* Test has a java folder, in java folder there exists a resource folder that has the following
* [Feature files](tree/master/src/test/java/resource/feature_files)
* [Page objects](tree/master/src/test/java/resource/page_objects)
* [Step definitions](tree/master/src/test/java/resource/step_defs)
* [Utils](tree/master/src/test/java/resource/utils)
* [Locators]tree/master/src/test/java/resource/locators)

#### [Feature files](https://github.com/psuryateja123/davis_test/tree/master/src/test/java/resource/feature_files)
* In this folder, there are two feature files.
* [Registration](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/feature_files/regitration.feature): This feature file has all the scenarios related to registration and validatation.
* [Login and Purchase](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/feature_files/login_and_purchase.feature).feature: This feature file has all the scenarios, that are related to product purchase.

#### [Page objects](https://github.com/psuryateja123/davis_test/tree/master/src/test/java/resource/page_objects)
* It has four class, 
* In [details_page_object](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/page_objects/details_page_objects.java), I have used placed the methods that are the page objects that are related to details page.
* In [Registration](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/page_objects/registration.java), I have placed the methods that are the page objects related to the registration page
* In [Selection_page_object](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/page_objects/selection_page_objects.java), I have placed the methods that are the page objects related to the dress selection page.
* In [sign_page_objects](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/page_objects/sign_page_objects.java), I have placed the methods that are the page objects related to the sign in page.

#### [Step definitions](https://github.com/psuryateja123/davis_test/tree/master/src/test/java/resource/step_defs)
* It has two step definition files
* [Registration steps](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/step_defs/registration_steps.java) is related to [Registration feature](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/feature_files/regitration.feature).
* [Login](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/step_defs/sign_in_Steps.java) and [Purchase](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/step_defs/selection_Steps.java)is related to [Login and purchase Feature](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/feature_files/login_and_purchase.feature)

#### [Utils](https://github.com/psuryateja123/davis_test/tree/master/src/test/java/resource/utils): 
* In this folder there are two class, they are the supporting class for the project.
* [Env.java](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/utils/Env.java) has url and the name of the browser, further configurations browserstack configurations can be added.
* [RunTest.java](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/utils/RunTest.java) has browser driver configurations, cucumber options - location of feature files, location of steps definition files. In this class further browserstack configuration can be added.
* [Email generator.java](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/utils/email_generator.java) is for generating a random emails with timestamp in it.

#### [Locators](https://github.com/psuryateja123/davis_test/tree/master/src/test/java/resource/locators)
* In this folder there are three class with the name respect to the name of the page in the website.
* [Registration](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/locators/registration.java) has locators that are related to the registration page
* [Selection page](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/locators/selection_page.java) has locators that are related to the dress selection page
* [Sign in page](https://github.com/psuryateja123/davis_test/blob/master/src/test/java/resource/locators/sign_page.java) has locators related to the sign page

#### cloning the project:
* open terminal and navigate to the location where the project need to be clone, then type
```
 git clone https://github.com/psuryateja123/davis_test.git
```

#### Running the test:
* I have used tags to run the individual feature file. 
* To run the tests in Treatment cost feature file, open the terminal and navigate to the root folder of the project and type

```
 mvn clean test -Dcucumber.options="src/test/java/resource/feature_files --tags @smoke"
```

* As I have configured the tags as smoke and smoke1 in the feature file. 

#### Viewing results:

* For viewing the results for the test run, open the [report.js](https://github.com/psuryateja123/davis_test/blob/master/davis/report.js) (open in a browser)

#### Improvements:

* There is a further room for expanding the framework by integrating BrowserStack to run on multiple browsers. 
* Integration of Allure report for better visual representation, I have added to other projects in [JavaScript](https://github.com/psuryateja123/cypress_meetup_demo) and [Python](https://github.com/psuryateja123/python-behave)
* Integration of framework to CI and adding build notifications to communication channels like - Slack, did it for my previous projects in [JavaScript](https://github.com/psuryateja123/cypress_meetup_demo) and [Python](https://github.com/psuryateja123/python-behave)
