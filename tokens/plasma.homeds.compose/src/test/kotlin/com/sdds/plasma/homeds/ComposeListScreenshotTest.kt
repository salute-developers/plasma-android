package com.sdds.plasma.homeds

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.list.HasBackground
import com.sdds.plasma.homeds.styles.list.HasItemBackground
import com.sdds.plasma.homeds.styles.list.List
import com.sdds.plasma.homeds.styles.list.NoBackground
import com.sdds.plasma.homeds.styles.list.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.list.ListAmountThreeHasDisclosure
import com.sdds.testing.compose.list.ListAmountThreeNoDisclosure
import com.sdds.testing.compose.list.ListAmountTwenty
import com.sdds.testing.vs.SDK_NUMBER
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
    fun testListSAmountThreeHasDisclosure() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(List.S.style())
        }
    }

    @Test
    fun testListSAmountThreeNoDisclosure() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(List.S.style())
        }
    }

    @Test
    fun testListSAmountTwenty() {
        composeTestRule.content {
            ListAmountTwenty(List.S.style())
        }
    }

    @Test
    fun testListSNoBackground() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(List.S.NoBackground.style())
        }
    }

    @Test
    fun testListSNoBackgroundHasItemBackground() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(List.S.NoBackground.HasItemBackground.style())
        }
    }

    @Test
    fun testListSHasBackground() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(List.S.HasBackground.style())
        }
    }
}
