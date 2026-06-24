// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.selectitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.SelectItemStyle
import com.sdds.compose.uikit.SelectItemStyleBuilder
import com.sdds.compose.uikit.SelectItemType
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.cell.CellSelect
import com.sdkit.star.designsystem.styles.cell.L
import com.sdkit.star.designsystem.styles.cell.M
import com.sdkit.star.designsystem.styles.cell.S
import com.sdkit.star.designsystem.styles.cell.Xs
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperSelectItem : BuilderWrapper<SelectItemStyle, SelectItemStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperSelectItemL(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItem

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperSelectItemM(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItem

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperSelectItemS(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItem

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperSelectItemXs(
    public override val builder: SelectItemStyleBuilder,
) : WrapperSelectItem

private val SelectItemStyleBuilder.invariantProps: SelectItemStyleBuilder
    @Composable
    get() = this
        .itemType(SelectItemType.Single)
        .disableAlpha(0.4f)
        .colors {
            iconColor(StarDsTheme.colors.textDefaultAccent.asInteractive())
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                ),
            )
        }

public val SelectItem.L: WrapperSelectItemL
    @Composable
    @JvmName("WrapperSelectItemL")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundL)
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(CellSelect.L.style())
        .dimensions {
            controlSize(dimensionResource(R.dimen.sdkit_cmp_select_item_control_size_l))
            controlMargin(dimensionResource(R.dimen.sdkit_cmp_select_item_control_margin_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_end_l))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_top_l))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_bottom_l))
            height(dimensionResource(R.dimen.sdkit_cmp_select_item_height_l))
        }
        .wrap(::WrapperSelectItemL)

public val SelectItem.M: WrapperSelectItemM
    @Composable
    @JvmName("WrapperSelectItemM")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_select_item_shapeAdjustment_m),
            ),
        )
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(CellSelect.M.style())
        .dimensions {
            controlSize(dimensionResource(R.dimen.sdkit_cmp_select_item_control_size_m))
            controlMargin(dimensionResource(R.dimen.sdkit_cmp_select_item_control_margin_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_end_m))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_top_m))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_bottom_m))
            height(dimensionResource(R.dimen.sdkit_cmp_select_item_height_m))
        }
        .wrap(::WrapperSelectItemM)

public val SelectItem.S: WrapperSelectItemS
    @Composable
    @JvmName("WrapperSelectItemS")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_select_item_shapeAdjustment_s),
            ),
        )
        .icon(com.sdds.icons.R.drawable.ic_done_24)
        .cellStyle(CellSelect.S.style())
        .dimensions {
            controlSize(dimensionResource(R.dimen.sdkit_cmp_select_item_control_size_s))
            controlMargin(dimensionResource(R.dimen.sdkit_cmp_select_item_control_margin_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_end_s))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_top_s))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_bottom_s))
            height(dimensionResource(R.dimen.sdkit_cmp_select_item_height_s))
        }
        .wrap(::WrapperSelectItemS)

public val SelectItem.Xs: WrapperSelectItemXs
    @Composable
    @JvmName("WrapperSelectItemXs")
    get() = SelectItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_select_item_shapeAdjustment_xs),
            ),
        )
        .icon(com.sdds.icons.R.drawable.ic_done_16)
        .cellStyle(CellSelect.Xs.style())
        .dimensions {
            controlSize(dimensionResource(R.dimen.sdkit_cmp_select_item_control_size_xs))
            controlMargin(dimensionResource(R.dimen.sdkit_cmp_select_item_control_margin_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_end_xs))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_top_xs))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_select_item_padding_bottom_xs))
            height(dimensionResource(R.dimen.sdkit_cmp_select_item_height_xs))
        }
        .wrap(::WrapperSelectItemXs)
