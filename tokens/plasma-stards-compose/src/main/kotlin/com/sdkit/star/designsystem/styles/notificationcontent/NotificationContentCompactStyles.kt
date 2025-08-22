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
public interface WrapperNotificationContentCompact :
    BuilderWrapper<NotificationContentStyle, NotificationContentStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNotificationContentCompactView : WrapperNotificationContentCompact

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperNotificationContentCompactTerminate(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentCompact

/**
 * Обертка для вариации NoIcon
 */
@JvmInline
public value class WrapperNotificationContentCompactNoIcon(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentCompactView

/**
 * Обертка для вариации IconTop
 */
@JvmInline
public value class WrapperNotificationContentCompactIconTop(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentCompactView

/**
 * Обертка для вариации IconStart
 */
@JvmInline
public value class WrapperNotificationContentCompactIconStart(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentCompactView

public val WrapperNotificationContentCompactView.Default: WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Positive:
    WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Negative:
    WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Warning: WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Info: WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

private val NotificationContentStyleBuilder.invariantProps: NotificationContentStyleBuilder
    @Composable
    get() = this
        .buttonLayout(NotificationContentButtonLayout.Stretch)
        .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
        .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
        .titleStyle(StarDsTheme.typography.bodySBold)
        .textStyle(StarDsTheme.typography.textSNormal)
        .dimensions {
            iconSize(dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_icon_size))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_text_padding))
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_content_start_padding))
            contentTopPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_content_top_padding))
            textBoxBottomPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_text_box_bottom_padding),
            )
            buttonGroupTopPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_button_group_top_padding),
            )
        }

public val NotificationContentCompact.NoIcon: WrapperNotificationContentCompactNoIcon
    @Composable
    @JvmName("WrapperNotificationContentCompactNoIcon")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.None)
        .wrap(::WrapperNotificationContentCompactNoIcon)

public val NotificationContentCompact.IconTop: WrapperNotificationContentCompactIconTop
    @Composable
    @JvmName("WrapperNotificationContentCompactIconTop")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.Top)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_icon_margin_icon_top))
            contentEndPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_content_end_padding_icon_top),
            )
            textBoxStartPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_text_box_start_padding_icon_top),
            )
        }
        .wrap(::WrapperNotificationContentCompactIconTop)

public val NotificationContentCompact.IconStart: WrapperNotificationContentCompactIconStart
    @Composable
    @JvmName("WrapperNotificationContentCompactIconStart")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_icon_margin_icon_start))
            textBoxStartPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_text_box_start_padding_icon_start),
            )
            textBoxTopPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_compact_text_box_top_padding_icon_start),
            )
        }
        .wrap(::WrapperNotificationContentCompactIconStart)
