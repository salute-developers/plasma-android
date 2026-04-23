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
 * Обертка для вариации Size48
 */
@JvmInline
public value class WrapperIconButtonSize48(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconButtonSize48BgNoView : WrapperIconButtonView

/**
 * Обертка для вариации Size48BgNo
 */
@JvmInline
public value class WrapperIconButtonSize48BgNo(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonSize48BgNoView

/**
 * Обертка для вариации Size40
 */
@JvmInline
public value class WrapperIconButtonSize40(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconButtonSize40BgNoView : WrapperIconButtonView

/**
 * Обертка для вариации Size40BgNo
 */
@JvmInline
public value class WrapperIconButtonSize40BgNo(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonSize40BgNoView

/**
 * Обертка для вариации Size32
 */
@JvmInline
public value class WrapperIconButtonSize32(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconButtonSize32BgNoView : WrapperIconButtonView

/**
 * Обертка для вариации Size32BgNo
 */
@JvmInline
public value class WrapperIconButtonSize32BgNo(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonSize32BgNoView

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperIconButtonSize24(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperIconButtonSize24BgNoView : WrapperIconButtonView

/**
 * Обертка для вариации Size24BgNo
 */
@JvmInline
public value class WrapperIconButtonSize24BgNo(
    public override val builder: IconButtonStyleBuilder,
) : WrapperIconButtonSize24BgNoView

public val WrapperIconButtonView.ModeAccentFilled: WrapperIconButtonTerminate
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

public val WrapperIconButtonView.ModeAccentGrey: WrapperIconButtonTerminate
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

public val WrapperIconButtonView.ModeDangerTint: WrapperIconButtonTerminate
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
                SddsSbComTheme.colors.surfaceDefaultTransparentNegative.asInteractive(
                    setOf(InteractiveState.Pressed)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentNegativeActive,
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultTransparentNegativeHover,
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

public val IconButton.Size48: WrapperIconButtonSize48
    @Composable
    @JvmName("WrapperIconButtonSize48")
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
        .wrap(::WrapperIconButtonSize48)

public val WrapperIconButtonSize48BgNoView.ModeAccentGrey: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize48BgNoViewModeAccentGrey")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize48BgNoView.ModeDangerTint: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize48BgNoViewModeDangerTint")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize48BgNoView.ModeAccentFilled: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize48BgNoViewModeAccentFilled")
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

public val WrapperIconButtonSize48.BgNo: WrapperIconButtonSize48BgNo
    @Composable
    @JvmName("WrapperIconButtonSize48BgNo")
    get() = builder
        .wrap(::WrapperIconButtonSize48BgNo)

public val IconButton.Size40: WrapperIconButtonSize40
    @Composable
    @JvmName("WrapperIconButtonSize40")
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
        .wrap(::WrapperIconButtonSize40)

public val WrapperIconButtonSize40BgNoView.ModeAccentGrey: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize40BgNoViewModeAccentGrey")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize40BgNoView.ModeDangerTint: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize40BgNoViewModeDangerTint")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize40BgNoView.ModeAccentFilled: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize40BgNoViewModeAccentFilled")
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

public val WrapperIconButtonSize40.BgNo: WrapperIconButtonSize40BgNo
    @Composable
    @JvmName("WrapperIconButtonSize40BgNo")
    get() = builder
        .wrap(::WrapperIconButtonSize40BgNo)

public val IconButton.Size32: WrapperIconButtonSize32
    @Composable
    @JvmName("WrapperIconButtonSize32")
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
        .wrap(::WrapperIconButtonSize32)

public val WrapperIconButtonSize32BgNoView.ModeAccentGrey: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize32BgNoViewModeAccentGrey")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize32BgNoView.ModeDangerTint: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize32BgNoViewModeDangerTint")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize32BgNoView.ModeAccentFilled: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize32BgNoViewModeAccentFilled")
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

public val WrapperIconButtonSize32.BgNo: WrapperIconButtonSize32BgNo
    @Composable
    @JvmName("WrapperIconButtonSize32BgNo")
    get() = builder
        .wrap(::WrapperIconButtonSize32BgNo)

public val IconButton.Size24: WrapperIconButtonSize24
    @Composable
    @JvmName("WrapperIconButtonSize24")
    get() = ButtonStyle.iconButtonBuilder(this)
        .invariantProps
        .dimensions {
            height(24.0.dp)
            paddingStart(4.0.dp)
            paddingEnd(4.0.dp)
            minWidth(24.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
        }
        .wrap(::WrapperIconButtonSize24)

public val WrapperIconButtonSize24BgNoView.ModeAccentGrey: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize24BgNoViewModeAccentGrey")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize24BgNoView.ModeDangerTint: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize24BgNoViewModeDangerTint")
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
                SddsSbComTheme.colors.surfaceDefaultClear.asInteractive(),
            )
        }
        .loadingAlpha(0.0f)
        .wrap(::WrapperIconButtonTerminate)

public val WrapperIconButtonSize24BgNoView.ModeAccentFilled: WrapperIconButtonTerminate
    @Composable
    @JvmName("WrapperIconButtonSize24BgNoViewModeAccentFilled")
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

public val WrapperIconButtonSize24.BgNo: WrapperIconButtonSize24BgNo
    @Composable
    @JvmName("WrapperIconButtonSize24BgNo")
    get() = builder
        .wrap(::WrapperIconButtonSize24BgNo)
