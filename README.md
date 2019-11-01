# Android Unit Tests

[![Build Status](https://dev.azure.com/oliverspryn/android-unit-tests/_apis/build/status/oliverspryn.android-unit-tests?branchName=develop)](https://dev.azure.com/oliverspryn/android-unit-tests/_build/latest?definitionId=2&branchName=develop) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/d44f4551041d4a2faa80d9528f66ec40)](https://www.codacy.com/manual/oliverspryn/android-unit-tests?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=oliverspryn/android-unit-tests&amp;utm_campaign=Badge_Grade) [![Maintainability](https://api.codeclimate.com/v1/badges/2240183e96e15084333d/maintainability)](https://codeclimate.com/github/oliverspryn/android-unit-tests/maintainability) [![Coverage Status](https://coveralls.io/repos/github/oliverspryn/android-unit-tests/badge.svg)](https://coveralls.io/github/oliverspryn/android-unit-tests) [![Known Vulnerabilities](https://snyk.io/test/github/oliverspryn/android-unit-tests/badge.svg)](https://snyk.io/test/github/oliverspryn/android-unit-tests)

Companion code for my Medium.com article: [Writing a Fully Unit Testable Android App](https://medium.com/@oliverspryn/writing-a-fully-unit-testable-android-app-90cd0310f18f)

## Running the Application

To build this application, simply run:

```bash
./gradlew assembleDebug
```

The output is shown in `app/build/outputs/apk/debug/app-debug.apk`

Running unit tests and extracting the coverage report is also just as easy:

```bash
./gradlew test
```

The coverage reports appear in `app/build/reports/jacoco/jacocoTestReport`
