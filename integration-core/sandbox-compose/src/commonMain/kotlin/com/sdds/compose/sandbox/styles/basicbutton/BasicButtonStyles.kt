// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.basicbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textInversePrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textInverseSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textInversePrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceOnLightTransparentDeepActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceOnLightTransparentDeepHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceOnLightSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceOnLightSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceOnLightSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnDarkPrimaryHover,
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
                SolidColor(SddsSandboxTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.surfaceOnDarkSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnLightPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSandboxTheme.colors.textOnLightSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnLightSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnLightSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textOnLightPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textOnLightPrimaryHover,
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
        .shape(SddsSandboxTheme.shapes.roundL)
        .labelStyle(SddsSandboxTheme.typography.bodyLBold)
        .valueStyle(SddsSandboxTheme.typography.bodyLBold)
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
        .shape(SddsSandboxTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .labelStyle(SddsSandboxTheme.typography.bodyLBold)
        .valueStyle(SddsSandboxTheme.typography.bodyLBold)
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
        .shape(SddsSandboxTheme.shapes.roundM)
        .labelStyle(SddsSandboxTheme.typography.bodyMBold)
        .valueStyle(SddsSandboxTheme.typography.bodyMBold)
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
        .shape(SddsSandboxTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .labelStyle(SddsSandboxTheme.typography.bodySBold)
        .valueStyle(SddsSandboxTheme.typography.bodySBold)
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
        .shape(SddsSandboxTheme.shapes.roundS)
        .labelStyle(SddsSandboxTheme.typography.bodyXsBold)
        .valueStyle(SddsSandboxTheme.typography.bodyXsBold)
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
        .shape(SddsSandboxTheme.shapes.roundXs)
        .labelStyle(SddsSandboxTheme.typography.bodyXsBold)
        .valueStyle(SddsSandboxTheme.typography.bodyXsBold)
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
