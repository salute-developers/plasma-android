package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.dimens.DimenData
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
        return "@style/${name.withPrefixIfNeed("$capitalizedPrefix.$camelCaseThemeName", ".")}"
    }

    /**
     * Возвращает ссылку на fontFamily с названием [name].
     * Например, если шрифт называется display, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @font/pref_display
     */
    fun font(name: String): String {
        return "@font/${name.withPrefixIfNeed(resourcePrefix)}"
    }

    /**
     * Возвращает ссылку на цвет с названием [name].
     * Например, если цвет называется dark_text_primary, и ресурсам задан префикс "pref",
     * то функция вернет ссылку @color/pref_dark_text_primary
     */
    fun color(name: String): String {
        return "@color/${name.withPrefixIfNeed(resourcePrefix)}"
    }
}
