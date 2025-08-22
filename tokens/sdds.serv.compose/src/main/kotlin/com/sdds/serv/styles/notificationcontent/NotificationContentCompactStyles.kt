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
import com.sdds.serv.theme.SddsServTheme
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
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            textColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Positive:
    WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Negative:
    WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Warning: WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

public val WrapperNotificationContentCompactView.Info: WrapperNotificationContentCompactTerminate
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
        .wrap(::WrapperNotificationContentCompactTerminate)

private val NotificationContentStyleBuilder.invariantProps: NotificationContentStyleBuilder
    @Composable
    get() = this
        .buttonLayout(NotificationContentButtonLayout.Stretch)
        .buttonGroupStyle(BasicButtonGroup.Xs.Dense.Default.style())
        .icon(com.sdds.icons.R.drawable.ic_info_circle_outline_24)
        .titleStyle(SddsServTheme.typography.bodySBold)
        .textStyle(SddsServTheme.typography.textSNormal)
        .dimensions {
            iconSize(24.0.dp)
            textPadding(4.0.dp)
            contentStartPadding(4.0.dp)
            contentTopPadding(2.0.dp)
            textBoxBottomPadding(6.0.dp)
            buttonGroupTopPadding(6.0.dp)
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
            iconMargin(8.0.dp)
            contentEndPadding(6.0.dp)
            textBoxStartPadding(2.0.dp)
        }
        .wrap(::WrapperNotificationContentCompactIconTop)

public val NotificationContentCompact.IconStart: WrapperNotificationContentCompactIconStart
    @Composable
    @JvmName("WrapperNotificationContentCompactIconStart")
    get() = NotificationContentStyle.builder(this)
        .invariantProps
        .iconPlacement(NotificationContentIconPlacement.Start)
        .dimensions {
            iconMargin(6.0.dp)
            textBoxStartPadding(2.0.dp)
            textBoxTopPadding(3.0.dp)
        }
        .wrap(::WrapperNotificationContentCompactIconStart)
