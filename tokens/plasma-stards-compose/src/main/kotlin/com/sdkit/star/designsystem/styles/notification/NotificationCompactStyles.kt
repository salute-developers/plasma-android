// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.notification

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.NotificationStyle
import com.sdds.compose.uikit.NotificationStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.notificationcontent.ButtonStretch
import com.sdkit.star.designsystem.styles.notificationcontent.Default
import com.sdkit.star.designsystem.styles.notificationcontent.NotificationContent
import com.sdkit.star.designsystem.theme.StarDsTheme
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
        .notificationContentStyle(NotificationContent.ButtonStretch.Default.style())
        .colors {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            closeColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val NotificationCompact.L: WrapperNotificationCompactL
    @Composable
    @JvmName("WrapperNotificationCompactL")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_end_l))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_top_l))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_bottom_l))
            closeSize(dimensionResource(R.dimen.sdkit_cmp_notification_compact_close_size_l))
        }
        .wrap(::WrapperNotificationCompactL)

public val NotificationCompact.M: WrapperNotificationCompactM
    @Composable
    @JvmName("WrapperNotificationCompactM")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_notification_compact_shapeAdjustment_m),
            ),
        )
        .dimensions {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_end_m))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_top_m))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_bottom_m))
            closeSize(dimensionResource(R.dimen.sdkit_cmp_notification_compact_close_size_m))
        }
        .wrap(::WrapperNotificationCompactM)

public val NotificationCompact.S: WrapperNotificationCompactS
    @Composable
    @JvmName("WrapperNotificationCompactS")
    get() = NotificationStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_end_s))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_top_s))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_notification_compact_padding_bottom_s))
            closeSize(dimensionResource(R.dimen.sdkit_cmp_notification_compact_close_size_s))
        }
        .wrap(::WrapperNotificationCompactS)
