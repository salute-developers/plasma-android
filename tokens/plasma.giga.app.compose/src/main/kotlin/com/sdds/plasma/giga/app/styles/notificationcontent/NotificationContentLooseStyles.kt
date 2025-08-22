// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.notificationcontent

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.NotificationContentButtonLayout
import com.sdds.compose.uikit.NotificationContentIconPlacement
import com.sdds.compose.uikit.NotificationContentStyle
import com.sdds.compose.uikit.NotificationContentStyleBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.giga.app.styles.buttongroup.Default
import com.sdds.plasma.giga.app.styles.buttongroup.Dense
import com.sdds.plasma.giga.app.styles.buttongroup.Xxs
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
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
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Positive: WrapperNotificationContentLooseTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaGigaAppTheme.colors.textDefaultPositive.asInteractive(),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Negative: WrapperNotificationContentLooseTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Warning: WrapperNotificationContentLooseTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaGigaAppTheme.colors.textDefaultWarning.asInteractive(),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentLooseTerminate)

public val WrapperNotificationContentLooseView.Info: WrapperNotificationContentLooseTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                PlasmaGigaAppTheme.colors.textDefaultInfo.asInteractive(),
            )
            textColor(
                PlasmaGigaAppTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentLooseTerminate)

private val NotificationContentStyleBuilder.invariantProps: NotificationContentStyleBuilder
    @Composable
    get() = this
        .buttonLayout(NotificationContentButtonLayout.Normal)
        .buttonGroupStyle(BasicButtonGroup.Xxs.Dense.Default.style())
        .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
        .titleStyle(PlasmaGigaAppTheme.typography.bodySBold)
        .textStyle(PlasmaGigaAppTheme.typography.textSNormal)
        .dimensions {
            iconSize(24.0.dp)
            textPadding(4.0.dp)
            contentTopPadding(4.0.dp)
            textBoxStartPadding(2.0.dp)
            textBoxTopPadding(3.0.dp)
            textBoxBottomPadding(6.0.dp)
            buttonGroupTopPadding(6.0.dp)
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
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperNotificationContentLooseIconTop)

public val NotificationContentLoose.IconStart: WrapperNotificationContentLooseIconStart
    @Composable
    @JvmName("WrapperNotificationContentLooseIconStart")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(6.0.dp)
            buttonGroupStartPadding(32.0.dp)
        }
        .wrap(::WrapperNotificationContentLooseIconStart)
