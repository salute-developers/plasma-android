// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.iconbutton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperIconButton : BuilderWrapper<ButtonStyle, IconButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconButtonView : WrapperIconButton

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconButtonTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButton

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperIconButtonXl(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации XlPilled
 */
@JvmInline
public value class WrapperIconButtonXlPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperIconButtonL(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации LPilled
 */
@JvmInline
public value class WrapperIconButtonLPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconButtonM(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации MPilled
 */
@JvmInline
public value class WrapperIconButtonMPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconButtonS(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации SPilled
 */
@JvmInline
public value class WrapperIconButtonSPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconButtonXs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации XsPilled
 */
@JvmInline
public value class WrapperIconButtonXsPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperIconButtonXxs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Обертка для вариации XxsPilled
 */
@JvmInline
public value class WrapperIconButtonXxsPilled(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

public val WrapperIconButtonView.Default: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textInversePrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textInversePrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Secondary: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Accent: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Positive: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Negative: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Warning: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Clear: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textDefaultPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultClearActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceDefaultClearHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Dark: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceOnLightTransparentDeepHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Black: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.White: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnLightPrimaryHover,
                ),
            )
            iconColor(
                PlasmaSdServiceTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.textOnLightPrimaryHover,
                ),
            )
            backgroundColor(
                PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to PlasmaSdServiceTheme.colors.surfaceOnDarkSolidDefaultHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .loadingAlpha(0.0f)
        .disableAlpha(0.4f)

public val IconButton.Xl: WrapperIconButtonXl
    @Composable
    @JvmName("WrapperIconButtonXl")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .dimensions {
            height(64.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            minWidth(64.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonXl)

public val WrapperIconButtonXl.Pilled: WrapperIconButtonXlPilled
    @Composable
    @JvmName("WrapperIconButtonXlPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonXlPilled)

public val IconButton.L: WrapperIconButtonL
    @Composable
    @JvmName("WrapperIconButtonL")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            height(56.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            minWidth(56.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonL)

public val WrapperIconButtonL.Pilled: WrapperIconButtonLPilled
    @Composable
    @JvmName("WrapperIconButtonLPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonLPilled)

public val IconButton.M: WrapperIconButtonM
    @Composable
    @JvmName("WrapperIconButtonM")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .dimensions {
            height(48.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(48.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonM)

public val WrapperIconButtonM.Pilled: WrapperIconButtonMPilled
    @Composable
    @JvmName("WrapperIconButtonMPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonMPilled)

public val IconButton.S: WrapperIconButtonS
    @Composable
    @JvmName("WrapperIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            height(40.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            minWidth(40.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonS)

public val WrapperIconButtonS.Pilled: WrapperIconButtonSPilled
    @Composable
    @JvmName("WrapperIconButtonSPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonSPilled)

public val IconButton.Xs: WrapperIconButtonXs
    @Composable
    @JvmName("WrapperIconButtonXs")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .dimensions {
            height(32.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            minWidth(32.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperIconButtonXs)

public val WrapperIconButtonXs.Pilled: WrapperIconButtonXsPilled
    @Composable
    @JvmName("WrapperIconButtonXsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonXsPilled)

public val IconButton.Xxs: WrapperIconButtonXxs
    @Composable
    @JvmName("WrapperIconButtonXxs")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .dimensions {
            height(24.0.dp)
            paddingStart(6.0.dp)
            paddingEnd(6.0.dp)
            minWidth(24.0.dp)
            iconSize(12.0.dp)
            spinnerSize(12.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperIconButtonXxs)

public val WrapperIconButtonXxs.Pilled: WrapperIconButtonXxsPilled
    @Composable
    @JvmName("WrapperIconButtonXxsPilled")
    get() = builder
        .shape(CircleShape)
        .wrap(::WrapperIconButtonXxsPilled)
