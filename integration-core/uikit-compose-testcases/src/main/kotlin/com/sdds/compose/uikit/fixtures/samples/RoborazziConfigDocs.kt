package com.sdds.compose.uikit.fixtures.samples

import android.app.Application
import android.content.pm.ActivityInfo
import androidx.activity.ComponentActivity
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onRoot
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.RoborazziRule
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.compose.docs.ComposableSample
import com.sdds.compose.docs.ComposableSamples
import org.json.JSONObject
import org.junit.AfterClass
import org.junit.Rule
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.Shadows.shadowOf
import java.io.File

/**
 * Базовая конфигурация Roborazzi для
 * compose скриншотных тестов документации
 */
@Suppress("UndocumentedPublicProperty")
open class RoborazziConfigDocs(
    val composableSample: ComposableSampleInfo,
) {

    private val providedStyles: Set<String> by lazy { ProvidedStyleKeys }

    /**
     * Правило для регистрации Activity до запуска тестов
     */
    @get:Rule(order = 0)
    val addActivityToRobolectricRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            super.starting(description)
            val appContext: Application = ApplicationProvider.getApplicationContext()
            val activityInfo = ActivityInfo().apply {
                name = ComponentActivity::class.java.name
                packageName = appContext.packageName
            }
            shadowOf(appContext.packageManager).addOrUpdateActivity(activityInfo)
        }
    }

    /**
     * Активити для тестов
     */
    @get:Rule(order = 1)
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    /**
     * Правило для запуска тестов и сохранения скриншотов в папку screenshots
     */
    @get:Rule(order = 2)
    val roborazziRule = RoborazziRule(
        composeRule = composeTestRule,
        captureRoot = composeTestRule.onRoot(),
        options = RoborazziRule.Options(
            captureType = RoborazziRule.CaptureType.None,
            outputDirectoryPath = screenshotsDir.toString(),
            outputFileProvider = { description, outputDirectory, fileExtension ->
                File(
                    outputDirectory,
                    composableSample.id.replace(".", "_") + ".$fileExtension",
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
    data class ComposableSampleInfo(val id: String, val sample: ComposableSample)

    /**
     * Добавляем скриншот, если компонент входит в список
     */
    fun ifNeedScreenshot() {
        var shouldCapture = true
        val componentName = composableSample.id
            .substringAfterLast(".")
            .substringBefore("_")
            .lowercase()
        shouldCapture = providedStyles.any { styleKey ->
            componentName == styleKey.lowercase()
        }
        println(" componentName: $componentName, ищем в: $providedStyles, совпали: $shouldCapture")
        if (shouldCapture) {
            composeTestRule.onRoot().captureRoboImage()
        } else {
            skippedTests.add(composableSample.id)
            println("Skipped tests: ${composableSample.id}")
        }
    }

    companion object {
        /**
         * Папка для сохранения скриншотов
         */
        private val screenshotsDir = File(
            System.getProperty("rootDir"),
            "override-docs/static/screenshots-docusaurus",
        )

        private val skippedTests = mutableListOf<String>()

        /**
         * Поиск названия компонентов в config-info-view-system.json
         */
        val ProvidedStyleKeys: Set<String> by lazy {
            val moduleDir = System.getProperty("moduleDir") ?: ""
            println("mooduleDir: $moduleDir")
            val jsonFile = File(moduleDir).parentFile?.resolve("config-info-compose.json")
                ?: return@lazy emptySet()

            if (!jsonFile.exists()) return@lazy emptySet()

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
         * Выводим список пропущенных тестов
         */
        @AfterClass
        @JvmStatic
        fun skippedTests() {
            if (skippedTests.isNotEmpty()) {
                println("Skipped tests: ${skippedTests.size} screenshots:")
                skippedTests.forEach { println(" - $it") }
            }
        }

        /**
         * Параметризированные тесты
         */
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "")
        fun samples(): List<ComposableSampleInfo> =
            ComposableSamples
                .filterValues { it is ComposableSample && it.needScreenshot }
                .map { (id, sample) -> ComposableSampleInfo(id, sample as ComposableSample) }
    }
}
