// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.button.basic

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
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
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Secondary: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Accent: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInversePrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textInverseSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textInverseSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textInverseSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Positive: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Negative: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Warning: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultWarningHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Clear: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textDefaultSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceDefaultClearHover,
                ),
            )
        }
        .loadingAlpha(0.06f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Dark: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceOnLightTransparentDeepActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceOnLightTransparentDeepHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.Black: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textOnDarkSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnDarkSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.White: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaGigaTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryHover,
                ),
            )
            iconColor(
                PlasmaGigaTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryHover,
                ),
            )
            labelColor(
                PlasmaGigaTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnLightPrimaryHover,
                ),
            )
            valueColor(
                PlasmaGigaTheme.colors.textOnLightSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.textOnLightSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.textOnLightSecondaryHover,
                ),
            )
            backgroundColor(
                PlasmaGigaTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaGigaTheme.colors.surfaceOnDarkSolidDefaultHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
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
