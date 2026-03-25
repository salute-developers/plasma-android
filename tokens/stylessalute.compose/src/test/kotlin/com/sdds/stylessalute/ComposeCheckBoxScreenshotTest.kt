package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxGroupSizeM
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxGroupSizeMDisabled
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxGroupSizeS
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeM
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeMIndeterminate
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeMediumNoLabelAndDesc
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeSDisabled
import com.sdds.compose.uikit.fixtures.testcases.CheckBoxSizeSUnchecked
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.checkbox.CheckBox
import com.sdds.stylessalute.styles.checkbox.Default
import com.sdds.stylessalute.styles.checkbox.M
import com.sdds.stylessalute.styles.checkbox.S
import com.sdds.stylessalute.styles.checkboxgroup.CheckBoxGroup
import com.sdds.stylessalute.styles.checkboxgroup.M
import com.sdds.stylessalute.styles.checkboxgroup.S
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
            CheckBoxSizeM(style = CheckBox.M.Default.style())
        }
    }

    @Test
    fun testCheckBoxSizeSUnchecked() {
        composeTestRule.content {
            CheckBoxSizeSUnchecked(style = CheckBox.S.Default.style())
        }
    }

    @Test
    fun testCheckBoxSizeSDisabled() {
        composeTestRule.content {
            CheckBoxSizeSDisabled(style = CheckBox.S.Default.style())
        }
    }

    @Test
    fun testCheckBoxSizeMIndeterminate() {
        composeTestRule.content {
            CheckBoxSizeMIndeterminate(style = CheckBox.M.Default.style())
        }
    }

    @Test
    fun testCheckBoxSizeMediumNoLabelAndDesc() {
        composeTestRule.content {
            CheckBoxSizeMediumNoLabelAndDesc(style = CheckBox.M.Default.style())
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
