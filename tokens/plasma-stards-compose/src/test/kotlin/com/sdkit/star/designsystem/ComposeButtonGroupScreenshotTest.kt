package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupHorizontal
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupHorizontalMaxAmount
import com.sdds.compose.uikit.fixtures.testcases.ButtonGroupVertical
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.buttongroup.BasicButtonGroup
import com.sdkit.star.designsystem.styles.buttongroup.Default
import com.sdkit.star.designsystem.styles.buttongroup.Dense
import com.sdkit.star.designsystem.styles.buttongroup.L
import com.sdkit.star.designsystem.styles.buttongroup.M
import com.sdkit.star.designsystem.styles.buttongroup.NoGap
import com.sdkit.star.designsystem.styles.buttongroup.S
import com.sdkit.star.designsystem.styles.buttongroup.Segmented
import com.sdkit.star.designsystem.styles.buttongroup.Wide
import com.sdkit.star.designsystem.styles.buttongroup.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeButtonGroupScreenshotTest : RoborazziConfigCompose("+night") {

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
    fun testButtonGroupXsNoGapSegmentedMaxAmount() {
        composeTestRule.content {
            ButtonGroupHorizontalMaxAmount(style = BasicButtonGroup.Xs.NoGap.Segmented.style())
        }
    }

    @Test
    fun testButtonGroupXsVerticalNoGapDefault() {
        composeTestRule.content {
            ButtonGroupVertical(style = BasicButtonGroup.Xs.NoGap.Default.style())
        }
    }
}
