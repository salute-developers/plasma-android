package utils

import org.gradle.api.Project
import org.gradle.api.logging.Logger
import org.jetbrains.kotlin.com.google.gson.GsonBuilder
import org.jetbrains.kotlin.com.google.gson.JsonArray
import org.jetbrains.kotlin.com.google.gson.JsonObject
import java.io.File

/**
 * Ссылка на кодовую тему оформления, указанную в параметрах проекта.
 * Возвращает `null`, если не задана.
 */
val Project.docsThemeCodeReference: String?
    get() = properties["docs-theme-codeReference"]?.toString()

/**
 * Название темы оформления, заданное в параметрах проекта.
 * Возвращает `null`, если не указано.
 */
val Project.docsThemeName: String?
    get() = properties["docs-theme-name"]?.toString()

/**
 * Префикс стилей темы, заданный в параметрах проекта.
 * Возвращает `null`, если не указан.
 */
val Project.docsThemeStylePrefix: String?
    get() = properties["docs-theme-prefix"]?.toString()

/**
 * Префикс ресурсов темы, заданный в параметрах проекта.
 * Возвращает `null`, если не указан.
 */
val Project.docsThemeResPrefix: String?
    get() = properties["docs-theme-resPrefix"]?.toString()

/**
 * Получает версию UIKit из version catalog.
 * Возвращает "latest", если версия не указана.
 */
val Project.docsUikitVersion: String
    get() = getVersionCatalog()?.versions?.sdds?.uikit?.asProvider()?.get() ?: "latest"

/**
 * Получает версию UIKit Compose из version catalog.
 * Возвращает "latest", если версия не указана.
 */
val Project.docsUikitComposeVersion: String
    get() = getVersionCatalog()?.versions?.sdds?.uikit?.compose?.get() ?: "latest"

/**
 * Получает версию иконок из version catalog.
 * Возвращает "latest", если версия не указана.
 */
val Project.docsIconsVersion: String
    get() = iconsCatalog()?.versions?.sdds?.icons?.get() ?: "latest"

/**
 * Возвращает URL на API-документацию артефакта в зависимости от типа библиотеки (Compose или XML).
 */
val Project.docsApiHref: String
    get() {
        val artifactId = if (isComposeLib()) "sdds-uikit-compose" else "sdds-uikit"
        val version = if (isComposeLib()) docsUikitComposeVersion else docsUikitVersion
        return "$BASE_DOC_URL${getArtifactDocsBaseUrl(artifactId, version, docsBranch())}"
    }

/**
 * Идентификатор артефакта (например, используемый в Nexus).
 * Обязателен. Бросает исключение, если не указан.
 */
val Project.docsArtifactId: String
    get() = properties["nexus.artifactId"]?.toString()
        ?: throw IllegalAccessException("nexus.artifactId must be specified")

/**
 * Целевой тип документации: "compose" или "xml", в зависимости от типа библиотеки.
 */
val Project.docsTarget: String
    get() = if (isComposeLib()) "compose" else "xml"

/**
 * Базовый URL, по которому размещается документация.
 */
val Project.docsUrl: String
    get() = BASE_DOC_URL

/**
 * Имя ветки документации. Может быть "", "current", "dev" или "pr/..." в зависимости от текущей ветки проекта.
 */
fun Project.docsBranch(deploy: Boolean = false): String {
    val branchName = getBranchName()
    return when {
        branchName.isMainBranch() && deploy -> "current"
        branchName.isMainBranch() -> ""
        branchName.isDevBranch() -> "dev"
        else -> "pr/${branchName.lowercase().replace("/", "_")}"
    }
}

/**
 * Возвращает относительный путь к документации артефакта на основе его ID, версии и текущей ветки.
 */
val Project.docsBaseUrl: String
    get() = getArtifactDocsBaseUrl(docsArtifactId, versionInfo().name, docsBranch())

/**
 * Возвращает относительный путь к документации артефакта на основе его ID и версии на ветке main.
 */
val Project.docsBaseProdUrl: String
    get() = getArtifactDocsBaseUrl(docsArtifactId, versionInfo().name, "")

