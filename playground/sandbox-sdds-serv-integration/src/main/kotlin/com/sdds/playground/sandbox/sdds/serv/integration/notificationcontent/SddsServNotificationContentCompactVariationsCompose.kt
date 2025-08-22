package com.sdds.playground.sandbox.sdds.serv.integration.notificationcontent

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.notificationcontent.Default
import com.sdds.serv.styles.notificationcontent.IconStart
import com.sdds.serv.styles.notificationcontent.IconTop
import com.sdds.serv.styles.notificationcontent.Info
import com.sdds.serv.styles.notificationcontent.Negative
import com.sdds.serv.styles.notificationcontent.NoIcon
import com.sdds.serv.styles.notificationcontent.NotificationContentCompact
import com.sdds.serv.styles.notificationcontent.Positive
import com.sdds.serv.styles.notificationcontent.Warning

internal object SddsServNotificationContentCompactVariationsCompose :
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
