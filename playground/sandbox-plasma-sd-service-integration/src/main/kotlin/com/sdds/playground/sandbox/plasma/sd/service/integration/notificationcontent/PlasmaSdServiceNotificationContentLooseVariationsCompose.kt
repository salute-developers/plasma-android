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
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContentLoose
import com.sdds.plasma.sd.service.styles.notificationcontent.Positive
import com.sdds.plasma.sd.service.styles.notificationcontent.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceNotificationContentLooseVariationsCompose :
    ComposeStyleProvider<String, NotificationContentStyle>() {
    override val variations: Map<String, @Composable () -> NotificationContentStyle> =
        mapOf(
            "NoIconDefault" to { NotificationContentLoose.NoIcon.Default.style() },
            "IconTopDefault" to { NotificationContentLoose.IconTop.Default.style() },
            "IconStartDefault" to { NotificationContentLoose.IconStart.Default.style() },
            "NoIconPositive" to { NotificationContentLoose.NoIcon.Positive.style() },
            "IconTopPositive" to { NotificationContentLoose.IconTop.Positive.style() },
            "IconStartPositive" to { NotificationContentLoose.IconStart.Positive.style() },
            "NoIconNegative" to { NotificationContentLoose.NoIcon.Negative.style() },
            "IconTopNegative" to { NotificationContentLoose.IconTop.Negative.style() },
            "IconStartNegative" to { NotificationContentLoose.IconStart.Negative.style() },
            "NoIconWarning" to { NotificationContentLoose.NoIcon.Warning.style() },
            "IconTopWarning" to { NotificationContentLoose.IconTop.Warning.style() },
            "IconStartWarning" to { NotificationContentLoose.IconStart.Warning.style() },
            "NoIconInfo" to { NotificationContentLoose.NoIcon.Info.style() },
            "IconTopInfo" to { NotificationContentLoose.IconTop.Info.style() },
            "IconStartInfo" to { NotificationContentLoose.IconStart.Info.style() },
        )
}
