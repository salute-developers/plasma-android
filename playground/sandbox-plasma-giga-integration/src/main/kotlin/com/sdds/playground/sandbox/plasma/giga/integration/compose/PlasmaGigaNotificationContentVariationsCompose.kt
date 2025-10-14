package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.notificationcontent.ButtonStretch
import com.sdds.plasma.giga.styles.notificationcontent.Default
import com.sdds.plasma.giga.styles.notificationcontent.IconStart
import com.sdds.plasma.giga.styles.notificationcontent.IconTop
import com.sdds.plasma.giga.styles.notificationcontent.Info
import com.sdds.plasma.giga.styles.notificationcontent.Negative
import com.sdds.plasma.giga.styles.notificationcontent.NoButtonStretch
import com.sdds.plasma.giga.styles.notificationcontent.NotificationContent
import com.sdds.plasma.giga.styles.notificationcontent.Positive
import com.sdds.plasma.giga.styles.notificationcontent.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaNotificationContentVariationsCompose : ComposeStyleProvider<String, NotificationContentStyle>() {
    override val variations: Map<String, @Composable () -> NotificationContentStyle> =
        mapOf(
            "ButtonStretch.Default" to { NotificationContent.ButtonStretch.Default.style() },
            "ButtonStretch.Positive" to { NotificationContent.ButtonStretch.Positive.style() },
            "ButtonStretch.Negative" to { NotificationContent.ButtonStretch.Negative.style() },
            "ButtonStretch.Warning" to { NotificationContent.ButtonStretch.Warning.style() },
            "ButtonStretch.Info" to { NotificationContent.ButtonStretch.Info.style() },
            "ButtonStretch.IconTop.Default" to { NotificationContent.ButtonStretch.IconTop.Default.style() },
            "ButtonStretch.IconTop.Positive" to { NotificationContent.ButtonStretch.IconTop.Positive.style() },
            "ButtonStretch.IconTop.Negative" to { NotificationContent.ButtonStretch.IconTop.Negative.style() },
            "ButtonStretch.IconTop.Warning" to { NotificationContent.ButtonStretch.IconTop.Warning.style() },
            "ButtonStretch.IconTop.Info" to { NotificationContent.ButtonStretch.IconTop.Info.style() },
            "ButtonStretch.IconStart.Default" to { NotificationContent.ButtonStretch.IconStart.Default.style() },
            "ButtonStretch.IconStart.Positive" to { NotificationContent.ButtonStretch.IconStart.Positive.style() },
            "ButtonStretch.IconStart.Negative" to { NotificationContent.ButtonStretch.IconStart.Negative.style() },
            "ButtonStretch.IconStart.Warning" to { NotificationContent.ButtonStretch.IconStart.Warning.style() },
            "ButtonStretch.IconStart.Info" to { NotificationContent.ButtonStretch.IconStart.Info.style() },
            "NoButtonStretch.Default" to { NotificationContent.NoButtonStretch.Default.style() },
            "NoButtonStretch.Positive" to { NotificationContent.NoButtonStretch.Positive.style() },
            "NoButtonStretch.Negative" to { NotificationContent.NoButtonStretch.Negative.style() },
            "NoButtonStretch.Warning" to { NotificationContent.NoButtonStretch.Warning.style() },
            "NoButtonStretch.Info" to { NotificationContent.NoButtonStretch.Info.style() },
            "NoButtonStretch.IconTop.Default" to { NotificationContent.NoButtonStretch.IconTop.Default.style() },
            "NoButtonStretch.IconTop.Positive" to { NotificationContent.NoButtonStretch.IconTop.Positive.style() },
            "NoButtonStretch.IconTop.Negative" to { NotificationContent.NoButtonStretch.IconTop.Negative.style() },
            "NoButtonStretch.IconTop.Warning" to { NotificationContent.NoButtonStretch.IconTop.Warning.style() },
            "NoButtonStretch.IconTop.Info" to { NotificationContent.NoButtonStretch.IconTop.Info.style() },
            "NoButtonStretch.IconStart.Default" to { NotificationContent.NoButtonStretch.IconStart.Default.style() },
            "NoButtonStretch.IconStart.Positive" to { NotificationContent.NoButtonStretch.IconStart.Positive.style() },
            "NoButtonStretch.IconStart.Negative" to { NotificationContent.NoButtonStretch.IconStart.Negative.style() },
            "NoButtonStretch.IconStart.Warning" to { NotificationContent.NoButtonStretch.IconStart.Warning.style() },
            "NoButtonStretch.IconStart.Info" to { NotificationContent.NoButtonStretch.IconStart.Info.style() },
        )
}
