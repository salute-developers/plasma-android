// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.iconbutton

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
import com.sdds.finai.theme.SddsFinAiTheme
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
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidDefaultHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textInversePrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textInversePrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textInversePrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textInversePrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textInversePrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textInversePrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Secondary: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Accent: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Positive: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultPositiveHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Negative: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultNegativeHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Warning: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultWarningHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Clear: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Dark: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceOnLightTransparentDeep).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceOnLightTransparentDeepActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceOnLightTransparentDeepHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.Black: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceOnLightSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceOnLightSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceOnLightSolidDefaultHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.White: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(SddsFinAiTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.surfaceOnDarkSolidDefaultActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textOnLightPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textOnLightPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textOnLightPrimaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textOnLightPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textOnLightPrimaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textOnLightPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperIconButtonTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .loadingAlpha(0.0f)

public val IconButton.S: WrapperIconButtonS
    @Composable
    @JvmName("WrapperIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundM.adjustBy(all = -2.0.dp))
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
        .shape(SddsFinAiTheme.shapes.roundS)
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
        .shape(SddsFinAiTheme.shapes.roundS)
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
