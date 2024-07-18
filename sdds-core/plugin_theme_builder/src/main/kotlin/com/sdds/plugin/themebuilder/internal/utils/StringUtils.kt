package com.sdds.plugin.themebuilder.internal.utils

import org.gradle.configurationcache.extensions.capitalized
import java.util.Locale

private val camelRegex = "(?<=[a-zA-Z])[A-Z]".toRegex()

/**
 * Переводит строку из формата CamelCase в формат snake_case
 */
internal fun String.camelToSnakeCase(): String = camelRegex.replace(this) {
    "_${it.value}"
}.toLowerCase(Locale.getDefault())

/**
 * Переводит строку из формата технического формата a.b.c-d в формат a_b_c_d
 * @author Малышев Александр on 12.03.2024
 */
internal fun String.techToSnakeCase(): String {
    return replace("[.-]+".toRegex(), "_")
}

/**
 * Переводит строку из snake_case в CamelCase
 */
internal fun String.snakeToCamelCase(): String {
    return split('_')
        .joinToString(separator = "") { it.capitalized() }
}

/**
 * Добавляет префикс [prefix] и разделитель [delimiter] к строке, если
 * [prefix] не пустой
 */
internal fun String.withPrefixIfNeed(prefix: String? = null, delimiter: String = "_"): String {
    if (prefix.isNullOrBlank()) return this
    return "${prefix}${delimiter}$this"
}

/**
 * Достает имя файла из ссылки
 */
internal fun String.fileNameFromUrl(): String =
    this.split('/')
        .last()

/**
 * Извлекает имя файла шрифта из ссылки и приводит к snake_case
 */
internal fun String.fontFileNameFromUrl(): String =
    fileNameFromUrl()
        .replace('-', '_')
        .camelToSnakeCase()
