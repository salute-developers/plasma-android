package com.sdds.plugin.themebuilder

import java.io.Serializable

/**
 * Модель наследуемой темы
 *
 * @property themePrefix префикс темы
 * @property themeSuffix суффикс темы
 * @property childSuffix строка, которую нужно добавить к названию наследника данной темы
 *
 */
data class ViewThemeParent(
    val themePrefix: String,
    val themeSuffix: String = "",
    val childSuffix: String = "",
) : Serializable {

    /**
     * Полное название наследуемой темы
     */
    val fullName: String
        get() = if (themeSuffix.isEmpty()) {
            themePrefix
        } else {
            "$themePrefix.$themeSuffix"
        }
}
