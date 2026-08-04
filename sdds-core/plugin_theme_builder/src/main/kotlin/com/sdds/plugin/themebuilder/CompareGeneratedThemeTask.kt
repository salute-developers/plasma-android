package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.compare.GeneratedResourceComparator
import org.gradle.api.DefaultTask
import org.gradle.api.GradleException
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.InputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option
import java.io.File

/**
 * Сравнивает сгенерированные ресурсы темы с эталонным снимком.
 *
 * Инструмент проверки обратной совместимости генерации: перестановка `<item>` внутри
 * `<style>` считается безобидной, всё остальное (переименование ресурса, изменение
 * значения, порядок элементов state-list) — семантическим расхождением, на котором
 * задача падает.
 *
 * Типовой сценарий:
 * ```
 * cp -R src/main/theme-builder-res /tmp/baseline
 * ./gradlew :модуль:cleanTheme :модуль:generateTheme :модуль:generateComponents
 * ./gradlew :модуль:compareGeneratedTheme --baseline=/tmp/baseline
 * ```
 *
 * Сравниваются только XML-ресурсы; сгенерированные Kotlin-файлы (напр. `ColorState`)
 * контролируются `git diff`.
 */
abstract class CompareGeneratedThemeTask : DefaultTask() {

    /**
     * Путь к каталогу ресурсов темы относительно директории проекта.
     */
    @get:Input
    abstract val outputResDirPath: Property<String>

    /**
     * Директория проекта, в которой лежит сгенерированная тема.
     */
    @get:InputDirectory
    abstract val projectDir: DirectoryProperty

    /**
     * Путь к эталонному снимку каталога ресурсов.
     */
    @get:Input
    abstract val baselineDir: Property<String>

    /**
     * Сколько расхождений печатать; при раскатке волн бывает нужен полный список.
     */
    @get:Input
    abstract val reportLimit: Property<Int>

    /**
     * Задаёт эталон из командной строки: `--baseline=/путь/к/снимку`.
     */
    @Option(option = "baseline", description = "Каталог с эталонным снимком сгенерированных ресурсов")
    fun setBaseline(path: String) {
        baselineDir.set(path)
    }

    /**
     * Ограничивает вывод отчёта: `--limit=500`.
     */
    @Option(option = "limit", description = "Сколько расхождений печатать (по умолчанию 50)")
    fun setLimit(limit: String) {
        reportLimit.set(limit.toInt())
    }

    private fun existingDirectory(directory: File, message: String): File {
        if (!directory.isDirectory) throw GradleException(message.format(directory.absolutePath))
        return directory
    }

    /**
     * Выполняет сравнение и печатает отчёт с разбивкой по классам расхождений.
     */
    @TaskAction
    fun compare() {
        val baseline = existingDirectory(
            File(baselineDir.get()),
            "Эталон не найден: %s. Укажите его через --baseline=<каталог>",
        )
        val actual = existingDirectory(
            projectDir.get().dir(outputResDirPath.get()).asFile,
            "Сгенерированные ресурсы не найдены: %s. Сначала выполните generateTheme и generateComponents",
        )

        val report = GeneratedResourceComparator().compare(baseline, actual)
        logger.lifecycle(report.format(reportLimit.getOrElse(DEFAULT_REPORT_LIMIT)))
        if (!report.isCompatible) {
            throw GradleException(
                "Обнаружено семантических расхождений: ${report.semantic.size}. " +
                    "Генерация не эквивалентна эталону",
            )
        }
    }

    private companion object {
        const val DEFAULT_REPORT_LIMIT = 50
    }
}
