// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.iconbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperEmbeddedIconButton : BuilderWrapper<ButtonStyle, IconButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperEmbeddedIconButtonView : WrapperEmbeddedIconButton

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperEmbeddedIconButtonTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperEmbeddedIconButton

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperEmbeddedIconButtonL(
    public override val builder: IconButtonStyleBuilder,
) : WrapperEmbeddedIconButtonView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperEmbeddedIconButtonM(
    public override val builder: IconButtonStyleBuilder,
) : WrapperEmbeddedIconButtonView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperEmbeddedIconButtonS(
    public override val builder: IconButtonStyleBuilder,
) : WrapperEmbeddedIconButtonView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperEmbeddedIconButtonXs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperEmbeddedIconButtonView

public val WrapperEmbeddedIconButtonView.Default: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Secondary: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Accent: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Positive: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPositiveHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Negative: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Warning: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultWarningHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Info: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultInfo).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultInfoActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultInfoHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultInfo.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultInfoActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultInfoHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue())
        }
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }

public val EmbeddedIconButton.L: WrapperEmbeddedIconButtonL
    @Composable
    @JvmName("WrapperEmbeddedIconButtonL")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundL)
        .dimensions {
            height(36.0.dp)
            minWidth(36.0.dp)
            iconSize(36.0.dp)
            spinnerSize(30.0.dp)
            spinnerStrokeWidth(3.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonL)

public val EmbeddedIconButton.M: WrapperEmbeddedIconButtonM
    @Composable
    @JvmName("WrapperEmbeddedIconButtonM")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundM)
        .dimensions {
            height(24.0.dp)
            minWidth(24.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonM)

public val EmbeddedIconButton.S: WrapperEmbeddedIconButtonS
    @Composable
    @JvmName("WrapperEmbeddedIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS)
        .dimensions {
            height(16.0.dp)
            minWidth(16.0.dp)
            iconSize(16.0.dp)
            spinnerSize(14.0.dp)
            spinnerStrokeWidth(1.5.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonS)

public val EmbeddedIconButton.Xs: WrapperEmbeddedIconButtonXs
    @Composable
    @JvmName("WrapperEmbeddedIconButtonXs")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs)
        .dimensions {
            height(12.0.dp)
            minWidth(12.0.dp)
            iconSize(12.0.dp)
            spinnerSize(11.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonXs)
