package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.plasma.sd.service.styles.checkbox.M
import com.sdds.plasma.sd.service.styles.checkbox.S
import com.sdds.plasma.sd.service.styles.checkbox.group.M
import com.sdds.plasma.sd.service.styles.checkbox.group.S
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.checkbox.CheckBoxGroupSizeM
import com.sdds.testing.compose.checkbox.CheckBoxGroupSizeMDisabled
import com.sdds.testing.compose.checkbox.CheckBoxGroupSizeS
import com.sdds.testing.compose.checkbox.CheckBoxSizeM
import com.sdds.testing.compose.checkbox.CheckBoxSizeMIndeterminate
import com.sdds.testing.compose.checkbox.CheckBoxSizeMediumNoLabelAndDesc
import com.sdds.testing.compose.checkbox.CheckBoxSizeSDisabled
import com.sdds.testing.compose.checkbox.CheckBoxSizeSUnchecked
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeCheckBoxScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    /**
     * Запуск скриншот тестов
     */
    @Test
    fun testCheckBoxSizeM() {
        composeTestRule.content {
            CheckBoxSizeM(style = CheckBox.M.style())
        }
    }

    @Test
    fun testCheckBoxSizeSUnchecked() {
        composeTestRule.content {
            CheckBoxSizeSUnchecked(style = CheckBox.S.style())
        }
    }

    @Test
    fun testCheckBoxSizeSDisabled() {
        composeTestRule.content {
            CheckBoxSizeSDisabled(style = CheckBox.S.style())
        }
    }

    @Test
    fun testCheckBoxSizeMIndeterminate() {
        composeTestRule.content {
            CheckBoxSizeMIndeterminate(style = CheckBox.M.style())
        }
    }

    @Test
    fun testCheckBoxSizeMediumNoLabelAndDesc() {
        composeTestRule.content {
            CheckBoxSizeMediumNoLabelAndDesc(style = CheckBox.M.style())
        }
    }

    @Test
    fun testCheckBoxGroupSizeM() {
        composeTestRule.content {
            CheckBoxGroupSizeM(style = CheckBoxGroup.M.style())
        }
    }

    @Test
    fun testCheckBoxGroupSizeS() {
        composeTestRule.content {
            CheckBoxGroupSizeS(style = CheckBoxGroup.S.style())
        }
    }

    @Test
    fun testCheckBoxGroupSizeMDisabled() {
        composeTestRule.content {
            CheckBoxGroupSizeMDisabled(style = CheckBoxGroup.M.style())
        }
    }
}
