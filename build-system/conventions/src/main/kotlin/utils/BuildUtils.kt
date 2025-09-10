package utils

import com.android.build.gradle.LibraryExtension
import org.gradle.accessors.dm.LibrariesForLibs
import java.io.File
import org.gradle.api.Project
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.the

/**
 * Находит общий для всех проектов файл detekt-baseline.
 * Если поиск неудачный, возвращает файл специфичный для проекта
 */
fun findDetektBaselineAll(project: Project): File =
    try {
        val bs = project.gradle.includedBuild("build-system")
        File("${bs.projectDir}/.detekt/detekt-baseline-all.xml")
    } catch (e: Throwable) {
        project.logger.warn("${project.displayName}: fallback to use project-specific '.detekt/detekt-baseline.xml'")
        File("${project.projectDir}/.detekt/detekt-baseline.xml")
    }

/**
 * Предоставляет скоуп для доступа к каталогу версий
 */
inline fun Project.withVersionCatalogs(block: LibrariesForLibs.() -> Unit) {
    // если тут не поставить эту проверку,
    // то в момент компиляции конвеншенов будем получать ошибку о том что такой extension не зарегистрирован
    // https://github.com/gradle/gradle/issues/15383
    if (name != "gradle-kotlin-dsl-accessors") {
        val libs = the<LibrariesForLibs>()
        block(libs)
    }
}

/**
 * Возвращает делегат для доступа к каталогу версий
 */
fun Project.getVersionCatalog(): LibrariesForLibs? {
    return if (name != "gradle-kotlin-dsl-accessors") {
         the<LibrariesForLibs>()
    } else null
}

/**
 * Производит поиск свойства [propertyName] во всех файла gradle.properties,
 * если не находит - возвращает [default]
 */
fun <Def> Project.findPropertyOrDefault(propertyName: String, default: Def) =
    findProperty(propertyName) ?: default

/**
 * Возвращает true, если текущий проект - проект с плагином "com.android.app",
 * иначе false
 */
fun Project.isAndroidApp(): Boolean =
    the<LibrariesForLibs>().let { libs ->
        plugins.hasPlugin(libs.plugins.android.app.get().pluginId)
    }

/**
 * Возвращает true, если текущий проект - проект с плагином "com.android.lib",
 * иначе false
 */
fun Project.isAndroidLib(): Boolean =
    the<LibrariesForLibs>().let { libs ->
        plugins.hasPlugin(libs.plugins.android.lib.get().pluginId)
    }

/**
 * Возвращает true, если текущий проект - проект с плагином "com.android.lib" и с включенным buildFeatures.compose,
 * иначе false
 */
fun Project.isComposeLib(): Boolean =
    extensions.findByType<LibraryExtension>()?.buildFeatures?.compose ?: false

/**
 * Возвращает true, если текущий проект - интеграционный модуль песочницы, иначе false
 */
fun Project.isSandboxIntegrationModule(): Boolean =
    name.endsWith("integration") && !name.contains("core")
