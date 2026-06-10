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
public interface WrapperAiHeaderEmbeddedIconButton :
    BuilderWrapper<ButtonStyle, IconButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperAiHeaderEmbeddedIconButtonView : WrapperAiHeaderEmbeddedIconButton

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButton

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonXl(
    public override val builder: IconButtonStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonL(
    public override val builder: IconButtonStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonM(
    public override val builder: IconButtonStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperAiHeaderEmbeddedIconButtonS(
    public override val builder: IconButtonStyleBuilder,
) : WrapperAiHeaderEmbeddedIconButtonView

public val WrapperAiHeaderEmbeddedIconButtonView.Default: WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

public val WrapperAiHeaderEmbeddedIconButtonView.Secondary:
    WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

public val WrapperAiHeaderEmbeddedIconButtonView.Accent: WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

public val WrapperAiHeaderEmbeddedIconButtonView.Positive:
    WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

public val WrapperAiHeaderEmbeddedIconButtonView.Negative:
    WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

public val WrapperAiHeaderEmbeddedIconButtonView.Warning: WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

public val WrapperAiHeaderEmbeddedIconButtonView.Info: WrapperAiHeaderEmbeddedIconButtonTerminate
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
        .wrap(::WrapperAiHeaderEmbeddedIconButtonTerminate)

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

public val AiHeaderEmbeddedIconButton.Xl: WrapperAiHeaderEmbeddedIconButtonXl
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonXl")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
        .dimensions {
            height(56.0.dp)
            minWidth(56.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperAiHeaderEmbeddedIconButtonXl)

public val AiHeaderEmbeddedIconButton.L: WrapperAiHeaderEmbeddedIconButtonL
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonL")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
        .dimensions {
            height(48.0.dp)
            minWidth(48.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperAiHeaderEmbeddedIconButtonL)

public val AiHeaderEmbeddedIconButton.M: WrapperAiHeaderEmbeddedIconButtonM
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonM")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundM)
        .dimensions {
            height(40.0.dp)
            minWidth(40.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperAiHeaderEmbeddedIconButtonM)

public val AiHeaderEmbeddedIconButton.S: WrapperAiHeaderEmbeddedIconButtonS
    @Composable
    @JvmName("WrapperAiHeaderEmbeddedIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundS)
        .dimensions {
            height(32.0.dp)
            minWidth(32.0.dp)
            iconSize(16.0.dp)
            spinnerSize(14.0.dp)
            spinnerStrokeWidth(1.5.dp)
        }
        .wrap(::WrapperAiHeaderEmbeddedIconButtonS)
