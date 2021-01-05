$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Star Kishan/eclipse-workspace/CucmberFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Sucessful Login",
  "description": "",
  "id": "sucessful-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#without examples keyword"
    },
    {
      "line": 4,
      "value": "#Scenario: Login test"
    },
    {
      "line": 5,
      "value": "#\tGiven User is already on login page"
    },
    {
      "line": 6,
      "value": "#\tWhen Title of the login page"
    },
    {
      "line": 7,
      "value": "#\tThen User enters the \"Star Kishan\" \u0026 \"kishan\""
    },
    {
      "line": 8,
      "value": "#\tThen User clicks the login button"
    },
    {
      "line": 9,
      "value": "#\tThen User enters the homepage"
    },
    {
      "line": 10,
      "value": "#\tThen close the browser"
    },
    {
      "line": 12,
      "value": "#achieve data driven approach in cucumber selenium using Scenario outline with examples keyword"
    },
    {
      "line": 13,
      "value": "#with examples keyword"
    }
  ],
  "line": 14,
  "name": "Login test",
  "description": "",
  "id": "sucessful-login;login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters the \"\u003cusername\u003e\" \u0026 \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 19,
      "value": "#\tThen User enters the homepage"
    }
  ],
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "sucessful-login;login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 23,
      "id": "sucessful-login;login-test;;1"
    },
    {
      "cells": [
        "Star Kishan",
        "kishan"
      ],
      "line": 24,
      "id": "sucessful-login;login-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Login test",
  "description": "",
  "id": "sucessful-login;login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "Title of the login page",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User enters the \"Star Kishan\" \u0026 \"kishan\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User clicks the login button",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 19,
      "value": "#\tThen User enters the homepage"
    }
  ],
  "line": 20,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.user_is_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.title_of_the_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Star Kishan",
      "offset": 17
    },
    {
      "val": "kishan",
      "offset": 33
    }
  ],
  "location": "StepDefinitions.user_enters_the_id_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.user_clicks_the_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinitions.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});