# AutoExSel Cucumber Test Automation Framework

A comprehensive test automation framework built with Java, Selenium WebDriver, Cucumber BDD, and TestNG for web application testing.

## 🚀 Overview

This project provides a robust and scalable test automation solution that combines:
- **Cucumber BDD** for behavior-driven development and readable test scenarios
- **Selenium WebDriver** for web browser automation
- **TestNG** as the test execution framework
- **Maven** for dependency management and build automation
- **ExtentReports** for detailed test reporting

## 📋 Features

- ✅ **BDD Framework**: Write tests in natural language using Gherkin syntax
- ✅ **Cross-browser Testing**: Support for multiple browsers via WebDriverManager
- ✅ **Page Object Model**: Organized locator management with JSON-based element definitions
- ✅ **Configurable Environment**: Support for multiple test environments (QA, DEV)
- ✅ **Comprehensive Reporting**: ExtentReports and Cucumber HTML reports
- ✅ **API Testing**: REST Assured integration for API test automation
- ✅ **Database Testing**: PostgreSQL database connectivity for data validation
- ✅ **Mobile Testing**: Appium integration for mobile app testing
- ✅ **Parallel Execution**: TestNG parallel execution capabilities

## 🛠️ Technology Stack

| Technology | Version | Purpose |
|------------|---------|----------|
| Java | 1.8+ | Programming Language |
| Maven | 3.6+ | Build Tool & Dependency Management |
| Selenium WebDriver | 3.12.0 | Web Browser Automation |
| Cucumber | 7.15.0 | BDD Framework |
| TestNG | Latest | Test Execution Framework |
| WebDriverManager | 5.6.2 | Browser Driver Management |
| ExtentReports | 3.0.0 | Test Reporting |
| REST Assured | 3.1.1 | API Testing |
| Appium | 6.0.0 | Mobile Testing |
| PostgreSQL | 9.1 | Database Testing |

## 📁 Project Structure

```
autoexsel-cucumber/
├── src/test/java/
│   ├── autoexsel/
│   │   ├── plugins/wrapper/          # Custom plugins
│   │   ├── prebuilt/stepdef/         # Pre-built step definitions
│   │   └── test/runner/              # Test runners
│   └── com/custom/stepdef/           # Custom step definitions
├── features/web/                     # Cucumber feature files
├── locators/web/                     # Element locators (JSON)
├── testdata/web/                     # Test data files
├── config.json                       # Environment configuration
├── autoexsel-config.json            # Framework configuration
└── pom.xml                          # Maven dependencies
```

## 🚦 Getting Started

### Prerequisites

- Java JDK 1.8 or higher
- Maven 3.6 or higher
- Git
- IDE (IntelliJ IDEA, Eclipse, or VS Code)

### Installation

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd autoexsel-cucumber
   ```

2. **Install dependencies**
   ```bash
   mvn clean install
   ```

3. **Verify installation**
   ```bash
   mvn test -Dtest=TestNGTestRunner
   ```

## ⚙️ Configuration

### Environment Configuration

Edit `config.json` to configure different environments:

```json
{
  "testEnv": "qa",
  "waitInSeconds": "10",
  "reportType": "aventstack",
  "env": {
    "qa": {
      "base-uri": "https://your-qa-environment.com",
      "db": {
        "url": "jdbc:postgresql://localhost:5432/testdb",
        "username": "testuser",
        "password": "encrypted_password"
      }
    }
  }
}
```

### Test Runner Configuration

Modify `TestNGTestRunner.java` to customize test execution:

```java
@CucumberOptions(
    features = "features/web/",
    glue = {"autoexsel/prebuilt/stepdef", "com/custom/stepdef"},
    tags = "@SauceDemo",
    plugin = {
        "pretty",
        "json:target/cucumber-reports/report.json",
        "html:target/cucumber-reports/report.html"
    }
)
```

## 📝 Writing Tests

### Feature Files

Create feature files in `features/web/` directory:

```gherkin
@SauceDemo
Feature: Verify login functionality

  Scenario: Successful login
    Given I open application under test
    When I enter "standard_user" in "userName" on "SauceLogin" page
    And I enter "secret_sauce" in "password"
    And I click "loginButton"
    Then I verify "pageHeader" is equals to "Swag Labs" on "Inventory" page
```

### Element Locators

Define element locators in JSON files under `locators/web/`:

```json
{
  "userName": "id=user-name",
  "password": "id=password",
  "loginButton": "id=login-button"
}
```

### Step Definitions

Implement custom step definitions in `src/test/java/com/custom/stepdef/`:

```java
@Given("I open application under test")
public void openApplication() {
    // Implementation
}
```

## 🏃‍♂️ Running Tests

### Command Line Execution

```bash
# Run all tests
mvn test

# Run specific feature
mvn test -Dcucumber.options="--tags @SauceDemo"

# Run with specific browser
mvn test -Dbrowser=chrome

# Run with specific environment
mvn test -DtestEnv=qa
```

### IDE Execution

1. Right-click on `TestNGTestRunner.java`
2. Select "Run As" → "TestNG Test"

## 📊 Test Reports

### Cucumber Reports
- **HTML Report**: `target/cucumber-reports/report.html`
- **JSON Report**: `target/cucumber-reports/report.json`

### ExtentReports
- Generated automatically after test execution
- Location: `target/extent-reports/`

### Maven Cucumber Reporting
```bash
mvn verify
```
Reports generated in `target/cucumber-html-reports/`

## 🧪 Test Examples

The framework includes sample tests for:

1. **Google Search**: Basic web navigation and search functionality
2. **SauceDemo Login**: E-commerce application login and logout flows

## 🔧 Advanced Features

### Parallel Execution

Configure parallel execution in `testng.xml`:

```xml
<suite name="ParallelSuite" parallel="methods" thread-count="3">
    <test name="ParallelTest">
        <classes>
            <class name="autoexsel.test.runner.TestNGTestRunner"/>
        </classes>
    </test>
</suite>
```

### API Testing

The framework supports REST API testing with REST Assured:

```java
given()
    .header("Authorization", "Bearer token")
    .when()
    .get("/api/endpoint")
    .then()
    .statusCode(200);
```

### Database Testing

Database connectivity is configured for PostgreSQL:

```java
// Database operations using configured connection
String dbPassword = db().getEncryptedPassword("TEST_PASSWORD");
```

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 📞 Support

For questions and support:
- Create an issue in the repository
- Contact the development team
- Check the documentation in the `docs/` folder

## 🔄 Version History

- **v0.0.1-SNAPSHOT**: Initial release with basic BDD framework setup

---

**Happy Testing! 🎉**
