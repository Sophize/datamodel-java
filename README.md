# datamodel-java
This repository contains the classes that model data that can be ingested by Sophize. Also contains utility functions to read and write these classes as json.

## Publish to maven central
This library is published to maven with group-id `org.sophize` and artifact `datamodel`

### Publishing steps
To publish a new version of the library to maven, run the following commands

```
mvn clean verify
mvn release:prepare
mvn release: perform

git push --tags
git push origin master
```

The publishing to maven was setup using instructions at [dzone](https://dzone.com/articles/publish-your-artifacts-to-maven-central).
