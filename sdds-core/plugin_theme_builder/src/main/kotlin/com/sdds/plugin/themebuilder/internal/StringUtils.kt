package com.sdds.plugin.themebuilder.internal

import org.gradle.configurationcache.extensions.capitalized

/**
 *
 * @author Малышев Александр on 06.03.2024
 */
fun String.toCamelCase(): String {
    var ignoreFirst = true
    return split("-").joinToString("") {
        if (ignoreFirst) {
            ignoreFirst = false
            it
        } else {
            it.capitalized()
        }
    }
}