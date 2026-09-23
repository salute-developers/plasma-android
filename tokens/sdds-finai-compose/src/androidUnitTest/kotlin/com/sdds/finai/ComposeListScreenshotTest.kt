package com.sdds.finai

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ListAmountThreeHasDisclosure
import com.sdds.compose.uikit.fixtures.testcases.ListAmountThreeNoDisclosure
import com.sdds.compose.uikit.fixtures.testcases.ListAmountTwenty
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.list.L
import com.sdds.finai.styles.list.ListNormal
import com.sdds.finai.styles.list.ListTight
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.list.S
import com.sdds.finai.styles.list.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeListScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testListNormalLAmountThreeHasDisclosure() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(ListNormal.L.style())
        }
    }

    @Test
    fun testListNormalLAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(ListNormal.L.style())
        }
    }

    @Test
    fun testListNormalMAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(ListNormal.M.style())
        }
    }

    @Test
    fun testListNormalSAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(ListNormal.S.style())
        }
    }

    @Test
    fun testListNormalXsAmountTwenty() {
        composeTestRule.content {
            ListAmountTwenty(ListNormal.Xs.style())
        }
    }

    @Test
    fun testListTightXsAmountThreeHasDisclosure() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(ListTight.Xs.style())
        }
    }
}
