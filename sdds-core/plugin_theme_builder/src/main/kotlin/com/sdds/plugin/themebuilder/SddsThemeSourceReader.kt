package com.sdds.plugin.themebuilder

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.io.File

/**
 * Читает локальный DSBuilder source из `.sdds/config.json`.
 */
internal class SddsThemeSourceReader(
    private val projectDir: File,
) {

    fun read(): ThemeBuilderSources {
        val configFile = getConfigFile()
        val config = json.decodeFromString(SddsConfig.serializer(), configFile.readText())
        validateTenants(config)
        val paletteFile = config.paletteFile(projectDir)
        validatePaletteFile(paletteFile)

        val sources = config.tenants.mapIndexed { index, tenant ->
            val tenantName = tenant.publicName
            val tenantDirectory = tenant.directory(projectDir)
            validateRequiredFiles(tenantDirectory)
            ThemeBuilderSource.withLocalDirectory(
                directory = tenantDirectory,
                name = tenantName,
                suffix = if (index == 0) "" else tenantName,
            )
        }

        return ThemeBuilderSources(
            baseAlias = config.tenants.first().publicName,
            sources = sources,
            paletteFile = paletteFile,
        )
    }

    private fun getConfigFile(): File {
        val configFile = projectDir.resolve(CONFIG_PATH)
        if (!configFile.exists()) {
            throw ThemeBuilderException(
                "themeSource(s) or $CONFIG_PATH must be provided. Missing file: ${configFile.path}",
            )
        }
        return configFile
    }

    private fun validateTenants(config: SddsConfig) {
        if (config.tenants.isEmpty()) {
            throw ThemeBuilderException("$CONFIG_PATH must contain at least one tenant")
        }
    }

    private fun validatePaletteFile(paletteFile: File) {
        if (!paletteFile.isFile) {
            throw ThemeBuilderException("Required palette file is missing: ${paletteFile.path}")
        }
    }

    private fun validateRequiredFiles(tenantDirectory: File) {
        val metaFile = tenantDirectory.resolve(META_JSON_NAME)
        if (!metaFile.isFile) {
            throw ThemeBuilderException("Required theme file is missing: ${metaFile.path}")
        }

        TOKEN_FILE_NAMES.forEach { fileName ->
            val tokenFile = tenantDirectory.resolve("android/$fileName")
            if (!tokenFile.isFile) {
                throw ThemeBuilderException("Required theme file is missing: ${tokenFile.path}")
            }
        }
    }

    @Serializable
    internal data class SddsConfig(
        val tenants: List<Tenant> = emptyList(),
        val palettePath: String? = null,
    ) {
        fun paletteFile(projectDir: File): File {
            val path = palettePath ?: DEFAULT_PALETTE_PATH
            return projectDir.resolve(path)
        }
    }

    @Serializable
    internal data class Tenant(
        val name: String,
        val alias: String? = null,
        val directoryPath: String? = null,
    ) {
        val publicName: String
            get() = alias ?: name

        fun directory(projectDir: File): File {
            val path = directoryPath ?: "$SDDS_DIR/$name"
            return projectDir.resolve(path)
        }
    }

    private companion object {
        const val SDDS_DIR = ".sdds"
        const val CONFIG_PATH = "$SDDS_DIR/config.json"
        const val DEFAULT_PALETTE_PATH = "$SDDS_DIR/tenants/palette.json"
        const val META_JSON_NAME = "meta.json"

        val TOKEN_FILE_NAMES = listOf(
            "android_color.json",
            "android_gradient.json",
            "android_typography.json",
            "android_fontFamily.json",
            "android_shape.json",
            "android_shadow.json",
            "android_spacing.json",
        )

        val json = Json {
            ignoreUnknownKeys = true
        }
    }
}
