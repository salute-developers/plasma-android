// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.notification

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.NotificationStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNotificationCompact :
    BuilderWrapper<NotificationStyle, NotificationStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperNotificationCompactL(
    public override val builder: NotificationStyleBuilder,
) : WrapperNotificationCompact

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperNotificationCompactM(
    public override val builder: NotificationStyleBuilder,
) : WrapperNotificationCompact

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperNotificationCompactS(
    public override val builder: NotificationStyleBuilder,
) : WrapperNotificationCompact

private val NotificationStyleBuilder.invariantProps: NotificationStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val NotificationCompact.L: WrapperNotificationCompactL
    @Composable
    @JvmName("WrapperNotificationCompactL")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(8.0.dp)
            paddingBottom(8.0.dp)
            closeSize(24.0.dp)
        }
        .wrap(::WrapperNotificationCompactL)

public val NotificationCompact.M: WrapperNotificationCompactM
    @Composable
    @JvmName("WrapperNotificationCompactM")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
            closeSize(16.0.dp)
        }
        .wrap(::WrapperNotificationCompactM)

public val NotificationCompact.S: WrapperNotificationCompactS
    @Composable
    @JvmName("WrapperNotificationCompactS")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(4.0.dp)
            closeSize(16.0.dp)
        }
        .wrap(::WrapperNotificationCompactS)
