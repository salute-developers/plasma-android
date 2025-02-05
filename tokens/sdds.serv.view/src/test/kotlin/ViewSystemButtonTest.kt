import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.RoborazziConfig
import com.sdds.testing.SDK_NUMBER
import com.sdds.testing.vs.button.basicButtonDisabled
import com.sdds.testing.vs.button.basicButtonIsLoading
import com.sdds.testing.vs.button.basicButtonLDefault
import com.sdds.testing.vs.button.basicButtonLStretching
import com.sdds.testing.vs.button.basicButtonLongText
import com.sdds.testing.vs.button.basicButtonMAccent
import com.sdds.testing.vs.button.basicButtonMClearSpaceBetween
import com.sdds.testing.vs.button.basicButtonSWarning
import com.sdds.testing.vs.button.basicButtonXSDark
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode


@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemButtonTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testBasicButtonLDefault() {
        basicButtonLDefault()
    }

    @Test
    fun testBasicButtonMAccent() {
        basicButtonMAccent()
    }

    @Test
    fun testBasicButtonSWarning() {
        basicButtonSWarning()
    }

    @Test
    fun testBasicButtonXSDark() {
        basicButtonXSDark()
    }

    @Test
    fun testBasicButtonIsLoading() {
        basicButtonIsLoading()
    }

    @Test
    fun testBasicButtonDisabled() {
        basicButtonDisabled()
    }

    @Test
    fun testBasicButtonLStretching() {
        basicButtonLStretching()
    }

    @Test
    fun testBasicButtonMClearSpaceBetween() {
        basicButtonMClearSpaceBetween()
    }

    @Test
    fun testBasicButtonLongText() {
        basicButtonLongText()
    }
}
