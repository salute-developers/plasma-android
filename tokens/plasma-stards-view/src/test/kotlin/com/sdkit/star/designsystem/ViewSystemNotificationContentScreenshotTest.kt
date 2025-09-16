package com.sdkit.star.designsystem

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.notificationcontent.NotificationContentTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Television1080p)
class ViewSystemNotificationContentScreenshotTest : NotificationContentTestCases("+night") {

    @Test
    override fun testNotificationContentButtonStretchDefaultTitleTextHasAction() {
        themedComponent {
            notificationContentButtonStretchDefaultTitleTextHasAction(
                R.style.Sdkit_StarDs_ComponentOverlays_NotificationContentButtonStretchDefault,
            )
        }
    }

    @Test
    override fun testNotificationContentNoTitleButtonStretchIconTopPositive() {
        themedComponent {
            notificationContentNoTitleButtonStretchIconTopPositive(
                R.style.Sdkit_StarDs_ComponentOverlays_NotificationContentButtonStretchIconTopPositive,
            )
        }
    }

    @Test
    override fun testNotificationContentNoTextButtonStretchIconStartNegative() {
        themedComponent {
            notificationContentNoTextButtonStretchIconStartNegative(
                R.style.Sdkit_StarDs_ComponentOverlays_NotificationContentButtonStretchIconStartNegative,
            )
        }
    }

    @Test
    override fun testNotificationContentNoTextTitleButtonStretchIconTopWarning() {
        themedComponent {
            notificationContentNoTextTitleButtonStretchIconTopWarning(
                R.style.Sdkit_StarDs_ComponentOverlays_NotificationContentButtonStretchIconTopWarning,
            )
        }
    }

    @Test
    override fun testNotificationContentLongTextButtonStretchIconStartInfo() {
        themedComponent {
            notificationContentLongTextButtonStretchIconStartInfo(
                R.style.Sdkit_StarDs_ComponentOverlays_NotificationContentButtonStretchIconStartInfo,
            )
        }
    }

    @Test
    override fun testNotificationContentNoButtonStretchIconStartDefault() {
        themedComponent {
            notificationContentNoButtonStretchIconStartDefault(
                R.style.Sdkit_StarDs_ComponentOverlays_NotificationContentButtonStretchIconStartDefault,
            )
        }
    }
}
