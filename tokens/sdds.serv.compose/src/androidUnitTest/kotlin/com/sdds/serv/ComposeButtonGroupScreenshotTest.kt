package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupHorizontal
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupHorizontalMaxAmount
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupVertical
import com.sdds.compose.uikit.fixtures.testcases.IconButtonGroupHorizontal
import com.sdds.compose.uikit.fixtures.testcases.IconButtonGroupHorizontalMaxAmount
import com.sdds.compose.uikit.fixtures.testcases.IconButtonGroupVertical
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.IconButtonGroup
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.Pilled
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Segmented
import com.sdds.serv.styles.buttongroup.Wide
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.Xxs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeButtonGroupScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testButtonGroupLNoGapDefault() {
        composeTestRule.content {
            ButtonGroupHorizontal(style = BasicButtonGroup.L.NoGap.Default.style())
        }
    }

    @Test
    fun testButtonGroupMDenseDefault() {
        composeTestRule.content {
            ButtonGroupHorizontal(style = BasicButtonGroup.M.Dense.Default.style())
        }
    }

    @Test
    fun testButtonGroupSWideSegmented() {
        composeTestRule.content {
            ButtonGroupHorizontal(style = BasicButtonGroup.S.Wide.Segmented.style())
        }
    }

    @Test
    fun testButtonGroupXsVerticalNoGapDefault() {
        composeTestRule.content {
            ButtonGroupVertical(style = BasicButtonGroup.Xs.NoGap.Default.style())
        }
    }

    @Test
    fun testButtonGroupXxsNoGapSegmentedMaxAmount() {
        composeTestRule.content {
            ButtonGroupHorizontalMaxAmount(style = BasicButtonGroup.Xxs.NoGap.Segmented.style())
        }
    }

    @Test
    fun testIconButtonGroupLNoGapDefault() {
        composeTestRule.content {
            IconButtonGroupHorizontal(style = IconButtonGroup.L.NoGap.Default.style())
        }
    }

    @Test
    fun testIconButtonGroupMDensePilled() {
        composeTestRule.content {
            IconButtonGroupHorizontal(style = IconButtonGroup.M.Dense.Pilled.style())
        }
    }

    @Test
    fun testIconButtonGroupSWideSegmented() {
        composeTestRule.content {
            IconButtonGroupHorizontal(style = IconButtonGroup.S.Wide.Segmented.style())
        }
    }

    @Test
    fun testIconButtonGroupXsNoGapDefaultVertical() {
        composeTestRule.content {
            IconButtonGroupVertical(style = IconButtonGroup.Xs.NoGap.Default.style())
        }
    }

    @Test
    fun testIconButtonGroupLNoGapSegmentedMaxAmount() {
        composeTestRule.content {
            IconButtonGroupHorizontalMaxAmount(style = IconButtonGroup.L.NoGap.Segmented.style())
        }
    }
}
