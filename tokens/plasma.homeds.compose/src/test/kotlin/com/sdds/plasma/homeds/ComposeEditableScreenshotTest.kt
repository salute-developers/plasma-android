package com.sdds.plasma.homeds

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.EditableDisabled
import com.sdds.compose.uikit.fixtures.testcases.EditableMultipleLinesIconPlacementAbsoluteTextAlignEnd
import com.sdds.compose.uikit.fixtures.testcases.EditableMultipleLinesStart
import com.sdds.compose.uikit.fixtures.testcases.EditableReadOnly
import com.sdds.compose.uikit.fixtures.testcases.EditableRelativeTextAlignCenter
import com.sdds.compose.uikit.fixtures.testcases.EditableSingleLineRelativeStart
import com.sdds.compose.uikit.fixtures.testcases.EditableTextAlignCenter
import com.sdds.compose.uikit.fixtures.testcases.EditableTextAlignCenterRelative
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.editable.BodyL
import com.sdds.plasma.homeds.styles.editable.BodyM
import com.sdds.plasma.homeds.styles.editable.BodyS
import com.sdds.plasma.homeds.styles.editable.BodyXs
import com.sdds.plasma.homeds.styles.editable.BodyXxs
import com.sdds.plasma.homeds.styles.editable.Editable
import com.sdds.plasma.homeds.styles.editable.H1
import com.sdds.plasma.homeds.styles.editable.H2
import com.sdds.plasma.homeds.styles.editable.H3
import com.sdds.plasma.homeds.styles.editable.H4
import com.sdds.plasma.homeds.styles.editable.H5
import com.sdds.plasma.homeds.styles.editable.H6
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeEditableScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testEditableH1() {
        composeTestRule.content {
            EditableSingleLineRelativeStart(Editable.H1.style())
        }
    }

    @Test
    fun testEditableH2Disabled() {
        composeTestRule.content {
            EditableDisabled(Editable.H2.style())
        }
    }

    @Test
    fun testEditableH3LongText() {
        composeTestRule.content {
            EditableMultipleLinesIconPlacementAbsoluteTextAlignEnd(Editable.H3.style())
        }
        composeTestRule
            .onNodeWithTag("EditableField")
            .performTextClearance()
        composeTestRule.onNodeWithTag("EditableField")
            .performTextInput(longText)
        composeTestRule.waitForIdle()
    }

    @Test
    fun testEditableH4() {
        composeTestRule.content {
            EditableSingleLineRelativeStart(Editable.H4.style())
        }
    }

    @Test
    fun testEditableH5() {
        composeTestRule.content {
            EditableTextAlignCenter(Editable.H5.style())
        }
        composeTestRule
            .onNodeWithTag("EditableField")
            .performTextClearance()
        composeTestRule.onNodeWithTag("EditableField")
            .performTextInput(longText)
        composeTestRule.waitForIdle()
    }

    @Test
    fun testEditableH6() {
        composeTestRule.content {
            EditableMultipleLinesStart(Editable.H6.style())
        }
        composeTestRule
            .onNodeWithTag("EditableField")
            .performTextClearance()
        composeTestRule.onNodeWithTag("EditableField")
            .performTextInput(longText)
        composeTestRule.waitForIdle()
    }

    @Test
    fun testEditableBodyL() {
        composeTestRule.content {
            EditableSingleLineRelativeStart(Editable.BodyL.style())
        }
    }

    @Test
    fun testEditableBodyM() {
        composeTestRule.content {
            EditableRelativeTextAlignCenter(Editable.BodyM.style())
        }
        composeTestRule
            .onNodeWithTag("EditableField")
            .performTextClearance()
        composeTestRule.waitForIdle()
        composeTestRule
            .onNodeWithTag("EditableField")
            .performTextInput("!@#$%^&*()")
        composeTestRule.waitForIdle()
    }

    @Test
    fun testEditableBodySReadOnly() {
        composeTestRule.content {
            EditableReadOnly(Editable.BodyS.style())
        }
    }

    @Test
    fun testEditableBodyXs() {
        composeTestRule.content {
            EditableTextAlignCenterRelative(Editable.BodyXs.style())
        }
        composeTestRule
            .onNodeWithTag("EditableField")
            .performTextClearance()
        composeTestRule.onNodeWithTag("EditableField")
            .performTextInput(longText)
        composeTestRule.waitForIdle()
    }

    @Test
    fun testEditableBodyXxs() {
        composeTestRule.content {
            EditableSingleLineRelativeStart(Editable.BodyXxs.style())
        }
    }

    private val longText =
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
            "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
            "when an unknown printer took a galley of type and scrambled it to make a type " +
            "specimen book."
}
