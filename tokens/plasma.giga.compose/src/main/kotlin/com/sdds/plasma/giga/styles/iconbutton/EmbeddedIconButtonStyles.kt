// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.iconbutton

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
import com.sdds.plasma.giga.theme.PlasmaGigaTheme
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

public val WrapperEmbeddedIconButtonView.Default: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Secondary: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Accent: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultAccentHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Positive: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultPositiveHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Negative: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Warning: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultWarningHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperEmbeddedIconButtonTerminate)

public val WrapperEmbeddedIconButtonView.Info: WrapperEmbeddedIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultInfo).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultInfoActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultInfoHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultInfo.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultInfoActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textDefaultInfoHover,
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
            backgroundColor(SolidColor(PlasmaGigaTheme.colors.surfaceDefaultClear).asStatefulValue())
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
        .shape(PlasmaGigaTheme.shapes.roundL)
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
        .shape(PlasmaGigaTheme.shapes.roundM)
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
        .shape(PlasmaGigaTheme.shapes.roundS)
        .dimensions {
            height(16.0.dp)
            minWidth(16.0.dp)
            iconSize(16.0.dp)
            spinnerSize(14.0.dp)
            spinnerStrokeWidth(1.5.dp)
        }
        .wrap(::WrapperEmbeddedIconButtonS)
