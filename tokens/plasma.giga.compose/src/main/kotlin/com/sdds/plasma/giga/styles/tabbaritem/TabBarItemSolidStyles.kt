// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.tabbaritem

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
import com.sdds.plasma.giga.styles.counter.Counter
import com.sdds.plasma.giga.styles.counter.Negative
import com.sdds.plasma.giga.styles.counter.S
import com.sdds.plasma.giga.styles.counter.Xs
import com.sdds.plasma.giga.styles.indicator.Indicator
import com.sdds.plasma.giga.styles.indicator.L
import com.sdds.plasma.giga.styles.indicator.M
import com.sdds.plasma.giga.styles.indicator.Negative
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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
                PlasmaGigaTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefault,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textInversePrimary,
                ),
            )
        }
        .wrap(::WrapperTabBarItemSolidTerminate)

public val WrapperTabBarItemSolidView.Accent: WrapperTabBarItemSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentAccent,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultAccent,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTabBarItemSolidTerminate)

public val WrapperTabBarItemSolidView.Secondary: WrapperTabBarItemSolidTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaGigaTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTabBarItemSolidTerminate)

private val TabBarItemStyleBuilder.invariantProps: TabBarItemStyleBuilder
    @Composable
    get() = this
        .labelStyle(PlasmaGigaTheme.typography.bodyXxsBold)

public val TabBarItemSolid.M: WrapperTabBarItemSolidM
    @Composable
    @JvmName("WrapperTabBarItemSolidM")
    get() = TabBarItemStyle.builder(this)
        .invariantProps
        .shape(PlasmaGigaTheme.shapes.roundL)
        .labelPlacement(TabBarLabelPlacement.None)
        .dimensions {
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            iconSize(24.0.dp)
            minHeight(48.0.dp)
        }
        .indicatorStyle(Indicator.M.Negative.style())
        .counterStyle(Counter.Xs.Negative.style())
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
        .shape(PlasmaGigaTheme.shapes.roundL)
        .labelPlacement(TabBarLabelPlacement.None)
        .dimensions {
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconSize(36.0.dp)
            minHeight(64.0.dp)
        }
        .indicatorStyle(Indicator.L.Negative.style())
        .counterStyle(Counter.S.Negative.style())
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
