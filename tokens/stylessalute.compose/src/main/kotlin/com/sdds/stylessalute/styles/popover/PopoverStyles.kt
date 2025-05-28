// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.popover

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.PopoverStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperPopover : BuilderWrapper<PopoverStyle, PopoverStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperPopoverView : WrapperPopover

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperPopoverTerminate(
    public override val builder: PopoverStyleBuilder,
) : WrapperPopover

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperPopoverM(
    public override val builder: PopoverStyleBuilder,
) : WrapperPopoverView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperPopoverS(
    public override val builder: PopoverStyleBuilder,
) : WrapperPopoverView

public val WrapperPopoverView.Default: WrapperPopoverTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(StylesSaluteTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }
        .wrap(::WrapperPopoverTerminate)

public val WrapperPopoverView.Accent: WrapperPopoverTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(StylesSaluteTheme.colors.surfaceDefaultAccentMain).asStatefulValue(),
            )
        }
        .wrap(::WrapperPopoverTerminate)

private val PopoverStyleBuilder.invariantProps: PopoverStyleBuilder
    @Composable
    get() = this
        .shadow(StylesSaluteTheme.shadows.downHardM)
        .dimensions {
            width(182.0.dp)
            offset(8.0.dp)
            tailWidth(20.0.dp)
            tailHeight(8.0.dp)
        }

public val Popover.M: WrapperPopoverM
    @Composable
    @JvmName("WrapperPopoverM")
    get() = PopoverStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL)
        .dimensions {
            tailPadding(20.0.dp)
        }
        .wrap(::WrapperPopoverM)

public val Popover.S: WrapperPopoverS
    @Composable
    @JvmName("WrapperPopoverS")
    get() = PopoverStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .dimensions {
            tailPadding(16.0.dp)
        }
        .wrap(::WrapperPopoverS)
