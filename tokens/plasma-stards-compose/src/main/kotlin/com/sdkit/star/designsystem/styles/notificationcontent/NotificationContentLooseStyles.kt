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
public interface WrapperNotificationContentLoose :
    BuilderWrapper<NotificationContentStyle, NotificationContentStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperNotificationContentLooseView : WrapperNotificationContentLoose

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperNotificationContentLooseTerminate(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentLoose

/**
 * Обертка для вариации NoIcon
 */
@JvmInline
public value class WrapperNotificationContentLooseNoIcon(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentLooseView

/**
 * Обертка для вариации IconTop
 */
@JvmInline
public value class WrapperNotificationContentLooseIconTop(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentLooseView

/**
 * Обертка для вариации IconStart
 */
@JvmInline
public value class WrapperNotificationContentLooseIconStart(
    public override val builder: NotificationContentStyleBuilder,
) : WrapperNotificationContentLooseView

public val WrapperNotificationContentLooseView.Default: WrapperNotificationContentLooseTerminate
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
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Positive: WrapperNotificationContentLooseTerminate
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
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Negative: WrapperNotificationContentLooseTerminate
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
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Warning: WrapperNotificationContentLooseTerminate
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
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Info: WrapperNotificationContentLooseTerminate
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
        .wrap(::WrapperNotificationContentLooseTerminate)

private val NotificationContentStyleBuilder.invariantProps: NotificationContentStyleBuilder
    @Composable
    get() = this
        .buttonLayout(NotificationContentButtonLayout.Normal)
        .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
        .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
        .titleStyle(StarDsTheme.typography.bodySBold)
        .textStyle(StarDsTheme.typography.textSNormal)
        .dimensions {
            iconSize(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_icon_size))
            textPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_text_padding))
            contentTopPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_content_top_padding))
            textBoxStartPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_text_box_start_padding))
            textBoxTopPadding(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_text_box_top_padding))
            textBoxBottomPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_text_box_bottom_padding),
            )
            buttonGroupTopPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_button_group_top_padding),
            )
        }

public val NotificationContentLoose.NoIcon: WrapperNotificationContentLooseNoIcon
    @Composable
    @JvmName("WrapperNotificationContentLooseNoIcon")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.None)
        .wrap(::WrapperNotificationContentLooseNoIcon)

public val NotificationContentLoose.IconTop: WrapperNotificationContentLooseIconTop
    @Composable
    @JvmName("WrapperNotificationContentLooseIconTop")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.Top)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_icon_margin_icon_top))
        }
        .wrap(::WrapperNotificationContentLooseIconTop)

public val NotificationContentLoose.IconStart: WrapperNotificationContentLooseIconStart
    @Composable
    @JvmName("WrapperNotificationContentLooseIconStart")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_icon_margin_icon_start))
            buttonGroupStartPadding(
                dimensionResource(R.dimen.sdkit_cmp_notification_content_loose_button_group_start_padding_icon_start),
            )
        }
        .wrap(::WrapperNotificationContentLooseIconStart)
