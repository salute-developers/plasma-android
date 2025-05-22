// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.popover

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.PopoverStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.theme.StarDsTheme
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
                SolidColor(StarDsTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }
        .wrap(::WrapperPopoverTerminate)

public val WrapperPopoverView.Accent: WrapperPopoverTerminate
    @Composable
    get() = builder
        .colors {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultAccentMain).asStatefulValue(),
            )
        }
        .wrap(::WrapperPopoverTerminate)

private val PopoverStyleBuilder.invariantProps: PopoverStyleBuilder
    @Composable
    get() = this
        .shadow(StarDsTheme.shadows.downHardM)
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_popover_width))
            offset(dimensionResource(R.dimen.sdkit_cmp_popover_offset))
            tailWidth(dimensionResource(R.dimen.sdkit_cmp_popover_tail_width))
            tailHeight(dimensionResource(R.dimen.sdkit_cmp_popover_tail_height))
        }

public val Popover.M: WrapperPopoverM
    @Composable
    @JvmName("WrapperPopoverM")
    get() = PopoverStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundL)
        .dimensions {
            tailPadding(dimensionResource(R.dimen.sdkit_cmp_popover_tail_padding_m))
        }
        .wrap(::WrapperPopoverM)

public val Popover.S: WrapperPopoverS
    @Composable
    @JvmName("WrapperPopoverS")
    get() = PopoverStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            tailPadding(dimensionResource(R.dimen.sdkit_cmp_popover_tail_padding_s))
        }
        .wrap(::WrapperPopoverS)
