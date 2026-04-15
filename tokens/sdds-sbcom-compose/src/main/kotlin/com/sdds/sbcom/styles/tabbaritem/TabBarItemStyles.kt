// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.tabbaritem

import androidx.compose.foundation.shape.CircleShape
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
import com.sdds.sbcom.styles.counter.Default
import com.sdds.sbcom.styles.counter.TabBarCounter
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.StateDanger
import com.sdds.sbcom.theme.SddsSbComTheme
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
        .shape(CircleShape)
        .labelPlacement(TabBarLabelPlacement.Bottom)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentAccent,
                ),
            )
            labelColor(
                SddsSbComTheme.colors.textDefaultPrimary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
            iconColor(
                SddsSbComTheme.colors.textDefaultPrimary.asStatefulValue(
                    setOf(InteractiveState.Selected)
                        to SddsSbComTheme.colors.textDefaultAccent,
                ),
            )
        }
        .dimensions {
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            paddingTop(4.0.dp)
            paddingBottom(5.0.dp)
            iconSize(24.0.dp)
            minHeight(48.0.dp)
        }
        .indicatorStyle(Indicator.StateDanger.style())
        .counterStyle(TabBarCounter.Default.style())
        .wrap(::WrapperTabBarItemDefault)
