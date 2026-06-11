package com.sdds.plugin.themebuilder

import java.io.File

internal data class ThemeBuilderSources(
    val baseAlias: String = "",
    val sources: List<ThemeBuilderSource>,
    val paletteFile: File? = null,
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

    /**
     * Способ получения темы из локальной tenant-директории DSBuilder.
     */
    data class LocalDirectory(
        val directory: File,
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

        /**
         * Позволяет указать локальную tenant-директорию DSBuilder.
         */
        fun withLocalDirectory(
            directory: File,
            name: String,
            suffix: String = "",
        ): ThemeBuilderSource = LocalDirectory(directory, name, suffix)
    }
}
