package com.sdds.plugin.core.task

import org.gradle.api.Project
import org.gradle.api.file.Directory
import org.gradle.api.file.RegularFile
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.register

/**
 * Регистрирует gradle-task для распаковки zip-архива
 *
 * @param name имя задачи
 * @param inputZip файл с исходным zip-архивом
 * @param outputDir директория, куда будет распакован архив
 * @param dependsOnTask gradle-task, от которого будет зависеть task распаковки
 */
fun Project.registerUnzip(
    name: String,
    inputZip: Provider<RegularFile>,
    outputDir: Provider<Directory>,
    dependsOnTask: Any,
): TaskProvider<Copy> {
    return project.tasks.register<Copy>(name) {
        from(zipTree(inputZip.get().asFile))
        into(outputDir)
        dependsOn(dependsOnTask)
    }
}