/**
 * Возвращает относительный путь для деплоя документации на основе его ID и версии.
 */
val Project.docsDeployUrl: String
    get() = getArtifactDocsBaseUrl(docsArtifactId, versionInfo().name, docsBranch(true))

/**
 * Возвращает относительный путь к changelog.json на сервере
 */
fun Project.changelogUrl(deploy: Boolean = true): String {
    val baseUrl = getArtifactDocsBaseUrl(docsArtifactId, "", docsBranch(deploy))
    return "${baseUrl}changelog.json"
}

/**
 * Преобразует шаблоны документации, подставляя значения из проекта в плейсхолдеры.
 * Изменяет все `.md` файлы и файл `docusaurus.config.ts` внутри указанной директории.
 */
fun Project.transformTemplate(templateDir: File, snippetsDir: File, componentsConfig: File) {
    val versionInfo = versionInfo()
    val components = resolveComponents(componentsConfig)
    val styleApis = resolveStyleApis(componentsConfig)
    templateDir
        .walkTopDown()
        .filter { file -> file.isFile && (file.extension == "md" || file.name == "docusaurus.config.ts") }
        .forEach { templateFile ->
            val content = templateFile.readText()
                .replace("{{ docs-url }}", docsUrl)
                .replace("{{ docs-baseUrl }}", docsBaseUrl)
                .replace("{{ docs-artifactId }}", docsArtifactId)
                .replace("{{ docs-artifactVersion }}", versionInfo.name)
                .replace("{{ docs-uikitVersion }}", docsUikitVersion)
                .replace("{{ docs-uikitComposeVersion }}", docsUikitComposeVersion)
                .replace("{{ docs-iconsVersion }}", docsIconsVersion)
                .replace("{{ docs-target }}", docsTarget)
                .replace("{{ docs-theme-codeReference }}", docsThemeCodeReference.orEmpty())
                .replace("{{ docs-theme-name }}", docsThemeName.orEmpty())
                .replace("{{ docs-theme-prefix }}", docsThemeStylePrefix.orEmpty())
                .replace("{{ docs-theme-resPrefix }}", docsThemeResPrefix ?: themeResPrefix)
                .replace("{{ docs-api-href }}", docsApiHref)
                .replaceKotlinSnippets(snippetsDir)
                .replaceXmlSnippets(snippetsDir)
                .replaceStyleApi(templateFile, styleApis, logger, components)
                .replaceScreenshots(templateDir, templateFile.definedInComponents(components), logger)

            val destFile = File(
                templateDir,
                templateFile.absolutePath.removePrefix(templateDir.absolutePath)
            )
            destFile.writeText(content)
        }
}

/**
 * Возвращает директорию с шаблонами документации Docusaurus,
 * расположенную в included build `build-system`.
 */
fun Project.getDocsTemplateDir(): File {
    val bs = project.gradle.includedBuild("build-system")
    return File("${bs.projectDir}/docs-template")
}

/**
 * Возвращает директорию, в которую будет сгенерирована документация Docusaurus.
 */
fun Project.getDocsDestinationDir(): File {
    return File("${project.buildDir}/generated/docusaurus")
}

/**
 * Возвращает относительный путь к документации артефакта на основе ветки, цели, ID и версии.
 */
private fun Project.getArtifactDocsBaseUrl(artifactId: String, version: String, branch: String): String {
    val branchSuffix = if (branch.isNotEmpty()) "/$branch" else ""
    val versionSuffix = if (version.isNotEmpty()) "$version/" else ""
    return "$branchSuffix/$docsTarget/$artifactId/$versionSuffix"
}

private fun String.replaceKotlinSnippets(snippetsDir: File): String {
    return this.replace("//\\s*@sample:\\s*(.+)".toRegex()) { m ->
        val path = m.groupValues[1].trim()
        snippetsDir.resolve(path).readText().trim()
    }
}

