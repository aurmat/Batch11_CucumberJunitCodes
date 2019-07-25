$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Albina/Desktop/ChicagoB11cucumberjunit/src/test/resources/features/test.feature");
formatter.feature({
  "name": "Amazon title verification",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Amazon title verification",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@amazon1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Amazon application",
  "keyword": "When "
});
formatter.match({
  "location": "Amazon_Steps.user_is_on_Amazon_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Amazon in title",
  "keyword": "Then "
});
formatter.match({
  "location": "Amazon_Steps.user_should_see_Amazon_in_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for something",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon_Steps.user_searches_for_something()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.fail(Assert.java:95)\r\n\tat steps.Amazon_Steps.user_searches_for_something(Amazon_Steps.java:29)\r\n\tat ✽.User searches for something(C:/Users/Albina/Desktop/ChicagoB11cucumberjunit/src/test/resources/features/test.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});