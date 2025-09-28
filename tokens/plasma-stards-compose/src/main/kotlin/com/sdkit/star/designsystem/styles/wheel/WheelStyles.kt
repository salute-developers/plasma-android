// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.wheel

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.WheelAlignment
import com.sdds.compose.uikit.WheelStyle
import com.sdds.compose.uikit.WheelStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
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
        .visibleItemsCount(5)
        .colors {
            itemTextColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            itemTextAfterColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            descriptionColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            controlIconUpColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            controlIconDownColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textDefaultPrimary,
                ),
            )
            separatorColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
        }

public val Wheel.H1: WrapperWheelH1
    @Composable
    @JvmName("WrapperWheelH1")
    get() = WheelStyle.builder(this)
        .invariantProps
        .itemTextStyle(StarDsTheme.typography.headerH1Normal)
        .itemTextAfterStyle(StarDsTheme.typography.headerH1Normal)
        .descriptionStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            itemTextAfterPadding(dimensionResource(R.dimen.sdkit_cmp_wheel_item_text_after_padding_h1))
            descriptionPadding(dimensionResource(R.dimen.sdkit_cmp_wheel_description_padding_h1))
            separatorSpacing(dimensionResource(R.dimen.sdkit_cmp_wheel_separator_spacing_h1))
            itemMinSpacing(dimensionResource(R.dimen.sdkit_cmp_wheel_item_min_spacing_h1))
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
