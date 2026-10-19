package com.sdds.plugin.themebuilder.preview

import com.sdds.plugin.themebuilder.readComposeApiMeta
import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File

/** Имя файла со списком компонентов рядом со сгенерированными исходниками. */
internal const val PREVIEW_COMPONENTS_FILE = "components.txt"

/**
 * Порождает фабрики стилей Compose preview по `uikit-compose-api-meta.json` из [metaClasspath].
 *
 * Для каждого компонента меты создаётся исходный файл фабрики и общий реестр; список имён компонентов
 * записывается в [PREVIEW_COMPONENTS_FILE] для manifest плагина preview.
 */
@CacheableTask
internal abstract class GenerateComposePreviewTask : DefaultTask() {

    /** JAR-архивы или каталоги, в которых лежит `uikit-compose-api-meta.json`. */
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val metaClasspath: ConfigurableFileCollection

    /** Имена компонентов через запятую; без значения генерируются все компоненты меты. */
    @get:Input
    @get:Optional
    abstract val components: Property<String>

    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    @TaskAction
    fun generate() {
        val meta = metaClasspath.files.firstNotNullOfOrNull(::readComposeApiMeta)
            ?: error(
                "Не найден ресурс uikit-compose-api-meta.json в: " +
                    metaClasspath.files.joinToString { it.path }.ifEmpty { "(пустой classpath)" },
            )
        val filter = components.orNull?.split(",")?.map { it.trim() }?.filter { it.isNotEmpty() }?.toSet()
        val selected = if (filter == null) meta else meta.filter { it.componentName in filter }
        if (filter != null) {
            val missing = filter - selected.map { it.componentName }.toSet()
            require(missing.isEmpty()) { "В мете нет компонентов: $missing" }
        }
        val output: File = outputDirectory.get().asFile
        output.deleteRecursively()
        output.mkdirs()
        val sorted = selected.sortedBy { it.componentName }
        PreviewFactoryGenerator(sorted).generate(output)
        File(output, PREVIEW_COMPONENTS_FILE).writeText(sorted.joinToString("\n", postfix = "\n") { it.componentName })
    }
}
