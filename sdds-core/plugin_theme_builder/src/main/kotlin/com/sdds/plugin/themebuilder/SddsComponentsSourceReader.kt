package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

/**
 * Читает локальный DSBuilder-источник компонентов из `.sdds/components`.
 */
internal class SddsComponentsSourceReader(
    sddsDirectory: File,
    private val componentsDirectory: File = sddsDirectory.resolve(COMPONENTS_DIR),
) {

    fun read(): ThemeBuilderSource {
        val metaFile = componentsDirectory.resolve(META_FILE_NAME)
        if (!metaFile.isFile) {
            throw ThemeBuilderException(
                "componentSource or $COMPONENTS_DIR/$META_FILE_NAME must be provided. " +
                    "Missing file: ${metaFile.path}",
            )
        }
        val meta = json.decodeFromString(ComponentsMeta.serializer(), metaFile.readText())

        return ThemeBuilderSource.withLocalDirectory(
            directory = componentsDirectory,
            name = meta.name,
        )
    }

    @Serializable
    internal data class ComponentsMeta(
        val name: String,
    )

    private companion object {
        const val COMPONENTS_DIR = "components"
        const val META_FILE_NAME = "meta.json"

        val json = Json {
            ignoreUnknownKeys = true
        }
    }
}
