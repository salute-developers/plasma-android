// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.listitem

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.InteractiveState
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
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultClear).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.surfaceDefaultSolidDefault),
                    setOf(InteractiveState.Activated) to
                        SolidColor(StarDsTheme.colors.surfaceDefaultTransparentSecondary),
                ),
            )
            titleColor(
                SolidColor(StarDsTheme.colors.textDefaultPrimary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInversePrimary),
                ),
            )
            subtitleColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
                ),
            )
            labelColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
                ),
            )
            disclosureIconColor(
                SolidColor(StarDsTheme.colors.textDefaultSecondary).asStatefulValue(
                    setOf(InteractiveState.Focused)
                        to SolidColor(StarDsTheme.colors.textInverseSecondary),
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
        .titleStyle(
            StarDsTheme.typography.bodyLNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyLBold,
            ),
        )
        .subtitleStyle(StarDsTheme.typography.bodyMNormal)
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_l))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_l))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_l))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_l))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_l))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_l))
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_start_l))
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
        .titleStyle(
            StarDsTheme.typography.bodyMNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyMBold,
            ),
        )
        .subtitleStyle(StarDsTheme.typography.bodySNormal)
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_m))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_m))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_m))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_m))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_m))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_m))
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_start_m))
        }
        .wrap(::WrapperListItemM)

public val ListItem.S: WrapperListItemS
    @Composable
    @JvmName("WrapperListItemS")
    get() = ListItemStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .titleStyle(
            StarDsTheme.typography.bodySNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodySBold,
            ),
        )
        .subtitleStyle(StarDsTheme.typography.bodyXsNormal)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_s))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_s))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_s))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_s))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_s))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_s))
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_start_s))
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
        .titleStyle(
            StarDsTheme.typography.bodyXsNormal.asStatefulValue(
                setOf(InteractiveState.Focused)
                    to StarDsTheme.typography.bodyXsBold,
            ),
        )
        .subtitleStyle(StarDsTheme.typography.bodyXsNormal)
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureIcon(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16)
        .dimensions {
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_end_xs))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_start_xs))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_end_xs))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_top_xs))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_list_item_padding_bottom_xs))
            height(dimensionResource(R.dimen.sdkit_cmp_list_item_height_xs))
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_list_item_content_padding_start_xs))
        }
        .wrap(::WrapperListItemXs)
