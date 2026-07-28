package tasks.docs

import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.CacheableTask
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import org.jetbrains.kotlin.com.google.gson.JsonElement
import org.jetbrains.kotlin.com.google.gson.JsonParser
import java.io.File

/** Validates that Core documentation structure explicitly lists every markdown template. */
@CacheableTask
abstract class ValidateCoreDocumentationTask : DefaultTask() {

    /** ADR-0003 navigation structure. */
    @get:InputFile
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val structureFile: RegularFileProperty

    /** Root containing Core markdown templates. */
    @get:InputDirectory
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val docsDirectory: DirectoryProperty

    /** Verifies that structure paths and markdown templates form the same set. */
    @TaskAction
    fun validate() {
        val structure = structureFile.get().asFile
        val docs = docsDirectory.get().asFile
        val root = JsonParser.parseString(structure.readText())
        val navigation = root.takeIf(JsonElement::isJsonObject)
            ?.asJsonObject
            ?.get("navigation")
            ?.takeIf(JsonElement::isJsonArray)
            ?: throw GradleException("${structure.absolutePath} must contain a navigation array")
        val declared = linkedSetOf<String>()
        navigation.asJsonArray.forEach { collectPaths(it, declared, structure) }
        val actual = docs.walkTopDown()
            .filter { it.isFile && it.extension == "md" }
            .map { it.relativeTo(docs).invariantSeparatorsPath }
            .toSet()
        val missing = declared - actual
        val unlisted = actual - declared
        if (missing.isNotEmpty() || unlisted.isNotEmpty()) {
            throw GradleException(
                buildString {
                    append("Core documentation structure does not match markdown templates.")
                    if (missing.isNotEmpty()) append(" Missing: ${missing.sorted()}.")
                    if (unlisted.isNotEmpty()) append(" Unlisted: ${unlisted.sorted()}.")
                },
            )
        }
    }

    private fun collectPaths(element: JsonElement, result: MutableSet<String>, structure: File) {
        if (!element.isJsonObject) {
            throw GradleException("${structure.absolutePath} contains a non-object navigation entry")
        }
        val node = element.asJsonObject
        node.get("path")?.let { path ->
            val value = path.takeIf(JsonElement::isJsonPrimitive)?.asString.orEmpty()
            if (!isSafeMarkdownPath(value)) {
                throw GradleException("${structure.absolutePath} contains an invalid markdown path: $value")
            }
            result += value
        }
        node.get("items")?.let { items ->
            if (!items.isJsonArray) {
                throw GradleException("${structure.absolutePath} contains non-array navigation items")
            }
            items.asJsonArray.forEach { collectPaths(it, result, structure) }
        }
    }

    private fun isSafeMarkdownPath(path: String): Boolean {
        val segments = path.replace('\\', '/').split('/')
        return path.isNotBlank() &&
            !path.startsWith("/") &&
            path.endsWith(".md") &&
            segments.none { it.isBlank() || it == "." || it == ".." }
    }
}
