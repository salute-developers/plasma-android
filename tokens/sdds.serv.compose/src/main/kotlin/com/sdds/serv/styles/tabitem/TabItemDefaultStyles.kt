// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.tabitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.counter.Accent
import com.sdds.serv.styles.counter.Counter
import com.sdds.serv.styles.counter.S
import com.sdds.serv.styles.counter.Xs
import com.sdds.serv.styles.counter.Xxs
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabItemDefault : BuilderWrapper<TabItemStyle, TabItemStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperTabItemDefaultL(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации LHorizontal
 */
@JvmInline
public value class WrapperTabItemDefaultLHorizontal(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации LVertical
 */
@JvmInline
public value class WrapperTabItemDefaultLVertical(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTabItemDefaultM(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации MHorizontal
 */
@JvmInline
public value class WrapperTabItemDefaultMHorizontal(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации MVertical
 */
@JvmInline
public value class WrapperTabItemDefaultMVertical(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTabItemDefaultS(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации SHorizontal
 */
@JvmInline
public value class WrapperTabItemDefaultSHorizontal(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации SVertical
 */
@JvmInline
public value class WrapperTabItemDefaultSVertical(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperTabItemDefaultXs(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации XsHorizontal
 */
@JvmInline
public value class WrapperTabItemDefaultXsHorizontal(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

/**
 * Обертка для вариации XsVertical
 */
@JvmInline
public value class WrapperTabItemDefaultXsVertical(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemDefault

private val TabItemStyleBuilder.invariantProps: TabItemStyleBuilder
    @Composable
    get() = this
        .colors {
            labelColor(
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
            valueColor(
                SddsServTheme.colors.textDefaultTertiary.asStatefulValue(
                    setOf(InteractiveState.Selected, InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(
                        InteractiveState.Selected,
                        InteractiveState.Hovered,
                    )
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultTertiaryHover,
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultTertiaryActive,
                    setOf(InteractiveState.Selected)
                        to SddsServTheme.colors.textDefaultSecondary,
                ),
            )
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
        .disableAlpha(0.4f)

public val TabItemDefault.L: WrapperTabItemDefaultL
    @Composable
    @JvmName("WrapperTabItemDefaultL")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .valueStyle(SddsServTheme.typography.bodyLBold)
        .dimensions {
            minHeight(56.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            counterPadding(8.0.dp)
            valuePadding(8.0.dp)
            actionPadding(10.0.dp)
        }
        .counterStyle(Counter.S.Accent.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
        .wrap(::WrapperTabItemDefaultL)

public val WrapperTabItemDefaultL.Horizontal: WrapperTabItemDefaultLHorizontal
    @Composable
    @JvmName("WrapperTabItemDefaultLHorizontal")
    get() = builder
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperTabItemDefaultLHorizontal)

public val WrapperTabItemDefaultL.Vertical: WrapperTabItemDefaultLVertical
    @Composable
    @JvmName("WrapperTabItemDefaultLVertical")
    get() = builder
        .dimensions {
            paddingStart(22.0.dp)
            paddingEnd(14.0.dp)
        }
        .wrap(::WrapperTabItemDefaultLVertical)

public val TabItemDefault.M: WrapperTabItemDefaultM
    @Composable
    @JvmName("WrapperTabItemDefaultM")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyMBold)
        .valueStyle(SddsServTheme.typography.bodyMBold)
        .dimensions {
            minHeight(48.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            iconPadding(6.0.dp)
            counterPadding(6.0.dp)
            valuePadding(6.0.dp)
            actionPadding(8.0.dp)
        }
        .counterStyle(Counter.Xs.Accent.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
        .wrap(::WrapperTabItemDefaultM)

public val WrapperTabItemDefaultM.Horizontal: WrapperTabItemDefaultMHorizontal
    @Composable
    @JvmName("WrapperTabItemDefaultMHorizontal")
    get() = builder
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperTabItemDefaultMHorizontal)

public val WrapperTabItemDefaultM.Vertical: WrapperTabItemDefaultMVertical
    @Composable
    @JvmName("WrapperTabItemDefaultMVertical")
    get() = builder
        .dimensions {
            paddingStart(18.0.dp)
            paddingEnd(12.0.dp)
        }
        .wrap(::WrapperTabItemDefaultMVertical)

public val TabItemDefault.S: WrapperTabItemDefaultS
    @Composable
    @JvmName("WrapperTabItemDefaultS")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodySBold)
        .valueStyle(SddsServTheme.typography.bodySBold)
        .dimensions {
            minHeight(40.0.dp)
            startContentSize(24.0.dp)
            endContentSize(24.0.dp)
            iconPadding(4.0.dp)
            counterPadding(4.0.dp)
            valuePadding(4.0.dp)
            actionPadding(6.0.dp)
        }
        .counterStyle(Counter.Xs.Accent.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_24)
        .wrap(::WrapperTabItemDefaultS)

public val WrapperTabItemDefaultS.Horizontal: WrapperTabItemDefaultSHorizontal
    @Composable
    @JvmName("WrapperTabItemDefaultSHorizontal")
    get() = builder
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperTabItemDefaultSHorizontal)

public val WrapperTabItemDefaultS.Vertical: WrapperTabItemDefaultSVertical
    @Composable
    @JvmName("WrapperTabItemDefaultSVertical")
    get() = builder
        .dimensions {
            paddingStart(14.0.dp)
            paddingEnd(8.0.dp)
        }
        .wrap(::WrapperTabItemDefaultSVertical)

public val TabItemDefault.Xs: WrapperTabItemDefaultXs
    @Composable
    @JvmName("WrapperTabItemDefaultXs")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyXsBold)
        .valueStyle(SddsServTheme.typography.bodyXsBold)
        .dimensions {
            minHeight(32.0.dp)
            startContentSize(16.0.dp)
            endContentSize(16.0.dp)
            iconPadding(4.0.dp)
            counterPadding(4.0.dp)
            valuePadding(4.0.dp)
            actionPadding(4.0.dp)
        }
        .counterStyle(Counter.Xxs.Accent.style())
        .actionIcon(com.sdds.icons.R.drawable.ic_close_16)
        .wrap(::WrapperTabItemDefaultXs)

public val WrapperTabItemDefaultXs.Horizontal: WrapperTabItemDefaultXsHorizontal
    @Composable
    @JvmName("WrapperTabItemDefaultXsHorizontal")
    get() = builder
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .wrap(::WrapperTabItemDefaultXsHorizontal)

public val WrapperTabItemDefaultXs.Vertical: WrapperTabItemDefaultXsVertical
    @Composable
    @JvmName("WrapperTabItemDefaultXsVertical")
    get() = builder
        .dimensions {
            paddingStart(10.0.dp)
            paddingEnd(6.0.dp)
        }
        .wrap(::WrapperTabItemDefaultXsVertical)
