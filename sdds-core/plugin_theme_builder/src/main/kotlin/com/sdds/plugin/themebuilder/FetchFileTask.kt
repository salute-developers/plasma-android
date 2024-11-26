package com.sdds.plugin.themebuilder

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.net.URL

/**
 * Gradle-task для загрузки файла
 * @author Малышев Александр on 04.03.2024
 */
internal abstract class FetchFileTask : DefaultTask() {

    /**
     * Строка URL файла темы
     */
    @get:Input
    abstract val url: Property<String>

    /**
     * Местоположение архива с темой после загрузки
     */
    @get:OutputFile
    abstract val file: RegularFileProperty

    /**
     * Строка с указанием ошибки
     */
    @get:Input
    abstract val failMessage: Property<String>

    /**
     * Загружает файл с темой
     */
    @TaskAction
    fun fetch() {
        runCatching { URL(url.get()).readBytes() }
            .onSuccess { themeContent ->
                val json = file.get().asFile
                json.writeBytes(themeContent)
            }.onFailure {
                logger.error(failMessage.get(), it)
                throw it
            }
    }
}
