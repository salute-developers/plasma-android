package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.AiUserMsgFileGroupUploadingContent
import com.sdds.compose.uikit.fixtures.testcases.AiUserMsgFileHasActionsEditableActions
import com.sdds.compose.uikit.fixtures.testcases.AiUserMsgHasActionsEditableUploadingContent
import com.sdds.compose.uikit.fixtures.testcases.AiUserMsgHasActionsUploadingContent
import com.sdds.compose.uikit.fixtures.testcases.AiUserMsgImageHasActionsEditableActionsUploadingContent
import com.sdds.compose.uikit.fixtures.testcases.AiUserMsgInEdit
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.aiusermessage.Accent
import com.sdds.serv.styles.aiusermessage.AiUserMessage
import com.sdds.serv.styles.aiusermessage.ContentTypeFile
import com.sdds.serv.styles.aiusermessage.ContentViewSecondary
import com.sdds.serv.styles.aiusermessage.Default
import com.sdds.serv.styles.aiusermessage.L
import com.sdds.serv.styles.aiusermessage.M
import com.sdds.serv.styles.aiusermessage.Negative
import com.sdds.serv.styles.aiusermessage.Positive
import com.sdds.serv.styles.aiusermessage.S
import com.sdds.serv.styles.aiusermessage.Secondary
import com.sdds.serv.styles.aiusermessage.Warning
import com.sdds.serv.styles.aiusermessage.Xl
import com.sdds.serv.styles.aiusermessage.Xs
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeAiUserMessageScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testAiUserMsgDefaultImageHasActionsEditableActionsUploadingContent() {
        composeTestRule.content {
            AiUserMsgImageHasActionsEditableActionsUploadingContent(
                AiUserMessage.Xl.Default.style(),
            )
        }
    }

    @Test
    fun testAiUserMsgSecondaryFileGroupUploadingContent() {
        composeTestRule.content {
            AiUserMsgFileGroupUploadingContent(
                AiUserMessage.L.ContentTypeFile.ContentViewSecondary.Secondary.style(),
            )
        }
    }

    @Test
    fun testAiUserMsgAccentFileHasActionsEditableActions() {
        composeTestRule.content {
            AiUserMsgFileHasActionsEditableActions(AiUserMessage.M.Accent.style())
        }
    }

    @Test
    fun testAiUserMsgPositiveHasActionsUploadingContent() {
        composeTestRule.content {
            AiUserMsgHasActionsEditableUploadingContent(AiUserMessage.S.ContentTypeFile.Positive.style())
        }
    }

    @Test
    fun testAiUserMsgNegativeHasActionsUploadingContent() {
        composeTestRule.content {
            AiUserMsgHasActionsUploadingContent(AiUserMessage.Xs.ContentTypeFile.Negative.style())
        }
    }

    @Test
    fun testAiUserMsgImageHasActionsEditableActionsUploadingContent() {
        composeTestRule.content {
            AiUserMsgImageHasActionsEditableActionsUploadingContent(AiUserMessage.Xl.Warning.style())
        }
    }

    @Test
    fun testAiUserMsgInEdit() {
        composeTestRule.content {
            AiUserMsgInEdit(AiUserMessage.Xl.ContentTypeFile.Default.style())
        }
    }
}
