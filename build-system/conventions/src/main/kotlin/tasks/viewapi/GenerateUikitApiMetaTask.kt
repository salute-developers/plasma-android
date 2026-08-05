package tasks.viewapi

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.com.google.gson.GsonBuilder

/**
 * Gradle-задача: парсит размеченные `declare-styleable` из [resourceFiles]
 * и пишет `sdds/api/uikit-api-meta.json` в [outputDir].
 *
 * Директория [outputDir] подключается как java-resources srcDir модуля `uikit`,
 * благодаря чему JSON попадает в classes.jar внутри AAR и доступен потребителям
 * по classpath (аналогично compose-мете из `uikit-compose`).
 */
abstract class GenerateUikitApiMetaTask : DefaultTask() {

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val resourceFiles: ConfigurableFileCollection

    @get:Input
    abstract val resourcePrefix: Property<String>

    @get:OutputDirectory
    abstract val outputDir: DirectoryProperty

    @TaskAction
    fun generate() {
        val parser = DeclareStyleableParser(resourcePrefix.getOrElse("sd_"))
        val meta = parser.parse(resourceFiles.files.toList())

        val gson = GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create()
        val outFile = outputDir.get().dir("sdds/api").asFile.apply { mkdirs() }
            .resolve("uikit-api-meta.json")
        outFile.writeText(gson.toJson(meta))

        logger.lifecycle(
            "Generated uikit-api-meta.json: ${meta.components.size} component(s), " +
                "${meta.sharedStates.size} shared state(s) -> ${outFile.path}",
        )
    }
}
