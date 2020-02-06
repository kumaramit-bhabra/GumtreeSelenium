$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/LandingPage.feature");
formatter.feature({
  "name": "To test Landing Page of Google.com and functionality associated with it",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the operator is able to perform search by keyword",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for product by entering text \"Cars in London\" and selects it",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.search_for_product_by_entering_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/SearchResultPage.feature");
formatter.feature({
  "name": "Validate search Results being displayed after user performs search and able to navigate to link having specific text",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user is on landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LandingPageTest.isUserOnLandingPageTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for product by entering text \"Cars in London\" and selects it",
  "keyword": "And "
});
formatter.match({
  "location": "LandingPageTest.search_for_product_by_entering_text(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate the search Results that are being displayed and clicks on link having specific text",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "search result window should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchResultPageTest.isSearchResultWindowDisplayedTest()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Identify links having \"gumtree\" in the URL",
  "keyword": "And "
});
formatter.match({
  "location": "SearchResultPageTest.identifyLinkHavingText(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on each link",
  "keyword": "And "
});
formatter.match({
  "location": "SearchResultPageTest.clickOnEachLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "For each opened link validate title and count displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SearchResultPageTest.validateTheTitleAndCount()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"h1.h1-responsive\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LATITUDE_E7240\u0027, ip: \u0027169.254.130.223\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 78.0.3904.70 (edb9c9f3de024..., userDataDir: C:\\Users\\Admin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54059}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 9a3b209e4a02e4d013cc4fd1079b3bde\n*** Element info: {Using\u003dcss selector, value\u003dh1.h1-responsive}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\r\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Pages.SearchResultPage.validateTitleAndCount(SearchResultPage.java:85)\r\n\tat testPages.SearchResultPageTest.validateTheTitleAndCount(SearchResultPageTest.java:35)\r\n\tat ✽.For each opened link validate title and count displayed(file:src/test/java/features/SearchResultPage.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});