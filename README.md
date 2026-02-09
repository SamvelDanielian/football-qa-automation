# UI Automation Testing – Football Website

## 📌 Project Overview
This project is a **UI test automation framework** built to validate the core functionality and navigation of a football-themed web application. 

The framework follows **QA best practices** to ensure maintainability and readability:
* **Page Object Model (POM):** Enhances test maintenance and reduces code duplication.
* **Behavior Driven Development (BDD):** Uses Gherkin syntax for human-readable test scenarios.
* **Clear Separation of Concerns:** Decouples test logic from page-specific actions.
* **Scalable Structure:** Built to easily accommodate new features and pages.

It serves as a **learning and practical QA automation project** to demonstrate real-world Selenium automation skills.

---

## 🛠 Tech Stack
* **Language:** Java 17
* **Automation Tool:** Selenium WebDriver
* **Framework:** Cucumber (BDD)
* **Build Tool:** Maven
* **Assertion Library:** JUnit
* **CI/CD:** GitHub Actions (CI – in progress)

---

## 🧪 Test Coverage
The automation suite currently validates the following areas:

### Home Page
* Verify Home page opens successfully.
* Confirm Welcome text is displayed correctly.

### Navigation Tests
* **News Page:** Verification of navigation and header.
* **Matches Page:** Validation of match listings.
* **Trainings Page:** Check for training content.
* **Player Pages:** Specific navigation to the Gavi page.
* **Media:** Navigation to the Edits page.

## 📊 Reports
After test execution, **Cucumber HTML reports** are generated automatically inside the project under the `target/html-report` directory. 

These reports provide a visual breakdown of:
* **Scenario Execution Status:** Overview of passed and failed tests.
* **Detailed Step-level Results:** Timing and status for each specific Gherkin step.
* **Failure Analysis:** Clear logs to assist in debugging failed assertions.

## ⚙️ CI Status
A **GitHub Actions** CI workflow is configured to:

* **Build the project** using Maven.
* **Start a local static web server** to host the football application.
* **Execute UI tests** using Selenium in a headless environment.
* **Upload test reports** as build artifacts for review.

> **Note:** CI execution is currently under refinement due to environment-related constraints (specifically headless browser configuration and static server timing). Local execution currently remains the most reliable method for full test results.
>
> ## 🎯 Key Learning Outcomes
* **Designing Scalable Frameworks:** Implementing a structure that grows with the application.
* **Page Object Model (POM):** Reducing maintenance by separating page-specific elements from test logic.
* **Behavior Driven Development (BDD):** Writing clear, human-readable scenarios using Gherkin.
* **Selenium Wait Strategies:** Managing synchronization to ensure test stability and reduce flakiness.
* **CI/CD Integration:** Learning to automate the testing lifecycle via GitHub Actions.

---

## 👤 Author
**Sam Danielyan** *Junior QA Automation Engineer*  
