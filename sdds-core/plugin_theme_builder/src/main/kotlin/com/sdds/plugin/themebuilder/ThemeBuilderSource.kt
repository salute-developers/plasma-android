package com.sdds.plugin.themebuilder

/**
 * Способ получения темы.
 */
internal sealed class ThemeBuilderSource(val themeName: String) {

    /**
     * Предпочтительный способ получения темы с помощью названия [remoteName] и версии [version] темы.
     */
    data class NameAndVersion(
        val remoteName: String,
        val version: String,
        val alias: String = remoteName,
    ) : ThemeBuilderSource(alias)

    /**
     * Способ получения темы с помощью ссылки [url].
     */
    data class Url(val url: String, val name: String) : ThemeBuilderSource(name)

    companion object {

        const val DEFAULT_THEME_NAME = "Default"

        /**
         * Позволяет указать источник получения темы с помощью [name] и [version]
         */
        fun withNameAndVersion(name: String, version: String, alias: String = name): ThemeBuilderSource =
            NameAndVersion(name, version, alias)

        /**
         * Позволяет указать источник получения темы с помощью [url]
         */
        fun withUrl(url: String, name: String = DEFAULT_THEME_NAME): ThemeBuilderSource = Url(url, name)
    }
}
