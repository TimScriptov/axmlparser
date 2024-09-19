plugins {
    java
    id("maven-publish")
    kotlin("jvm")
}

repositories {
    google()
    mavenCentral()
    maven { url = uri("https://www.jitpack.io" ) }
}

dependencies {
    implementation("org.jetbrains:annotations:24.0.1")
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = "com.mcal"
            artifactId = "axmlparser"
            version = "1.0.4"

            afterEvaluate {
                from(components["java"])
            }
        }
    }
}
