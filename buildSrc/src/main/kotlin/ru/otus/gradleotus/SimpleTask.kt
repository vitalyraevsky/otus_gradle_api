package ru.otus.gradleotus

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.TaskAction

@CacheableTask
open class SimpleTask : DefaultTask() {

    @TaskAction
    fun act() {
        print("this is task")
    }
}