
## Kenya Emr  Automated Testing Framework.
This is the Kenya EMR  Automated Testing Framework that integrates both BDD with Cucumber and Functional Testing with Selenium using the Page Object Model design for high Maintainability, Readability and Re-usability.

[![Kenya EMR  QA](https://github.com/palladiumkenya/kenyaemr-contrib-qaframework/actions/workflows/qa.yml/badge.svg)](https://github.com/palladiumkenya/kenyaemr-contrib-qaframework/actions/workflows/qa.yml)

## Installing dependencies 

    mvn clean install -DskipTests=true

## Configuration
- Set Your test configurations in [src/test/resources/test.properties](./src/test/resources/test.properties)

- See Feature files under [src/features/automation](./src/features/automation)

### Running tests

1. All Test Features

        mvn test

2. To run individual Test Features/categories ,You need to filter them by the feature filter tag.

        mvn test -Dcucumber.filter.tags='<@tag>'   

    ie , to run Login Feature tests  

         mvn test -Dcucumber.filter.tags='@login'   

 See All test features bellow with their coresponding filter tags      




| Test Feature        |Filter Tag      |
|:------------------: |:-------------: |
| Login               | @login         | 
| password            | @password      |
| Form                | @form          |