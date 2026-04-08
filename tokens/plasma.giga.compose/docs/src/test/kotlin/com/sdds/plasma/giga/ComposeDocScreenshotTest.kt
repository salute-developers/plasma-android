package com.sdds.plasma.giga

import androidx.compose.runtime.SideEffect
import androidx.compose.ui.test.onRoot
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.samples.RoborazziConfigDocs
import org.junit.AfterClass
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeDocScreenshotTest(composableSample: ComposableSampleInfo) : RoborazziConfigDocs(composableSample) {

    @Test
    fun docs_screenshot_test() {
        var shouldCapture = true

        try {
            composeTestRule.content {
                val providedStyles = LocalProvidedStyles.current
                SideEffect {
                    val componentName = composableSample.id
                        .substringBeforeLast(".")
                        .split(".")
                    val component = componentName.takeLast(2).joinToString("").lowercase()
                    val lastSegment = componentName.last().lowercase()
                    shouldCapture = providedStyles.any { styleKey ->
                        val key = styleKey.replace("-", "").lowercase()
                        component.contains(key) || key.contains(component) ||
                            key.contains(lastSegment) || lastSegment.contains(key)
                    }
                    println(" componentName: $componentName, ищем в: $providedStyles, совпали: $shouldCapture")
                }
                composableSample.sample.reference.invoke()
            }
            composeTestRule.waitForIdle()
            if (shouldCapture) {
                composeTestRule.onRoot().captureRoboImage()
            } else {
                skippedTests.add(composableSample.id)
                println("Skipped tests: ${composableSample.id}")
            }
        } catch (e: Throwable) {
            throw AssertionError(
                "Screenshot test failed: \n${composableSample.id}",
                e,
            )
        }
    }

    companion object {
        private val skippedTests = mutableListOf<String>()

        @AfterClass
        @JvmStatic
        fun skippedTests() {
            if (skippedTests.isNotEmpty()) {
                println("Skipped tests: ${skippedTests.size} screenshots:")
                skippedTests.forEach { println(" - $it") }
            }
        }
    }
}
