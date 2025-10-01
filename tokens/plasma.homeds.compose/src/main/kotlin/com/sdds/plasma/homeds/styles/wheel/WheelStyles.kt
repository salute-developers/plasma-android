// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.wheel

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.WheelAlignment
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.WheelStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperWheel : BuilderWrapper<WheelStyle, WheelStyleBuilder>

/**
 * Обертка для вариации H1
 */
@JvmInline
public value class WrapperWheelH1(
    public override val builder: WheelStyleBuilder,
) : WrapperWheel

/**
 * Обертка для вариации H1RightAlign
 */
@JvmInline
public value class WrapperWheelH1RightAlign(
    public override val builder: WheelStyleBuilder,
) : WrapperWheel

/**
 * Обертка для вариации H1CenterAlign
 */
@JvmInline
public value class WrapperWheelH1CenterAlign(
    public override val builder: WheelStyleBuilder,
) : WrapperWheel

/**
 * Обертка для вариации H1LeftAlign
 */
@JvmInline
public value class WrapperWheelH1LeftAlign(
    public override val builder: WheelStyleBuilder,
) : WrapperWheel

/**
 * Обертка для вариации H1MixedAlign
 */
@JvmInline
public value class WrapperWheelH1MixedAlign(
    public override val builder: WheelStyleBuilder,
) : WrapperWheel

private val WheelStyleBuilder.invariantProps: WheelStyleBuilder
    @Composable
    get() = this
        .controlIconUp(com.sdds.icons.R.drawable.ic_disclosure_up_outline_36)
        .controlIconDown(com.sdds.icons.R.drawable.ic_disclosure_down_outline_36)
        .wheelCount(3)
        .visibleItemsCount(3)
        .dividerStyle(Divider.Default.style())
        .colors {
            itemTextColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            itemTextAfterColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            descriptionColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            controlIconUpColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to PlasmaHomeDsTheme.colors.textDefaultPrimary,
                ),
            )
            controlIconDownColor(
                PlasmaHomeDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to PlasmaHomeDsTheme.colors.textDefaultPrimary,
                ),
            )
            separatorColor(
                PlasmaHomeDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }

public val Wheel.H1: WrapperWheelH1
    @Composable
    @JvmName("WrapperWheelH1")
    get() = WheelStyle.builder(this)
        .invariantProps
        .itemTextStyle(PlasmaHomeDsTheme.typography.headerH1Bold)
        .itemTextAfterStyle(PlasmaHomeDsTheme.typography.headerH1Bold)
        .descriptionStyle(PlasmaHomeDsTheme.typography.bodySBold)
        .dimensions {
            itemTextAfterPadding(2.0.dp)
            descriptionPadding(8.0.dp)
            separatorSpacing(40.0.dp)
            itemMinSpacing(20.0.dp)
        }
        .wrap(::WrapperWheelH1)

public val WrapperWheelH1.RightAlign: WrapperWheelH1RightAlign
    @Composable
    @JvmName("WrapperWheelH1RightAlign")
    get() = builder
        .itemAlignment(WheelAlignment.End)
        .wrap(::WrapperWheelH1RightAlign)

public val WrapperWheelH1.CenterAlign: WrapperWheelH1CenterAlign
    @Composable
    @JvmName("WrapperWheelH1CenterAlign")
    get() = builder
        .itemAlignment(WheelAlignment.Center)
        .wrap(::WrapperWheelH1CenterAlign)

public val WrapperWheelH1.LeftAlign: WrapperWheelH1LeftAlign
    @Composable
    @JvmName("WrapperWheelH1LeftAlign")
    get() = builder
        .itemAlignment(WheelAlignment.Start)
        .wrap(::WrapperWheelH1LeftAlign)

public val WrapperWheelH1.MixedAlign: WrapperWheelH1MixedAlign
    @Composable
    @JvmName("WrapperWheelH1MixedAlign")
    get() = builder
        .itemAlignment(WheelAlignment.Mixed)
        .wrap(::WrapperWheelH1MixedAlign)
