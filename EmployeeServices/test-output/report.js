$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/GetInvalidSingleEmployee.feature");
formatter.feature({
  "name": "Rest API for valid Single Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get Single Employee Info Valid GET Request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "baseUrl and invalid resourcePath",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Make a invalid GET call",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should received status code 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("classpath:features/GetValidSingleEmployee.feature");
formatter.feature({
  "name": "Rest API for valid Single Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Get Single Employee Info Valid GET Request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "baseUrl and valid resourcePath",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Make a valid GET call",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should received status code 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});