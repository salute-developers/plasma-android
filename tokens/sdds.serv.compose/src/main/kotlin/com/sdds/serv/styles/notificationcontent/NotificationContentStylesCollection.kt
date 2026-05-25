// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.notificationcontent

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.NotificationContentStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента NotificationContent
 */
public enum class NotificationContentStyles(
    public val key: String,
) {
    NotificationContentButtonStretchDefault("NotificationContent.ButtonStretch.Default"),
    NotificationContentButtonStretchPositive("NotificationContent.ButtonStretch.Positive"),
    NotificationContentButtonStretchNegative("NotificationContent.ButtonStretch.Negative"),
    NotificationContentButtonStretchWarning("NotificationContent.ButtonStretch.Warning"),
    NotificationContentButtonStretchInfo("NotificationContent.ButtonStretch.Info"),
    NotificationContentButtonStretchIconTopDefault("NotificationContent.ButtonStretch.IconTop.Default"),
    NotificationContentButtonStretchIconTopPositive("NotificationContent.ButtonStretch.IconTop.Positive"),
    NotificationContentButtonStretchIconTopNegative("NotificationContent.ButtonStretch.IconTop.Negative"),
    NotificationContentButtonStretchIconTopWarning("NotificationContent.ButtonStretch.IconTop.Warning"),
    NotificationContentButtonStretchIconTopInfo("NotificationContent.ButtonStretch.IconTop.Info"),
    NotificationContentButtonStretchIconStartDefault("NotificationContent.ButtonStretch.IconStart.Default"),
    NotificationContentButtonStretchIconStartPositive("NotificationContent.ButtonStretch.IconStart.Positive"),
    NotificationContentButtonStretchIconStartNegative("NotificationContent.ButtonStretch.IconStart.Negative"),
    NotificationContentButtonStretchIconStartWarning("NotificationContent.ButtonStretch.IconStart.Warning"),
    NotificationContentButtonStretchIconStartInfo("NotificationContent.ButtonStretch.IconStart.Info"),
    NotificationContentNoButtonStretchDefault("NotificationContent.NoButtonStretch.Default"),
    NotificationContentNoButtonStretchPositive("NotificationContent.NoButtonStretch.Positive"),
    NotificationContentNoButtonStretchNegative("NotificationContent.NoButtonStretch.Negative"),
    NotificationContentNoButtonStretchWarning("NotificationContent.NoButtonStretch.Warning"),
    NotificationContentNoButtonStretchInfo("NotificationContent.NoButtonStretch.Info"),
    NotificationContentNoButtonStretchIconTopDefault("NotificationContent.NoButtonStretch.IconTop.Default"),
    NotificationContentNoButtonStretchIconTopPositive("NotificationContent.NoButtonStretch.IconTop.Positive"),
    NotificationContentNoButtonStretchIconTopNegative("NotificationContent.NoButtonStretch.IconTop.Negative"),
    NotificationContentNoButtonStretchIconTopWarning("NotificationContent.NoButtonStretch.IconTop.Warning"),
    NotificationContentNoButtonStretchIconTopInfo("NotificationContent.NoButtonStretch.IconTop.Info"),
    NotificationContentNoButtonStretchIconStartDefault("NotificationContent.NoButtonStretch.IconStart.Default"),
    NotificationContentNoButtonStretchIconStartPositive("NotificationContent.NoButtonStretch.IconStart.Positive"),
    NotificationContentNoButtonStretchIconStartNegative("NotificationContent.NoButtonStretch.IconStart.Negative"),
    NotificationContentNoButtonStretchIconStartWarning("NotificationContent.NoButtonStretch.IconStart.Warning"),
    NotificationContentNoButtonStretchIconStartInfo("NotificationContent.NoButtonStretch.IconStart.Info"),
    ;

    /**
     * Typed API для подбора стиля notification-content
     */
    public companion object
}

/**
 * Возможные значения свойства button-layout для notification-content
 */
public enum class NotificationContentButtonLayout {
    Stretch,
    Normal,
}

/**
 * Возможные значения свойства icon-placement для notification-content
 */
public enum class NotificationContentIconPlacement {
    Top,
    Start,
}

