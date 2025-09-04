// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.notificationcontent

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
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.Xxs
import com.sdds.serv.theme.SddsServTheme
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
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Positive: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Negative: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Warning: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

public val WrapperNotificationContentView.Info: WrapperNotificationContentTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentTerminate)

private val NotificationContentStyleBuilder.invariantProps: NotificationContentStyleBuilder
    @Composable
    get() = this
        .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
        .titleStyle(SddsServTheme.typography.bodySBold)
        .textStyle(SddsServTheme.typography.textSNormal)
        .dimensions {
            iconSize(24.0.dp)
            textPadding(4.0.dp)
            textBoxBottomPadding(6.0.dp)
            buttonGroupTopPadding(6.0.dp)
        }

public val NotificationContent.ButtonStretch: WrapperNotificationContentButtonStretch
    @Composable
    @JvmName("WrapperNotificationContentButtonStretch")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .buttonLayout(NotificationContentButtonLayout.Stretch)
        .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
        .dimensions {
            contentStartPadding(4.0.dp)
            contentTopPadding(2.0.dp)
        }
        .wrap(::WrapperNotificationContentButtonStretch)

public val WrapperNotificationContentButtonStretch.IconTop:
    WrapperNotificationContentButtonStretchIconTop
    @Composable
    @JvmName("WrapperNotificationContentButtonStretchIconTop")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Top)
        .dimensions {
            iconMargin(8.0.dp)
            contentEndPadding(6.0.dp)
            textBoxStartPadding(2.0.dp)
        }
        .wrap(::WrapperNotificationContentButtonStretchIconTop)

public val WrapperNotificationContentButtonStretch.IconStart:
    WrapperNotificationContentButtonStretchIconStart
    @Composable
    @JvmName("WrapperNotificationContentButtonStretchIconStart")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(6.0.dp)
            textBoxStartPadding(2.0.dp)
            textBoxTopPadding(3.0.dp)
        }
        .wrap(::WrapperNotificationContentButtonStretchIconStart)

public val NotificationContent.NoButtonStretch: WrapperNotificationContentNoButtonStretch
    @Composable
    @JvmName("WrapperNotificationContentNoButtonStretch")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .buttonLayout(NotificationContentButtonLayout.Normal)
        .buttonGroupStyle(BasicButtonGroup.Xxs.Dense.Default.style())
        .dimensions {
            contentTopPadding(4.0.dp)
            textBoxStartPadding(2.0.dp)
            textBoxTopPadding(3.0.dp)
        }
        .wrap(::WrapperNotificationContentNoButtonStretch)

public val WrapperNotificationContentNoButtonStretch.IconTop:
    WrapperNotificationContentNoButtonStretchIconTop
    @Composable
    @JvmName("WrapperNotificationContentNoButtonStretchIconTop")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Top)
        .dimensions {
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperNotificationContentNoButtonStretchIconTop)

public val WrapperNotificationContentNoButtonStretch.IconStart:
    WrapperNotificationContentNoButtonStretchIconStart
    @Composable
    @JvmName("WrapperNotificationContentNoButtonStretchIconStart")
    get() = builder
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(6.0.dp)
            buttonGroupStartPadding(32.0.dp)
        }
        .wrap(::WrapperNotificationContentNoButtonStretchIconStart)
