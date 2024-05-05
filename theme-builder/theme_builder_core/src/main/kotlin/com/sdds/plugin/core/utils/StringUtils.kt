package com.sdds.plugin.core.utils

import java.util.Locale

private val camelRegex = "(?<=[a-zA-Z])[A-Z]".toRegex()
private const val RGBA_STR_LENGTH = 9
private const val RGB_STR_LENGTH = 7
private const val RGBA_ALPHA_INDEX_START = 7

/**
 * Переводит строку из формата CamelCase в формат snake_case
 */
fun String.camelToSnakeCase(): String = camelRegex.replace(this) {
    "_${it.value}"
}.toLowerCase(Locale.getDefault())

/**
 * Переводит строку из формата технического формата a.b.c-d в формат a_b_c_d
 * @author Малышев Александр on 12.03.2024
 */
fun String.techToSnakeCase(): String {
    return replace("[.-]+".toRegex(), "_")
}

/**
 * Добавляет префикс [prefix] и разделитель [delimiter] к строке, если
 * [prefix] не пустой
 */
fun String.withPrefixIfNeed(prefix: String? = null, delimiter: String = "_"): String {
    if (prefix.isNullOrBlank()) return this
    return "${prefix}${delimiter}$this"
}

/**
 * Преобразует строку цвета [rgba] вида #FFFFFFFF в строку вида 0xFFFFFFFF.
 * Также изменяет порядковый номер альфа-канала или добавляет его, если он отсутствует
 * в исходной строке. Т.е. RGBA -> ARGB или RGB -> ARGB
 */
fun colorToArgbHex(rgba: String): String {
    if (rgba.length == RGB_STR_LENGTH) return rgba.replace("#", "0xFF")
    if (rgba.length != RGBA_STR_LENGTH) return rgba.replace("#", "0x")
    return buildString {
        append("0x")
        append(rgba.subSequence(RGBA_ALPHA_INDEX_START, RGBA_STR_LENGTH))
        append(rgba.subSequence(1, RGBA_ALPHA_INDEX_START))
    }
}

/**
 * Достает имя файла из ссылки
 */
fun String.fileNameFromUrl(): String =
    this.split('/')
        .last()
