import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.RoborazziConfig
import com.sdds.testing.SDK_NUMBER
import com.sdds.testing.vs.radiobox.radioBoxM
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemRadioBoxTest(
    theme: String
) : RoborazziConfig(theme) {

    @Test
    fun testRadioBoxM() {
        radioBoxM()
    }
}