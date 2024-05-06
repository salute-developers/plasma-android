package com.sdds.plugin.attributebuilder.utils

import java.io.File

/**
 * Возвращает содержимое ресурса по пути [path] как строку
 * @author Малышев Александр on 14.03.2024
 */
internal fun Any.getResourceAsText(path: String): String {
    return this::class.java.classLoader.getResource(path)?.readText().orEmpty()
}

/**
 * Возвращает содержимое ресурса по пути [path] как [File]
 */
internal fun Any.getResourceAsFile(path: String): File {
    val inputFileName = javaClass.classLoader.getResource(path)
        ?.file ?: throw IllegalStateException()
    return File(inputFileName)
}
