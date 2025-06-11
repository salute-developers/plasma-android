package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.list.ListTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemListViewScreenshotTest(
    theme: String,
) : ListTestCases(theme) {

    @Test
    override fun testListNormalXlHasDisclosure() {
        themedComponent {
            listNormalXlHasDisclosure(R.style.Salute_StylesSalute_ComponentOverlays_ListNormalXl)
        }
    }

    @Test
    override fun testListNormalL() {
        themedComponent {
            listNormalL(R.style.Salute_StylesSalute_ComponentOverlays_ListNormalL)
        }
    }

    @Test
    override fun testListNormalM() {
        themedComponent {
            listNormalM(R.style.Salute_StylesSalute_ComponentOverlays_ListNormalM)
        }
    }

    @Test
    override fun testListNormalS() {
        themedComponent {
            listNormalS(R.style.Salute_StylesSalute_ComponentOverlays_ListNormalS)
        }
    }

    @Test
    override fun testListNormalXs() {
        themedComponent {
            listNormalXs(R.style.Salute_StylesSalute_ComponentOverlays_ListNormalXs)
        }
    }

    @Test
    override fun testListTightXsHasDisclosure() {
        themedComponent {
            listTightXsHasDisclosure(R.style.Salute_StylesSalute_ComponentOverlays_ListTightXs)
        }
    }
}
