// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.tabbaritem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarItemStyleBuilder
import com.sdds.compose.uikit.TabBarLabelPlacement
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.styles.badge.BadgeSolid
import com.sdds.plasma.giga.app.styles.badge.Negative
import com.sdds.plasma.giga.app.styles.badge.Pilled
import com.sdds.plasma.giga.app.styles.badge.S
import com.sdds.plasma.giga.app.styles.badge.Xs
import com.sdds.plasma.giga.app.styles.counter.Counter
import com.sdds.plasma.giga.app.styles.counter.Negative
import com.sdds.plasma.giga.app.styles.counter.S
import com.sdds.plasma.giga.app.styles.counter.Xs
import com.sdds.plasma.giga.app.styles.indicator.Indicator
import com.sdds.plasma.giga.app.styles.indicator.L
import com.sdds.plasma.giga.app.styles.indicator.M
import com.sdds.plasma.giga.app.styles.indicator.Negative
import com.sdds.plasma.giga.app.theme.PlasmaGigaAppTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarItemSolid : BuilderWrapper<TabBarItemStyle, TabBarItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarItemSolidView : WrapperTabBarItemSolid

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarItemSolidTerminate(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemSolid

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarItemSolidM(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemSolidView

/**
 * Обертка для вариации MLabel
 */
@JvmInline
public value class WrapperTabBarItemSolidMLabel(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemSolidView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarItemSolidL(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemSolidView

/**
 * Обертка для вариации LLabel
 */
@JvmInline
public value class WrapperTabBarItemSolidLLabel(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemSolidView

public val WrapperTabBarItemSolidView.Default: WrapperTabBarItemSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultSolidDefault,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.textInversePrimary,
                ),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.textInversePrimary,
                ),
            )
        }
        .wrap(::WrapperTabBarItemSolidTerminate)

public val WrapperTabBarItemSolidView.Accent: WrapperTabBarItemSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultTransparentAccent,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.textDefaultAccent,
                ),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.textDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTabBarItemSolidTerminate)

public val WrapperTabBarItemSolidView.Secondary: WrapperTabBarItemSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaAppTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            labelColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimary,
                ),
            )
            iconColor(
                PlasmaGigaAppTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaAppTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTabBarItemSolidTerminate)

private val TabBarItemStyleBuilder.invariantProps: TabBarItemStyleBuilder
    @Composable
    get() = this
        .labelStyle(PlasmaGigaAppTheme.typography.bodyXxsBold)

public val TabBarItemSolid.M: WrapperTabBarItemSolidM
    @Composable
    @JvmName("WrapperTabBarItemSolidM")
    get() = TabBarItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundL)
        .labelPlacement(TabBarLabelPlacement.None)
        .dimensions {
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            iconSize(24.0.dp)
            minHeight(48.0.dp)
        }
        .indicatorStyle(Indicator.M.Negative.style())
        .counterStyle(Counter.Xs.Negative.style())
        .badgeStyle(BadgeSolid.Xs.Pilled.Negative.style())
        .wrap(::WrapperTabBarItemSolidM)

public val WrapperTabBarItemSolidM.Label: WrapperTabBarItemSolidMLabel
    @Composable
    @JvmName("WrapperTabBarItemSolidMLabel")
    get() = builder
        .labelPlacement(TabBarLabelPlacement.Bottom)
        .dimensions {
            paddingTop(10.0.dp)
            paddingBottom(8.0.dp)
            labelPadding(2.0.dp)
        }
        .wrap(::WrapperTabBarItemSolidMLabel)

public val TabBarItemSolid.L: WrapperTabBarItemSolidL
    @Composable
    @JvmName("WrapperTabBarItemSolidL")
    get() = TabBarItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaAppTheme.shapes.roundL)
        .labelPlacement(TabBarLabelPlacement.None)
        .dimensions {
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconSize(36.0.dp)
            minHeight(64.0.dp)
        }
        .indicatorStyle(Indicator.L.Negative.style())
        .counterStyle(Counter.S.Negative.style())
        .badgeStyle(BadgeSolid.S.Pilled.Negative.style())
        .wrap(::WrapperTabBarItemSolidL)

public val WrapperTabBarItemSolidL.Label: WrapperTabBarItemSolidLLabel
    @Composable
    @JvmName("WrapperTabBarItemSolidLLabel")
    get() = builder
        .labelPlacement(TabBarLabelPlacement.Bottom)
        .dimensions {
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            labelPadding(0.0.dp)
        }
        .wrap(::WrapperTabBarItemSolidLLabel)
