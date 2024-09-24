package com.sdds.playground.sandbox

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import org.junit.Rule
import java.io.File

open class RoborazziConfig {

    @OptIn(ExperimentalRoborazziApi::class)
    @get:Rule
    val roborazziRule = RoborazziRule(
        options = RoborazziRule.Options(
            outputDirectoryPath = directoryPath,
            outputFileProvider = { description, outputDirectory, fileExtension ->
                File(
                    outputDirectory,
                    "${description.methodName}.$fileExtension",
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
    }
}
