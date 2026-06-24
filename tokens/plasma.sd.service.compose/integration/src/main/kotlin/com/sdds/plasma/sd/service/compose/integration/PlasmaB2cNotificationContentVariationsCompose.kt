// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.notificationcontent.ButtonStretch
import com.sdds.plasma.sd.service.styles.notificationcontent.Default
import com.sdds.plasma.sd.service.styles.notificationcontent.IconStart
import com.sdds.plasma.sd.service.styles.notificationcontent.IconTop
import com.sdds.plasma.sd.service.styles.notificationcontent.Info
import com.sdds.plasma.sd.service.styles.notificationcontent.Negative
import com.sdds.plasma.sd.service.styles.notificationcontent.NoButtonStretch
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContent
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContentButtonLayout
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContentIconPlacement
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContentStyles
import com.sdds.plasma.sd.service.styles.notificationcontent.NotificationContentView
import com.sdds.plasma.sd.service.styles.notificationcontent.Positive
import com.sdds.plasma.sd.service.styles.notificationcontent.Warning
import com.sdds.plasma.sd.service.styles.notificationcontent.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cNotificationContentVariationsCompose : ComposeStyleProvider<NotificationContentStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "buttonLayout",
                value = "Stretch",
                variants = listOf("Stretch", "Normal"),
            ),
            Property.SingleChoiceProperty(name = "iconPlacement", value = "Top", variants = listOf("Top", "Start")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative", "Warning", "Info"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<NotificationContentStyle>> =
        mapOf(
            "NotificationContent.ButtonStretch.Default" to ComposeStyleReference {
                NotificationContent.ButtonStretch.Default.style()
            },
            "NotificationContent.ButtonStretch.Positive" to ComposeStyleReference {
                NotificationContent.ButtonStretch.Positive.style()
            },
            "NotificationContent.ButtonStretch.Negative" to ComposeStyleReference {
                NotificationContent.ButtonStretch.Negative.style()
            },
            "NotificationContent.ButtonStretch.Warning" to ComposeStyleReference {
                NotificationContent.ButtonStretch.Warning.style()
            },
            "NotificationContent.ButtonStretch.Info" to ComposeStyleReference { NotificationContent.ButtonStretch.Info.style() },
            "NotificationContent.ButtonStretch.IconTop.Default" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Default.style()
            },
            "NotificationContent.ButtonStretch.IconTop.Positive" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Positive.style()
            },
            "NotificationContent.ButtonStretch.IconTop.Negative" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Negative.style()
            },
            "NotificationContent.ButtonStretch.IconTop.Warning" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Warning.style()
            },
            "NotificationContent.ButtonStretch.IconTop.Info" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconTop.Info.style()
            },
            "NotificationContent.ButtonStretch.IconStart.Default" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Default.style()
            },
            "NotificationContent.ButtonStretch.IconStart.Positive" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Positive.style()
            },
            "NotificationContent.ButtonStretch.IconStart.Negative" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Negative.style()
            },
            "NotificationContent.ButtonStretch.IconStart.Warning" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Warning.style()
            },
            "NotificationContent.ButtonStretch.IconStart.Info" to ComposeStyleReference {
                NotificationContent.ButtonStretch.IconStart.Info.style()
            },
            "NotificationContent.NoButtonStretch.Default" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.Default.style()
            },
            "NotificationContent.NoButtonStretch.Positive" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.Positive.style()
            },
            "NotificationContent.NoButtonStretch.Negative" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.Negative.style()
            },
            "NotificationContent.NoButtonStretch.Warning" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.Warning.style()
            },
            "NotificationContent.NoButtonStretch.Info" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.Info.style()
            },
            "NotificationContent.NoButtonStretch.IconTop.Default" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Default.style()
            },
            "NotificationContent.NoButtonStretch.IconTop.Positive" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Positive.style()
            },
            "NotificationContent.NoButtonStretch.IconTop.Negative" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Negative.style()
            },
            "NotificationContent.NoButtonStretch.IconTop.Warning" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Warning.style()
            },
            "NotificationContent.NoButtonStretch.IconTop.Info" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconTop.Info.style()
            },
            "NotificationContent.NoButtonStretch.IconStart.Default" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Default.style()
            },
            "NotificationContent.NoButtonStretch.IconStart.Positive" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Positive.style()
            },
            "NotificationContent.NoButtonStretch.IconStart.Negative" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Negative.style()
            },
            "NotificationContent.NoButtonStretch.IconStart.Warning" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Warning.style()
            },
            "NotificationContent.NoButtonStretch.IconStart.Info" to ComposeStyleReference {
                NotificationContent.NoButtonStretch.IconStart.Info.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return NotificationContentStyles.resolve(
            buttonLayout = when (bindings["buttonLayout"]?.toString()) {
                "Stretch" -> NotificationContentButtonLayout.Stretch
                "Normal" -> NotificationContentButtonLayout.Normal
                else -> NotificationContentButtonLayout.Stretch
            },
            iconPlacement = when (bindings["iconPlacement"]?.toString()) {
                "Top" -> NotificationContentIconPlacement.Top
                "Start" -> NotificationContentIconPlacement.Start
                else -> NotificationContentIconPlacement.Top
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> NotificationContentView.Default
                "Positive" -> NotificationContentView.Positive
                "Negative" -> NotificationContentView.Negative
                "Warning" -> NotificationContentView.Warning
                "Info" -> NotificationContentView.Info
                else -> NotificationContentView.Default
            },
        ).key
    }
}
