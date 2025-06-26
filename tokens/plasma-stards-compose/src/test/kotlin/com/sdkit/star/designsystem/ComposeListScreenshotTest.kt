package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.list.ListAmountThreeNoDisclosure
import com.sdds.testing.compose.list.ListAmountTwenty
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.List
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeListScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testListNormalLAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(List.L.style())
        }
    }

    @Test
    fun testListNormalMAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(List.M.style())
        }
    }

    @Test
    fun testListNormalSAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(List.S.style())
        }
    }

    @Test
    fun testListNormalXsAmountTwenty() {
        composeTestRule.content {
            ListAmountTwenty(List.Xs.style())
        }
    }
}
