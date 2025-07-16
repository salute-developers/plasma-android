package com.sdds.plasma.giga.app

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.giga.app.styles.buttongroup.Default
import com.sdds.plasma.giga.app.styles.buttongroup.Dense
import com.sdds.plasma.giga.app.styles.buttongroup.IconButtonGroup
import com.sdds.plasma.giga.app.styles.buttongroup.L
import com.sdds.plasma.giga.app.styles.buttongroup.M
import com.sdds.plasma.giga.app.styles.buttongroup.NoGap
import com.sdds.plasma.giga.app.styles.buttongroup.Pilled
import com.sdds.plasma.giga.app.styles.buttongroup.S
import com.sdds.plasma.giga.app.styles.buttongroup.Segmented
import com.sdds.plasma.giga.app.styles.buttongroup.Wide
import com.sdds.plasma.giga.app.styles.buttongroup.Xs
import com.sdds.plasma.giga.app.styles.buttongroup.Xxs
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.buttongroup.ButtonGroupHorizontal
import com.sdds.testing.compose.buttongroup.ButtonGroupHorizontalMaxAmount
import com.sdds.testing.compose.buttongroup.ButtonGroupVertical
import com.sdds.testing.compose.buttongroup.IconButtonGroupHorizontal
import com.sdds.testing.compose.buttongroup.IconButtonGroupHorizontalMaxAmount
import com.sdds.testing.compose.buttongroup.IconButtonGroupVertical
import com.sdds.testing.vs.SDK_NUMBER
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
