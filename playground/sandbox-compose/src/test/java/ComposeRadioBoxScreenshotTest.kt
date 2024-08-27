import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewMedium
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewOff
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewSmallDark
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewUnchecked
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeRadioBoxScreenshotTest {

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
    fun testRadioBoxMedium() {
        captureRoboImage {
            config.roborazziOptions
            SandboxRadioBoxPreviewMedium()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testRadioBoxSmallDark() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTheme(darkTheme = true) {
                SandboxRadioBoxPreviewSmallDark()
            }
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testRadioBoxUnchecked() {
        captureRoboImage {
            config.roborazziOptions
            SandboxRadioBoxPreviewUnchecked()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testRadioBoxOff() {
        captureRoboImage {
            config.roborazziOptions
            SandboxRadioBoxPreviewOff()
        }
    }
}
