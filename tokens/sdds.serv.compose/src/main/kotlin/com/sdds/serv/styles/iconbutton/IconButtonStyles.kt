// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.iconbutton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
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
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Secondary: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Accent: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Positive: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Negative: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Warning: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Clear: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Dark: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceOnLightTransparentDeepActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceOnLightTransparentDeepHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Black: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceOnLightSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceOnLightSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceOnLightSolidDefaultHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.White: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsServTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.surfaceOnDarkSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            iconColor(
                SolidColor(SddsServTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsServTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsServTheme.colors.textOnLightPrimaryHover),
                ),
            )
            spinnerColor(
                SddsServTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsServTheme.colors.textOnLightPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .loadingAlpha(0.0f)

public val IconButton.Xl: WrapperIconButtonXl
    @Composable
    @JvmName("WrapperIconButtonXl")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsServTheme.shapes.roundL)
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
        .shape(SddsServTheme.shapes.roundL.adjustBy(all = -2.0.dp))
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
        .shape(SddsServTheme.shapes.roundM)
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
        .shape(SddsServTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
        .shape(SddsServTheme.shapes.roundS)
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
        .shape(SddsServTheme.shapes.roundS)
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
