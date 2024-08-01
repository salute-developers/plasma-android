import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewMedium
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewOff
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewSmallDark
import com.sdds.playground.sandbox.radiobox.SandboxRadioBoxPreviewUnchecked
import org.junit.Before
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode
import java.util.TimeZone

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeRadioBoxScreenshotTest {

    private val config = RoborazziConfig()

    /**
     * Для запуска только скриншот тестов
     */
    interface ScreenshotTests

    @Before
    fun setTimeZone() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
    }

    /**
     * Запуск скриншот тестов с использованием Preview
     */
    @Category(ScreenshotTests::class)
    @Test
    fun testComposeRadioBoxMedium() {
        captureRoboImage {
            config.roborazziOptions
            SandboxRadioBoxPreviewMedium()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testComposeRadioBoxSmallDark() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTheme(darkTheme = true) {
                SandboxRadioBoxPreviewSmallDark()
            }
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testComposeRadioBoxUnchecked() {
        captureRoboImage {
            config.roborazziOptions
            SandboxRadioBoxPreviewUnchecked()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testComposeRadioBoxOff() {
        captureRoboImage {
            config.roborazziOptions
            SandboxRadioBoxPreviewOff()
        }
    }
}
