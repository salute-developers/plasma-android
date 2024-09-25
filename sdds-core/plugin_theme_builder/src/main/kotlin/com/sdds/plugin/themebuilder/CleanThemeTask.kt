package com.sdds.plugin.themebuilder

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * Gradle задача на удаление сгенерированной темы
 * @author Малышев Александр on 20.09.2024
 */
abstract class CleanThemeTask : DefaultTask() {

    /**
     * Путь для сохранения kt-файлов токенов
     */
    @get:Input
    abstract val outputDirPath: Property<String>

    /**
     * Путь для сохранения xml-файлов токенов
     */
    @get:Input
    abstract val outputResDirPath: Property<String>

    /**
     * Название пакета для файлов kotlin
     */
    @get:Input
    abstract val packageName: Property<String>

    /**
     * Очищает рабочую директорию от файлов темы
     */
    @TaskAction
    fun clean() {
        val packagePath = packageName.get().replace(".", "/")
        val outputDir = File("${project.projectDir.path}/${outputDirPath.get()}/$packagePath")
        val outputResDir = File("${project.projectDir.path}/${outputResDirPath.get()}")
        outputDir.deleteRecursively()
        outputResDir.deleteRecursively()
    }
}
