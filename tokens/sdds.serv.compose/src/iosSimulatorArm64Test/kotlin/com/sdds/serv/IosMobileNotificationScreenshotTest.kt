package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigIos
import com.sdds.compose.uikit.fixtures.kmp.RoborazziScreenshotThemeMode
import com.sdds.compose.uikit.fixtures.testcases.NotificationCompactMTopCenterHasCloseActionButtonOpened
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseMCenterEndTextHasCloseOpened
import com.sdds.compose.uikit.fixtures.testcases.NotificationLooseSBottomStartTextOpened
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationCompact
import com.sdds.serv.styles.notification.NotificationLoose
import com.sdds.serv.styles.notification.S
import kotlin.test.Test

@OptIn(ExperimentalTestApi::class)
abstract class IosMobileNotificationScreenshotTest(
    themeMode: RoborazziScreenshotThemeMode,
) : RoborazziConfigIos(
    theme = SddsServScreenshotTheme,
    themeMode = themeMode,
) {

    /**
     * PLASMA-T2049
     */
    @Test
    fun testNotificationCompactMTopCenterHasCloseActionButton() {
        content(::testNotificationCompactMTopCenterHasCloseActionButton) {
            NotificationCompactMTopCenterHasCloseActionButtonOpened(
                NotificationCompact.M.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2053
     */
    @Test
    fun testNotificationLooseMCenterEndTextHasClose() {
        content(::testNotificationLooseMCenterEndTextHasClose) {
            NotificationLooseMCenterEndTextHasCloseOpened(
                NotificationLoose.M.style(),
                BasicButton.M.Default.style(),
            )
        }
    }

    /**
     * PLASMA-T2054
     */
    @Test
    fun testNotificationLooseSBottomStartText() {
        content(::testNotificationLooseSBottomStartText) {
            NotificationLooseSBottomStartTextOpened(
                NotificationLoose.S.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}

class IosMobileNotificationScreenshotTestLight : IosMobileNotificationScreenshotTest(
    RoborazziScreenshotThemeMode.Light,
)

class IosMobileNotificationScreenshotTestDark : IosMobileNotificationScreenshotTest(
    RoborazziScreenshotThemeMode.Dark,
)
