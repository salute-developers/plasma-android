import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.sdds.playground.sandbox.SandboxTheme
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewCheckedSizeSmall
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewOffSizeSmall
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewOnSizeMediumNoDesc
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewOnSizeMediumNoLabel
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewSizeMediumNoLabelAndDesc
import com.sdds.playground.sandbox.checkbox.SandboxCheckBoxPreviewUncheckedSizeMedium
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
@RunWith(RobolectricTestRunner::class)
class ComposeCheckBoxScreenshotTest {

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
    fun testCheckBoxUncheckedSizeMedium() {
        captureRoboImage {
            config.roborazziOptions
            SandboxCheckBoxPreviewUncheckedSizeMedium()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testCheckBoxCheckedSizeSmallDark() {
        captureRoboImage {
            config.roborazziOptions
            SandboxTheme(darkTheme = true) {
                SandboxCheckBoxPreviewCheckedSizeSmall()
            }
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testCheckBoxOffSizeSmall() {
        captureRoboImage {
            config.roborazziOptions
            SandboxCheckBoxPreviewOffSizeSmall()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testCheckBoxOnSizeMediumNoDesc() {
        captureRoboImage {
            config.roborazziOptions
            SandboxCheckBoxPreviewOnSizeMediumNoDesc()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testCheckBoxOnSizeMediumNoLabel() {
        captureRoboImage {
            config.roborazziOptions
            SandboxCheckBoxPreviewOnSizeMediumNoLabel()
        }
    }

    @Category(ScreenshotTests::class)
    @Test
    fun testCheckBoxSizeMediumNoLabelAndDesc() {
        captureRoboImage {
            config.roborazziOptions
            SandboxCheckBoxPreviewSizeMediumNoLabelAndDesc()
        }
    }
}
