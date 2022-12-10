$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Test1.feature");
formatter.feature({
  "line": 2,
  "name": "Cucumber Test Two",
  "description": "",
  "id": "cucumber-test-two",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "duration": 6070551948,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Sky Blue Background",
  "description": "",
  "id": "cucumber-test-two;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "\"\u003cSet SkyWhite Background\u003e\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cSet SkyWhite Background\u003e",
      "offset": 1
    }
  ],
  "location": "StepDefinition1.button_exists1(String)"
});
formatter.result({
  "duration": 130832653,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.i_click_on_the_button()"
});
formatter.result({
  "duration": 263279649,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 20208806,
  "status": "passed"
});
formatter.after({
  "duration": 980258946,
  "status": "passed"
});
});