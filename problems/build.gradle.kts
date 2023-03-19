plugins {
    kotlin("jvm") version "1.7.0"
    java
}

group = "com.palgogo"
version = "unspecified"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}