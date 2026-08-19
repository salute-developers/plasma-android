// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.linkbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.linkButtonBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperLinkButton : BuilderWrapper<ButtonStyle, LinkButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperLinkButtonView : WrapperLinkButton

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperLinkButtonTerminate(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButton

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperLinkButtonS(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperLinkButtonXs(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

/**
 * Обертка для вариации Xxs
 */
@JvmInline
public value class WrapperLinkButtonXxs(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

public val WrapperLinkButtonView.Default: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPrimaryHover),
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
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Secondary: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultSecondaryHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Accent: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultAccentHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Positive: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPositiveHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultPositiveHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Negative: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultNegativeHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Warning: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultWarningHover),
                ),
            )
            iconColor(
                SolidColor(SddsFinAiTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsFinAiTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsFinAiTheme.colors.textDefaultWarningHover),
                ),
            )
            spinnerColor(
                SddsFinAiTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsFinAiTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered) to
                        SddsFinAiTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

private val LinkButtonStyleBuilder.invariantProps: LinkButtonStyleBuilder
    @Composable
    get() = this
        .disableAlpha(0.4f)
        .loadingAlpha(0.06f)
        .colors {
            backgroundColor(SolidColor(SddsFinAiTheme.colors.surfaceDefaultClear).asStatefulValue())
        }

public val LinkButton.S: WrapperLinkButtonS
    @Composable
    @JvmName("WrapperLinkButtonS")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsFinAiTheme.typography.bodySBold)
        .dimensions {
            height(40.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(39.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(4.0.dp)
        }
        .wrap(::WrapperLinkButtonS)

public val LinkButton.Xs: WrapperLinkButtonXs
    @Composable
    @JvmName("WrapperLinkButtonXs")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsFinAiTheme.typography.bodyXsBold)
        .dimensions {
            height(32.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(33.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
        }
        .wrap(::WrapperLinkButtonXs)

public val LinkButton.Xxs: WrapperLinkButtonXxs
    @Composable
    @JvmName("WrapperLinkButtonXxs")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsFinAiTheme.typography.bodyXsBold)
        .dimensions {
            height(24.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(33.0.dp)
            iconSize(12.0.dp)
            spinnerSize(12.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
        }
        .wrap(::WrapperLinkButtonXxs)
