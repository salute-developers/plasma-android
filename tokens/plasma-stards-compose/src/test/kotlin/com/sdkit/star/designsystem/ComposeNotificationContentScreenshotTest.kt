package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.testing.compose.RoborazziConfigCompose
import com.sdds.testing.compose.notificationcontent.NotificationContentHasAction
import com.sdds.testing.compose.notificationcontent.NotificationContentLongText
import com.sdds.testing.compose.notificationcontent.NotificationContentNoText
import com.sdds.testing.compose.notificationcontent.NotificationContentNoTitle
import com.sdds.testing.compose.notificationcontent.NotificationContentNoTitleNoText
import com.sdds.testing.vs.SDK_NUMBER
import com.sdkit.star.designsystem.styles.notificationcontent.Default
import com.sdkit.star.designsystem.styles.notificationcontent.IconStart
import com.sdkit.star.designsystem.styles.notificationcontent.IconTop
import com.sdkit.star.designsystem.styles.notificationcontent.Info
import com.sdkit.star.designsystem.styles.notificationcontent.Negative
import com.sdkit.star.designsystem.styles.notificationcontent.NoIcon
import com.sdkit.star.designsystem.styles.notificationcontent.NotificationContentCompact
import com.sdkit.star.designsystem.styles.notificationcontent.NotificationContentLoose
import com.sdkit.star.designsystem.styles.notificationcontent.Positive
import com.sdkit.star.designsystem.styles.notificationcontent.Warning
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ComposeNotificationContentScreenshotTest : RoborazziConfigCompose("+night") {

    @Test
    fun testNotificationContentNoIconDefault() {
        composeTestRule.content {
            NotificationContentHasAction(style = NotificationContentCompact.NoIcon.Default.style())
        }
    }

    @Test
    fun testNotificationContentIconTopPositiveNoTitle() {
        composeTestRule.content {
            NotificationContentNoTitle(style = NotificationContentCompact.IconTop.Positive.style())
        }
    }

    @Test
    fun testNotificationContentIconStartNegative() {
        composeTestRule.content {
            NotificationContentNoText(style = NotificationContentCompact.IconStart.Negative.style())
        }
    }

    @Test
    fun testNotificationContentIconTopWarning() {
        composeTestRule.content {
            NotificationContentNoTitleNoText(style = NotificationContentCompact.IconTop.Warning.style())
        }
    }

    @Test
    fun testNotificationContentIconStartInfo() {
        composeTestRule.content {
            NotificationContentLongText(style = NotificationContentCompact.IconStart.Info.style())
        }
    }

    @Test
    fun testNotificationContentLooseIconStartDefault() {
        composeTestRule.content {
            NotificationContentHasAction(style = NotificationContentLoose.IconStart.Default.style())
        }
    }
}
