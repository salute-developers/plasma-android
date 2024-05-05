package com.sdds.plugin.attributebuilder.internal.utils

import java.io.File

/**
 * Директория values
 */
private fun File.valuesDir(): File {
    val valueDir = File("${this.path}/values")
    if (!valueDir.exists()) valueDir.mkdirs()
    return valueDir
}

/**
 * Файл с атрибутами
 */
internal fun File.attrsDir(): File {
    return File("${valuesDir().path}/attributes.xml")
}
