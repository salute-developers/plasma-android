// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.basicbutton

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.BasicButtonStyleBuilder
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.basicButtonBuilder
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.theme.SddsSbComTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperBasicButton : BuilderWrapper<ButtonStyle, BasicButtonStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBasicButtonView : WrapperBasicButton

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperBasicButtonTerminate(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButton

/**
 * Обертка для вариации Size48
 */
@JvmInline
public value class WrapperBasicButtonSize48(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBasicButtonSize48BgNoView : WrapperBasicButtonView

/**
 * Обертка для вариации Size48BgNo
 */
@JvmInline
public value class WrapperBasicButtonSize48BgNo(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonSize48BgNoView

/**
 * Обертка для вариации Size40
 */
@JvmInline
public value class WrapperBasicButtonSize40(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBasicButtonSize40BgNoView : WrapperBasicButtonView

/**
 * Обертка для вариации Size40BgNo
 */
@JvmInline
public value class WrapperBasicButtonSize40BgNo(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonSize40BgNoView

/**
 * Обертка для вариации Size32
 */
@JvmInline
public value class WrapperBasicButtonSize32(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBasicButtonSize32BgNoView : WrapperBasicButtonView

/**
 * Обертка для вариации Size32BgNo
 */
@JvmInline
public value class WrapperBasicButtonSize32BgNo(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonSize32BgNoView

/**
 * Обертка для вариации Size24
 */
@JvmInline
public value class WrapperBasicButtonSize24(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonView

/**
 * Интерфейс, который реализуют все обертки вариации bg-no
 * и обертки ее подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperBasicButtonSize24BgNoView : WrapperBasicButtonView

/**
 * Обертка для вариации Size24BgNo
 */
@JvmInline
public value class WrapperBasicButtonSize24BgNo(
    public override val builder: BasicButtonStyleBuilder,
) : WrapperBasicButtonSize24BgNoView

public val WrapperBasicButtonView.ModePrimary: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.ModeAccentFilled: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.ModeAccentWhite: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.ModeAccentGrey: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentSecondaryHover),
                ),
            )
            labelColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            spinnerColor(SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive())
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonView.ModeDangerTint: WrapperBasicButtonTerminate
    @Composable
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultTransparentNegativeHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

private val BasicButtonStyleBuilder.invariantProps: BasicButtonStyleBuilder
    @Composable
    get() = this
        .shape(CircleShape)
        .disableAlpha(0.4f)

public val BasicButton.Size48: WrapperBasicButtonSize48
    @Composable
    @JvmName("WrapperBasicButtonSize48")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsSbComTheme.typography.headerH4Medium)
        .valueStyle(SddsSbComTheme.typography.headerH4Medium)
        .dimensions {
            height(48.0.dp)
            paddingStart(24.0.dp)
            paddingEnd(24.0.dp)
            minWidth(84.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(6.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonSize48)

public val WrapperBasicButtonSize48BgNoView.ModeAccentGrey: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize48BgNoViewModeAccentGrey")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            spinnerColor(SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive())
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize48BgNoView.ModeDangerTint: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize48BgNoViewModeDangerTint")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize48BgNoView.ModePrimary: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize48BgNoViewModePrimary")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize48BgNoView.ModeAccentFilled: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize48BgNoViewModeAccentFilled")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize48BgNoView.ModeAccentWhite: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize48BgNoViewModeAccentWhite")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize48.BgNo: WrapperBasicButtonSize48BgNo
    @Composable
    @JvmName("WrapperBasicButtonSize48BgNo")
    get() = builder
        .wrap(::WrapperBasicButtonSize48BgNo)

public val BasicButton.Size40: WrapperBasicButtonSize40
    @Composable
    @JvmName("WrapperBasicButtonSize40")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsSbComTheme.typography.headerH4Medium)
        .valueStyle(SddsSbComTheme.typography.headerH4Medium)
        .dimensions {
            height(40.0.dp)
            paddingStart(20.0.dp)
            paddingEnd(20.0.dp)
            minWidth(71.0.dp)
            iconSize(24.0.dp)
            spinnerSize(24.0.dp)
            spinnerStrokeWidth(2.0.dp)
            iconMargin(6.0.dp)
            valueMargin(4.0.dp)
        }
        .wrap(::WrapperBasicButtonSize40)

public val WrapperBasicButtonSize40BgNoView.ModeAccentGrey: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize40BgNoViewModeAccentGrey")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            spinnerColor(SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive())
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize40BgNoView.ModeDangerTint: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize40BgNoViewModeDangerTint")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize40BgNoView.ModePrimary: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize40BgNoViewModePrimary")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize40BgNoView.ModeAccentFilled: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize40BgNoViewModeAccentFilled")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize40BgNoView.ModeAccentWhite: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize40BgNoViewModeAccentWhite")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize40.BgNo: WrapperBasicButtonSize40BgNo
    @Composable
    @JvmName("WrapperBasicButtonSize40BgNo")
    get() = builder
        .wrap(::WrapperBasicButtonSize40BgNo)

public val BasicButton.Size32: WrapperBasicButtonSize32
    @Composable
    @JvmName("WrapperBasicButtonSize32")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsSbComTheme.typography.headerH4Medium)
        .valueStyle(SddsSbComTheme.typography.headerH4Medium)
        .dimensions {
            height(32.0.dp)
            paddingStart(16.0.dp)
            paddingEnd(16.0.dp)
            minWidth(57.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(6.0.dp)
            valueMargin(2.0.dp)
        }
        .wrap(::WrapperBasicButtonSize32)

public val WrapperBasicButtonSize32BgNoView.ModeAccentGrey: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize32BgNoViewModeAccentGrey")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            spinnerColor(SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive())
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize32BgNoView.ModeDangerTint: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize32BgNoViewModeDangerTint")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize32BgNoView.ModePrimary: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize32BgNoViewModePrimary")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize32BgNoView.ModeAccentFilled: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize32BgNoViewModeAccentFilled")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize32BgNoView.ModeAccentWhite: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize32BgNoViewModeAccentWhite")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize32.BgNo: WrapperBasicButtonSize32BgNo
    @Composable
    @JvmName("WrapperBasicButtonSize32BgNo")
    get() = builder
        .wrap(::WrapperBasicButtonSize32BgNo)

