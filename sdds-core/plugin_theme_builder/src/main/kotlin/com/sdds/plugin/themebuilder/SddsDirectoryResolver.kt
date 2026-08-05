package com.sdds.plugin.themebuilder

import org.gradle.api.GradleException
import java.io.File

/** Android UI platform used to resolve standard DS Builder info artifacts. */
enum class DsBuilderPlatform(
    internal val componentsInfoName: String,
    internal val themeInfoName: String,
) {
    /** Jetpack Compose. */
    COMPOSE("config-info-compose.json", "theme-info-compose.json"),

    /** Android View system. */
    VIEW("config-info-view-system.json", "theme-info-view-system.json"),
}

/**
 * Resolves `.sdds` from the current project and its immediate Gradle parent.
 *
 * The parent directory is supplied explicitly because a Gradle parent project
 * does not necessarily coincide with the filesystem parent.
 */
class SddsDirectoryResolver(
    private val projectDirectory: File,
    private val parentProjectDirectory: File? = null,
) {
    private val candidates: List<File>
        get() = listOfNotNull(
            projectDirectory.resolve(SDDS_DIRECTORY_NAME),
            parentProjectDirectory?.resolve(SDDS_DIRECTORY_NAME),
        ).distinct()

    /** Returns the first existing standard `.sdds` directory, if any. */
    fun resolveOrNull(): File? = candidates.firstOrNull(File::isDirectory)

    /**
     * Returns the standard `.sdds` directory or fails with every checked path.
     */
    fun resolve(): File = resolveOrNull()
        ?: throw GradleException(
            buildString {
                append("Cannot resolve .sdds directory. Checked: ")
                append(candidates.joinToString { it.absolutePath })
                append(". Set dsBuilder.sddsDirectory explicitly or create one of these directories.")
            },
        )

    /** Resolves `.sdds/config.json` and optionally verifies it exists. */
    fun configFile(required: Boolean = true): File =
        resolve().resolve(CONFIG_FILE_NAME).requireFile("DS Builder config", required)

    /** Resolves the platform-specific components info file. */
    fun componentsInfoFile(platform: DsBuilderPlatform, required: Boolean = true): File =
        resolve().resolve(platform.componentsInfoName).requireFile("Components info", required)

    /** Resolves the platform-specific theme info file. */
    fun themeInfoFile(platform: DsBuilderPlatform, required: Boolean = true): File =
        resolve().resolve(platform.themeInfoName).requireFile("Theme info", required)

    private fun File.requireFile(description: String, required: Boolean): File {
        if (required && !isFile) {
            throw GradleException("$description file does not exist: $absolutePath")
        }
        return this
    }

    private companion object {
        const val SDDS_DIRECTORY_NAME = ".sdds"
        const val CONFIG_FILE_NAME = "config.json"
    }
}
