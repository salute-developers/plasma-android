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
import com.sdkit.star.designsystem.styles.notificationcontent.NotificationContentLoose
import com.sdkit.star.designsystem.styles.notificationcontent.Positive
import com.sdkit.star.designsystem.styles.notificationcontent.Warning

internal object StarDsNotificationContentLooseVariationsCompose :
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
