// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.basicbutton

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
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
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

public val WrapperBasicButtonView.Default: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textInversePrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textInverseSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textInverseSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textInverseSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceInverseSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceInverseSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceInverseSolidDefaultHover,
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
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultHover,
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
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultHover,
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
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefaultHover,
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
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefaultHover,
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
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceOnDarkSolidDefaultHover,
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
                SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered) to
                        PlasmaHomeDsTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

private val BasicButtonStyleBuilder.invariantProps: BasicButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)

public val BasicButton.M: WrapperBasicButtonM
    @Composable
    @JvmName("WrapperBasicButtonM")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .shape(PlasmaHomeDsTheme.shapes.roundL)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyMBold)
        .valueStyle(PlasmaHomeDsTheme.typography.bodyMBold)
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
        .shape(PlasmaHomeDsTheme.shapes.roundM)
        .labelStyle(PlasmaHomeDsTheme.typography.bodySBold)
        .valueStyle(PlasmaHomeDsTheme.typography.bodySBold)
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
        .shape(PlasmaHomeDsTheme.shapes.roundS)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyXsBold)
        .valueStyle(PlasmaHomeDsTheme.typography.bodyXsBold)
        .dimensions {
            height(32.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(56.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(4.0.dp)
            valueMargin(2.0.dp)
        }
        .wrap(::WrapperBasicButtonXs)
