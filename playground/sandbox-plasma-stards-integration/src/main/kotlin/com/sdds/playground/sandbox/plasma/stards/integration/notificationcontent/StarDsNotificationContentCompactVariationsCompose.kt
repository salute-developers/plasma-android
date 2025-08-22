package com.sdds.playground.sandbox.plasma.stards.integration.notificationcontent

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdkit.star.designsystem.styles.notificationcontent.Default
import com.sdkit.star.designsystem.styles.notificationcontent.IconStart
import com.sdkit.star.designsystem.styles.notificationcontent.IconTop
import com.sdkit.star.designsystem.styles.notificationcontent.Info
import com.sdkit.star.designsystem.styles.notificationcontent.Negative
import com.sdkit.star.designsystem.styles.notificationcontent.NoIcon
import com.sdkit.star.designsystem.styles.notificationcontent.NotificationContentCompact
import com.sdkit.star.designsystem.styles.notificationcontent.Positive
import com.sdkit.star.designsystem.styles.notificationcontent.Warning

internal object StarDsNotificationContentCompactVariationsCompose :
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
