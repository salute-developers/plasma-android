package tasks.docs

import org.gradle.api.DefaultTask
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.FileCollection
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.OutputFile
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction

abstract class ExtractCodeSnippetsTask : DefaultTask() {

    @get:OutputDirectory
    abstract val outputKotlinDir: DirectoryProperty

    @get:OutputDirectory
    abstract val outputXmlDir: DirectoryProperty

    @get:OutputFile
    abstract val outputMeta: RegularFileProperty

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val kotlinSources: ConfigurableFileCollection

    @get:InputFiles
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val xmlSources: ConfigurableFileCollection

    @get:Input
    abstract val xmlNamespace: Property<String>

    init {
        kotlinSources.from(kotlinSourceTrees())
        xmlSources.from(xmlSourceTrees())
        xmlNamespace.convention("")
    }

    @TaskAction
    fun run() {
        val outKotlinDir = outputKotlinDir.get().asFile.also { it.mkdirs() }
        val outXmlDir    = outputXmlDir.get().asFile.also    { it.mkdirs() }

        val meta = mutableListOf<SampleMeta>()

        val kotlinDelegate = KotlinSnippetExtractorDelegate(
            snippetsDir = outKotlinDir,
            project     = project,
        )
        kotlinSources.files.forEach { meta += kotlinDelegate.extractFromFile(it) }

        val xmlDelegate = XmlSnippetExtractorDelegate(
            snippetsDir = outXmlDir,
            project     = project,
            namespace   = xmlNamespace.get(),
        )
        xmlSources.files.forEach { meta += xmlDelegate.extractFromFile(it) }

        val metaFile = outputMeta.asFile.get()
        metaFile.writeText(serializeMetaToJson(meta))
        logger.lifecycle("Written docs meta: ${project.relativePath(metaFile)} (samples=${meta.size})")
    }

    // ── JSON ──────────────────────────────────────────────────────────────────

    private fun serializeMetaToJson(meta: List<SampleMeta>): String = buildString {
        appendLine("[")
        meta.forEachIndexed { i, m ->
            appendLine("  {")
            appendLine("""    "id": ${m.id.toJsonString()},""")
            appendLine("""    "kind": ${m.kind.toJsonString()},""")
            appendLine("""    "fqName": ${m.fqName.toJsonString()},""")
            appendLine("""    "file": ${m.file.toJsonString()},""")
            appendLine("""    "snippetPath": ${m.snippetPath.toJsonString()},""")
            appendLine("""    "snippetStartOffset": ${m.snippetStartOffset},""")
            append("""    "snippetEndOffset": ${m.snippetEndOffset}""")
            appendLine()
            append("  }")
            if (i < meta.lastIndex) append(",")
            appendLine()
        }
        append("]")
    }

    private fun String.toJsonString(): String {
        val escaped = replace("\\", "\\\\")
            .replace("\"", "\\\"")
            .replace("\n", "\\n")
            .replace("\r", "\\r")
            .replace("\t", "\\t")
        return "\"$escaped\""
    }

    private fun kotlinSourceTrees(): FileCollection {
        val roots = listOf("src/main/kotlin", "src/main/java", "src")
            .map(project::file).filter { it.exists() }
        return project.files(roots.map { root ->
            project.fileTree(root) { include("**/*.kt") }
        })
    }

    private fun xmlSourceTrees(): FileCollection {
        val roots = listOf("src/main/res", "src/main/resources", "src")
            .map(project::file).filter { it.exists() }
        return project.files(roots.map { root ->
            project.fileTree(root) { include("**/*.xml") }
        })
    }
}