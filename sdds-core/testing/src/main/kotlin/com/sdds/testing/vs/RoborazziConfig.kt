package com.sdds.testing.vs

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import com.sdds.uikit.utils.TextAppearanceConfig
import org.junit.Before
import org.junit.Rule
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import java.io.File

/**
 * Базовая конфигурация Roborazzi для тестов
 */
open class RoborazziConfig(
    private val theme: String,
) {
    /**
     * Коифигурация темной/светлой темы
     */
    @Before
    fun setUpTheme() {
        RuntimeEnvironment.setQualifiers(theme)
        TextAppearanceConfig.shouldLoadFontSynchronously = true
    }

    /**
     * Roborazzi rule
     */
    @OptIn(ExperimentalRoborazziApi::class)
    @get:Rule
    val roborazziRule = RoborazziRule(
        options = RoborazziRule.Options(
            outputDirectoryPath = directoryPath,
            outputFileProvider = { description, outputDirectory, fileExtension ->
                val themeSuffix = when (theme) {
                    "+notnight" -> "light"
                    else -> "dark"
                }
                File(
                    outputDirectory,
                    "${description.methodName.replace("[]", "")}_$themeSuffix.$fileExtension",
                )
            },
            roborazziOptions = RoborazziOptions(
                compareOptions = RoborazziOptions.CompareOptions(
                    changeThreshold = 0.005f,
                ),
            ),
        ),
    )

    companion object {
        /**
         * Папка для сохранения скриншотов
         */
        const val directoryPath = "screenshots"

        /**
         * Темная/светлая тема
         */
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "")
        fun themeProvider(): Array<String> =
            arrayOf(
                "+night",
                "+notnight",
            )
    }
}
