package com.sdds.plugin.core.task

import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.file.RegularFile
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.provider.Provider
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.TaskProvider
import org.gradle.kotlin.dsl.register
import java.net.URL

/**
 * Gradle-task для загрузки файла
 */
abstract class FetchFileTask : DefaultTask() {

    /**
     * Строка URL файла
     */
    @get:Input
    abstract val url: Property<String>

    /**
     * Местоположение файла после загрузки
     */
    @get:OutputFile
    abstract val file: RegularFileProperty

    /**
     * Загружает файл
     */
    @TaskAction
    fun fetch() {
        runCatching { URL(url.get()).readBytes() }
            .onSuccess { fileContent ->
                val outputFile = file.get().asFile
                outputFile.writeBytes(fileContent)
            }.onFailure {
                logger.error("Can't fetch file", it)
                throw it
            }
    }
}

/**
 * Регистрирует gradle-task [FetchFileTask]
 *
 * @param name имя задачи
 * @param fileUrl ссылка для скачивания файла
 * @param outputFile выходной файл
 */
fun Project.registerFileFetcher(
    name: String,
    fileUrl: String,
    outputFile: Provider<RegularFile>,
): TaskProvider<FetchFileTask> {
    return project.tasks.register<FetchFileTask>(name) {
        url.set(fileUrl)
        file.set(outputFile)
    }
}
