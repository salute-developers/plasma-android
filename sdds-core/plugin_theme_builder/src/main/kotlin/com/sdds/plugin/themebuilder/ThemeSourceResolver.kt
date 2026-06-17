package com.sdds.plugin.themebuilder

import java.io.File

internal class ThemeSourceResolver(
    projectDir: File,
) {
    private val sddsThemeSourceReader = SddsThemeSourceReader(projectDir)

    fun resolve(explicitSources: ThemeBuilderSources?): ThemeBuilderSources {
        return explicitSources ?: sddsThemeSourceReader.read()
    }
}
