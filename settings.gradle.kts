dependencyResolutionManagement {
  repositories {
    maven("https://maven.tryformation.com/releases") {
      content {
        includeGroup("com.jillesvangurp")
      }
    }
    mavenCentral()
  }
}

rootProject.name="demo"

