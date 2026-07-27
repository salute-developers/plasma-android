import com.android.build.gradle.LibraryExtension
import tasks.viewapi.GenerateUikitApiMetaTask

/**
 * Convention-плагин: регистрирует задачу генерации `uikit-api-meta.json`
 * из размеченных `declare-styleable` и подключает её вывод как java-resources
 * модуля-библиотеки, чтобы JSON попал в AAR.
 *
 * Применяется поверх `convention.android-lib`.
 */

private val androidLib = extensions.getByType(LibraryExtension::class.java)

private val metaOutputDir = layout.buildDirectory.dir("generated/viewApiMeta")

private val generateUikitApiMeta = tasks.register<GenerateUikitApiMetaTask>("generateUikitApiMeta") {
    resourcePrefix.set(provider { androidLib.resourcePrefix ?: "sd_" })
    resourceFiles.from(fileTree("src/main/res/values").matching { include("**/*.xml") })
    outputDir.set(metaOutputDir)
}

// Вывод задачи — как java-resources, чтобы JSON оказался в classes.jar внутри AAR.
androidLib.sourceSets.getByName("main").resources.srcDir(generateUikitApiMeta.map { it.outputDir })

// AGP не пробрасывает task-зависимость через srcDir(Provider) для генерируемой
// директории, поэтому задача не запускалась бы автоматически (JSON в AAR был бы
// устаревшим/отсутствующим). Явно привязываем её к упаковке java-ресурсов —
// во всех вариантах (process*JavaRes / merge*JavaResource).
tasks.matching { it.name.endsWith("JavaRes") || it.name.endsWith("JavaResource") }
    .configureEach { dependsOn(generateUikitApiMeta) }
