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
public interface WrapperIconButtonClear : BuilderWrapper<ButtonStyle, IconButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconButtonClearView : WrapperIconButtonClear

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperIconButtonClearTerminate(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonClear

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperIconButtonClearM(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonClearView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperIconButtonClearS(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonClearView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperIconButtonClearXs(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonClearView

public val WrapperIconButtonClearView.Accent: WrapperIconButtonClearTerminate
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
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonClearTerminate)

public val WrapperIconButtonClearView.DangerTint: WrapperIconButtonClearTerminate
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
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonClearTerminate)

private val IconButtonStyleBuilder.invariantProps: IconButtonStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .colors {
            backgroundColor(
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultClearActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultClearHover,
                ),
            )
        }
        .disableAlpha(0.4f)

public val IconButtonClear.M: WrapperIconButtonClearM
    @Composable
    @JvmName("WrapperIconButtonClearM")
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
        .wrap(::WrapperIconButtonClearM)

public val IconButtonClear.S: WrapperIconButtonClearS
    @Composable
    @JvmName("WrapperIconButtonClearS")
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
        .wrap(::WrapperIconButtonClearS)

public val IconButtonClear.Xs: WrapperIconButtonClearXs
    @Composable
    @JvmName("WrapperIconButtonClearXs")
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
        .wrap(::WrapperIconButtonClearXs)
