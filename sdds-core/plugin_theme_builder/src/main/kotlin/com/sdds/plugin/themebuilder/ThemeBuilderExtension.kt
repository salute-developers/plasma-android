package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.ThemeBuilderTarget
import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import org.gradle.api.Project

/**
 * Расширение для плагина ThemeBuilder
 * @author Малышев Александр on 04.03.2024
 */
open class ThemeBuilderExtension {
    internal var target: ThemeBuilderTarget? = null
    internal var ktPackage: String? = null
    internal var resourcesPrefix: String? = null
    internal var viewThemeParents: Set<ViewThemeParent> = emptySet()
    internal var themeSource: ThemeBuilderSource? = null
    internal var paletteUrl: String = DEFAULT_PALETTE_URL
    internal var mode: ThemeBuilderMode = ThemeBuilderMode.TOKENS_ONLY

    /**
     * Устанавливает источник темы по имени [name] и версии [version]
     */
    fun themeSource(name: String, version: String = "latest") {
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
    fun view(viewConfigBuilder: ViewConfigBuilder.() -> Unit = {}) {
        val builder = ViewConfigBuilder().apply(viewConfigBuilder)
        viewThemeParents = builder.themeParents
        updateTarget(ThemeBuilderTarget.VIEW_SYSTEM)
    }

    /**
     * Устанавливает compose фреймворк для генерации темы и токенов
     */
    fun compose() {
        updateTarget(ThemeBuilderTarget.COMPOSE)
    }

    /**
     * Устанавливает пакет для генерируемых kotlin-файлов
     */
    fun ktPackage(ktPackage: String) {
        this.ktPackage = ktPackage
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

    /**
     * Устанавливает режим генерации: токены или тема.
     * @see ThemeBuilderMode
     */
    fun mode(mode: ThemeBuilderMode) {
        this.mode = mode
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

/**
 * Билдер конфига для view
 */
class ViewConfigBuilder {
    private val _themeParents = mutableSetOf<ViewThemeParent>()
    internal val themeParents: Set<ViewThemeParent>
        get() = _themeParents

    /**
     * Указывает родительские темы
     *
     * @param themeParentsBuilder билдер списка родительских тем
     */
    fun themeParents(themeParentsBuilder: ViewParentListBuilder.() -> Unit) {
        val builder = ViewParentListBuilder().apply(themeParentsBuilder)
        _themeParents.clear()
        _themeParents.addAll(builder.themeParents)
    }
}

/**
 * Билдер списка родительских тем.
 * Позволяет указывать material, appCompat и любые custom темы в качестве родительских.
 */
class ViewParentListBuilder {
    private val _themeParents = mutableSetOf<ViewThemeParent>()
    internal val themeParents: Set<ViewThemeParent>
        get() = _themeParents

    /**
     * Добавляет Material тему в качестве родитльской темы.
     *
     * @param themeSuffix суффикс темы. Например для темы Theme.MaterialComponents.DayNight
     * нужно указать суффикс "DayNight".
     * Если суффикс не указан, родительская тема будет соответствовать Theme.MaterialComponents.
     * Если суффикс содержит "DayNight", будут сгенерированы темы для дневного и ночного режимов в директориях res/values и res/values-night.
     * Если суффикс содержит "Light", будет сгенерирована тема со светлыми токенами в директории res/values.
     * Если суффикс не содержит "Light" или "DayNight", будет сгенерирована тема с темными токенами в директории res/values.
     */
    fun materialComponentsTheme(themeSuffix: String = "") =
        addThemeParent(
            themePrefix = "Theme.MaterialComponents",
            themeSuffix = themeSuffix,
            defaultChildSuffix = "MaterialComponents",
        )

    /**
     * Добавляет AppCompat тему в качестве родитльской темы.
     *
     * @param themeSuffix суффикс темы. Например для темы Theme.AppCompat.DayNight
     * нужно указать суффикс "DayNight".
     * Если суффикс не указан, родительская тема будет соответствовать Theme.AppCompat.
     * Если суффикс содержит "DayNight", будут сгенерированы темы для дневного и ночного режимов в директориях res/values и res/values-night.
     * Если суффикс содержит "Light", будет сгенерирована тема со светлыми токенами в директории res/values.
     * Если суффикс не содержит "Light" или "DayNight", будет сгенерирована тема с темными токенами в директории res/values.
     */
    fun appCompatTheme(themeSuffix: String = "") =
        addThemeParent(
            themePrefix = "Theme.AppCompat",
            themeSuffix = themeSuffix,
            defaultChildSuffix = "AppCompat",
        )

    /**
     * Добавляет любую тему в качестве родитльской темы.
     *
     * @param themeName полное название наследуемой темы. Не должно быть пустым.
     * @param themeType тип темы, от которого будет зависеть, какие токены (светлые/темные)
     * и в каких файлах ресурсов будут сгенерированы.
     *
     * @see ViewThemeType
     */
    fun customTheme(
        themeName: String,
        themeType: ViewThemeType = ViewThemeType.DARK_LIGHT,
    ) = addThemeParent(
        themeName = themeName,
        themeType = themeType,
    )

    private fun addThemeParent(
        themePrefix: String,
        themeSuffix: String,
        defaultChildSuffix: String,
    ) {
        if (themeSuffix.isEmpty() && themePrefix.isEmpty()) {
            throw ThemeBuilderException("themePrefix or themeSuffix must be defined for parent theme")
        }
        val childSuffix =
            if (themeSuffix.isEmpty()) defaultChildSuffix else "$defaultChildSuffix.$themeSuffix"
        _themeParents.add(
            ViewThemeParent(
                fullName = getFullThemeName(themePrefix, themeSuffix),
                themeType = getThemeType(themeSuffix),
                childSuffix = childSuffix,
            ),
        )
    }

    private fun getFullThemeName(themePrefix: String, themeSuffix: String): String {
        return if (themeSuffix.isEmpty()) {
            themePrefix
        } else {
            "$themePrefix.$themeSuffix"
        }
    }

    private fun getThemeType(themeSuffix: String): ViewThemeType {
        return if (themeSuffix.contains("DayNight")) {
            ViewThemeType.DARK_LIGHT
        } else if (themeSuffix.contains("Light")) {
            ViewThemeType.LIGHT
        } else {
            ViewThemeType.DARK
        }
    }

    private fun addThemeParent(
        themeName: String,
        themeType: ViewThemeType,
    ) {
        if (themeName.isEmpty()) throw ThemeBuilderException("themeName must be defined for parent theme")
        _themeParents.add(
            ViewThemeParent(
                fullName = themeName,
                childSuffix = themeName,
                themeType = themeType,
            ),
        )
    }
}
