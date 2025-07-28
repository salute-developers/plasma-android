package utils

import org.gradle.api.Project
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
    get() = getVersionCatalog()?.versions?.sdds?.icons?.get() ?: "latest"

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
 * Преобразует шаблоны документации, подставляя значения из проекта в плейсхолдеры.
 * Изменяет все `.md` файлы и файл `docusaurus.config.ts` внутри указанной директории.
 */
fun Project.transformTemplate(templateDir: File) {
    val versionInfo = versionInfo()
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
    return "$branchSuffix/$docsTarget/$artifactId/$version/"
}

private const val BASE_DOC_URL = "https://plasma.sberdevices.ru"