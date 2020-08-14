plugins {
    kotlin("jvm") version "1.3.72"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


object Versions {
    const val kotest = "4.1.3"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
    setOf("runner-junit5", "runner-console", "assertions-core", "property", "extensions-spring")
        .forEach { testImplementation("io.kotest:kotest-$it-jvm:${Versions.kotest}") }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
