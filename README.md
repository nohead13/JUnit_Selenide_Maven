# Swedbank insurance calculator UI Tests
Do something something

## Technology part
- Maven
- JUnit
- Selenide
- Java

## Usage
```If you need using special properties could be  ```
Add for every env by yourself under *src/main/resources/ENV_name/*config.properties.** folder.

Run all tests:
``` bash
mvn clean test
```
## Environment variables
* WEBDRIVER_LOCATION - specifies whether to run in local browser, in Selenium Grid or cloud. Default is local browser
* BROWSER - chrome (default), firefox, phantomjs
* SELENIDE_TIMEOUT - timeout value for Selenide element waits