package com.sdds.plugin.themebuilder.internal.utils

/**
 * Возвращает содержимое ресурса по пути [path] как строку
 * @author Малышев Александр on 14.03.2024
 */
internal fun Any.getResourceAsText(path: String): String {
    return this::class.java.classLoader.getResource(path)?.readText().orEmpty()
}
