package com.sdds.plugin.themebuilder

import java.io.Serializable

/**
 * Модель наследуемой темы
 *
 * @property fullName полное название наследуемой темы
 * @property childSuffix строка, которую нужно добавить к названию наследника данной темы
 * @property themeType тип темы (только светлые токены, только темные токены, светлые и темные токены)
 *
 * @see [ViewThemeType]
 */
data class ViewThemeParent(
    val fullName: String,
    val childSuffix: String,
    val themeType: ViewThemeType = ViewThemeType.DARK_LIGHT,
) : Serializable

/**
 * Тип темы
 */
enum class ViewThemeType {
    /**
     * Дефолтная тема (директория res/values) с темными токенами
     */
    DARK,

    /**
     * Дефолтная тема (директория res/values) со светлыми токенами
     */
    LIGHT,

    /**
     * Дефолтная (директория res/values) и night (директория res/values-night) темы со светлыми и темными токенами
     */
    DARK_LIGHT,
}
