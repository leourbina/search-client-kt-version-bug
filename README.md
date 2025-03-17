# search-client Kotlin version bug

This project is a minimal reproduction of attempting to use search-client with Kotlin 1.9 in a Micronaut project. 


## Bug

Any version greaten than or equal to 2.3.6 of `com.jillesvangurp:search-client` yields errors of the form:

```
<module> was compiled with an incompatible version of Kotlin. The binary version of its metadata is 2.1.0, expected version is 1.9.0.
```

Any version less than 2.3.6 compiles and works correctly


### To reproduce

Just run

```
./gradlew test
```

And the build will fail. To check that it works with 2.3.5, go to `build.gradle.kts` and swap with 2.3.5 and re-run to verify it works.
