// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.iconbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
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
            spinnerColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Secondary: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Accent: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultAccentHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Positive: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPositiveHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Negative: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Warning: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultWarningHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Info: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultInfoActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultInfoHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultInfo.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultInfoActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultInfoHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .dimensions {
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
        }
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .disableAlpha(0.4f)

public val EmbeddedIconButton.L: WrapperEmbeddedIconButtonL
    @Composable
    @JvmName("WrapperEmbeddedIconButtonL")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
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
        .shape(SddsServTheme.shapes.roundM)
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
        .shape(SddsServTheme.shapes.roundS)
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
        .shape(SddsServTheme.shapes.roundXs)
        .dimensions {
            height(12.0.dp)
            minWidth(12.0.dp)
            iconSize(12.0.dp)
            spinnerSize(11.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonXs)
