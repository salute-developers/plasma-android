package com.sdds.plugin.themebuilder

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.net.URL

/**
 * Gradle-task для загрузки файла темы
 * @author Малышев Александр on 04.03.2024
 */
internal abstract class FetchThemeTask : DefaultTask() {

    /**
     * Строка URL файла темы
     */
    @get:Input
    abstract val url: Property<String>

    /**
     * Местоположение файла с темой после загрузки
     */
    @get:OutputFile
    abstract val themeFile: RegularFileProperty

    /**
     * Загружает файл с темой
     */
    @TaskAction
    fun fetch() {
        runCatching { URL(url.get()).readBytes() }
            .onSuccess { themeContent ->
                val themeJSON = themeFile.get().asFile
                themeJSON.writeBytes(themeContent)
            }.onFailure {
                logger.error("Can't fetch theme json", it)
                throw it
            }
    }
}