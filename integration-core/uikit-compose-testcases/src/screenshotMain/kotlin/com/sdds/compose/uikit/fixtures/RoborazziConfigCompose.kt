@file:OptIn(androidx.compose.ui.test.ExperimentalTestApi::class)

package com.sdds.compose.uikit.fixtures

import androidx.compose.runtime.Composable
import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import kotlin.reflect.KFunction

/**
 * Платформонезависимая тема для скриншотных тестов.
 */
interface RoborazziScreenshotTheme {

    /**
     * Применяет выбранную цветовую тему к [content].
     */
    @Composable
    fun content(
        darkTheme: Boolean,
        content: @Composable () -> Unit,
    )
}

/**
 * Общая конфигурация Roborazzi для скриншотных тестов Android, JVM и iOS.
 *
 * [theme] сохраняет совместимость с параметризованными Android-тестами.
 * KMP-тесты вместо него передают [screenshotTheme].
 */
@Suppress("UnnecessaryAbstractClass")
expect abstract class RoborazziConfigCompose(
    theme: String? = null,
    screenshotTheme: RoborazziScreenshotTheme? = null,
)

/**
 * Запускает скриншотный кейс через реализацию текущей платформы.
 */
fun RoborazziConfigCompose.content(
    testMethod: KFunction<*>,
    captureRoot: ScreenshotCaptureRoot = ScreenshotCaptureRoot.Primary,
    actions: SemanticsNodeInteractionsProvider.() -> Unit = {},
    content: @Composable () -> Unit,
) {
    runPlatformScreenshotTest(
        testName = testMethod.name,
        captureRoot = captureRoot,
        actions = actions,
        content = content,
    )
}

/**
 * Запускает тест и делает снимок через платформенный тестовый API.
 */
expect fun RoborazziConfigCompose.runPlatformScreenshotTest(
    testName: String,
    captureRoot: ScreenshotCaptureRoot,
    actions: SemanticsNodeInteractionsProvider.() -> Unit,
    content: @Composable () -> Unit,
)

/**
 * Определяет корневой узел Compose semantics для снимка.
 */
enum class ScreenshotCaptureRoot {
    /** Снимает основной корневой узел контента. */
    Primary,

    /** Снимает последний корневой узел, обычно окно overlay-компонента. */
    Last,
}
