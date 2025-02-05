import androidx.core.content.ContextCompat
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.icons.R
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.basicButton
import com.sdds.testing.vs.component
import com.sdds.uikit.Button
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode


@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class BasicButtonTest(
    theme: String,
) : RoborazziConfig(theme) {

    @Test
    fun testBasicButtonLDefault() {
        component(com.sdds.serv.R.style.Serv_Sdds_MaterialComponents_DayNight) { context ->
            basicButton(
                context = context,
                buttonStyle = com.sdds.serv.R.style.Serv_Sdds_ComponentOverlays_BasicButtonLDefault,
                label = "Label",
                value = "",
                isLoading = false,
                isEnabled = true,
                icon = ContextCompat.getDrawable(context, R.drawable.ic_plasma_24),
                iconPosition = Button.IconPosition.TextStart,
                buttonId = 1,
            )
        }
    }
}
