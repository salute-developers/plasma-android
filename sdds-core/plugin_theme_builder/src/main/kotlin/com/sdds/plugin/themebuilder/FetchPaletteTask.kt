package com.sdds.plugin.themebuilder

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.TaskAction
import java.net.URL

/**
 * Gradle-task для загрузки файла палитры
 */
internal abstract class FetchPaletteTask : DefaultTask() {

    /**
     * Строка URL файла палитры
     */
    @get:Input
    abstract val url: Property<String>

    /**
     * Местоположение файла палитры после загрузки
     */
    @get:OutputFile
    abstract val paletteFile: RegularFileProperty

    /**
     * Загружает файл с палитрой
     */
    @TaskAction
    fun fetch() {
        runCatching { URL(url.get()).readBytes() }
            .onSuccess { themeContent ->
                val paletteJSON = paletteFile.get().asFile
                paletteJSON.writeBytes(themeContent)
            }.onFailure {
                logger.error("Can't fetch palette", it)
                throw it
            }
    }
}
