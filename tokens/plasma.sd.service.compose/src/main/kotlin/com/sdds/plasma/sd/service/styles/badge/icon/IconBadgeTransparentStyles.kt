// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
)

package com.sdds.plasma.sd.service.styles.badge.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.IconBadgeTransparent
import com.sdds.compose.uikit.iconBadgeTransparentBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех врапперов этого стиля
 */
public interface WrapperIconBadgeTransparent : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все врапперы вариаций корневого уровня
 * и врапперы их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим врапперам.
 */
public interface WrapperIconBadgeTransparentView : WrapperIconBadgeTransparent

/**
 * Терминальный враппер
 */
@JvmInline
public value class WrapperIconBadgeTransparentTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

/**
 * Враппер для вариации L
 */
@JvmInline
public value class WrapperIconBadgeTransparentL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации LPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации M
 */
@JvmInline
public value class WrapperIconBadgeTransparentM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации MPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации S
 */
@JvmInline
public value class WrapperIconBadgeTransparentS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации SPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации Xs
 */
@JvmInline
public value class WrapperIconBadgeTransparentXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Враппер для вариации XsPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

public val WrapperIconBadgeTransparentView.Default: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Accent: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentAccent.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Negative: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Positive: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Warning: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Dark: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Light: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            startContentColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this

public val IconBadgeTransparent.L: WrapperIconBadgeTransparentL
    @Composable
    @JvmName("WrapperIconBadgeTransparentL")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeTransparentL)

public val WrapperIconBadgeTransparentL.Pilled: WrapperIconBadgeTransparentLPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentLPilled)

public val IconBadgeTransparent.M: WrapperIconBadgeTransparentM
    @Composable
    @JvmName("WrapperIconBadgeTransparentM")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeTransparentM)

public val WrapperIconBadgeTransparentM.Pilled: WrapperIconBadgeTransparentMPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentMPilled)

public val IconBadgeTransparent.S: WrapperIconBadgeTransparentS
    @Composable
    @JvmName("WrapperIconBadgeTransparentS")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperIconBadgeTransparentS)

public val WrapperIconBadgeTransparentS.Pilled: WrapperIconBadgeTransparentSPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentSPilled)

public val IconBadgeTransparent.Xs: WrapperIconBadgeTransparentXs
    @Composable
    @JvmName("WrapperIconBadgeTransparentXs")
    get() = BadgeStyle.iconBadgeTransparentBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXxs)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            startPadding(3.0.dp)
            endPadding(3.0.dp)
        }
        .wrap(::WrapperIconBadgeTransparentXs)

public val WrapperIconBadgeTransparentXs.Pilled: WrapperIconBadgeTransparentXsPilled
    @Composable
    @JvmName("WrapperIconBadgeTransparentXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeTransparentXsPilled)
