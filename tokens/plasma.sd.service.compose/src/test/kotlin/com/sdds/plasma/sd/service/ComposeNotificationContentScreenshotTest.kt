package com.sdds.plasma.sd.service

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.compose.uikit.fixtures.RoborazziConfigCompose
import com.sdds.compose.uikit.fixtures.SDK_NUMBER
import com.sdds.compose.uikit.fixtures.testcases.NotificationContentHasAction
import com.sdds.compose.uikit.fixtures.testcases.NotificationContentLongText
import com.sdds.compose.uikit.fixtures.testcases.NotificationContentNoText
import com.sdds.compose.uikit.fixtures.testcases.NotificationContentNoTitle
import com.sdds.compose.uikit.fixtures.testcases.NotificationContentNoTitleNoText
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.notificationcontent.ButtonStretch
import com.sdds.plasma.sd.service.styles.notificationcontent.Default
import com.sdds.plasma.sd.service.styles.notificationcontent.IconStart
import com.sdds.plasma.sd.service.styles.notificationcontent.IconTop
import com.sdds.plasma.sd.service.styles.notificationcontent.Info
import com.sdds.plasma.sd.service.styles.notificationcontent.Negative
import com.sdds.plasma.sd.service.styles.notificationcontent.NoButtonStretch
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContent
import com.sdds.plasma.sd.service.styles.notificationcontent.Positive
import com.sdds.plasma.sd.service.styles.notificationcontent.Warning
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

    @Test
    fun testNotificationContentPositive() {
        composeTestRule.content {
            NotificationContentHasAction(style = NotificationContent.ButtonStretch.Positive.style())
        }
    }

    @Test
    fun testNotificationContentWarning() {
        composeTestRule.content {
            NotificationContentHasAction(style = NotificationContent.ButtonStretch.Warning.style())
        }
    }
}
