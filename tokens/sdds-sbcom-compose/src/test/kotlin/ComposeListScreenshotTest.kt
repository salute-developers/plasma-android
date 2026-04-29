package com.sdds.sbcom

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ListAmountThreeHasDisclosure
import com.sdds.compose.uikit.fixtures.testcases.ListAmountThreeNoDisclosure
import com.sdds.compose.uikit.fixtures.testcases.ListAmountTwenty
import com.sdds.compose.uikit.fixtures.testcases.ListCounterDisclosure
import com.sdds.compose.uikit.fixtures.testcases.ListIconDisclosure
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.list.Default
import com.sdds.sbcom.styles.list.DropdownMenuList
import com.sdds.sbcom.styles.list.List
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
    fun testListDefaultThreeHasDisclosure() {
        composeTestRule.content {
            ListAmountThreeHasDisclosure(List.Default.style())
        }
    }

    @Test
    fun testListDropdownMenuAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(DropdownMenuList.Default.style())
        }
    }

    @Test
    fun testListDefaultAmountThree() {
        composeTestRule.content {
            ListAmountThreeNoDisclosure(List.Default.style())
        }
    }

    @Test
    fun testListCounter() {
        composeTestRule.content {
            ListCounterDisclosure(List.Default.style())
        }
    }

    @Test
    fun testListAmountTwenty() {
        composeTestRule.content {
            ListAmountTwenty(List.Default.style())
        }
    }

    @Test
    fun testListAmountThreeHasDisclosure() {
        composeTestRule.content {
            ListIconDisclosure(List.Default.style())
        }
    }
}
