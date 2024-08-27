import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.switch.SandboxSwitchPreviewOff
import com.sdds.playground.sandbox.switch.SandboxSwitchPreviewOn
import com.sdds.playground.sandbox.switch.SandboxSwitchPreviewOnDisabled
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeSwitchScreenshotTest {

    private val config = RoborazziConfig()

    /**
     * Для запуска только скриншот тестов
     */
    interface ScreenshotTests

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Category(ScreenshotTests::class)
    @Test
    internal fun testSwitchPreviewOn() {
        captureRoboImage {
            config.roborazziOptions
            SandboxSwitchPreviewOn()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    internal fun testSwitchPreviewOff() {
        captureRoboImage {
            config.roborazziOptions
            SandboxSwitchPreviewOff()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    internal fun testSwitchPreviewOnDisabled() {
        captureRoboImage {
            config.roborazziOptions
            SandboxSwitchPreviewOnDisabled()
        }
    }
}
