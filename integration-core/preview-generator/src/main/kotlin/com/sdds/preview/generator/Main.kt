package com.sdds.preview.generator

import java.io.File

/** Имя файла со списком компонентов рядом со сгенерированными исходниками. */
internal const val COMPONENTS_FILE = "components.txt"

/**
 * Точка входа генератора фабрик стилей preview.
 *
 * Аргументы: путь к api-мете (JSON либо JAR с ресурсом `sdds/api/uikit-compose-api-meta.json`), каталог вывода и
 * необязательный список `componentName` через запятую (по умолчанию все компоненты меты).
 */
public fun main(args: Array<String>) {
    require(args.size >= 2) { "Использование: <meta.json|meta.jar> <outputDir> [Component1,Component2]" }
    val meta = readApiMeta(File(args[0]))
    val filter = args.getOrNull(2)?.split(",")?.map { it.trim() }?.filter { it.isNotEmpty() }?.toSet()
    val selected = if (filter == null) meta else meta.filter { it.componentName in filter }
    if (filter != null) {
        val missing = filter - selected.map { it.componentName }.toSet()
        require(missing.isEmpty()) { "В мете нет компонентов: $missing" }
    }
    val output = File(args[1])
    output.deleteRecursively()
    output.mkdirs()
    val sorted = selected.sortedBy { it.componentName }
    FactoryGenerator(sorted).generate(output)
    // Список компонентов для manifest плагина: те же имена, что и в реестре сгенерированных фабрик.
    File(output, COMPONENTS_FILE).writeText(sorted.joinToString("\n", postfix = "\n") { it.componentName })
}
