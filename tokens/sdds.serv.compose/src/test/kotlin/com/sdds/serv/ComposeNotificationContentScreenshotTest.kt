package com.sdds.serv

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.notificationcontent.ButtonStretch
import com.sdds.serv.styles.notificationcontent.Default
import com.sdds.serv.styles.notificationcontent.IconStart
import com.sdds.serv.styles.notificationcontent.IconTop
import com.sdds.serv.styles.notificationcontent.Info
import com.sdds.serv.styles.notificationcontent.Negative
import com.sdds.serv.styles.notificationcontent.NoButtonStretch
import com.sdds.serv.styles.notificationcontent.NotificationContent
import com.sdds.serv.styles.notificationcontent.Positive
import com.sdds.serv.styles.notificationcontent.Warning
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.notificationcontent.NotificationContentHasAction
import com.sdds.testing.compose.notificationcontent.NotificationContentLongText
import com.sdds.testing.compose.notificationcontent.NotificationContentNoText
import com.sdds.testing.compose.notificationcontent.NotificationContentNoTitle
import com.sdds.testing.compose.notificationcontent.NotificationContentNoTitleNoText
import com.sdds.testing.vs.SDK_NUMBER
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ComposeNotificationContentScreenshotTest(
    theme: String,
) : RoborazziConfigCompose(theme) {

    @Test
    fun testNotificationContentNoIconDefault() {
        composeTestRule.content {
            NotificationContentHasAction(style = NotificationContent.ButtonStretch.Default.style())
        }
    }

    @Test
    fun testNotificationContentIconTopPositiveNoTitle() {
        composeTestRule.content {
            NotificationContentNoTitle(style = NotificationContent.ButtonStretch.IconTop.Positive.style())
        }
    }

    @Test
    fun testNotificationContentIconStartNegative() {
        composeTestRule.content {
            NotificationContentNoText(style = NotificationContent.ButtonStretch.IconStart.Negative.style())
        }
    }

    @Test
    fun testNotificationContentIconTopWarning() {
        composeTestRule.content {
            NotificationContentNoTitleNoText(style = NotificationContent.ButtonStretch.IconTop.Warning.style())
        }
    }

    @Test
    fun testNotificationContentIconStartInfo() {
        composeTestRule.content {
            NotificationContentLongText(style = NotificationContent.ButtonStretch.IconStart.Info.style())
        }
    }

    @Test
    fun testNotificationContentLooseIconStartDefault() {
        composeTestRule.content {
            NotificationContentHasAction(style = NotificationContent.NoButtonStretch.IconStart.Default.style())
        }
    }
}
