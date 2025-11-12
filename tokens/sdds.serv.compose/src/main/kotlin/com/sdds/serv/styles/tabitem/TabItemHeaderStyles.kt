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
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperTabItemHeader : BuilderWrapper<TabItemStyle, TabItemStyleBuilder>

/**
 * Обертка для вариации H1
 */
@JvmInline
public value class WrapperTabItemHeaderH1(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemHeader

/**
 * Обертка для вариации H2
 */
@JvmInline
public value class WrapperTabItemHeaderH2(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemHeader

/**
 * Обертка для вариации H3
 */
@JvmInline
public value class WrapperTabItemHeaderH3(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemHeader

/**
 * Обертка для вариации H4
 */
@JvmInline
public value class WrapperTabItemHeaderH4(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemHeader

/**
 * Обертка для вариации H5
 */
@JvmInline
public value class WrapperTabItemHeaderH5(
    public override val builder: TabItemStyleBuilder,
) : WrapperTabItemHeader

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
        .actionIcon(com.sdds.icons.R.drawable.ic_close_36)
        .disableAlpha(0.4f)

public val TabItemHeader.H1: WrapperTabItemHeaderH1
    @Composable
    @JvmName("WrapperTabItemHeaderH1")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.headerH1Normal)
        .valueStyle(SddsServTheme.typography.headerH1Normal)
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            valuePadding(16.0.dp)
            actionPadding(16.0.dp)
            actionSize(52.0.dp)
        }
        .wrap(::WrapperTabItemHeaderH1)

public val TabItemHeader.H2: WrapperTabItemHeaderH2
    @Composable
    @JvmName("WrapperTabItemHeaderH2")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.headerH2Normal)
        .valueStyle(SddsServTheme.typography.headerH2Normal)
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            valuePadding(14.0.dp)
            actionPadding(12.0.dp)
        }
        .wrap(::WrapperTabItemHeaderH2)

public val TabItemHeader.H3: WrapperTabItemHeaderH3
    @Composable
    @JvmName("WrapperTabItemHeaderH3")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.headerH3Normal)
        .valueStyle(SddsServTheme.typography.headerH3Normal)
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            valuePadding(12.0.dp)
            actionPadding(10.0.dp)
            actionSize(30.0.dp)
        }
        .wrap(::WrapperTabItemHeaderH3)

public val TabItemHeader.H4: WrapperTabItemHeaderH4
    @Composable
    @JvmName("WrapperTabItemHeaderH4")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.headerH4Normal)
        .valueStyle(SddsServTheme.typography.headerH4Normal)
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            valuePadding(10.0.dp)
            actionPadding(8.0.dp)
            actionSize(26.0.dp)
        }
        .wrap(::WrapperTabItemHeaderH4)

public val TabItemHeader.H5: WrapperTabItemHeaderH5
    @Composable
    @JvmName("WrapperTabItemHeaderH5")
    get() = TabItemStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.headerH5Normal)
        .valueStyle(SddsServTheme.typography.headerH5Normal)
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            valuePadding(10.0.dp)
            actionPadding(8.0.dp)
            actionSize(24.0.dp)
        }
        .wrap(::WrapperTabItemHeaderH5)
