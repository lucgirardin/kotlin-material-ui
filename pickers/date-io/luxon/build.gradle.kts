group = Packages.group
version = Packages.version

plugins {
    kotlin("js")
    id("maven-publishing")
    //id("com.jfrog.bintray")
}

dependencies {
    api(npm("luxon", Libraries.Npm.luxon))
}
