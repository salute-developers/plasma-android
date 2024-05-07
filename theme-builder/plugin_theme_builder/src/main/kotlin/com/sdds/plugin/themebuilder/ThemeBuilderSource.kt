package com.sdds.plugin.themebuilder

/**
 * Способ получения темы.
 * Предпочтительно использовать способ [withNameAndVersion].
 */
sealed class ThemeBuilderSource {

    /**
     * Предпочтительный способ получения темы с помощью названия [name] и версии [version] темы.
     */
    data class NameAndVersion(val name: String, val version: String) : ThemeBuilderSource()

    /**
     * Способ получения темы с помощью ссылки [url].
     */
    data class Url(val url: String) : ThemeBuilderSource()

    companion object {

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
