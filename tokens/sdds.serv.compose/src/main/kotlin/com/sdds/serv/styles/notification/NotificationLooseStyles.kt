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
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.notificationcontent.Default
import com.sdds.serv.styles.notificationcontent.NoButtonStretch
import com.sdds.serv.styles.notificationcontent.NotificationContent
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperNotificationLoose :
    BuilderWrapper<NotificationStyle, NotificationStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperNotificationLooseL(
    public override val builder: NotificationStyleBuilder,
) : WrapperNotificationLoose

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperNotificationLooseM(
    public override val builder: NotificationStyleBuilder,
) : WrapperNotificationLoose

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperNotificationLooseS(
    public override val builder: NotificationStyleBuilder,
) : WrapperNotificationLoose

private val NotificationStyleBuilder.invariantProps: NotificationStyleBuilder
    @Composable
    get() = this
        .notificationContentStyle(NotificationContent.NoButtonStretch.Default.style())
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val NotificationLoose.L: WrapperNotificationLooseL
    @Composable
    @JvmName("WrapperNotificationLooseL")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .dimensions {
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            paddingTop(16.0.dp)
            paddingBottom(16.0.dp)
            closeSize(24.0.dp)
        }
        .wrap(::WrapperNotificationLooseL)

public val NotificationLoose.M: WrapperNotificationLooseM
    @Composable
    @JvmName("WrapperNotificationLooseM")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            closeSize(16.0.dp)
        }
        .wrap(::WrapperNotificationLooseM)

public val NotificationLoose.S: WrapperNotificationLooseS
    @Composable
    @JvmName("WrapperNotificationLooseS")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            closeSize(16.0.dp)
        }
        .wrap(::WrapperNotificationLooseS)