public val BasicButton.Size24: WrapperBasicButtonSize24
    @Composable
    @JvmName("WrapperBasicButtonSize24")
    get() = ButtonStyle.basicButtonBuilder(this)
        .invariantProps
        .labelStyle(SddsSbComTheme.typography.bodySMedium)
        .valueStyle(SddsSbComTheme.typography.bodySMedium)
        .dimensions {
            height(24.0.dp)
            paddingStart(12.0.dp)
            paddingEnd(12.0.dp)
            minWidth(53.0.dp)
            iconSize(16.0.dp)
            spinnerSize(16.0.dp)
            spinnerStrokeWidth(1.0.dp)
            iconMargin(4.0.dp)
            valueMargin(2.0.dp)
        }
        .wrap(::WrapperBasicButtonSize24)

public val WrapperBasicButtonSize24BgNoView.ModeAccentGrey: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize24BgNoViewModeAccentGrey")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            spinnerColor(SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive())
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize24BgNoView.ModeDangerTint: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize24BgNoViewModeDangerTint")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultClear).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultNegative).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultNegativeHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultNegativeHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize24BgNoView.ModePrimary: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize24BgNoViewModePrimary")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidPrimaryHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textDefaultPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize24BgNoView.ModeAccentFilled: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize24BgNoViewModeAccentFilled")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue())
            labelColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.textOnDarkPrimary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textOnDarkPrimaryHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.textOnDarkPrimary.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.textOnDarkPrimaryHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize24BgNoView.ModeAccentWhite: WrapperBasicButtonTerminate
    @Composable
    @JvmName("WrapperBasicButtonSize24BgNoViewModeAccentWhite")
    get() = builder
        .loadingAlpha(0.0f)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefault).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceOnDarkSolidDefaultHover),
                ),
            )
            labelColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            valueColor(
                SolidColor(SddsSbComTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.textDefaultSecondaryHover),
                ),
            )
            iconColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultAccent).asStatefulValue(
                    setOf(InteractiveState.Hovered)
                        to SolidColor(SddsSbComTheme.colors.surfaceDefaultAccentHover),
                ),
            )
            spinnerColor(
                SddsSbComTheme.colors.surfaceDefaultAccent.asInteractive(
                    setOf(InteractiveState.Hovered)
                        to SddsSbComTheme.colors.surfaceDefaultAccentHover,
                ),
            )
        }
        .wrap(::WrapperBasicButtonTerminate)

public val WrapperBasicButtonSize24.BgNo: WrapperBasicButtonSize24BgNo
    @Composable
    @JvmName("WrapperBasicButtonSize24BgNo")
    get() = builder
        .wrap(::WrapperBasicButtonSize24BgNo)
