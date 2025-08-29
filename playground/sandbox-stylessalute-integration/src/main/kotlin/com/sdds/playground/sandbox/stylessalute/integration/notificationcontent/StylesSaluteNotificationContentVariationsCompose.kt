package com.sdds.playground.sandbox.stylessalute.integration.notificationcontent

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.notificationcontent.ButtonStretch
import com.sdds.stylessalute.styles.notificationcontent.Default
import com.sdds.stylessalute.styles.notificationcontent.IconStart
import com.sdds.stylessalute.styles.notificationcontent.IconTop
import com.sdds.stylessalute.styles.notificationcontent.Info
import com.sdds.stylessalute.styles.notificationcontent.Negative
import com.sdds.stylessalute.styles.notificationcontent.NoButtonStretch
import com.sdds.stylessalute.styles.notificationcontent.NotificationContent
import com.sdds.stylessalute.styles.notificationcontent.Positive
import com.sdds.stylessalute.styles.notificationcontent.Warning

internal object StylesSaluteNotificationContentVariationsCompose :
    ComposeStyleProvider<String, NotificationContentStyle>() {
    override val variations: Map<String, @Composable () -> NotificationContentStyle> =
        mapOf(
            "ButtonStretchDefault" to { NotificationContent.ButtonStretch.Default.style() },
            "ButtonStretchIconTopDefault" to { NotificationContent.ButtonStretch.IconTop.Default.style() },
            "ButtonStretchIconStartDefault" to { NotificationContent.ButtonStretch.IconStart.Default.style() },
            "ButtonStretchPositive" to { NotificationContent.ButtonStretch.Positive.style() },
            "ButtonStretchIconTopPositive" to { NotificationContent.ButtonStretch.IconTop.Positive.style() },
            "ButtonStretchIconStartPositive" to { NotificationContent.ButtonStretch.IconStart.Positive.style() },
            "ButtonStretchNegative" to { NotificationContent.ButtonStretch.Negative.style() },
            "ButtonStretchIconTopNegative" to { NotificationContent.ButtonStretch.IconTop.Negative.style() },
            "ButtonStretchIconStartNegative" to { NotificationContent.ButtonStretch.IconStart.Negative.style() },
            "ButtonStretchWarning" to { NotificationContent.ButtonStretch.Warning.style() },
            "ButtonStretchIconTopWarning" to { NotificationContent.ButtonStretch.IconTop.Warning.style() },
            "ButtonStretchIconStartWarning" to { NotificationContent.ButtonStretch.IconStart.Warning.style() },
            "ButtonStretchInfo" to { NotificationContent.ButtonStretch.Info.style() },
            "ButtonStretchIconTopInfo" to { NotificationContent.ButtonStretch.IconTop.Info.style() },
            "ButtonStretchIconStartInfo" to { NotificationContent.ButtonStretch.IconStart.Info.style() },

            "NoButtonStretchDefault" to { NotificationContent.NoButtonStretch.Default.style() },
            "NoButtonStretchIconTopDefault" to { NotificationContent.NoButtonStretch.IconTop.Default.style() },
            "NoButtonStretchIconStartDefault" to { NotificationContent.NoButtonStretch.IconStart.Default.style() },
            "NoButtonStretchPositive" to { NotificationContent.NoButtonStretch.Positive.style() },
            "NoButtonStretchIconTopPositive" to { NotificationContent.NoButtonStretch.IconTop.Positive.style() },
            "NoButtonStretchIconStartPositive" to { NotificationContent.NoButtonStretch.IconStart.Positive.style() },
            "NoButtonStretchNegative" to { NotificationContent.NoButtonStretch.Negative.style() },
            "NoButtonStretchIconTopNegative" to { NotificationContent.NoButtonStretch.IconTop.Negative.style() },
            "NoButtonStretchIconStartNegative" to { NotificationContent.NoButtonStretch.IconStart.Negative.style() },
            "NoButtonStretchWarning" to { NotificationContent.NoButtonStretch.Warning.style() },
            "NoButtonStretchIconTopWarning" to { NotificationContent.NoButtonStretch.IconTop.Warning.style() },
            "NoButtonStretchIconStartWarning" to { NotificationContent.NoButtonStretch.IconStart.Warning.style() },
            "NoButtonStretchInfo" to { NotificationContent.NoButtonStretch.Info.style() },
            "NoButtonStretchIconTopInfo" to { NotificationContent.NoButtonStretch.IconTop.Info.style() },
            "NoButtonStretchIconStartInfo" to { NotificationContent.NoButtonStretch.IconStart.Info.style() },
        )
}
