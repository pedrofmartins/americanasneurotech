$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("compra.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: pedrofalcao@outlook.com"
    },
    {
      "line": 2,
      "value": "#language: en"
    }
  ],
  "line": 4,
  "name": "Purchase",
  "description": "As a visitor of the ecommerce website\r\nI want to choose one product\r\nSo that I can see the products and costs of what I want to purchase",
  "id": "purchase",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Select one product to buy",
  "description": "",
  "id": "purchase;select-one-product-to-buy",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I have a list of products",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I search one \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click to search",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters \"\u003ccep\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click to submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Check the basket",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "purchase;select-one-product-to-buy;",
  "rows": [
    {
      "cells": [
        "product",
        "cep"
      ],
      "line": 20,
      "id": "purchase;select-one-product-to-buy;;1"
    },
    {
      "cells": [
        "ps4",
        "54430250"
      ],
      "line": 21,
      "id": "purchase;select-one-product-to-buy;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Select one product to buy",
  "description": "",
  "id": "purchase;select-one-product-to-buy;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "I have a list of products",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I search one \"ps4\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click to search",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user enters \"54430250\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "I click to submit",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Check the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "PurchaseSteps.user_app_home_page()"
});
formatter.result({
  "duration": 11336427300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ps4",
      "offset": 14
    }
  ],
  "location": "PurchaseSteps.user_clicks_on_Search(String)"
});
formatter.result({
  "duration": 8392772700,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.user_clicks_on_Buynow()"
});
formatter.result({
  "duration": 6790312100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "54430250",
      "offset": 13
    }
  ],
  "location": "PurchaseSteps.user_enters_cep(String)"
});
formatter.result({
  "duration": 3113152100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.user_clicks_on_submit()"
});
formatter.result({
  "duration": 2278712800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.close_the_Browser()"
});
formatter.result({
  "duration": 4358955600,
  "status": "passed"
});
});