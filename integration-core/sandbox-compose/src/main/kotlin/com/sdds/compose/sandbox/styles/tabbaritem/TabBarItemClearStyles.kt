// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.tabbaritem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.styles.counter.Counter
import com.sdds.compose.sandbox.styles.counter.Negative
import com.sdds.compose.sandbox.styles.counter.S
import com.sdds.compose.sandbox.styles.counter.Xs
import com.sdds.compose.sandbox.styles.indicator.Indicator
import com.sdds.compose.sandbox.styles.indicator.L
import com.sdds.compose.sandbox.styles.indicator.M
import com.sdds.compose.sandbox.styles.indicator.Negative
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.TabBarItemStyle
import com.sdds.compose.uikit.TabBarItemStyleBuilder
import com.sdds.compose.uikit.TabBarLabelPlacement
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarItemClear : BuilderWrapper<TabBarItemStyle, TabBarItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperTabBarItemClearView : WrapperTabBarItemClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperTabBarItemClearTerminate(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabBarItemClearM(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemClearView

/**
 * Обертка для вариации MLabel
 */
@JvmInline
public value class WrapperTabBarItemClearMLabel(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemClearView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabBarItemClearL(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemClearView

/**
 * Обертка для вариации LLabel
 */
@JvmInline
public value class WrapperTabBarItemClearLLabel(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItemClearView

public val WrapperTabBarItemClearView.Default: WrapperTabBarItemClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSandboxTheme.colors.textDefaultPrimary,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSandboxTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .wrap(::WrapperTabBarItemClearTerminate)

public val WrapperTabBarItemClearView.Accent: WrapperTabBarItemClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSandboxTheme.colors.textDefaultAccent,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSandboxTheme.colors.textDefaultAccent,
                ),
            )
        }
        .wrap(::WrapperTabBarItemClearTerminate)

public val WrapperTabBarItemClearView.Secondary: WrapperTabBarItemClearTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asStatefulValue(),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asStatefulValue(),
            )
        }
        .wrap(::WrapperTabBarItemClearTerminate)

private val TabBarItemStyleBuilder.invariantProps: TabBarItemStyleBuilder
    @Composable
    get() = this
        .labelStyle(SddsSandboxTheme.typography.bodyXxsBold)
        .colors {
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultClear.asStatefulValue(),
            )
        }

public val TabBarItemClear.M: WrapperTabBarItemClearM
    @Composable
    @JvmName("WrapperTabBarItemClearM")
    get() = TabBarItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL)
        .labelPlacement(TabBarLabelPlacement.None)
        .dimensions {
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            iconSize(24.0.dp)
            minHeight(48.0.dp)
        }
        .indicatorStyle(Indicator.M.Negative.style())
        .counterStyle(Counter.Xs.Negative.style())
        .wrap(::WrapperTabBarItemClearM)

public val WrapperTabBarItemClearM.Label: WrapperTabBarItemClearMLabel
    @Composable
    @JvmName("WrapperTabBarItemClearMLabel")
    get() = builder
        .labelPlacement(TabBarLabelPlacement.Bottom)
        .dimensions {
            paddingTop(10.0.dp)
            paddingBottom(8.0.dp)
            labelPadding(2.0.dp)
        }
        .wrap(::WrapperTabBarItemClearMLabel)

public val TabBarItemClear.L: WrapperTabBarItemClearL
    @Composable
    @JvmName("WrapperTabBarItemClearL")
    get() = TabBarItemStyle.builder(this)
        .invariantProps
        .shape(SddsSandboxTheme.shapes.roundL)
        .labelPlacement(TabBarLabelPlacement.None)
        .dimensions {
            paddingTop(14.0.dp)
            paddingBottom(14.0.dp)
            iconSize(36.0.dp)
            minHeight(64.0.dp)
        }
        .indicatorStyle(Indicator.L.Negative.style())
        .counterStyle(Counter.S.Negative.style())
        .wrap(::WrapperTabBarItemClearL)

public val WrapperTabBarItemClearL.Label: WrapperTabBarItemClearLLabel
    @Composable
    @JvmName("WrapperTabBarItemClearLLabel")
    get() = builder
        .labelPlacement(TabBarLabelPlacement.Bottom)
        .dimensions {
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
            labelPadding(0.0.dp)
        }
        .wrap(::WrapperTabBarItemClearLLabel)
