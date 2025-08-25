package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.style.style
import com.sdds.stylessalute.styles.notificationcontent.Default
import com.sdds.stylessalute.styles.notificationcontent.IconStart
import com.sdds.stylessalute.styles.notificationcontent.IconTop
import com.sdds.stylessalute.styles.notificationcontent.Info
import com.sdds.stylessalute.styles.notificationcontent.Negative
import com.sdds.stylessalute.styles.notificationcontent.NoIcon
import com.sdds.stylessalute.styles.notificationcontent.NotificationContentCompact
import com.sdds.stylessalute.styles.notificationcontent.NotificationContentLoose
import com.sdds.stylessalute.styles.notificationcontent.Positive
import com.sdds.stylessalute.styles.notificationcontent.Warning
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
