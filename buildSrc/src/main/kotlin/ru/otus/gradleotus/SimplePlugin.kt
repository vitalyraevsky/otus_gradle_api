package ru.otus.gradleotus

import org.gradle.api.Plugin
import org.gradle.api.Project

class SimplePlugin : Plugin<Project>{

    override fun apply(project: Project) {
        print("this is plugin config")
        val task = project.tasks.register("MyTask", SimpleTask::class.java)
        task.configure {
            it.group = "otus"
        }
    }
}