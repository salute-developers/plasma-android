package com.sdds.plugin.themebuilder.internal.generator.theme.view

import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import org.gradle.configurationcache.extensions.capitalized
import java.util.Locale

/**
 * Модель атрибута в xml-теме
 * @param name имя атрибута
 * @param value значение атрибута
 */
internal data class ViewThemeAttribute(
    val name: String,
    val value: String,
) {
    internal companion object {
        fun attrNameFromTokenName(name: String) =
            name
                .removePrefix("dark.")
                .removePrefix("light.")
                .techToSnakeCase()
                .split('_')
                .joinToString(separator = "") { it.capitalized() }
                .decapitalize(Locale.getDefault())
    }
}
