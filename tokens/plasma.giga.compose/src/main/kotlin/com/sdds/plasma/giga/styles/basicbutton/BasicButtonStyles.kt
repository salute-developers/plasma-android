// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.basicbutton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.basicButtonBuilder
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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textInversePrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryHover),
                ),
            )
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
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Accent: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInverseSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textInversePrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textDefaultSecondaryHover),
                ),
            )
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
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Dark: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaGigaTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceOnLightTransparentDeepActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceOnLightTransparentDeepHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceOnLightSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceOnLightSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceOnLightSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.surfaceOnDarkSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaGigaTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnLightPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaGigaTheme.colors.textOnLightSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnLightSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnLightSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaGigaTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaGigaTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaGigaTheme.colors.textOnLightPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaGigaTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaGigaTheme.colors.textOnLightPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

private val BasicButtonStyleBuilder.invariantProps: BasicButtonStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .disableAlpha(0.4f)

public val BasicButton.Xl: WrapperBasicButtonXl
    @Composable
    @JvmName("WrapperBasicButtonXl")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .labelStyle(PlasmaGigaTheme.typography.bodyLBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyLBold)
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
        .labelStyle(PlasmaGigaTheme.typography.bodyLBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyLBold)
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
        .labelStyle(PlasmaGigaTheme.typography.bodyMBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyMBold)
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
        .labelStyle(PlasmaGigaTheme.typography.bodySBold)
        .valueStyle(PlasmaGigaTheme.typography.bodySBold)
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
        .labelStyle(PlasmaGigaTheme.typography.bodyXsBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyXsBold)
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
        .labelStyle(PlasmaGigaTheme.typography.bodyXsBold)
        .valueStyle(PlasmaGigaTheme.typography.bodyXsBold)
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
