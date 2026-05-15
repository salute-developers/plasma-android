package com.sdds.plugin.themebuilder

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.util.zip.ZipFile

/**
 * Gradle-задача для поиска и чтения файлов метаданных
 * `uikit-api-meta.json` из зависимостей classpath.
 *
 * Используется для агрегации или отладки API-метаданных,
 * сгенерированных KSP-процессором.
 */
internal abstract class UikitApiMetaTask : DefaultTask() {

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val metaClasspath: ConfigurableFileCollection

    @TaskAction
    fun generate() {
        metaClasspath.files.forEach { file ->
            if (!file.exists()) return@forEach
            ZipFile(file).use { zip ->
                val entries = zip.entries().toList()
                val jsonEntry = entries.firstOrNull { it.name.endsWith("uikit-api-meta.json") }
                jsonEntry?.let {
                    val text = zip.getInputStream(it).bufferedReader().readText()
                    logger.warn("jsonText=$text")
                }
            }
        }
    }
}
