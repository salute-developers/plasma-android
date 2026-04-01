package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxDisabled
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxGroupSizeM
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxGroupSizeMDescription
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxGroupSizeS
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxGroupSizeSLabel
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxSizeM
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxSizeMNoDescription
import com.sdds.compose.uikit.fixtures.testcases.RadioBoxSizeS
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radiobox.S
import com.sdkit.star.designsystem.styles.radioboxgroup.M
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroup
import com.sdkit.star.designsystem.styles.radioboxgroup.S
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeRadiBoxScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testRadioBoxSizeM() {
        composeTestRule.content {
            RadioBoxSizeM(style = RadioBox.M.style())
        }
    }

    @Test
    fun testRadioBoxSizeS() {
        composeTestRule.content {
            RadioBoxSizeS(style = RadioBox.S.style())
        }
    }

    @Test
    fun testRadioBoxSizeMNoDescription() {
        composeTestRule.content {
            RadioBoxSizeMNoDescription(style = RadioBox.M.style())
        }
    }

    @Test
    fun testRadioBoxDisabled() {
        composeTestRule.content {
            RadioBoxDisabled(style = RadioBox.M.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeM() {
        composeTestRule.content {
            RadioBoxGroupSizeM(style = RadioBoxGroup.M.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeS() {
        composeTestRule.content {
            RadioBoxGroupSizeS(style = RadioBoxGroup.S.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeMDescription() {
        composeTestRule.content {
            RadioBoxGroupSizeMDescription(style = RadioBoxGroup.M.style())
        }
    }

    @Test
    fun testRadioBoxGroupSizeSLabel() {
        composeTestRule.content {
            RadioBoxGroupSizeSLabel(style = RadioBoxGroup.S.style())
        }
    }
}