/**
 * Возможные значения свойства view для notification-content
 */
public enum class NotificationContentView {
    Default,
    Positive,
    Negative,
    Warning,
    Info,
}

/**
 * Возвращает [NotificationContentStyle] для [NotificationContentStyles]
 */
@Composable
public fun NotificationContentStyles.style(
    modify: @Composable
    NotificationContentStyleBuilder.() -> Unit = {},
): NotificationContentStyle {
    val builder = when (this) {
        NotificationContentStyles.NotificationContentButtonStretchDefault ->
            NotificationContent.ButtonStretch.Default
        NotificationContentStyles.NotificationContentButtonStretchPositive ->
            NotificationContent.ButtonStretch.Positive
        NotificationContentStyles.NotificationContentButtonStretchNegative ->
            NotificationContent.ButtonStretch.Negative
        NotificationContentStyles.NotificationContentButtonStretchWarning ->
            NotificationContent.ButtonStretch.Warning
        NotificationContentStyles.NotificationContentButtonStretchInfo ->
            NotificationContent.ButtonStretch.Info
        NotificationContentStyles.NotificationContentButtonStretchIconTopDefault ->
            NotificationContent.ButtonStretch.IconTop.Default
        NotificationContentStyles.NotificationContentButtonStretchIconTopPositive ->
            NotificationContent.ButtonStretch.IconTop.Positive
        NotificationContentStyles.NotificationContentButtonStretchIconTopNegative ->
            NotificationContent.ButtonStretch.IconTop.Negative
        NotificationContentStyles.NotificationContentButtonStretchIconTopWarning ->
            NotificationContent.ButtonStretch.IconTop.Warning
        NotificationContentStyles.NotificationContentButtonStretchIconTopInfo ->
            NotificationContent.ButtonStretch.IconTop.Info
        NotificationContentStyles.NotificationContentButtonStretchIconStartDefault ->
            NotificationContent.ButtonStretch.IconStart.Default
        NotificationContentStyles.NotificationContentButtonStretchIconStartPositive ->
            NotificationContent.ButtonStretch.IconStart.Positive
        NotificationContentStyles.NotificationContentButtonStretchIconStartNegative ->
            NotificationContent.ButtonStretch.IconStart.Negative
        NotificationContentStyles.NotificationContentButtonStretchIconStartWarning ->
            NotificationContent.ButtonStretch.IconStart.Warning
        NotificationContentStyles.NotificationContentButtonStretchIconStartInfo ->
            NotificationContent.ButtonStretch.IconStart.Info
        NotificationContentStyles.NotificationContentNoButtonStretchDefault ->
            NotificationContent.NoButtonStretch.Default
        NotificationContentStyles.NotificationContentNoButtonStretchPositive ->
            NotificationContent.NoButtonStretch.Positive
        NotificationContentStyles.NotificationContentNoButtonStretchNegative ->
            NotificationContent.NoButtonStretch.Negative
        NotificationContentStyles.NotificationContentNoButtonStretchWarning ->
            NotificationContent.NoButtonStretch.Warning
        NotificationContentStyles.NotificationContentNoButtonStretchInfo ->
            NotificationContent.NoButtonStretch.Info
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopDefault ->
            NotificationContent.NoButtonStretch.IconTop.Default
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopPositive ->
            NotificationContent.NoButtonStretch.IconTop.Positive
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopNegative ->
            NotificationContent.NoButtonStretch.IconTop.Negative
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopWarning ->
            NotificationContent.NoButtonStretch.IconTop.Warning
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopInfo ->
            NotificationContent.NoButtonStretch.IconTop.Info
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartDefault ->
            NotificationContent.NoButtonStretch.IconStart.Default
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartPositive ->
            NotificationContent.NoButtonStretch.IconStart.Positive
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartNegative ->
            NotificationContent.NoButtonStretch.IconStart.Negative
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartWarning ->
            NotificationContent.NoButtonStretch.IconStart.Warning
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartInfo ->
            NotificationContent.NoButtonStretch.IconStart.Info
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [NotificationContentStyles] для notification-content
 */
public fun NotificationContentStyles.Companion.resolve(
    buttonLayout: NotificationContentButtonLayout = NotificationContentButtonLayout.Stretch,
    iconPlacement: NotificationContentIconPlacement = NotificationContentIconPlacement.Top,
    view: NotificationContentView = NotificationContentView.Default,
): NotificationContentStyles = when {
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Default ->
        NotificationContentStyles.NotificationContentButtonStretchIconTopDefault
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Positive ->
        NotificationContentStyles.NotificationContentButtonStretchIconTopPositive
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Negative ->
        NotificationContentStyles.NotificationContentButtonStretchIconTopNegative
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Warning ->
        NotificationContentStyles.NotificationContentButtonStretchIconTopWarning
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Info ->
        NotificationContentStyles.NotificationContentButtonStretchIconTopInfo
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Default ->
        NotificationContentStyles.NotificationContentButtonStretchIconStartDefault
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Positive ->
        NotificationContentStyles.NotificationContentButtonStretchIconStartPositive
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Negative ->
        NotificationContentStyles.NotificationContentButtonStretchIconStartNegative
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Warning ->
        NotificationContentStyles.NotificationContentButtonStretchIconStartWarning
    buttonLayout == NotificationContentButtonLayout.Stretch && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Info ->
        NotificationContentStyles.NotificationContentButtonStretchIconStartInfo
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Default ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopDefault
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Positive ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopPositive
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Negative ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopNegative
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Warning ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopWarning
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Top && view == NotificationContentView.Info ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconTopInfo
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Default ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartDefault
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Positive ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartPositive
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Negative ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartNegative
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Warning ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartWarning
    buttonLayout == NotificationContentButtonLayout.Normal && iconPlacement ==
        NotificationContentIconPlacement.Start && view == NotificationContentView.Info ->
        NotificationContentStyles.NotificationContentNoButtonStretchIconStartInfo
    buttonLayout == NotificationContentButtonLayout.Stretch && view ==
        NotificationContentView.Default ->
        NotificationContentStyles.NotificationContentButtonStretchDefault
    buttonLayout == NotificationContentButtonLayout.Stretch && view ==
        NotificationContentView.Positive ->
        NotificationContentStyles.NotificationContentButtonStretchPositive
    buttonLayout == NotificationContentButtonLayout.Stretch && view ==
        NotificationContentView.Negative ->
        NotificationContentStyles.NotificationContentButtonStretchNegative
    buttonLayout == NotificationContentButtonLayout.Stretch && view ==
        NotificationContentView.Warning ->
        NotificationContentStyles.NotificationContentButtonStretchWarning
    buttonLayout == NotificationContentButtonLayout.Stretch && view ==
        NotificationContentView.Info ->
        NotificationContentStyles.NotificationContentButtonStretchInfo
    buttonLayout == NotificationContentButtonLayout.Normal && view ==
        NotificationContentView.Default ->
        NotificationContentStyles.NotificationContentNoButtonStretchDefault
    buttonLayout == NotificationContentButtonLayout.Normal && view ==
        NotificationContentView.Positive ->
        NotificationContentStyles.NotificationContentNoButtonStretchPositive
    buttonLayout == NotificationContentButtonLayout.Normal && view ==
        NotificationContentView.Negative ->
        NotificationContentStyles.NotificationContentNoButtonStretchNegative
    buttonLayout == NotificationContentButtonLayout.Normal && view ==
        NotificationContentView.Warning ->
        NotificationContentStyles.NotificationContentNoButtonStretchWarning
    buttonLayout == NotificationContentButtonLayout.Normal && view ==
        NotificationContentView.Info ->
        NotificationContentStyles.NotificationContentNoButtonStretchInfo
    else -> error("Unsupported notification-content style combination")
}

/**
 * Возвращает [NotificationContentStyle] для notification-content
 */
@Composable
public fun NotificationContentStyles.Companion.style(
    buttonLayout: NotificationContentButtonLayout = NotificationContentButtonLayout.Stretch,
    iconPlacement: NotificationContentIconPlacement = NotificationContentIconPlacement.Top,
    view: NotificationContentView = NotificationContentView.Default,
    modify: @Composable NotificationContentStyleBuilder.() -> Unit = {},
): NotificationContentStyle = resolve(buttonLayout, iconPlacement, view).style(modify)