private fun String.replaceXmlSnippets(snippetsDir: File): String {
    return this.replace("<!--\\s*@sample:\\s*(.+)\\s*-->".toRegex()) { m ->
        val path = m.groupValues[1].trim()
        snippetsDir.resolve(path).readText().trim()
    }
}

private fun String.replaceScreenshots(templateDir: File, needScreenshots: Boolean, logger: Logger): String {
    val SCREENSHOT_REGEX =
        "<!--\\s*@screenshot:\\s*(.+?)\\s*-->".toRegex()

    return this.replace(SCREENSHOT_REGEX) { match ->
        val id = match.groupValues[1].trim()
        if (!needScreenshots) return@replace ""
        val fileName = id.replace(".", "_") + ".png"
        val imagePath = File(templateDir, "static/screenshots-docusaurus/$fileName")

        if (!imagePath.exists()) {
            logger.warn(
                """
                Скриншот не найден:
                  $id
                Файл должен быть здесь:
                  ${imagePath.absolutePath}
                """.trimIndent()
            )
        }
        "![${id.substringAfterLast(".")}](/screenshots-docusaurus/$fileName)"
    }
}

private fun String.replaceStyleApi(
    templateFile: File,
    styleApis: Map<String, List<StyleApiDoc>>,
    logger: Logger,
    components: Set<String>,
): String {
    return replace(STYLE_API_REGEX) {
        val componentName = templateFile.name.removeSuffix("Usage.md")
        val hasStyles = templateFile.definedInComponents(components)
        val docs = styleApis[componentName].orEmpty()
        when {
            hasStyles && docs.isNotEmpty() -> docs.joinToString("\n\n") { it.toMarkdown() }
            hasStyles -> {
                logger.info("Style API metadata not found for ${templateFile.name}")
                ""
            }
            else -> """:::warning
            У компонента нет готовых стилей. Если нужен стиль, обратитесь в поддержку. 
            :::""".trim()
        }
    }
}

fun Project.filterComponents(docsDir: File, componentsConfig: File) {
    val components = resolveComponents(componentsConfig)

    fileTree(docsDir.resolve("components"))
        .filter {
            val componentName = it.name.removeSuffix("Usage.md")
            !components.contains(componentName)
        }
        .forEach {
            it.delete()
        }
}

fun File.definedInComponents(components: Set<String>): Boolean {
    val componentName = name.removeSuffix("Usage.md").lowercase()
    return components.any { it.lowercase() == componentName }
}

fun Project.resolveComponents(componentsConfig: File): Set<String> {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val info = gson.fromJson(componentsConfig.readText(), JsonObject::class.java)
    val components = info.getAsJsonArray("components")
    return components.map { it.asJsonObject.get("coreName").asString }.toSet()
}

private fun resolveStyleApis(componentsConfig: File): Map<String, List<StyleApiDoc>> {
    val gson = GsonBuilder().setPrettyPrinting().create()
    val info = gson.fromJson(componentsConfig.readText(), JsonObject::class.java)
    val components = info.getAsJsonArray("components")
    return components.mapNotNull { componentElement ->
        val component = componentElement.asJsonObject
        val styleApi = component.getAsJsonObjectOrNull("styleApi") ?: return@mapNotNull null
        StyleApiDoc(
            coreName = component.get("coreName").asString,
            styleName = component.get("styleName").asString,
            receiverClassName = styleApi.get("receiverClassName").asString,
            functionName = styleApi.get("functionName")?.asString ?: "style",
            returnTypeName = styleApi.get("returnTypeName")?.asString.orEmpty(),
            params = styleApi.getAsJsonArrayOrEmpty("params").map { paramElement ->
                val param = paramElement.asJsonObject
                StyleApiParamDoc(
                    name = param.get("name").asString,
                    typeName = param.get("typeName").asString,
                    defaultValue = param.getAsJsonObjectOrNull("defaultValue")?.toStyleApiValueDoc(),
                    values = param.getAsJsonArrayOrEmpty("values").map { valueElement ->
                        valueElement.asJsonObject.toStyleApiValueDoc()
                    },
                )
            },
            variations = component.getAsJsonArrayOrEmpty("variations").mapNotNull { variationElement ->
                val variation = variationElement.asJsonObject
                val composeReference = variation.get("composeReference")?.takeUnless { it.isJsonNull }?.asString
                    ?: return@mapNotNull null
                StyleVariationDoc(
                    composeReference = composeReference,
                    props = variation.getAsJsonArrayOrEmpty("props").associate { propElement ->
                        val prop = propElement.asJsonObject
                        prop.get("name").asString to prop.get("value").asString
                    },
                )
            },
        )
    }.groupBy { it.coreName }
}

