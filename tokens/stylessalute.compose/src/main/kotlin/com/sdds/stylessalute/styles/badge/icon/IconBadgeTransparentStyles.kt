// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.badge.icon

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
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconBadgeTransparent : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconBadgeTransparentView : WrapperIconBadgeTransparent

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconBadgeTransparentTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparent

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconBadgeTransparentL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconBadgeTransparentM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconBadgeTransparentS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperIconBadgeTransparentSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconBadgeTransparentXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeTransparentView

/**
 * Обертка для вариации XsPilled
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
                StylesSaluteTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Accent: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentAccentMain.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Negative: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentNegative.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Positive: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentPositive.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Warning: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultTransparentWarning.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Dark: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnLightTransparentDeep.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeTransparentTerminate)

public val WrapperIconBadgeTransparentView.Light: WrapperIconBadgeTransparentTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceOnDarkTransparentSecondary.asInteractive(),
            )
            startContentColor(
                StylesSaluteTheme.colors.textOnDarkPrimary.asInteractive(),
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
        .shape(StylesSaluteTheme.shapes.roundS)
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
        .shape(StylesSaluteTheme.shapes.roundXs)
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
        .shape(StylesSaluteTheme.shapes.roundXs)
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
        .shape(StylesSaluteTheme.shapes.roundXxs)
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
