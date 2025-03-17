package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.flow.FlowTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemFlowScreenshotTest(
    theme: String,
) : FlowTestCases(theme) {

    @Test
    override fun testFlowStartHorizontal() {
        themedComponent {
            flowStartHorizontal()
        }
    }

    @Test
    override fun testFlowCenterVertical() {
        themedComponent {
            flowCenterVertical()
        }
    }

    @Test
    override fun testFlowEndHorizontal() {
        themedComponent {
            flowEndHorizontal()
        }
    }

    @Test
    override fun testFlowSpaceBetweenStartHorizontal() {
        themedComponent {
            flowSpaceBetweenStartHorizontal()
        }
    }

    @Test
    override fun testFlowSpaceAroundStartHorizontal() {
        themedComponent {
            flowSpaceAroundStartHorizontal()
        }
    }

    @Test
    override fun testFlowItemsPerLineOne() {
        themedComponent {
            flowItemsPerLineOne()
        }
    }
}
