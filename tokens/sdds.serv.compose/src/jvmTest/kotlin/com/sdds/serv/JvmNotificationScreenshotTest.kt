package com.sdds.serv

import androidx.compose.ui.test.ExperimentalTestApi
import com.sdds.compose.uikit.fixtures.kmp.RoborazziConfigJvm
import com.sdds.compose.uikit.fixtures.kmp.testcases.NotificationCompactMTopCenterHasCloseActionButton
import com.sdds.compose.uikit.fixtures.kmp.testcases.NotificationLooseMCenterEndTextHasClose
import com.sdds.compose.uikit.fixtures.kmp.testcases.NotificationLooseSBottomStartText
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.basicbutton.BasicButton
import com.sdds.serv.styles.basicbutton.Default
import com.sdds.serv.styles.basicbutton.M
import com.sdds.serv.styles.notification.M
import com.sdds.serv.styles.notification.NotificationCompact
import com.sdds.serv.styles.notification.NotificationLoose
import com.sdds.serv.styles.notification.S
import org.junit.Test

@OptIn(ExperimentalTestApi::class)
class JvmNotificationScreenshotTest : RoborazziConfigJvm(SddsServScreenshotTheme) {

    /**
     * PLASMA-T2049
     */
    @Test
    fun testNotificationCompactMTopCenterHasCloseActionButton() {
        content {
            NotificationCompactMTopCenterHasCloseActionButton(
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
        content {
            NotificationLooseMCenterEndTextHasClose(
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
        content {
            NotificationLooseSBottomStartText(
                NotificationLoose.S.style(),
                BasicButton.M.Default.style(),
            )
        }
    }
}
