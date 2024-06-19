@file:Suppress("DSL_SCOPE_VIOLATION")

import org.jetbrains.kotlin.incremental.mkdirsOrThrow

plugins {
    id("convention.root-project")
    alias(libs.plugins.android.lib) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.android.cache.fix) apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://plugins.gradle.org/m2/")
        }
    }

    dependencies {
        configurations.all {
            resolutionStrategy {
                force(libs.base.kotlin.serialization.json)
            }
        }
        classpath(libs.base.gradle.android)
        classpath(libs.base.gradle.kotlin)
        classpath(libs.base.gradle.cacheFix)
    }
}

/**
 * Gradle-таска, генерирующая модули тем в соответствии со списком тем.
 * Каждый модуль содержит файл build.gradle.kts с нужной конфигурацией themeBuilder
 * и файл манифеста.
 */
internal abstract class GenerateThemeModulesTask @Inject constructor() : DefaultTask() {

    /**
     * Строк, содержащая список тем, разделенных точкой.
     */
    @get:Input
    abstract val themes: Property<String>

    @TaskAction
    fun action() {
        val themeNames = themes.get().split('.')
        themeNames.forEach {
            generateComposeModule(it)
            generateViewModule(it)
        }
        modifySettingsGradle(themeNames)
    }

    private fun modifySettingsGradle(themes: List<String>) {
        val file = File("${project.projectDir}/settings.gradle.kts")
        with(file) {
            val lines = readLines()
            val linesWithoutInclude = lines.takeWhile { !it.contains("include(") }
            val settingGradleFileContent = buildString {
                linesWithoutInclude.forEach {
                    appendLine(it)
                }
                appendLine("include(")
                themes.forEach {
                    appendLine("    \":${it}_compose\",")
                    appendLine("    \":${it}_view\",")
                }
                appendLine(")")
            }
            writeText(settingGradleFileContent)
        }
    }

    private fun generateComposeModule(themeName: String) {
        val buildGradleFile = createThemeModuleAndBuildGradleFile(themeName, isCompose = true)
        buildGradleFile.writeText(generateBuildGradleText(themeName = themeName, isCompose = true))
    }

    private fun generateViewModule(themeName: String) {
        val buildGradleFile = createThemeModuleAndBuildGradleFile(themeName, isCompose = false)
        buildGradleFile.writeText(generateBuildGradleText(themeName, isCompose = false))
    }

    private fun generateBuildGradleText(themeName: String, isCompose: Boolean): String {
        return if (isCompose) {
            generateComposeBuildGradle(themeName)
        } else {
            generateViewBuildGradle(themeName)
        }
    }

    private fun generateComposeBuildGradle(themeName: String): String {
        return buildString {
            appendLine("@Suppress(\"DSL_SCOPE_VIOLATION\")")
            appendLine("plugins {")
            appendLine("    id(\"convention.android-lib\")")
            appendLine("    id(\"convention.compose\")")
            appendLine("    id(libs.plugins.themebuilder.get().pluginId)")
            appendLine("}")
            appendLine()
            appendLine("android {")
            appendLine("    namespace = \"com.sdds.playground.themebuilder\"")
            appendLine("}")
            appendLine()
            appendLine("themeBuilder {")
            appendLine("    themeSource(name = \"$themeName\", version = \"latest\")")
            appendLine("    compose(ktPackage = \"com.sdds.themes.$themeName.tokens\")")
            appendLine("    resourcesPrefix(prefix = \"thmbldr\")")
            appendLine("}")
            appendLine()
            appendLine("dependencies {")
            appendLine("    implementation(\"sdds-core:uikit-compose\")")
            appendLine("    implementation(libs.base.androidX.core)")
            appendLine("    implementation(libs.base.androidX.appcompat)")
            appendLine("    val composeBom = platform(libs.base.androidX.compose.bom)")
            appendLine("    implementation(composeBom)")
            appendLine("    implementation(libs.base.androidX.compose.foundation)")
            appendLine("}")
        }
    }

    private fun generateViewBuildGradle(themeName: String): String {
        return buildString {
            appendLine("@Suppress(\"DSL_SCOPE_VIOLATION\")")
            appendLine("plugins {")
            appendLine("    id(\"convention.android-lib\")")
            appendLine("    id(libs.plugins.themebuilder.get().pluginId)")
            appendLine("}")
            appendLine()
            appendLine("android {")
            appendLine("    namespace = \"com.sdds.playground.themebuilder\"")
            appendLine("}")
            appendLine()
            appendLine("themeBuilder {")
            appendLine("    themeSource(name = \"$themeName\", version = \"latest\")")
            appendLine("    view(parentThemeName = \"Sdds.Theme\")")
            appendLine("    resourcesPrefix(prefix = \"thmbldr\")")
            appendLine("}")
            appendLine()
            appendLine("dependencies {")
            appendLine("    implementation(\"sdds-core:uikit\")")
            appendLine("    implementation(libs.base.androidX.core)")
            appendLine("    implementation(libs.base.androidX.appcompat)")
            appendLine("}")
        }
    }

    private fun addManifestFile(manifestPath: String) {
        val sourceManifestFile = File("${project.projectDir}/manifest.txt")
        val outputFile = File(manifestPath)
        sourceManifestFile.copyTo(outputFile, overwrite = true)
    }

    private fun createThemeModuleAndBuildGradleFile(themeName: String, isCompose: Boolean): File {
        val moduleDirPath = getModuleDirPath(themeName, isCompose = isCompose)
        createModuleDir(moduleDirPath)
        addManifestFile("$moduleDirPath/src/main/AndroidManifest.xml")
        return File("$moduleDirPath/build.gradle.kts")
            .also { it.createNewFile() }
    }

    private fun getModuleDirPath(themeName: String, isCompose: Boolean): String {
        val framework = if (isCompose) "compose" else "view"
        return "${project.projectDir}/${themeName}_$framework"
    }

    private fun createModuleDir(moduleDirPath: String) {
        File(moduleDirPath).also { it.mkdirsOrThrow() }
    }
}

tasks.register<GenerateThemeModulesTask>("generateThemeModulesTask")
tasks.named<GenerateThemeModulesTask>("generateThemeModulesTask") {
    themes.set(
        "caldera_online." +
                "default." +
                "flamingo." +
                "plasma_b2c." +
                "plasma_web." +
                "sberHealth." +
                "sbermarket." +
                "sbermarket_business." +
                "sbermarket_metro." +
                "sbermarket_selgros." +
                "sbermarket_wlbusiness." +
                "sberonline." +
                "sberprime." +
                "sdds_serv." +
                "stylesSalute"
    )
}