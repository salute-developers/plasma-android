// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.badge

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BadgeStyle
import com.sdds.compose.uikit.BadgeStyleBuilder
import com.sdds.compose.uikit.badgeBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBadgeSolid : BuilderWrapper<BadgeStyle, BadgeStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBadgeSolidView : WrapperBadgeSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperBadgeSolidTerminate(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolid

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperBadgeSolidL(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperBadgeSolidLPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperBadgeSolidM(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperBadgeSolidMPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperBadgeSolidS(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperBadgeSolidSPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperBadgeSolidXs(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperBadgeSolidXsPilled(
    public override val builder: BadgeStyleBuilder,
) : WrapperBadgeSolidView

public val WrapperBadgeSolidView.Default: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Accent: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultAccent.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textInversePrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Negative: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultNegative.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Positive: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultPositive.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Warning: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultWarning.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Dark: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceOnLightSolidDefault.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textOnDarkPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

public val WrapperBadgeSolidView.Light: WrapperBadgeSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceOnDarkSolidDefault.asInteractive(),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textOnLightPrimary.asInteractive(),
            )
            startContentColor(
                PlasmaGigaAppTheme.colors.textOnLightPrimary.asInteractive(),
            )
            endContentColor(
                PlasmaGigaAppTheme.colors.textOnLightPrimary.asInteractive(),
            )
        }
        .wrap(::WrapperBadgeSolidTerminate)

private val BadgeStyleBuilder.invariantProps: BadgeStyleBuilder
    @Composable
    get() = this

public val BadgeSolid.L: WrapperBadgeSolidL
    @Composable
    @JvmName("WrapperBadgeSolidL")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundS)
        .labelStyle(PlasmaGigaAppTheme.typography.bodySNormal)
        .dimensions {
            height(28.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            startContentMargin(4.0.dp)
            endContentMargin(4.0.dp)
            startPadding(11.0.dp)
            endPadding(11.0.dp)
        }
        .wrap(::WrapperBadgeSolidL)

public val WrapperBadgeSolidL.Pilled: WrapperBadgeSolidLPilled
    @Composable
    @JvmName("WrapperBadgeSolidLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidLPilled)

public val BadgeSolid.M: WrapperBadgeSolidM
    @Composable
    @JvmName("WrapperBadgeSolidM")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundXs)
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXsNormal)
        .dimensions {
            height(24.0.dp)
            startContentSize(12.0.dp)
            endContentSize(12.0.dp)
            startContentMargin(3.0.dp)
            endContentMargin(3.0.dp)
            startPadding(9.0.dp)
            endPadding(9.0.dp)
        }
        .wrap(::WrapperBadgeSolidM)

public val WrapperBadgeSolidM.Pilled: WrapperBadgeSolidMPilled
    @Composable
    @JvmName("WrapperBadgeSolidMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidMPilled)

public val BadgeSolid.S: WrapperBadgeSolidS
    @Composable
    @JvmName("WrapperBadgeSolidS")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundXs)
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXxsNormal)
        .dimensions {
            height(20.0.dp)
            startContentSize(12.0.dp)
            endContentSize(12.0.dp)
            startContentMargin(2.0.dp)
            endContentMargin(2.0.dp)
            startPadding(7.0.dp)
            endPadding(7.0.dp)
        }
        .wrap(::WrapperBadgeSolidS)

public val WrapperBadgeSolidS.Pilled: WrapperBadgeSolidSPilled
    @Composable
    @JvmName("WrapperBadgeSolidSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidSPilled)

public val BadgeSolid.Xs: WrapperBadgeSolidXs
    @Composable
    @JvmName("WrapperBadgeSolidXs")
    get() = BadgeStyle.badgeBuilder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundXxs)
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXxsNormal)
        .dimensions {
            height(16.0.dp)
            startContentSize(10.0.dp)
            endContentSize(10.0.dp)
            startContentMargin(2.0.dp)
            endContentMargin(2.0.dp)
            startPadding(4.0.dp)
            endPadding(4.0.dp)
        }
        .wrap(::WrapperBadgeSolidXs)

public val WrapperBadgeSolidXs.Pilled: WrapperBadgeSolidXsPilled
    @Composable
    @JvmName("WrapperBadgeSolidXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperBadgeSolidXsPilled)
