$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshoping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9107954000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "TC-001 Create New User/SignUp",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-001-create-new-user/signup",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Navigate to SignUp page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "create an account with random username",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.iAmOnHomePage()"
});
formatter.result({
  "duration": 111196900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.navigateToSignUpPage()"
});
formatter.result({
  "duration": 2254100900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.createAnAccountWithRandomUsername()"
});
formatter.result({
  "duration": 6440188899,
  "status": "passed"
});
formatter.after({
  "duration": 747536300,
  "status": "passed"
});
formatter.before({
  "duration": 6179018900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "TC-002 Sign In with newly created user credentials",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-002-sign-in-with-newly-created-user-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I shall verify the address information in my address section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStep.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 1208232300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 1768698399,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStep.iShallVerifyTheAddressInformationInMyAddressSection()"
});
formatter.result({
  "duration": 1095918600,
  "status": "passed"
});
formatter.after({
  "duration": 727604500,
  "status": "passed"
});
});