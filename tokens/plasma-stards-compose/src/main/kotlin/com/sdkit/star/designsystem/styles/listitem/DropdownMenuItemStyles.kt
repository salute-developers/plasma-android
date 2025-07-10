// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.asInteractive
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
public interface WrapperDropdownMenuItem : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Интерфейс, который реализуют все обертки вариаций корневого уровня
 * и обертки их подвариаций.
 * Является ресивером для extension-функций view,
 * применимых к этим оберткам.
 */
public interface WrapperDropdownMenuItemView : WrapperDropdownMenuItem

/**
 * Терминальная обертка
 */
@JvmInline
public value class WrapperDropdownMenuItemTerminate(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItem

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuItemXl(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemView

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuItemL(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemView

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuItemM(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemView

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuItemS(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemView

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuItemXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperDropdownMenuItemView

public val WrapperDropdownMenuItemView.Default: WrapperDropdownMenuItemTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                ),
            )
        }
        .wrap(::WrapperDropdownMenuItemTerminate)

public val WrapperDropdownMenuItemView.Positive: WrapperDropdownMenuItemTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultPositive.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                ),
            )
        }
        .wrap(::WrapperDropdownMenuItemTerminate)

public val WrapperDropdownMenuItemView.Negative: WrapperDropdownMenuItemTerminate
    @Composable
    get() = builder
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultNegative.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                ),
            )
        }
        .wrap(::WrapperDropdownMenuItemTerminate)

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.surfaceInverseSolidPrimary,
                ),
            )
            disclosureIconColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseSecondary,
                ),
            )
        }

public val DropdownMenuItem.Xl: WrapperDropdownMenuItemXl
    @Composable
    @JvmName("WrapperDropdownMenuItemXl")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundL)
        .titleStyle(StarDsTheme.typography.bodyLNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_content_padding_end_xl))
            height(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_height_xl))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_start_xl))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_end_xl))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_top_xl))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_bottom_xl))
        }
        .wrap(::WrapperDropdownMenuItemXl)

public val DropdownMenuItem.L: WrapperDropdownMenuItemL
    @Composable
    @JvmName("WrapperDropdownMenuItemL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_shapeAdjustment_l),
            ),
        )
        .titleStyle(StarDsTheme.typography.bodyLNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_content_padding_end_l))
            height(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_height_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_end_l))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_top_l))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_bottom_l))
        }
        .wrap(::WrapperDropdownMenuItemL)

public val DropdownMenuItem.M: WrapperDropdownMenuItemM
    @Composable
    @JvmName("WrapperDropdownMenuItemM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .titleStyle(StarDsTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_content_padding_end_m))
            height(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_height_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_end_m))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_top_m))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_bottom_m))
        }
        .wrap(::WrapperDropdownMenuItemM)

public val DropdownMenuItem.S: WrapperDropdownMenuItemS
    @Composable
    @JvmName("WrapperDropdownMenuItemS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_shapeAdjustment_s),
            ),
        )
        .titleStyle(StarDsTheme.typography.bodySNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_content_padding_end_s))
            height(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_height_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_end_s))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_top_s))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_bottom_s))
        }
        .wrap(::WrapperDropdownMenuItemS)

public val DropdownMenuItem.Xs: WrapperDropdownMenuItemXs
    @Composable
    @JvmName("WrapperDropdownMenuItemXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .titleStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_content_padding_end_xs))
            height(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_height_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_end_xs))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_top_xs))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_item_padding_bottom_xs))
        }
        .wrap(::WrapperDropdownMenuItemXs)
