// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.button.link

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButton
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.linkButtonBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.theme.SddsServTheme
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
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperLinkButtonXl(
    public override val builder: LinkButtonStyleBuilder,
) : WrapperLinkButtonView

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
            spinnerColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
            labelColor(
                SddsServTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Secondary: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                ),
            )
            labelColor(
                SddsServTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Accent: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultAccentHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultAccentHover,
                ),
            )
            labelColor(
                SddsServTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Positive: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPositiveHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPositiveHover,
                ),
            )
            labelColor(
                SddsServTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Negative: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                ),
            )
            labelColor(
                SddsServTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Warning: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultWarningHover,
                ),
            )
            iconColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultWarningHover,
                ),
            )
            labelColor(
                SddsServTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsServTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered)
                        to SddsServTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

private val LinkButtonStyleBuilder.invariantProps: LinkButtonStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                SddsServTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.06f)
        .disableAlpha(0.4f)

public val LinkButton.Xl: WrapperLinkButtonXl
    @Composable
    @JvmName("WrapperLinkButtonXl")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyLBold)
        .dimensions {
            height(64.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            minWidth(50.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(8.0.dp)
        }
        .wrap(::WrapperLinkButtonXl)

public val LinkButton.L: WrapperLinkButtonL
    @Composable
    @JvmName("WrapperLinkButtonL")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyLBold)
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
        .labelStyle(SddsServTheme.typography.bodyMBold)
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
        .labelStyle(SddsServTheme.typography.bodySBold)
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
        .labelStyle(SddsServTheme.typography.bodyXsBold)
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
        .labelStyle(SddsServTheme.typography.bodyXsBold)
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
