import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.RoborazziConfig
import com.sdds.testing.SDK_NUMBER
import com.sdds.testing.vs.chip.chipDisabled
import com.sdds.testing.vs.chip.chipLDefault
import com.sdds.testing.vs.chip.chipMPilledSecondary
import com.sdds.testing.vs.chip.chipSAccent
import com.sdds.testing.vs.chip.chipXs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemChipTest(
    theme: String
) : RoborazziConfig(theme) {

    @Test
    fun testChipLDefault() {
        chipLDefault()
    }

    @Test
    fun testChipMPilledSecondary() {
        chipMPilledSecondary()
    }

    @Test
    fun testChipSAccent() {
        chipSAccent()
    }

    @Test
    fun testChipXsIcon() {
        chipXs()
    }

    @Test
    fun testChipDisabled() {
        chipDisabled()
    }
}
