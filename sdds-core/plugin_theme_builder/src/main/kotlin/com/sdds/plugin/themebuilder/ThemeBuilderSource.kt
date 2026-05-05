package com.sdds.plugin.themebuilder

internal data class ThemeBuilderSources(
    val baseAlias: String = "",
    val sources: List<ThemeBuilderSource>,
)

/**
 * Способ получения темы.
 */
internal sealed class ThemeBuilderSource(val themeName: String, val tenant: String) {

    /**
     * Предпочтительный способ получения темы с помощью названия [remoteName] и версии [version] темы.
     */
    data class NameAndVersion(
        val remoteName: String,
        val version: String,
        val alias: String = remoteName,
        val suffix: String,
    ) : ThemeBuilderSource(alias, suffix)

    /**
     * Способ получения темы с помощью ссылки [url].
     */
    data class Url(
        val url: String,
        val name: String,
        val suffix: String,
    ) : ThemeBuilderSource(name, suffix)

    companion object {

        const val DEFAULT_THEME_NAME = "Default"

        /**
         * Позволяет указать источник получения темы с помощью [name] и [version]
         */
        fun withNameAndVersion(
            name: String,
            version: String,
            alias: String = name,
            suffix: String = "",
        ): ThemeBuilderSource =
            NameAndVersion(name, version, alias, suffix)

        /**
         * Позволяет указать источник получения темы с помощью [url]
         */
        fun withUrl(
            url: String,
            name: String = DEFAULT_THEME_NAME,
            suffix: String = "",
        ): ThemeBuilderSource = Url(url, name, suffix)
    }
}
