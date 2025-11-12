// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.icontabitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.counter.Counter
import com.sdds.serv.styles.counter.Negative
import com.sdds.serv.styles.counter.Xs
import com.sdds.serv.styles.counter.Xxs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconTabItem : BuilderWrapper<TabItemStyle, TabItemStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconTabItemL(
    public override val builder: TabItemStyleBuilder,
) : WrapperIconTabItem

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconTabItemM(
    public override val builder: TabItemStyleBuilder,
) : WrapperIconTabItem

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconTabItemS(
    public override val builder: TabItemStyleBuilder,
) : WrapperIconTabItem

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconTabItemXs(
    public override val builder: TabItemStyleBuilder,
) : WrapperIconTabItem

private val TabItemStyleBuilder.invariantProps: TabItemStyleBuilder
    @Composable
    get() = this
        .colors {
            startContentColor(
                SddsServTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textDefaultPrimary,
                ),
            )
            endContentColor(
                SddsServTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textDefaultPrimary,
                ),
            )
            actionColor(
                SddsServTheme.colors.textDefaultSecondary.asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                ),
            )
        }
        .dimensions {
            counterPadding(0.0.dp)
        }
        .disableAlpha(0.4f)

public val IconTabItem.L: WrapperIconTabItemL
    @Composable
    @JvmName("WrapperIconTabItemL")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .dimensions {
            minHeight(56.0.dp)
            paddingStart(18.0.dp)
            paddingEnd(18.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            actionPadding(10.0.dp)
            counterOffsetX(8.0.dp)
            counterOffsetY(8.0.dp)
        }
        .counterStyle(Counter.Xs.Negative.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
        .wrap(::WrapperIconTabItemL)

public val IconTabItem.M: WrapperIconTabItemM
    @Composable
    @JvmName("WrapperIconTabItemM")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .dimensions {
            minHeight(48.0.dp)
            paddingStart(14.0.dp)
            paddingEnd(14.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            counterPadding(6.0.dp)
            actionPadding(8.0.dp)
            counterOffsetX(8.0.dp)
            counterOffsetY(8.0.dp)
        }
        .counterStyle(Counter.Xs.Negative.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
        .wrap(::WrapperIconTabItemM)

public val IconTabItem.S: WrapperIconTabItemS
    @Composable
    @JvmName("WrapperIconTabItemS")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .dimensions {
            minHeight(40.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            counterPadding(4.0.dp)
            actionPadding(6.0.dp)
            counterOffsetX(6.0.dp)
            counterOffsetY(6.0.dp)
        }
        .counterStyle(Counter.Xxs.Negative.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
        .wrap(::WrapperIconTabItemS)

public val IconTabItem.Xs: WrapperIconTabItemXs
    @Composable
    @JvmName("WrapperIconTabItemXs")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .dimensions {
            minHeight(32.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            counterPadding(4.0.dp)
            actionPadding(4.0.dp)
            counterOffsetX(6.0.dp)
            counterOffsetY(6.0.dp)
        }
        .counterStyle(Counter.Xxs.Negative.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_16)
        .wrap(::WrapperIconTabItemXs)
