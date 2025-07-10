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
public interface WrapperListItem : BuilderWrapper<ListItemStyle, ListItemStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperListItemL(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListItemM(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListItemS(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperListItemXs(
    public override val builder: ListItemStyleBuilder,
) : WrapperListItem

private val ListItemStyleBuilder.invariantProps: ListItemStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInversePrimary,
                ),
            )
            backgroundColor(
                StarDsTheme.colors.surfaceDefaultClear.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.surfaceDefaultSolidDefault,
                    setOf(InteractiveState.Activated)
                        to StarDsTheme.colors.surfaceDefaultTransparentSecondary,
                ),
            )
            disclosureIconColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(
                    setOf(InteractiveState.Focused)
                        to StarDsTheme.colors.textInverseSecondary,
                ),
            )
        }

public val ListItem.L: WrapperListItemL
    @Composable
    @JvmName("WrapperListItemL")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_list_item_shapeAdjustment_l),
            ),
        )
        .titleStyle(StarDsTheme.typography.bodyLBold)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_l))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_l))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_l))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_l))
        }
        .wrap(::WrapperListItemL)

public val ListItem.M: WrapperListItemM
    @Composable
    @JvmName("WrapperListItemM")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_list_item_shapeAdjustment_m),
            ),
        )
        .titleStyle(StarDsTheme.typography.bodyMBold)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_m))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_m))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_m))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_m))
        }
        .wrap(::WrapperListItemM)

public val ListItem.S: WrapperListItemS
    @Composable
    @JvmName("WrapperListItemS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .titleStyle(StarDsTheme.typography.bodySBold)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_s))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_s))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_s))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_s))
        }
        .wrap(::WrapperListItemS)

public val ListItem.Xs: WrapperListItemXs
    @Composable
    @JvmName("WrapperListItemXs")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_list_item_shapeAdjustment_xs),
            ),
        )
        .titleStyle(StarDsTheme.typography.bodyXsBold)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_xs))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_xs))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_xs))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_xs))
        }
        .wrap(::WrapperListItemXs)