fun Project.mergePlusPrefixedDocs(docsDir: File) {
    if (!docsDir.exists()) return

    // Ищем только файлы, начинающиеся с "+"
    val plusFiles = fileTree(docsDir).matching {
        include("**/+*")
    }.files

    plusFiles.forEach { plusFile ->
        val relative = plusFile.relativeTo(docsDir)
        val parentDir = relative.parentFile // может быть null
        val baseName = plusFile.name.removePrefix("+")

        val baseFile = if (parentDir != null) {
            docsDir.resolve(parentDir).resolve(baseName)
        } else {
            docsDir.resolve(baseName)
        }

        // Если базового файла нет — можно просто переименовать доп. файл в базовый
        if (!baseFile.exists()) {
            plusFile.renameTo(baseFile)
            return@forEach
        }

        // Если базовый файл есть — мержим
        val baseContent = baseFile.readText()
        val extraContent = plusFile.readText()

        val mergedContent = buildString {
            append(baseContent)
            appendLine()
            appendLine()
            appendLine("<!-- merged from ${plusFile.name} -->")
            appendLine()
            append(extraContent)
        }

        baseFile.writeText(mergedContent)
        plusFile.delete()
    }
}

private const val BASE_DOC_URL = "https://plasma.sberdevices.ru"
private val STYLE_API_REGEX = "<!--\\s*@style-api\\s*-->".toRegex()

private data class StyleApiDoc(
    val coreName: String,
    val styleName: String,
    val receiverClassName: String,
    val functionName: String,
    val returnTypeName: String,
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
                    appendLine(
                        "| `${param.name}` | `${param.typeName}` | ${param.valuesColumn} |"
                    )
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
                append(dotExample)
                appendLine()
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
            append("val style = ")
            append(invocation)
            append('.')
            append(functionName)
            append('(')
            if (args.isNotBlank()) {
                append('\n')
                append(args)
                append('\n')
            }
            append(")")
        }
    }

    private fun exampleDotNotationCall(): String? {
        val composeReference = variations.firstOrNull { variation ->
            params.all { param ->
                val actualValue = variation.props[param.name] ?: param.defaultValue?.value
                actualValue == param.exampleRawValue()
            }
        }?.composeReference ?: variations.firstOrNull()?.composeReference
        return composeReference?.let { "val style = $it.style()" }
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
        val selectedValue = defaultValue ?: values.firstOrNull()
        return when {
            selectedValue == null -> error("No values available for `$name`")
            typeName == "Boolean" -> selectedValue.codeName
            else -> "$typeName.${selectedValue.codeName}"
        }
    }

    fun exampleRawValue(): String {
        return (defaultValue ?: values.firstOrNull())?.value
            ?: error("No values available for `$name`")
    }
}

private data class StyleApiValueDoc(
    val value: String,
    val codeName: String,
)

private data class StyleVariationDoc(
    val composeReference: String,
    val props: Map<String, String>,
)

private fun JsonObject.getAsJsonObjectOrNull(name: String): JsonObject? {
    val element = get(name) ?: return null
    return if (element.isJsonNull) null else element.asJsonObject
}

private fun JsonObject.getAsJsonArrayOrEmpty(name: String): JsonArray {
    val element = get(name) ?: return JsonArray()
    return if (element.isJsonNull) JsonArray() else element.asJsonArray
}

private fun JsonObject.toStyleApiValueDoc(): StyleApiValueDoc {
    return StyleApiValueDoc(
        value = get("value").asString,
        codeName = get("codeName").asString,
    )
}
