// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
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

internal object PlasmaGigaNotificationContentVariationsCompose : ComposeStyleProvider<NotificationContentStyle>() {
    override val variations: Map<String, ComposeStyleReference<NotificationContentStyle>> =
        mapOf(
            "ButtonStretch.Default" to ComposeStyleReference { NotificationContent.ButtonStretch.Default.style() },
            "ButtonStretch.Positive" to ComposeStyleReference { NotificationContent.ButtonStretch.Positive.style() },
            "ButtonStretch.Negative" to ComposeStyleReference { NotificationContent.ButtonStretch.Negative.style() },
            "ButtonStretch.Warning" to ComposeStyleReference { NotificationContent.ButtonStretch.Warning.style() },
            "ButtonStretch.Info" to ComposeStyleReference { NotificationContent.ButtonStretch.Info.style() },
            "ButtonStretch.IconTop.Default" to ComposeStyleReference { NotificationContent.ButtonStretch.IconTop.Default.style() },
            "ButtonStretch.IconTop.Positive" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Positive.style()
            },
            "ButtonStretch.IconTop.Negative" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Negative.style()
            },
            "ButtonStretch.IconTop.Warning" to ComposeStyleReference { NotificationContent.ButtonStretch.IconTop.Warning.style() },
            "ButtonStretch.IconTop.Info" to ComposeStyleReference { NotificationContent.ButtonStretch.IconTop.Info.style() },
            "ButtonStretch.IconStart.Default" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Default.style()
            },
            "ButtonStretch.IconStart.Positive" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Positive.style()
            },
            "ButtonStretch.IconStart.Negative" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Negative.style()
            },
            "ButtonStretch.IconStart.Warning" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Warning.style()
            },
            "ButtonStretch.IconStart.Info" to ComposeStyleReference { NotificationContent.ButtonStretch.IconStart.Info.style() },
            "NoButtonStretch.Default" to ComposeStyleReference { NotificationContent.NoButtonStretch.Default.style() },
            "NoButtonStretch.Positive" to ComposeStyleReference { NotificationContent.NoButtonStretch.Positive.style() },
            "NoButtonStretch.Negative" to ComposeStyleReference { NotificationContent.NoButtonStretch.Negative.style() },
            "NoButtonStretch.Warning" to ComposeStyleReference { NotificationContent.NoButtonStretch.Warning.style() },
            "NoButtonStretch.Info" to ComposeStyleReference { NotificationContent.NoButtonStretch.Info.style() },
            "NoButtonStretch.IconTop.Default" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Default.style()
            },
            "NoButtonStretch.IconTop.Positive" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Positive.style()
            },
            "NoButtonStretch.IconTop.Negative" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Negative.style()
            },
            "NoButtonStretch.IconTop.Warning" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Warning.style()
            },
            "NoButtonStretch.IconTop.Info" to ComposeStyleReference { NotificationContent.NoButtonStretch.IconTop.Info.style() },
            "NoButtonStretch.IconStart.Default" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Default.style()
            },
            "NoButtonStretch.IconStart.Positive" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Positive.style()
            },
            "NoButtonStretch.IconStart.Negative" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Negative.style()
            },
            "NoButtonStretch.IconStart.Warning" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Warning.style()
            },
            "NoButtonStretch.IconStart.Info" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Info.style()
            },
        )
}
