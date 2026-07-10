// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.compose.sandbox.styles.linkbutton

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.LinkButtonStyleBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.linkButtonBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
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
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPrimaryHover),
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
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Secondary: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultSecondaryHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSandboxTheme.colors.textDefaultSecondaryHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Accent: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultAccentHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultAccentActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Positive: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPositiveHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultPositive).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultPositiveActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultPositiveHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultPositiveActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultPositiveHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Negative: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultNegativeHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultNegativeActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Warning: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultWarningHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultWarning).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultWarningActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultWarningHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultWarning.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultWarningActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultWarningHover,
                ),
            )
        }
        .wrap(::WrapperLinkButtonTerminate)

public val WrapperLinkButtonView.Info: WrapperLinkButtonTerminate
    @Composable
    get() = builder
        .colors {
            labelColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultInfo).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultInfoActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultInfoHover),
                ),
            )
            iconColor(
                SolidColor(SddsSandboxTheme.colors.textDefaultInfo).asStatefulValue(
                    setOf(InteractiveState.Pressed)
                        to SolidColor(SddsSandboxTheme.colors.textDefaultInfoActive),
                    setOf(InteractiveState.Hovered) to
                        SolidColor(SddsSandboxTheme.colors.textDefaultInfoHover),
                ),
            )
            spinnerColor(
                SddsSandboxTheme.colors.textDefaultInfo.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSandboxTheme.colors.textDefaultInfoActive,
                    setOf(InteractiveState.Hovered) to
                        SddsSandboxTheme.colors.textDefaultInfoHover,
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
            backgroundColor(SolidColor(SddsSandboxTheme.colors.surfaceDefaultClear).asStatefulValue())
        }

public val LinkButton.Xl: WrapperLinkButtonXl
    @Composable
    @JvmName("WrapperLinkButtonXl")
    get() = ButtonStyle.linkButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsSandboxTheme.typography.bodyLBold)
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
        .labelStyle(SddsSandboxTheme.typography.bodyLBold)
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
        .labelStyle(SddsSandboxTheme.typography.bodyMBold)
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
        .labelStyle(SddsSandboxTheme.typography.bodySBold)
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
        .labelStyle(SddsSandboxTheme.typography.bodyXsBold)
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
        .labelStyle(SddsSandboxTheme.typography.bodyXsBold)
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
