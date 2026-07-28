package com.sdds.plugin.themebuilder.documentation

import com.google.gson.GsonBuilder
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipFile

/** Assembles Android documentation enrichment using the ADR-0003 directory contract. */
abstract class DocumentationAggregateTask : DefaultTask() {

    /** Core documentation JARs. */
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val coreArtifacts: ConfigurableFileCollection

    /** Locally extracted Kotlin examples. */
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val kotlinSnippets: DirectoryProperty

    /** Locally extracted XML examples. */
    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val xmlSnippets: DirectoryProperty

    /** Metadata describing local examples. */
    @get:InputFile
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val samplesMetadata: RegularFileProperty

    /** Platform components info JSON. */
    @get:InputFile
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val componentsInfoFile: RegularFileProperty

    /** Platform theme info JSON. */
    @get:InputFile
    @get:PathSensitive(PathSensitivity.NONE)
    abstract val themeInfoFile: RegularFileProperty

    /** `.sdds/temp/docs` directory consumed by DS Builder CLI. */
    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    /** Builds a deterministic enrichment tree; local examples override Core examples. */
    @TaskAction
    fun aggregate() {
        val output = outputDirectory.get().asFile
        output.deleteRecursively()
        output.mkdirs()

        val coreSamples = coreArtifacts.files
            .sortedBy(File::getAbsolutePath)
            .flatMap { unpackCoreArtifact(it, output) }
        copyTree(kotlinSnippets.get().asFile, output.resolve("assets/examples/kotlin"))
        copyTree(xmlSnippets.get().asFile, output.resolve("assets/examples/xml"))
        mergeSamples(
            coreSamples = coreSamples,
            localMetadata = samplesMetadata.get().asFile,
            target = output.resolve("meta/samples.json"),
        )
        copyRequired(componentsInfoFile.get().asFile, output.resolve("meta/components-info.json"))
        copyRequired(themeInfoFile.get().asFile, output.resolve("meta/theme-info.json"))
    }

    private fun unpackCoreArtifact(artifact: File, output: File): List<JsonObject> {
        val samples = mutableListOf<JsonObject>()
        ZipFile(artifact).use { zip ->
            zip.entries().asSequence()
                .filterNot { it.isDirectory }
                .filter { it.name.startsWith(CORE_DOCS_PREFIX) }
                .sortedBy { it.name }
                .forEach { entry ->
                    processCoreEntry(zip, entry, output, samples)
                }
        }
        return samples
    }

    private fun processCoreEntry(
        zip: ZipFile,
        entry: java.util.zip.ZipEntry,
        output: File,
        samples: MutableList<JsonObject>,
    ) {
        val relativePath = entry.name.removePrefix(CORE_DOCS_PREFIX)
        if (relativePath == LEGACY_META_PATH || relativePath == SAMPLES_META_PATH) {
            zip.getInputStream(entry).reader().use { reader ->
                samples += parseSamples(JsonParser.parseReader(reader))
            }
            return
        }
        val normalizedPath = if (relativePath.startsWith("assets/")) {
            relativePath
        } else {
            "assets/examples/kotlin/$relativePath"
        }
        val target = output.resolve(normalizedPath).canonicalFile
        if (!target.toPath().startsWith(output.canonicalFile.toPath())) {
            throw GradleException("Invalid Core documentation entry: ${entry.name}")
        }
        target.parentFile.mkdirs()
        zip.getInputStream(entry).use { input ->
            target.outputStream().use(input::copyTo)
        }
    }

    private fun copyTree(source: File, target: File) {
        target.mkdirs()
        if (!source.exists()) return
        source.walkTopDown().filter(File::isFile).sortedBy { it.relativeTo(source).path }.forEach { file ->
            val destination = target.resolve(file.relativeTo(source).path)
            destination.parentFile.mkdirs()
            file.copyTo(destination, overwrite = true)
        }
    }

    private fun copyRequired(source: File, target: File) {
        if (!source.isFile) {
            throw GradleException("Required documentation input does not exist: ${source.absolutePath}")
        }
        target.parentFile.mkdirs()
        source.copyTo(target, overwrite = true)
    }

    private fun mergeSamples(
        coreSamples: List<JsonObject>,
        localMetadata: File,
        target: File,
    ) {
        if (!localMetadata.isFile) {
            throw GradleException("Required documentation input does not exist: ${localMetadata.absolutePath}")
        }
        val localSamples = localMetadata.reader().use { reader ->
            parseSamples(JsonParser.parseReader(reader))
        }
        val merged = linkedMapOf<String, JsonObject>()
        (coreSamples + localSamples).map(::normalizeSamplePath).forEachIndexed { index, sample ->
            val key = sample.get("id")?.asString ?: "__anonymous_$index"
            merged[key] = sample
        }
        target.parentFile.mkdirs()
        target.writeText(GSON.toJson(merged.values))
    }

    private fun normalizeSamplePath(sample: JsonObject): JsonObject {
        val normalized = sample.deepCopy()
        val snippetPath = normalized.get("snippetPath")?.asString
            ?.replace('\\', '/')
            ?.takeIf(String::isNotBlank)
            ?: return normalized
        if (snippetPath.startsWith("assets/")) return normalized
        val language = if (normalized.get("kind")?.asString == "xml") "xml" else "kotlin"
        normalized.addProperty("snippetPath", "assets/examples/$language/$snippetPath")
        return normalized
    }

    private fun parseSamples(element: JsonElement): List<JsonObject> {
        if (!element.isJsonArray) {
            throw GradleException("Snippet metadata must be a JSON array")
        }
        return element.asJsonArray.map { item ->
            if (!item.isJsonObject) {
                throw GradleException("Snippet metadata entries must be JSON objects")
            }
            item.asJsonObject
        }
    }

    private companion object {
        const val CORE_DOCS_PREFIX = "META-INF/sdds-docs/"
        const val LEGACY_META_PATH = "meta.json"
        const val SAMPLES_META_PATH = "meta/samples.json"
        val GSON = GsonBuilder().setPrettyPrinting().create()
    }
}
