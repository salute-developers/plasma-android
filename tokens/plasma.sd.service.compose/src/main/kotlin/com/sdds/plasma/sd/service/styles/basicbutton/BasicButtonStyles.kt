// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.basicbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBasicButton : BuilderWrapper<ButtonStyle, BasicButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBasicButtonView : WrapperBasicButton

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperBasicButtonTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperBasicButtonXl(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperBasicButtonL(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperBasicButtonM(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperBasicButtonS(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperBasicButtonXs(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperBasicButtonXxs(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

public val WrapperBasicButtonView.Default: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textInversePrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textInverseSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Secondary: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Accent: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Positive: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Negative: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Warning: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Clear: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.06f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Dark: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Black: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.White: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnLightPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnLightSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnLightSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnLightSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaSdServiceTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaSdServiceTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaSdServiceTheme.colors.textOnLightPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnLightPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

private val BasicButtonStyleBuilder.invariantProps: BasicButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val BasicButton.Xl: WrapperBasicButtonXl
    @Composable
    @JvmName("WrapperBasicButtonXl")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .dimensions {
            height(64.0.dp)
            paddingStart(28.0.dp)
            paddingEnd(28.0.dp)
            minWidth(106.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonXl)

public val BasicButton.L: WrapperBasicButtonL
    @Composable
    @JvmName("WrapperBasicButtonL")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyLBold)
        .dimensions {
            height(56.0.dp)
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            minWidth(98.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonL)

public val BasicButton.M: WrapperBasicButtonM
    @Composable
    @JvmName("WrapperBasicButtonM")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyMBold)
        .dimensions {
            height(48.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            minWidth(84.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(6.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonM)

public val BasicButton.S: WrapperBasicButtonS
    @Composable
    @JvmName("WrapperBasicButtonS")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodySBold)
        .dimensions {
            height(40.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            minWidth(71.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(4.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonS)

public val BasicButton.Xs: WrapperBasicButtonXs
    @Composable
    @JvmName("WrapperBasicButtonXs")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .dimensions {
            height(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(57.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
            valueMargin(2.0.dp)
        }
        .wrap(::WrapperBasicButtonXs)

public val BasicButton.Xxs: WrapperBasicButtonXxs
    @Composable
    @JvmName("WrapperBasicButtonXxs")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundXs)
        .labelStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .valueStyle(PlasmaSdServiceTheme.typography.bodyXsBold)
        .dimensions {
            height(24.0.dp)
            paddingStart(10.0.dp)
            paddingEnd(10.0.dp)
            minWidth(53.0.dp)
            iconSize(12.0.dp)
            spinnerSize(12.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
            valueMargin(2.0.dp)
        }
        .wrap(::WrapperBasicButtonXxs)
