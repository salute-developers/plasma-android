// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.notificationcontent

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.NotificationContentButtonLayout
import com.sdds.compose.uikit.NotificationContentIconPlacement
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.NotificationContentStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.buttongroup.BasicButtonGroup
import com.sdkit.star.designsystem.styles.buttongroup.Default
import com.sdkit.star.designsystem.styles.buttongroup.Dense
import com.sdkit.star.designsystem.styles.buttongroup.Xs
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNotificationContent :
    BuilderWrapper<NotificationContentStyle, NotificationContentStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNotificationContentView : WrapperNotificationContent

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperNotificationContentTerminate(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContent

/**
 * Обертка для вариации ButtonStretch
 */
@JvmInline
public value class WrapperNotificationContentButtonStretch(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentView

/**
 * Обертка для вариации ButtonStretchIconTop
 */
@JvmInline
public value class WrapperNotificationContentButtonStretchIconTop(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentView

/**
 * Обертка для вариации ButtonStretchIconStart
 */
@JvmInline
public value class WrapperNotificationContentButtonStretchIconStart(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentView

/**
 * Обертка для вариации NoButtonStretch
 */
@JvmInline
public value class WrapperNotificationContentNoButtonStretch(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentView

/**
 * Обертка для вариации NoButtonStretchIconTop
 */
@JvmInline
public value class WrapperNotificationContentNoButtonStretchIconTop(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentView

/**
 * Обертка для вариации NoButtonStretchIconStart
 */
@JvmInline
public value class WrapperNotificationContentNoButtonStretchIconStart(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentView

public val WrapperNotificationContentView.Default: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Positive: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(),
            )
            textColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Negative: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(),
            )
            textColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Warning: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultWarning.asInteractive(),
            )
            textColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                StarDsTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Info: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultInfo.asInteractive(),
            )
            textColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                StarDsTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

private val NotificationContentStyleBuilder.invariantProps: NotificationContentStyleBuilder
    @Composable
    get() = this
        .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
        .titleStyle(StarDsTheme.typography.bodySBold)
        .textStyle(StarDsTheme.typography.textSNormal)
        .dimensions {
            iconSize(dimensionResource(R.dimen.sdkit_cmp_notification_content_icon_size))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_text_padding))
            textBoxBottomPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_text_box_bottom_padding))
            buttonGroupTopPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_button_group_top_padding))
        }

public val NotificationContent.ButtonStretch: WrapperNotificationContentButtonStretch
    @Composable
    @JvmName("WrapperNotificationContentButtonStretch")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .buttonLayout(NotificationContentButtonLayout.Stretch)
        .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
        .dimensions {
            contentStartPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_content_start_padding_button_stretch),
            )
            contentTopPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_content_top_padding_button_stretch),
            )
        }
        .wrap(::WrapperNotificationContentButtonStretch)

public val WrapperNotificationContentButtonStretch.IconTop:
    WrapperNotificationContentButtonStretchIconTop
    @Composable
    @JvmName("WrapperNotificationContentButtonStretchIconTop")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Top)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_icon_margin_button_stretch_icon_top))
            contentEndPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_content_end_padding_button_stretch_icon_top),
            )
            textBoxStartPadding(
                dimensionResource(
                    R.dimen.sdkit_cmp_notification_content_text_box_start_padding_button_stretch_icon_top,
                ),
            )
        }
        .wrap(::WrapperNotificationContentButtonStretchIconTop)

public val WrapperNotificationContentButtonStretch.IconStart:
    WrapperNotificationContentButtonStretchIconStart
    @Composable
    @JvmName("WrapperNotificationContentButtonStretchIconStart")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_icon_margin_button_stretch_icon_start))
            textBoxStartPadding(
                dimensionResource(
                    R.dimen.sdkit_cmp_notification_content_text_box_start_padding_button_stretch_icon_start,
                ),
            )
            textBoxTopPadding(
                dimensionResource(
                    R.dimen.sdkit_cmp_notification_content_text_box_top_padding_button_stretch_icon_start,
                ),
            )
        }
        .wrap(::WrapperNotificationContentButtonStretchIconStart)

public val NotificationContent.NoButtonStretch: WrapperNotificationContentNoButtonStretch
    @Composable
    @JvmName("WrapperNotificationContentNoButtonStretch")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .buttonLayout(NotificationContentButtonLayout.Normal)
        .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
        .dimensions {
            contentTopPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_content_top_padding_no_button_stretch),
            )
            textBoxStartPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_text_box_start_padding_no_button_stretch),
            )
            textBoxTopPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_text_box_top_padding_no_button_stretch),
            )
        }
        .wrap(::WrapperNotificationContentNoButtonStretch)

public val WrapperNotificationContentNoButtonStretch.IconTop:
    WrapperNotificationContentNoButtonStretchIconTop
    @Composable
    @JvmName("WrapperNotificationContentNoButtonStretchIconTop")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Top)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_icon_margin_no_button_stretch_icon_top))
        }
        .wrap(::WrapperNotificationContentNoButtonStretchIconTop)

public val WrapperNotificationContentNoButtonStretch.IconStart:
    WrapperNotificationContentNoButtonStretchIconStart
    @Composable
    @JvmName("WrapperNotificationContentNoButtonStretchIconStart")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_icon_margin_no_button_stretch_icon_start),
            )
            buttonGroupStartPadding(
                dimensionResource(
                    R.dimen.sdkit_cmp_notification_content_button_group_start_padding_no_button_stretch_icon_start,
                ),
            )
        }
        .wrap(::WrapperNotificationContentNoButtonStretchIconStart)
