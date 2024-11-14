package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import org.junit.Before
import org.junit.Rule
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import java.io.File

open class RoborazziConfig(
    private val theme: String,
) {

    @Before
    fun setUpTheme() {
        RuntimeEnvironment.setQualifiers(theme)
    }

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
        const val directoryPath = "screenshots"

        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "")
        fun themeProvider(): Array<String> =
            arrayOf(
                "+night",
                "+notnight",
            )
    }
}
