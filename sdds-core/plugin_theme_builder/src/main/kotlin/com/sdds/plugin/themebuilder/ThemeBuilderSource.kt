package com.sdds.plugin.themebuilder

/**
 * Способ получения темы.
 */
internal sealed class ThemeBuilderSource(val themeName: String) {

    /**
     * Предпочтительный способ получения темы с помощью названия [name] и версии [version] темы.
     */
    data class NameAndVersion(val name: String, val version: String) : ThemeBuilderSource(name)

    /**
     * Способ получения темы с помощью ссылки [url].
     */
    data class Url(val url: String, val name: String = DEFAULT_THEME_NAME) : ThemeBuilderSource(name)

    companion object {

        private const val DEFAULT_THEME_NAME = "Default"

        /**
         * Позволяет указать источник получения темы с помощью [name] и [version]
         */
        fun withNameAndVersion(name: String, version: String): ThemeBuilderSource =
            NameAndVersion(name, version)

        /**
         * Позволяет указать источник получения темы с помощью [url]
         */
        fun withUrl(url: String): ThemeBuilderSource = Url(url)
    }
}
