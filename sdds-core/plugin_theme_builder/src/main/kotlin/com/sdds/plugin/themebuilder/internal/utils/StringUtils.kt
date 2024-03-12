package com.sdds.plugin.themebuilder.internal.utils

/**
 * Переводит строку из формата технического формата a.b.c-d в формат a_b_c_d
 * @author Малышев Александр on 12.03.2024
 */
internal fun String.techToSnakeCase(): String {
    return replace("[.-]+".toRegex(), "_")
}