package com.sdds.plugin.themebuilder.documentation

import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.ConfigurableFileCollection
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.Optional
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.api.tasks.TaskAction
import java.io.File
import java.util.zip.ZipEntry
import java.util.zip.ZipFile

/** Assembles Android documentation enrichment using the ADR-0003 directory contract. */
abstract class DocumentationAggregateTask : DefaultTask() {

    /** Versioned Core documentation template JARs. */
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

    /** Locally generated screenshots keyed by screenshot directives. */
    @get:InputDirectory
    @get:Optional
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val screenshotsDirectory: DirectoryProperty

    /** Optional user documentation root containing `structure.json` and `docs/**/*.md`. */
    @get:InputDirectory
    @get:Optional
    @get:PathSensitive(PathSensitivity.RELATIVE)
    abstract val userDocumentationRoot: DirectoryProperty

    /** `.sdds/temp/docs` directory consumed by DS Builder CLI. */
    @get:OutputDirectory
    abstract val outputDirectory: DirectoryProperty

    /**
     * Builds a deterministic ADR-0003 enrichment tree.
     *
     * Local examples and metadata override their Core counterparts.
     */
    @TaskAction
    fun aggregate() {
        val output = outputDirectory.get().asFile
        output.deleteRecursively()
        output.mkdirs()

        val core = unpackCoreArtifacts(output)
        copyTree(kotlinSnippets.get().asFile, output.resolve("assets/examples/kotlin"))
        copyTree(xmlSnippets.get().asFile, output.resolve("assets/examples/xml"))
        screenshotsDirectory.orNull?.asFile
            ?.takeIf(File::isDirectory)
            ?.let { copyTree(it, output.resolve("assets/screenshots")) }
        mergeSamples(
            coreSamples = core.samples,
            localMetadata = samplesMetadata.get().asFile,
            target = output.resolve("meta/samples.json"),
        )
        copyRequired(componentsInfoFile.get().asFile, output.resolve("meta/components-info.json"))
        copyRequired(themeInfoFile.get().asFile, output.resolve("meta/theme-info.json"))
        enrichDocumentation(core, output)
    }

    private fun unpackCoreArtifacts(output: File): CoreDocumentation {
        val core = CoreDocumentation()
        coreArtifacts.files.sortedBy(File::getAbsolutePath).forEach { artifact ->
            ZipFile(artifact).use { zip ->
                zip.entries().asSequence()
                    .filterNot { it.isDirectory }
                    .filter { it.name.startsWith(CORE_DOCS_PREFIX) }
                    .sortedBy { it.name }
                    .forEach { entry -> processCoreEntry(zip, entry, output, core) }
            }
        }
        return core
    }

    @Suppress("CyclomaticComplexMethod", "ThrowsCount")
    private fun processCoreEntry(
        zip: ZipFile,
        entry: ZipEntry,
        output: File,
        core: CoreDocumentation,
    ) {
        val relativePath = normalizeRelativePath(
            entry.name.removePrefix(CORE_DOCS_PREFIX),
            "Core documentation entry ${entry.name}",
        )
        when {
            relativePath == LEGACY_META_PATH || relativePath == SAMPLES_META_PATH -> {
                zip.getInputStream(entry).reader().use { reader ->
                    core.samples += parseSamples(JsonParser.parseReader(reader))
                }
            }
            relativePath == STRUCTURE_PATH -> {
                if (core.structure != null) {
                    throw GradleException("Conflicting Core documentation structure: ${entry.name}")
                }
                val structure = zip.getInputStream(entry).reader().use(JsonParser::parseReader)
                if (!structure.isJsonObject) {
                    throw GradleException("Core documentation structure must be a JSON object: ${entry.name}")
                }
                core.structure = structure.asJsonObject
            }
            relativePath.startsWith(TEMPLATES_PREFIX) && relativePath.endsWith(".md") -> {
                if (core.templates.containsKey(relativePath)) {
                    throw GradleException("Conflicting Core documentation template: $relativePath")
                }
                core.templates[relativePath] = zip.getInputStream(entry).reader().use { it.readText() }
            }
            relativePath.startsWith(EXAMPLES_PREFIX) -> {
                copyZipEntryChecked(zip, entry, checkedTarget(output, relativePath, entry.name))
            }
            relativePath.startsWith("meta/") || relativePath.startsWith("assets/") -> Unit
            else -> {
                copyZipEntry(
                    zip,
                    entry,
                    checkedTarget(output, "assets/examples/kotlin/$relativePath", entry.name),
                )
            }
        }
    }

    private fun copyZipEntry(zip: ZipFile, entry: ZipEntry, target: File) {
        target.parentFile.mkdirs()
        zip.getInputStream(entry).use { input ->
            target.outputStream().use(input::copyTo)
        }
    }

    private fun copyZipEntryChecked(zip: ZipFile, entry: ZipEntry, target: File) {
        val bytes = zip.getInputStream(entry).use { it.readBytes() }
        if (target.isFile) {
            if (!target.readBytes().contentEquals(bytes)) {
                throw GradleException("Conflicting documentation asset: ${entry.name}")
            }
            return
        }
        target.parentFile.mkdirs()
        target.writeBytes(bytes)
    }

    private fun checkedTarget(output: File, relativePath: String, source: String): File {
        val target = output.resolve(relativePath).canonicalFile
        if (!target.toPath().startsWith(output.canonicalFile.toPath())) {
            throw GradleException("Invalid Core documentation entry: $source")
        }
        return target
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

    @Suppress("ThrowsCount")
    private fun enrichDocumentation(core: CoreDocumentation, output: File) {
        val structure = core.structure
        if (structure == null) {
            if (core.templates.isNotEmpty()) {
                throw GradleException("Core documentation templates require structure.json")
            }
            enrichUserDocumentation(emptySet(), output)
            return
        }
        val styleApis = resolveStyleApis(componentsInfoFile.get().asFile)
        val publicPaths = collectPublicPages(structure, "Core").mapTo(linkedSetOf(), Page::path)
        publicPaths.forEach { pagePath ->
            val templatePath = "$TEMPLATES_PREFIX$pagePath"
            val template = core.templates[templatePath]
                ?: throw GradleException("Core documentation template does not exist: $pagePath")
            val target = checkedTarget(output, "content/core/$pagePath", templatePath)
            target.parentFile.mkdirs()
            target.writeText(enrichTemplate(template, "core", pagePath, output, styleApis))
        }
        val structureTarget = checkedTarget(output, "structure-core.json", STRUCTURE_PATH)
        structureTarget.parentFile.mkdirs()
        structureTarget.writeText(GSON.toJson(structure))
        enrichUserDocumentation(publicPaths, output)
    }

    @Suppress("CyclomaticComplexMethod", "ThrowsCount")
    private fun enrichUserDocumentation(corePaths: Set<String>, output: File) {
        val root = userDocumentationRoot.orNull?.asFile ?: return
        val structureFile = root.resolve(STRUCTURE_PATH)
        if (!structureFile.isFile) return
        val structureElement = runCatching { JsonParser.parseString(structureFile.readText()) }
            .getOrElse { throw GradleException("Invalid user documentation structure: ${structureFile.path}", it) }
        if (!structureElement.isJsonObject) {
            throw GradleException("User documentation structure must be a JSON object: ${structureFile.path}")
        }
        val structure = structureElement.asJsonObject
        val pages = collectPublicPages(structure, "User")
        val styleApis = resolveStyleApis(componentsInfoFile.get().asFile)
        pages.forEach { page ->
            val collidesWithCore = page.path in corePaths
            val merge = page.merge
            when {
                merge == "prepend" -> throw GradleException(
                    "User documentation page '${page.path}' uses unsupported merge mode: prepend",
                )
                merge != null && merge !in SUPPORTED_MERGES -> throw GradleException(
                    "User documentation page '${page.path}' uses unsupported merge mode: $merge",
                )
                collidesWithCore && merge == null -> throw GradleException(
                    "User documentation page '${page.path}' collides with Core and requires explicit append or replace",
                )
                !collidesWithCore && merge != null -> throw GradleException(
                    "Standalone user documentation page '${page.path}' must not declare merge: $merge",
                )
            }
            val sourcePath = when (merge) {
                "append" -> page.path.withPlusFileName()
                else -> page.path
            }
            val source = checkedSource(root.resolve(TEMPLATES_PREFIX), sourcePath, page.path)
            if (!source.isFile) {
                val alternatePath = if (merge == "append") page.path else page.path.withPlusFileName()
                val alternate = checkedSource(root.resolve(TEMPLATES_PREFIX), alternatePath, page.path)
                val message = when {
                    merge == "append" && alternate.isFile ->
                        "Append user documentation page '${page.path}' must use source '$sourcePath'"
                    !collidesWithCore && alternate.isFile ->
                        "Standalone user documentation page '${page.path}' " +
                            "must not use plus-prefixed source '$alternatePath'"
                    else -> "User documentation source does not exist for '${page.path}': ${source.path}"
                }
                throw GradleException(message)
            }
            val target = checkedTarget(output, "content/user/${page.path}", source.path)
            target.parentFile.mkdirs()
            target.writeText(enrichTemplate(source.readText(), "user", page.path, output, styleApis))
        }
        checkedTarget(output, "structure-user.json", structureFile.path)
            .writeText(GSON.toJson(structure))
    }

    private fun checkedSource(root: File, relativePath: String, logicalPath: String): File {
        val source = root.resolve(relativePath).canonicalFile
        if (!source.toPath().startsWith(root.canonicalFile.toPath())) {
            throw GradleException("User documentation page '$logicalPath' has an unsafe source path")
        }
        return source
    }

    private fun enrichTemplate(
        template: String,
        layer: String,
        logicalPath: String,
        output: File,
        styleApis: StyleApis,
    ): String {
        return enrichSamples(template, layer, logicalPath, output)
            .replace(STYLE_API_REGEX) {
                renderStyleApi(logicalPath, styleApis)
            }
    }

    private fun collectPublicPages(structure: JsonObject, layer: String): List<Page> {
        val navigation = structure.get("navigation")
        if (navigation == null || !navigation.isJsonArray) {
            throw GradleException("$layer documentation structure must contain a navigation array")
        }
        val result = mutableListOf<Page>()
        navigation.asJsonArray.forEach { collectPages(it, layer, result) }
        return result
    }

    @Suppress("ThrowsCount")
    private fun collectPages(element: JsonElement, layer: String, result: MutableList<Page>) {
        if (!element.isJsonObject) {
            throw GradleException("$layer documentation navigation entries must be JSON objects")
        }
        val node = element.asJsonObject
        node.get("path")?.let { pathElement ->
            if (!pathElement.isJsonPrimitive || !pathElement.asJsonPrimitive.isString) {
                throw GradleException("$layer documentation page path must be a string")
            }
            val path = normalizeRelativePath(pathElement.asString, "$layer documentation page path")
            if (!path.endsWith(".md")) {
                throw GradleException("$layer documentation page must reference markdown: $path")
            }
            if (File(path).name.startsWith("+")) {
                throw GradleException("$layer documentation logical path must not use plus prefix: $path")
            }
            val merge = node.get("merge")?.let {
                if (!it.isJsonPrimitive || !it.asJsonPrimitive.isString) {
                    throw GradleException("$layer documentation merge must be a string: $path")
                }
                it.asString
            }
            result += Page(path, merge)
        }
        node.get("items")?.let { items ->
            if (!items.isJsonArray) {
                throw GradleException("$layer documentation navigation items must be an array")
            }
            items.asJsonArray.forEach { collectPages(it, layer, result) }
        }
    }

    private fun enrichSamples(template: String, layer: String, logicalPath: String, output: File): String {
        val withKotlin = template.replace(KOTLIN_SAMPLE_REGEX) { match ->
            resolveSample(match.groupValues[1].trim(), "kotlin", layer, logicalPath, output)
        }
        return withKotlin.replace(XML_SAMPLE_REGEX) { match ->
            resolveSample(match.groupValues[1].trim(), "xml", layer, logicalPath, output)
        }
    }

    private fun resolveSample(
        reference: String,
        language: String,
        layer: String,
        logicalPath: String,
        output: File,
    ): String {
        val normalized = normalizeRelativePath(reference, "Sample reference in $layer page $logicalPath")
        val examples = output.resolve("assets/examples")
        val candidates = if (normalized.startsWith("assets/")) {
            listOf(output.resolve(normalized))
        } else {
            listOf(examples.resolve(normalized), examples.resolve(language).resolve(normalized))
        }
        val sample = candidates.firstOrNull(File::isFile)
            ?: throw GradleException(
                "Documentation sample '$reference' referenced from $layer page '$logicalPath' does not exist",
            )
        return sample.readText().trim()
    }

    private fun normalizeRelativePath(path: String, description: String): String {
        val normalized = path.replace('\\', '/')
        val parts = normalized.split('/').filter(String::isNotEmpty)
        val hasInvalidSegment = parts.any { it == "." || it == ".." }
        if (normalized.startsWith("/") || parts.isEmpty() || hasInvalidSegment) {
            throw GradleException("$description has an invalid relative path: $path")
        }
        return parts.joinToString("/")
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

    private fun resolveStyleApis(componentsInfo: File): StyleApis {
        val info = JsonParser.parseString(componentsInfo.readText())
        if (!info.isJsonObject) return StyleApis()
        val components = info.asJsonObject.getAsJsonArrayOrEmpty("components")
        val componentNames = components.mapNotNull { element ->
            element.takeIf(JsonElement::isJsonObject)?.asJsonObject?.get("coreName")?.asString
        }.toSet()
        val docs = components.mapNotNull { element ->
            val component = element.asJsonObject
            val styleApi = component.getAsJsonObjectOrNull("styleApi") ?: return@mapNotNull null
            StyleApiDoc(
                coreName = component.get("coreName").asString,
                styleName = component.get("styleName").asString,
                receiverClassName = styleApi.get("receiverClassName").asString,
                functionName = styleApi.get("functionName")?.asString ?: "style",
                params = styleApi.getAsJsonArrayOrEmpty("params").map { paramElement ->
                    val param = paramElement.asJsonObject
                    StyleApiParamDoc(
                        name = param.get("name").asString,
                        typeName = param.get("typeName").asString,
                        defaultValue = param.getAsJsonObjectOrNull("defaultValue")?.toStyleApiValueDoc(),
                        values = param.getAsJsonArrayOrEmpty("values").map {
                            it.asJsonObject.toStyleApiValueDoc()
                        },
                    )
                },
                variations = component.getAsJsonArrayOrEmpty("variations").mapNotNull variation@{ variationElement ->
                    val variation = variationElement.asJsonObject
                    val reference = variation.get("composeReference")
                        ?.takeUnless(JsonElement::isJsonNull)
                        ?.asString
                        ?: return@variation null
                    StyleVariationDoc(
                        composeReference = reference,
                        props = variation.getAsJsonArrayOrEmpty("props").associate {
                            val property = it.asJsonObject
                            property.get("name").asString to property.get("value").asString
                        },
                    )
                },
            )
        }.groupBy(StyleApiDoc::coreName)
        return StyleApis(componentNames, docs)
    }

    private fun renderStyleApi(templatePath: String, styleApis: StyleApis): String {
        val componentName = File(templatePath).name.removeSuffix("Usage.md")
        val hasStyles = styleApis.componentNames.any { it.equals(componentName, ignoreCase = true) }
        val docs = styleApis.docs[componentName].orEmpty()
        return when {
            hasStyles && docs.isNotEmpty() -> docs.joinToString("\n\n", transform = StyleApiDoc::toMarkdown)
            hasStyles -> ""
            else -> """
                :::warning
                У компонента нет готовых стилей. Если нужен стиль, обратитесь в поддержку.
                :::
            """.trimIndent()
        }
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

    private data class CoreDocumentation(
        var structure: JsonObject? = null,
        val templates: MutableMap<String, String> = linkedMapOf(),
        val samples: MutableList<JsonObject> = mutableListOf(),
    )

    private data class Page(val path: String, val merge: String?)

    private data class StyleApis(
        val componentNames: Set<String> = emptySet(),
        val docs: Map<String, List<StyleApiDoc>> = emptyMap(),
    )

    private data class StyleApiDoc(
        val coreName: String,
        val styleName: String,
        val receiverClassName: String,
        val functionName: String,
        val params: List<StyleApiParamDoc>,
        val variations: List<StyleVariationDoc>,
    ) {
        fun toMarkdown(): String {
            val header = if (styleName == coreName) {
                "### Параметры стиля"
            } else {
                "### Параметры стиля `$styleName`"
            }
            return buildString {
                if (params.isNotEmpty()) {
                    appendLine(header)
                    appendLine()
                    appendLine("| Параметр | Тип | Возможные значения |")
                    appendLine("| --- | --- | --- |")
                    params.forEach { param ->
                        appendLine("| `${param.name}` | `${param.typeName}` | ${param.valuesColumn} |")
                    }
                    appendLine()
                }
                appendLine("Пример выбора готового стиля:")
                appendLine("```kotlin")
                append(exampleCall())
                exampleDotNotationCall()?.let { dotExample ->
                    appendLine()
                    appendLine()
                    appendLine("// или через dot notation")
                    appendLine(dotExample)
                }
                appendLine("```")
            }
        }

        private fun exampleCall(): String {
            val invocation = receiverClassName.removeSuffix(".Companion")
            val args = params.joinToString(",\n") { param ->
                "    ${param.name} = ${param.exampleValueExpression()}"
            }
            return buildString {
                append("val style = $invocation.$functionName(")
                if (args.isNotBlank()) append("\n$args\n")
                append(")")
            }
        }

        private fun exampleDotNotationCall(): String? {
            val reference = variations.firstOrNull { variation ->
                params.all { param ->
                    val actual = variation.props[param.name] ?: param.defaultValue?.value
                    actual == param.exampleRawValue()
                }
            }?.composeReference ?: variations.firstOrNull()?.composeReference
            return reference?.let { "val style = $it.style()" }
        }
    }

    private data class StyleApiParamDoc(
        val name: String,
        val typeName: String,
        val defaultValue: StyleApiValueDoc?,
        val values: List<StyleApiValueDoc>,
    ) {
        val valuesColumn: String
            get() = if (values.isEmpty()) "-" else values.joinToString(", ") { "`${it.codeName}`" }

        fun exampleValueExpression(): String {
            val selected = defaultValue ?: values.firstOrNull()
                ?: throw GradleException("No values available for style parameter '$name'")
            return if (typeName == "Boolean") selected.codeName else "$typeName.${selected.codeName}"
        }

        fun exampleRawValue(): String {
            return (defaultValue ?: values.firstOrNull())?.value
                ?: throw GradleException("No values available for style parameter '$name'")
        }
    }

    internal data class StyleApiValueDoc(val value: String, val codeName: String)

    private data class StyleVariationDoc(
        val composeReference: String,
        val props: Map<String, String>,
    )

    private companion object {
        const val CORE_DOCS_PREFIX = "META-INF/sdds-docs/"
        const val STRUCTURE_PATH = "structure.json"
        const val TEMPLATES_PREFIX = "docs/"
        const val EXAMPLES_PREFIX = "assets/examples/"
        const val LEGACY_META_PATH = "meta.json"
        const val SAMPLES_META_PATH = "meta/samples.json"
        val SUPPORTED_MERGES = setOf("append", "replace")
        val KOTLIN_SAMPLE_REGEX = "//\\s*@sample:\\s*(.+)".toRegex()
        val XML_SAMPLE_REGEX = "<!--\\s*@sample:\\s*(.+?)\\s*-->".toRegex()
        val STYLE_API_REGEX = "<!--\\s*@style-api\\s*-->".toRegex()
        val GSON = GsonBuilder().setPrettyPrinting().create()
    }
}

private fun String.withPlusFileName(): String {
    val file = File(this)
    return file.parent?.let { "$it/+${file.name}" } ?: "+${file.name}"
}

private fun JsonObject.getAsJsonObjectOrNull(name: String): JsonObject? {
    val element = get(name) ?: return null
    return if (element.isJsonNull) null else element.asJsonObject
}

private fun JsonObject.getAsJsonArrayOrEmpty(name: String): JsonArray {
    val element = get(name) ?: return JsonArray()
    return if (element.isJsonNull) JsonArray() else element.asJsonArray
}

private fun JsonObject.toStyleApiValueDoc(): DocumentationAggregateTask.StyleApiValueDoc {
    return DocumentationAggregateTask.StyleApiValueDoc(
        value = get("value").asString,
        codeName = get("codeName").asString,
    )
}
