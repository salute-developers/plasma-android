package com.sdds.uikit.fixtures.samples

import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import com.sdds.docs.ViewSample
import com.sdds.docs.ViewSamples
import com.sdds.uikit.utils.TextAppearanceConfig
import org.json.JSONObject
import org.junit.Before
import org.junit.Rule
import org.robolectric.ParameterizedRobolectricTestRunner
import java.io.File

/**
 * Базовая конфигурация Roborazzi для тестов
 * @property viewSample информация о примере
 */
open class RoborazziConfigDocsXml(
    val viewSample: ViewSampleInfo,
) {

    /**
     * Устанавливает тему для скриншотов
     */
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

    /**
     * Информация о примере
     * @property id идентификатор примера
     * @property sample обертка над примеров в документацию
     */
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
         * Поиск названия компонентов в config-info-view-system.json
         */
        val ProvidedStyleKeys: Set<String> by lazy {
            val moduleDir = System.getProperty("moduleDir") ?: ""
            println("mooduleDir: $moduleDir")
            val jsonFile = File(moduleDir).parentFile?.resolve("config-info-view-system.json")
                ?: return@lazy emptySet()

            if (!jsonFile.exists()) return@lazy emptySet()

            println("jsonFile: ${jsonFile.absolutePath}")
            println("jsonFile.exists(): ${jsonFile.exists()}")

            val json = JSONObject(jsonFile.readText())
            val components = json.getJSONArray("components")

            buildSet {
                for (i in 0 until components.length()) {
                    val component = components.getJSONObject(i)
                    add(component.getString("key").replace("-", "").lowercase())
                    add(component.getString("coreName").lowercase())
                    add(component.getString("styleName").lowercase())
                }
            }
        }

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
