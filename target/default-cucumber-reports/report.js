$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration on MoneyGaming",
  "description": "",
  "id": "user-registration-on-moneygaming",
  "keyword": "Feature"
});
formatter.before({
  "duration": 26261310900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should validate required field message under the date of birth box",
  "description": "",
  "id": "user-registration-on-moneygaming;user-should-validate-required-field-message-under-the-date-of-birth-box",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@UserRegistration"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the MoneyGaming main page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Join Now button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "clicks on Job Title from the dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "enters required fields",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "checks the over the age of 18 text",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "clicks on JOIN NOW button to submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should see \"This field is required\" message",
  "keyword": "Then "
});
formatter.match({
  "location": "RegistrationSteps.user_is_on_the_MoneyGaming_main_page()"
});
formatter.result({
  "duration": 232138800,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.user_clicks_on_Join_Now_button()"
});
formatter.result({
  "duration": 21069511900,
  "status": "passed"
});
formatter.match({
  "location": "RegistrationSteps.clicks_on_Job_Title_from_the_dropdown()"
});
formatter.result({
  "duration": 20014017000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".title\\ required\"}\n  (Session info: chrome\u003d92.0.4515.131)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DELL\u0027, ip: \u0027192.168.254.21\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 92.0.4515.131, chrome: {chromedriverVersion: 92.0.4515.107 (87a818b10553..., userDataDir: C:\\Users\\Owner\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57805}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 795952f50718d57fef69131ff905f402\n*** Element info: {Using\u003dclass name, value\u003dtitle required}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat MoneyGamingRegistration.page.RegistrationPage.selectTitle(RegistrationPage.java:50)\r\n\tat MoneyGamingRegistration.steps.RegistrationSteps.clicks_on_Job_Title_from_the_dropdown(RegistrationSteps.java:24)\r\n\tat ✽.And clicks on Job Title from the dropdown(Features/registration.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "RegistrationSteps.enters_required_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "18",
      "offset": 27
    }
  ],
  "location": "RegistrationSteps.checks_the_over_the_age_of_text(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RegistrationSteps.clicks_on_JOIN_NOW_button_to_submit_the_form()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "This field is required",
      "offset": 17
    }
  ],
  "location": "RegistrationSteps.user_should_see_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1283454200,
  "status": "passed"
});
});