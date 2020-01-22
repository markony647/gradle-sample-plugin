import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    //id("org.jetbrains.kotlin.jvm") version "1.3.61"
    kotlin("jvm") version "1.3.50"
    `java-gradle-plugin`
}

gradlePlugin {
    plugins {
        create("testFormatCheck") {
            id = "reminder-test-format-checker"
            implementationClass = "com.example.plugins.TestFormatCheckPlugin"
        }
    }
}

repositories {
    jcenter()
}

dependencies {
    compile("com.github.javaparser:javaparser-core:3.14.7")
    implementation(kotlin("stdlib-jdk8"))
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}