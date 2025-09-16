package com.sdds.stylessalute

import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.sdds.testing.vs.SDK_NUMBER
import com.sdds.testing.vs.notificationcontent.NotificationContentTestCases
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(ParameterizedRobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(sdk = [SDK_NUMBER], qualifiers = RobolectricDeviceQualifiers.Pixel6)
class ViewSystemNotificationContentScreenshotTest(
    theme: String,
) : NotificationContentTestCases(theme) {

    @Test
    override fun testNotificationContentButtonStretchDefaultTitleTextHasAction() {
        themedComponent {
            notificationContentButtonStretchDefaultTitleTextHasAction(
                R.style.Salute_StylesSalute_ComponentOverlays_NotificationContentButtonStretchDefault,
            )
        }
    }

    @Test
    override fun testNotificationContentNoTitleButtonStretchIconTopPositive() {
        themedComponent {
            notificationContentNoTitleButtonStretchIconTopPositive(
                R.style.Salute_StylesSalute_ComponentOverlays_NotificationContentButtonStretchIconTopPositive,
            )
        }
    }

    @Test
    override fun testNotificationContentNoTextButtonStretchIconStartNegative() {
        themedComponent {
            notificationContentNoTextButtonStretchIconStartNegative(
                R.style.Salute_StylesSalute_ComponentOverlays_NotificationContentButtonStretchIconStartNegative,
            )
        }
    }

    @Test
    override fun testNotificationContentNoTextTitleButtonStretchIconTopWarning() {
        themedComponent {
            notificationContentNoTextTitleButtonStretchIconTopWarning(
                R.style.Salute_StylesSalute_ComponentOverlays_NotificationContentButtonStretchIconTopWarning,
            )
        }
    }

    @Test
    override fun testNotificationContentLongTextButtonStretchIconStartInfo() {
        themedComponent {
            notificationContentLongTextButtonStretchIconStartInfo(
                R.style.Salute_StylesSalute_ComponentOverlays_NotificationContentButtonStretchIconStartInfo,
            )
        }
    }

    @Test
    override fun testNotificationContentNoButtonStretchIconStartDefault() {
        themedComponent {
            notificationContentNoButtonStretchIconStartDefault(
                R.style.Salute_StylesSalute_ComponentOverlays_NotificationContentButtonStretchIconStartDefault,
            )
        }
    }
}
