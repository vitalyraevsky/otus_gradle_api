package ru.otus.gradleotus

import org.gradle.api.JavaVersion

object AppConfig {

    const val androidMinSdk = 23
    const val androidTargetSdk = 33
    const val androidConpileSdk = 33


}


object AppConfig2 {
    const val projectName = "GradleApiLesson"

    const val applicationId = "ru.otus.gradleapi"
    const val compileSdkVersion = 33
    const val minSdkVersion = 22
    const val targetSdkVersion = 33

    val javaVersion = JavaVersion.VERSION_11
    const val jvmTargetVersion = "11"
}

enum class BuildTypes(val title: String, val isMinifyEnabled: Boolean) {
    DEBUG(title = "debug", isMinifyEnabled = false),
    RELEASE(title = "release", isMinifyEnabled = true)
}