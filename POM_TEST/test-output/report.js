$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/Selennium/POM_TEST/src/main/java/Com/QA/Feature/SignUpPage.feature");
formatter.feature({
  "line": 3,
  "name": "Testing SignUp Page Of FaceBook",
  "description": "",
  "id": "testing-signup-page-of-facebook",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "User Filling Details",
  "description": "",
  "id": "testing-signup-page-of-facebook;user-filling-details",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "validate the button create new account is enable",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on button create new account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate the SignUp Page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Entering \"\u003cFirst_Name\u003e\" and \"\u003cSurname\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Wrighting \"\u003cMobile_No\u003e\" and \"\u003cNew_Password\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User giving Date Of Birth",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Giving Gender",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "testing-signup-page-of-facebook;user-filling-details;",
  "rows": [
    {
      "cells": [
        "First_Name",
        "Surname",
        "Mobile_No",
        "New_Password"
      ],
      "line": 17,
      "id": "testing-signup-page-of-facebook;user-filling-details;;1"
    },
    {
      "cells": [
        "Prasad",
        "Arewar",
        "7588590402",
        "prasad123"
      ],
      "line": 18,
      "id": "testing-signup-page-of-facebook;user-filling-details;;2"
    },
    {
      "cells": [
        "Sharad",
        "Arewar",
        "7588590401",
        "prasad1234"
      ],
      "line": 19,
      "id": "testing-signup-page-of-facebook;user-filling-details;;3"
    },
    {
      "cells": [
        "Sadhana",
        "Arewar",
        "7588590400",
        "prasad234"
      ],
      "line": 20,
      "id": "testing-signup-page-of-facebook;user-filling-details;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 15206505900,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User Filling Details",
  "description": "",
  "id": "testing-signup-page-of-facebook;user-filling-details;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "validate the button create new account is enable",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on button create new account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate the SignUp Page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Entering \"Prasad\" and \"Arewar\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Wrighting \"7588590402\" and \"prasad123\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User giving Date Of Birth",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Giving Gender",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpPage.user_is_on_HomePage()"
});
formatter.result({
  "duration": 332493900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.validate_the_button_create_new_account_is_enable()"
});
formatter.result({
  "duration": 377404700,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_click_on_button_create_new_account()"
});
formatter.result({
  "duration": 3377273000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.validate_the_SignUp_Page_title()"
});
formatter.result({
  "duration": 42970500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Prasad",
      "offset": 15
    },
    {
      "val": "Arewar",
      "offset": 28
    }
  ],
  "location": "SignUpPage.user_Entering_and(String,String)"
});
formatter.result({
  "duration": 1398070700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7588590402",
      "offset": 16
    },
    {
      "val": "prasad123",
      "offset": 33
    }
  ],
  "location": "SignUpPage.user_Wrighting_and(String,String)"
});
formatter.result({
  "duration": 834607400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_giving_Date_Of_Birth()"
});
formatter.result({
  "duration": 1268486500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_Giving_Gender()"
});
formatter.result({
  "duration": 320047700,
  "status": "passed"
});
formatter.after({
  "duration": 1740045900,
  "status": "passed"
});
formatter.before({
  "duration": 13359734000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User Filling Details",
  "description": "",
  "id": "testing-signup-page-of-facebook;user-filling-details;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "validate the button create new account is enable",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on button create new account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate the SignUp Page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Entering \"Sharad\" and \"Arewar\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Wrighting \"7588590401\" and \"prasad1234\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User giving Date Of Birth",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Giving Gender",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpPage.user_is_on_HomePage()"
});
formatter.result({
  "duration": 31595800,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.validate_the_button_create_new_account_is_enable()"
});
formatter.result({
  "duration": 324065300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_click_on_button_create_new_account()"
});
formatter.result({
  "duration": 3221899000,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.validate_the_SignUp_Page_title()"
});
formatter.result({
  "duration": 527219800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sharad",
      "offset": 15
    },
    {
      "val": "Arewar",
      "offset": 28
    }
  ],
  "location": "SignUpPage.user_Entering_and(String,String)"
});
formatter.result({
  "duration": 627878100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7588590401",
      "offset": 16
    },
    {
      "val": "prasad1234",
      "offset": 33
    }
  ],
  "location": "SignUpPage.user_Wrighting_and(String,String)"
});
formatter.result({
  "duration": 636184900,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_giving_Date_Of_Birth()"
});
formatter.result({
  "duration": 1200382500,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_Giving_Gender()"
});
formatter.result({
  "duration": 305075100,
  "status": "passed"
});
formatter.after({
  "duration": 2666133300,
  "status": "passed"
});
formatter.before({
  "duration": 10227480700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "User Filling Details",
  "description": "",
  "id": "testing-signup-page-of-facebook;user-filling-details;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "validate the button create new account is enable",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user click on button create new account",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Validate the SignUp Page title",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User Entering \"Sadhana\" and \"Arewar\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User Wrighting \"7588590400\" and \"prasad234\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User giving Date Of Birth",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Giving Gender",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpPage.user_is_on_HomePage()"
});
formatter.result({
  "duration": 29291200,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.validate_the_button_create_new_account_is_enable()"
});
formatter.result({
  "duration": 270547300,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_click_on_button_create_new_account()"
});
formatter.result({
  "duration": 3288882400,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.validate_the_SignUp_Page_title()"
});
formatter.result({
  "duration": 17579700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sadhana",
      "offset": 15
    },
    {
      "val": "Arewar",
      "offset": 29
    }
  ],
  "location": "SignUpPage.user_Entering_and(String,String)"
});
formatter.result({
  "duration": 923613200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7588590400",
      "offset": 16
    },
    {
      "val": "prasad234",
      "offset": 33
    }
  ],
  "location": "SignUpPage.user_Wrighting_and(String,String)"
});
formatter.result({
  "duration": 809270100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_giving_Date_Of_Birth()"
});
formatter.result({
  "duration": 1165424100,
  "status": "passed"
});
formatter.match({
  "location": "SignUpPage.user_Giving_Gender()"
});
formatter.result({
  "duration": 262737600,
  "status": "passed"
});
formatter.after({
  "duration": 1368374000,
  "status": "passed"
});
});