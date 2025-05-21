// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.tooltip

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.TooltipStyle
import com.sdds.compose.uikit.TooltipStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asInteractive
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
public interface WrapperTooltip : BuilderWrapper<TooltipStyle, TooltipStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperTooltipM(
    public override val builder: TooltipStyleBuilder,
) : WrapperTooltip

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperTooltipS(
    public override val builder: TooltipStyleBuilder,
) : WrapperTooltip

private val TooltipStyleBuilder.invariantProps: TooltipStyleBuilder
    @Composable
    get() = this
        .shadow(StarDsTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceOnDarkSolidSecondary).asStatefulValue(),
            )
            textColor(
                SolidColor(StarDsTheme.colors.textOnDarkPrimary).asStatefulValue(),
            )
            contentStartColor(
                StarDsTheme.colors.textOnDarkSecondary.asInteractive(),
            )
        }
        .dimensions {
            contentStartSize(dimensionResource(R.dimen.sdkit_cmp_tooltip_content_start_size))
        }

public val Tooltip.M: WrapperTooltipM
    @Composable
    @JvmName("WrapperTooltipM")
    get() = TooltipStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_tooltip_shapeAdjustment_m),
            ),
        )
        .textStyle(StarDsTheme.typography.bodySNormal)
        .dimensions {
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_tooltip_content_start_padding_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_end_m))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_top_m))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_bottom_m))
            offset(dimensionResource(R.dimen.sdkit_cmp_tooltip_offset_m))
            tailWidth(dimensionResource(R.dimen.sdkit_cmp_tooltip_tail_width_m))
            tailHeight(dimensionResource(R.dimen.sdkit_cmp_tooltip_tail_height_m))
            tailPadding(dimensionResource(R.dimen.sdkit_cmp_tooltip_tail_padding_m))
        }
        .wrap(::WrapperTooltipM)

public val Tooltip.S: WrapperTooltipS
    @Composable
    @JvmName("WrapperTooltipS")
    get() = TooltipStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .textStyle(StarDsTheme.typography.bodyXsNormal)
        .dimensions {
            contentStartPadding(dimensionResource(R.dimen.sdkit_cmp_tooltip_content_start_padding_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_end_s))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_top_s))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_tooltip_padding_bottom_s))
            offset(dimensionResource(R.dimen.sdkit_cmp_tooltip_offset_s))
            tailWidth(dimensionResource(R.dimen.sdkit_cmp_tooltip_tail_width_s))
            tailHeight(dimensionResource(R.dimen.sdkit_cmp_tooltip_tail_height_s))
            tailPadding(dimensionResource(R.dimen.sdkit_cmp_tooltip_tail_padding_s))
        }
        .wrap(::WrapperTooltipS)
