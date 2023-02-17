package ru.otus.gradleotus

import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler

object AndroidXDeps {

    object Versions {
        const val androidxCoreVer = "1.9.0"
        const val androidxAppcompatVer = "1.6.1"
        const val androidxConstraintlayoutVer = "2.1.4"
    }

    const val core = "androidx.core:core-ktx:${Versions.androidxCoreVer}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.androidxAppcompatVer}"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.androidxConstraintlayoutVer}"

    fun DependencyHandler.all() = this.apply {
        implementation(core)
        implementation(appcompat)
        implementation(constraintlayout)
    }
}

internal fun DependencyHandler.implementation(depNotation: Any): Dependency? =
    add("implementation",depNotation)