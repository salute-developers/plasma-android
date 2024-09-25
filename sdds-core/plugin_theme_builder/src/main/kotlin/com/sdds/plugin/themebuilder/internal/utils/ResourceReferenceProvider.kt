package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.dimens.DimenData
import com.sdds.plugin.themebuilder.internal.fonts.FontData
import org.gradle.configurationcache.extensions.capitalized

/**
 * Провайдер ссылок на ресурсы. Добавляет нужные префиксы к названию ресурса.
 * @param resourcePrefix префикс ресурсов
 * @author Малышев Александр on 14.03.2024
 */
internal class ResourceReferenceProvider(
    private val resourcePrefix: String,
    themeName: String,
) {

    private val capitalizedPrefix by unsafeLazy { resourcePrefix.capitalized() }
    private val camelCaseThemeName = themeName.snakeToCamelCase()

    /**
     * Возвращает ссылку на размер с названием [name].
     * Например, если размер называется text_size, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @dimen/pref_text_size
     */
    fun dimen(name: String): String {
        return "@dimen/${name.withPrefixIfNeed(resourcePrefix)}"
    }

    /**
     * Возвращает ссылку на размер [dimen].
     * @see ResourceReferenceProvider.dimen(name)
     */
    fun dimen(dimen: DimenData): String {
        return dimen(dimen.name)
    }

    /**
     * Возвращает ссылку на стиль с названием [name].
     * Например, если стиль называется Typography, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @style/Pref.Typography
     */
    fun style(name: String): String {
        val prefix = if (camelCaseThemeName.isNotBlank()) {
            "$capitalizedPrefix.$camelCaseThemeName"
        } else {
            capitalizedPrefix
        }
        return "@style/${name.withPrefixIfNeed(prefix, ".")}"
    }

    /**
     * Возвращает ссылку на шрифт с названием из [fontData].
     * Например, если шрифт называется display_bold, то функция вернет ссылку @font/display_bold
     */
    fun font(fontData: FontData): String {
        return "@font/${fontData.fontName}"
    }

    /**
     * Возвращает ссылку на цвет с названием [name].
     * Например, если цвет называется dark_text_primary, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @color/pref_dark_text_primary
     */
    fun color(name: String): String {
        return "@color/${name.withPrefixIfNeed(resourcePrefix)}"
    }

    /**
     * Возвращает ссылку на строку с названием [name].
     * Например, если строка называется app_name, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @string/pref_app_name
     */
    fun string(name: String): String {
        return "@string/${name.withPrefixIfNeed(resourcePrefix)}"
    }

    /**
     * Возвращает ссылку на массив с названием [name].
     * Например, если массив называется stops, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @array/pref_stops
     */
    fun array(name: String): String {
        return "@array/${name.withPrefixIfNeed(resourcePrefix)}"
    }

    /**
     * Возвращает ссылку на drawable с названием [name].
     * Например, если drawable называется button_bg, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @drawable/pref_button_bg
     */
    fun drawable(name: String): String {
        return "@drawable/${name.withPrefixIfNeed(resourcePrefix)}"
    }
}
