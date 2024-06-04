package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import org.gradle.api.Project

/**
 * Расширение для плагина ThemeBuilder
 * @author Малышев Александр on 04.03.2024
 */
open class ThemeBuilderExtension {
    internal var target: ThemeBuilderTarget? = null
    internal var ktPackage: String? = null
    internal var resourcesPrefix: String? = null
    internal var parentThemeName: String = DEFAULT_PARENT_THEME_NAME
    internal var themeSource: ThemeBuilderSource? = null
    internal var paletteUrl: String = DEFAULT_PALETTE_URL

    /**
     * Устанавливает источник темы по имени [name] и версии [version]
     */
    fun themeSource(name: String, version: String) {
        themeSource = ThemeBuilderSource.withNameAndVersion(name, version)
    }

    /**
     * Устанавливает источник темы по [url]
     */
    fun themeSource(url: String) {
        themeSource = ThemeBuilderSource.withUrl(url)
    }

    /**
     * Устанавливает View фреймворк для генерации темы и токенов
     *
     * @param parentThemeName опциональное название темы, от которой будет унаследована генерируемая тема.
     * Если не указано, тема будет унаследована от Sdds.Theme
     */
    fun view(parentThemeName: String? = null) {
        parentThemeName?.let { this.parentThemeName = it }
        updateTarget(ThemeBuilderTarget.VIEW_SYSTEM)
    }

    /**
     * Устанавливает compose фреймворк для генерации темы и токенов
     *
     * @param ktPackage пакет для генерируемых kotlin-файлов
     */
    fun compose(ktPackage: String) {
        this.ktPackage = ktPackage
        updateTarget(ThemeBuilderTarget.COMPOSE)
    }

    /**
     * Устанавливает префикс для названий ресурсов токенов
     */
    fun resourcesPrefix(prefix: String) {
        this.resourcesPrefix = prefix
    }

    /**
     * Устанавливает url для скачивания палитры
     */
    fun paletteUrl(url: String) {
        this.paletteUrl = url
    }

    private fun updateTarget(newTarget: ThemeBuilderTarget) {
        if (target == ThemeBuilderTarget.ALL || target == newTarget) return
        target = if (target != null) {
            ThemeBuilderTarget.ALL
        } else {
            newTarget
        }
    }

    companion object {
        private const val DEFAULT_PARENT_THEME_NAME = "Sdds.Theme"
        private const val DEFAULT_PALETTE_URL =
            "https://raw.githubusercontent.com/salute-developers/plasma/dev/packages/plasma-colors/palette/general.json"

        /**
         * Создает extension [ThemeBuilderExtension]
         */
        fun Project.themeBuilderExt(): ThemeBuilderExtension {
            return extensions.create("themeBuilder", ThemeBuilderExtension::class.java)
        }
    }
}
