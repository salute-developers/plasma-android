// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.iconbutton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.IconButtonStyleBuilder
import com.sdds.compose.uikit.iconButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
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
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconButtonM(
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
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconButtonXs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

public val WrapperIconButtonView.AccentFilled: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            iconColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textOnDarkPrimaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.AccentGrey: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSbComTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                ),
            )
            iconColor(
                SddsSbComTheme.colors.textDefaultAccent.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultAccentActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultAccentHover,
                ),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultTransparentSecondary.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentSecondaryActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentSecondaryHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonView.DangerTint: WrapperIconButtonTerminate
    @Composable
    get() = builder
        .colors {
            spinnerColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
            iconColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.textDefaultNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultNegativeMinor.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultNegativeMinorActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultNegativeMinorHover,
                ),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .disableAlpha(0.4f)

public val IconButton.M: WrapperIconButtonM
    @Composable
    @JvmName("WrapperIconButtonM")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .dimensions {
            height(48.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(48.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonM)

public val IconButton.S: WrapperIconButtonS
    @Composable
    @JvmName("WrapperIconButtonS")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .dimensions {
            height(40.0.dp)
            paddingStart(8.0.dp)
            paddingEnd(8.0.dp)
            minWidth(40.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
        }
        .wrap(::WrapperIconButtonS)

public val IconButton.Xs: WrapperIconButtonXs
    @Composable
    @JvmName("WrapperIconButtonXs")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .dimensions {
            height(32.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            minWidth(32.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperIconButtonXs)
