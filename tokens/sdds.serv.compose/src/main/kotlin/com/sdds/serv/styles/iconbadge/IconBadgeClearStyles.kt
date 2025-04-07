// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.iconbadge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.IconBadgeStyleBuilder
import com.sdds.compose.uikit.iconBadgeBuilder
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
public interface WrapperIconBadgeClear : BuilderWrapper<BadgeStyle, IconBadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconBadgeClearView : WrapperIconBadgeClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconBadgeClearTerminate(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClear

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconBadgeClearL(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperIconBadgeClearLPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconBadgeClearM(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperIconBadgeClearMPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconBadgeClearS(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperIconBadgeClearSPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconBadgeClearXs(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperIconBadgeClearXsPilled(
    public override val builder: IconBadgeStyleBuilder,
) : WrapperIconBadgeClearView

public val WrapperIconBadgeClearView.Default: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

public val WrapperIconBadgeClearView.Accent: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

public val WrapperIconBadgeClearView.Negative: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

public val WrapperIconBadgeClearView.Positive: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

public val WrapperIconBadgeClearView.Warning: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

public val WrapperIconBadgeClearView.Dark: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

public val WrapperIconBadgeClearView.Light: WrapperIconBadgeClearTerminate
    @Composable
    get() = builder
        .colors {
            startContentColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperIconBadgeClearTerminate)

private val IconBadgeStyleBuilder.invariantProps: IconBadgeStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }

public val IconBadgeClear.L: WrapperIconBadgeClearL
    @Composable
    @JvmName("WrapperIconBadgeClearL")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeClearL)

public val WrapperIconBadgeClearL.Pilled: WrapperIconBadgeClearLPilled
    @Composable
    @JvmName("WrapperIconBadgeClearLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearLPilled)

public val IconBadgeClear.M: WrapperIconBadgeClearM
    @Composable
    @JvmName("WrapperIconBadgeClearM")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            startPadding(6.0.dp)
            endPadding(6.0.dp)
        }
        .wrap(::WrapperIconBadgeClearM)

public val WrapperIconBadgeClearM.Pilled: WrapperIconBadgeClearMPilled
    @Composable
    @JvmName("WrapperIconBadgeClearMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearMPilled)

public val IconBadgeClear.S: WrapperIconBadgeClearS
    @Composable
    @JvmName("WrapperIconBadgeClearS")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperIconBadgeClearS)

public val WrapperIconBadgeClearS.Pilled: WrapperIconBadgeClearSPilled
    @Composable
    @JvmName("WrapperIconBadgeClearSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearSPilled)

public val IconBadgeClear.Xs: WrapperIconBadgeClearXs
    @Composable
    @JvmName("WrapperIconBadgeClearXs")
    get() = BadgeStyle.iconBadgeBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundXxs)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            startPadding(3.0.dp)
            endPadding(3.0.dp)
        }
        .wrap(::WrapperIconBadgeClearXs)

public val WrapperIconBadgeClearXs.Pilled: WrapperIconBadgeClearXsPilled
    @Composable
    @JvmName("WrapperIconBadgeClearXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconBadgeClearXsPilled)
