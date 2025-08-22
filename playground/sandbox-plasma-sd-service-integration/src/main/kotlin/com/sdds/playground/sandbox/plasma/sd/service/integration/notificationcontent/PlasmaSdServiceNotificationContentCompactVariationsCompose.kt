package com.sdds.playground.sandbox.plasma.sd.service.integration.notificationcontent

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.notificationcontent.Default
import com.sdds.plasma.sd.service.styles.notificationcontent.IconStart
import com.sdds.plasma.sd.service.styles.notificationcontent.IconTop
import com.sdds.plasma.sd.service.styles.notificationcontent.Info
import com.sdds.plasma.sd.service.styles.notificationcontent.Negative
import com.sdds.plasma.sd.service.styles.notificationcontent.NoIcon
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContentCompact
import com.sdds.plasma.sd.service.styles.notificationcontent.Positive
import com.sdds.plasma.sd.service.styles.notificationcontent.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceNotificationContentCompactVariationsCompose :
    ComposeStyleProvider<String, NotificationContentStyle>() {
    override val variations: Map<String, @Composable () -> NotificationContentStyle> =
        mapOf(
            "NoIconDefault" to { NotificationContentCompact.NoIcon.Default.style() },
            "IconTopDefault" to { NotificationContentCompact.IconTop.Default.style() },
            "IconStartDefault" to { NotificationContentCompact.IconStart.Default.style() },
            "NoIconPositive" to { NotificationContentCompact.NoIcon.Positive.style() },
            "IconTopPositive" to { NotificationContentCompact.IconTop.Positive.style() },
            "IconStartPositive" to { NotificationContentCompact.IconStart.Positive.style() },
            "NoIconNegative" to { NotificationContentCompact.NoIcon.Negative.style() },
            "IconTopNegative" to { NotificationContentCompact.IconTop.Negative.style() },
            "IconStartNegative" to { NotificationContentCompact.IconStart.Negative.style() },
            "NoIconWarning" to { NotificationContentCompact.NoIcon.Warning.style() },
            "IconTopWarning" to { NotificationContentCompact.IconTop.Warning.style() },
            "IconStartWarning" to { NotificationContentCompact.IconStart.Warning.style() },
            "NoIconInfo" to { NotificationContentCompact.NoIcon.Info.style() },
            "IconTopInfo" to { NotificationContentCompact.IconTop.Info.style() },
            "IconStartInfo" to { NotificationContentCompact.IconStart.Info.style() },
        )
}
