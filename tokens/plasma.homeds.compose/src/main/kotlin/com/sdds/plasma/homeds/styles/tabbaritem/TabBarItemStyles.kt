// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.tabbaritem

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
import com.sdds.plasma.homeds.styles.counter.Counter
import com.sdds.plasma.homeds.styles.counter.Negative
import com.sdds.plasma.homeds.styles.counter.Xs
import com.sdds.plasma.homeds.styles.indicator.Indicator
import com.sdds.plasma.homeds.styles.indicator.M
import com.sdds.plasma.homeds.styles.indicator.Negative
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabBarItem : BuilderWrapper<TabBarItemStyle, TabBarItemStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperTabBarItemDefault(
    public override val builder: TabBarItemStyleBuilder,
) : WrapperTabBarItem

public val TabBarItem.Default: WrapperTabBarItemDefault
    @Composable
    @JvmName("WrapperTabBarItemDefault")
    get() = TabBarItemStyle.builder(this)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXxsBold)
        .labelPlacement(TabBarLabelPlacement.Bottom)
        .colors {
            backgroundColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultClear.asStatefulValue(),
            )
            labelColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaHomeDsTheme.colors.textDefaultPrimary,
                ),
            )
            iconColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to PlasmaHomeDsTheme.colors.textDefaultPrimary,
                ),
            )
        }
        .dimensions {
            paddingTop(11.0.dp)
            paddingBottom(11.0.dp)
            labelPadding(2.0.dp)
            iconSize(24.0.dp)
            minHeight(60.0.dp)
        }
        .indicatorStyle(Indicator.M.Negative.style())
        .counterStyle(Counter.Xs.Negative.style())
        .wrap(::WrapperTabBarItemDefault)
