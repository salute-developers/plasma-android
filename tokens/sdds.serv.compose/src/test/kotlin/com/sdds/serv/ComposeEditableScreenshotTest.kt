package com.sdds.serv

import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performTextClearance
import androidx.compose.ui.test.performTextInput
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.editable.BodyL
import com.sdds.serv.styles.editable.BodyM
import com.sdds.serv.styles.editable.BodyS
import com.sdds.serv.styles.editable.BodyXs
import com.sdds.serv.styles.editable.BodyXxs
import com.sdds.serv.styles.editable.Editable
import com.sdds.serv.styles.editable.H1
import com.sdds.serv.styles.editable.H2
import com.sdds.serv.styles.editable.H4
import com.sdds.serv.styles.editable.H5
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.editable.EditableDisabled
import com.sdds.testing.compose.editable.EditableMultipleLinesIconPlacementAbsoluteTextAlignEnd
import com.sdds.testing.compose.editable.EditableReadOnly
import com.sdds.testing.compose.editable.EditableRelativeTextAlignCenter
import com.sdds.testing.compose.editable.EditableSingleLineRelativeStart
import com.sdds.testing.compose.editable.EditableTextAlignCenter
import com.sdds.testing.compose.editable.EditableTextAlignCenterRelative
import com.sdds.testing.vs.SDK_NUMBER
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
            EditableMultipleLinesIconPlacementAbsoluteTextAlignEnd(Editable.H2.style())
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
