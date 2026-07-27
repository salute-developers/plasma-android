package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.serializer.Serializer
import com.sdds.plugin.themebuilder.internal.universal.compose.ComposeComponentMeta
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.decodeFromStream
import kotlinx.serialization.json.encodeToStream
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipFile

/**
 * Gradle-задача для поиска и чтения файлов метаданных
 * `uikit-compose-api-meta.json` из зависимостей classpath.
 *
 * Парсит найденный JSON в список [ComposeComponentMeta] и записывает его в [outputFile].
 * Если файл не найден, записывает пустой массив.
 */
internal abstract class UikitComposeApiMetaTask : DefaultTask() {

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val metaClasspath: ConfigurableFileCollection

    @get:OutputFile
    abstract val outputFile: RegularFileProperty

    @OptIn(ExperimentalSerializationApi::class)
    @TaskAction
    fun generate() {
        val meta = metaClasspath.files
            .firstNotNullOfOrNull(::readMeta)
            ?: emptyList()

        outputFile.get().asFile.outputStream().use { stream ->
            Serializer.componentConfig.encodeToStream(meta, stream)
        }
    }

    @OptIn(ExperimentalSerializationApi::class)
    private fun readMeta(file: File): List<ComposeComponentMeta>? {
        if (!file.exists()) return null
        if (file.isDirectory) {
            return file.walkTopDown()
                .firstOrNull { it.isFile && it.invariantSeparatorsPath.endsWith("uikit-compose-api-meta.json") }
                ?.inputStream()
                ?.use { stream ->
                    Serializer.componentConfig.decodeFromStream<List<ComposeComponentMeta>>(stream)
                }
        }
        return ZipFile(file).use { zip ->
            zip.entries().toList()
                .firstOrNull { it.name.endsWith("uikit-compose-api-meta.json") }
                ?.let { zip.getInputStream(it) }
                ?.use { Serializer.componentConfig.decodeFromStream<List<ComposeComponentMeta>>(it) }
        }
    }
}
