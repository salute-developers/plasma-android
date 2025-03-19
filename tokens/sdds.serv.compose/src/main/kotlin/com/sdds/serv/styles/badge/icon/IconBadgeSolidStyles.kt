// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.badge.icon

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeSolidBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconBadgeSolid : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconBadgeSolidView : WrapperIconBadgeSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconBadgeSolidTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconBadgeSolidL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconBadgeSolidM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconBadgeSolidS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconBadgeSolidXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperIconBadgeSolidXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeSolidView

public val WrapperIconBadgeSolidView.Default: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Accent: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Negative: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Positive: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Warning: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Dark: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

public val WrapperIconBadgeSolidView.Light: WrapperIconBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            startContentColor(
                SddsServTheme.colors.textOnLightPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeSolidTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this

public val IconBadgeSolid.L: WrapperIconBadgeSolidL
    @Composable
    @JvmName("WrapperIconBadgeSolidL")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidL)

public val WrapperIconBadgeSolidL.Pilled: WrapperIconBadgeSolidLPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidLPilled)

public val IconBadgeSolid.M: WrapperIconBadgeSolidM
    @Composable
    @JvmName("WrapperIconBadgeSolidM")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidM)

public val WrapperIconBadgeSolidM.Pilled: WrapperIconBadgeSolidMPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidMPilled)

public val IconBadgeSolid.S: WrapperIconBadgeSolidS
    @Composable
    @JvmName("WrapperIconBadgeSolidS")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidS)

public val WrapperIconBadgeSolidS.Pilled: WrapperIconBadgeSolidSPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidSPilled)

public val IconBadgeSolid.Xs: WrapperIconBadgeSolidXs
    @Composable
    @JvmName("WrapperIconBadgeSolidXs")
    get() = BadgeStyle.iconBadgeSolidBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXxs)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            startPadding(3.0.dp)
            endPadding(3.0.dp)
        }
        .wrap(::WrapperIconBadgeSolidXs)

public val WrapperIconBadgeSolidXs.Pilled: WrapperIconBadgeSolidXsPilled
    @Composable
    @JvmName("WrapperIconBadgeSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeSolidXsPilled)
