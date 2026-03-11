// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.iconbutton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
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
                SddsSandboxTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textInversePrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textInversePrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultSolidDefaultHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Secondary: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Accent: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Positive: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Negative: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Warning: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Clear: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Dark: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceOnLightTransparentDeep.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceOnLightTransparentDeepActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceOnLightTransparentDeepHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Black: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceOnLightSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceOnLightSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceOnLightSolidDefaultHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.White: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSandboxTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnLightPrimaryHover,
                ),
            )
            iconColor(
                SddsSandboxTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textOnLightPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSandboxTheme.colors.surfaceOnDarkSolidDefault.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.surfaceOnDarkSolidDefaultActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.surfaceOnDarkSolidDefaultHover,
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
        .shape(SddsSandboxTheme.shapes.roundL)
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
        .shape(SddsSandboxTheme.shapes.roundL.adjustBy(all = -2.0.dp))
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
        .shape(SddsSandboxTheme.shapes.roundM)
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
        .shape(SddsSandboxTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
        .shape(SddsSandboxTheme.shapes.roundS)
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
        .shape(SddsSandboxTheme.shapes.roundS)
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
