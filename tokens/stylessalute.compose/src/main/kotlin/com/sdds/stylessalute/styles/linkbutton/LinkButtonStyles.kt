// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.linkbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.linkButtonBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperLinkButtonL(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperLinkButtonM(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

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

public val WrapperLinkButtonView.Default: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Secondary: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                ),
            )
            iconColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Accent: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultAccentMainActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultAccentMainHover,
                ),
            )
            iconColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultAccentMainActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultAccentMainHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultAccentMain.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultAccentMainActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultAccentMainHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Positive: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPositiveHover,
                ),
            )
            iconColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPositiveHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Negative: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultNegativeHover,
                ),
            )
            iconColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultNegativeHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Warning: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultWarningHover,
                ),
            )
            iconColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultWarningHover,
                ),
            )
            labelColor(
                StylesSaluteTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to StylesSaluteTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to StylesSaluteTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

private val LinkButtonStyleBuilder.invariantProps: LinkButtonStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                StylesSaluteTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.06f)
        .disableAlpha(0.4f)

public val LinkButton.L: WrapperLinkButtonL
    @Composable
    @JvmName("WrapperLinkButtonL")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodyLBold)
        .dimensions {
            height(56.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(50.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperLinkButtonL)

public val LinkButton.M: WrapperLinkButtonM
    @Composable
    @JvmName("WrapperLinkButtonM")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodyMBold)
        .dimensions {
            height(48.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(44.0.dp)
            iconSize(24.0.dp)
            spinnerSize(22.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(6.0.dp)
        }
        .wrap(::WrapperLinkButtonM)

public val LinkButton.S: WrapperLinkButtonS
    @Composable
    @JvmName("WrapperLinkButtonS")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodySBold)
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
        .labelStyle(StylesSaluteTheme.typography.bodyXsBold)
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
