# Kotlin Logging

Logging library for Kotlin.

## Release

see https://github.com/mbogner/spring-boot-bom for more details.

### Build

Local:
```shell
./gradlew clean signMavenPublication publishToMavenLocal
```

see `~/.m2/repository/dev/mbo/kotlin-logging` for the created content

Release:
```shell
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```

By running this you don't need to use the web interface to close and release the library.

### Web Process

https://s01.oss.sonatype.org