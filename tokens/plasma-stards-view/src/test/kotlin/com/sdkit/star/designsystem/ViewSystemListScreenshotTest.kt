package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.list.ListTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemListScreenshotTest : ListTestCases("+night") {

    @Test
    override fun testListNormalL() {
        themedComponent {
            listNormalL(R.style.Sdkit_StarDs_ComponentOverlays_ListL)
        }
    }

    @Test
    override fun testListNormalM() {
        themedComponent {
            listNormalM(R.style.Sdkit_StarDs_ComponentOverlays_ListM)
        }
    }

    @Test
    override fun testListNormalS() {
        themedComponent {
            listNormalS(R.style.Sdkit_StarDs_ComponentOverlays_ListS)
        }
    }

    @Test
    override fun testListNormalXs() {
        themedComponent {
            listNormalXs(R.style.Sdkit_StarDs_ComponentOverlays_ListXs)
        }
    }

    override fun testListNormalXlHasDisclosure() {
        TODO("Not yet implemented")
    }

    override fun testListTightXsHasDisclosure() {
        TODO("Not yet implemented")
    }
}
