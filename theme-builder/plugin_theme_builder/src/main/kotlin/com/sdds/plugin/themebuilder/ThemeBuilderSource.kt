package com.sdds.plugin.themebuilder

/**
 * Способ получения темы.
 */
sealed class ThemeBuilderSource {

    /**
     * Предпочтительный способ получения темы с помощью названия [name] и версии [version] темы.
     */
    data class NameAndVersion(val name: String, val version: String) : ThemeBuilderSource()

    /**
     * Способ получения темы с помощью ссылки [url].
     * В этом способе ожидается, что базовый файл темы с мета-ифнормацией имеет такое же название,
     * как и архив в [url].
     * Например, если ссылка имеет вид https://github.com/plasma/theme/json/plasma.zip,
     * то архив по ссылке должен содержать в корне файл с названием plasma.json.
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
