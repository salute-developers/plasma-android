package com.sdds.uikit.fixtures.samples

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import com.sdds.docs.ViewSample
import com.sdds.docs.ViewSamples
import com.sdds.uikit.utils.TextAppearanceConfig
import org.junit.Before
import org.junit.Rule
import org.robolectric.ParameterizedRobolectricTestRunner
import java.io.File

/**
 * Базовая конфигурация Roborazzi для тестов
 */
open class RoborazziConfigDocsXml(
    val viewSample: ViewSampleInfo,
) {

    @Before
    fun setUpTheme() {
        TextAppearanceConfig.shouldLoadFontSynchronously = true
    }

    /**
     * Roborazzi rule
     */
    @OptIn(ExperimentalRoborazziApi::class)
    @get:Rule
    val roborazziRule = RoborazziRule(
        options = RoborazziRule.Options(
            outputDirectoryPath = screenshotsDir.toString(),
            outputFileProvider = { description, outputDirectory, fileExtension ->
                File(
                    outputDirectory,
                    viewSample.id.replace(".", "_") + ".$fileExtension",
                )
            },
            roborazziOptions = RoborazziOptions(
                compareOptions = RoborazziOptions.CompareOptions(
                    changeThreshold = 0.005f,
                ),
            ),
        ),
    )

    @Suppress("UndocumentedPublicClass")
    data class ViewSampleInfo(val id: String, val sample: ViewSample)

    companion object {
        /**
         * Папка для сохранения скриншотов
         */
        private val screenshotsDir = File(
            System.getProperty("rootDir"),
            "override-docs/static/screenshots-docusaurus",
        )

        /**
         * Параметризированные тесты
         */
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "")
        fun samples(): List<ViewSampleInfo> =
            ViewSamples
                .filterValues { it is ViewSample && it.needScreenshot }
                .map { (id, sample) -> ViewSampleInfo(id, sample as ViewSample) }
    }
}
