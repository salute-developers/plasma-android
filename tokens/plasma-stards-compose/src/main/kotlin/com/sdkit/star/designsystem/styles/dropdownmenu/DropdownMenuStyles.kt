// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.dimensionResource
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownMenuStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.divider.Default
import com.sdkit.star.designsystem.styles.divider.Divider
import com.sdkit.star.designsystem.styles.list.DropdownMenuList
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xl
import com.sdkit.star.designsystem.styles.list.Xs
import com.sdkit.star.designsystem.styles.scrollbar.S
import com.sdkit.star.designsystem.styles.scrollbar.ScrollBar
import com.sdkit.star.designsystem.theme.StarDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenu : BuilderWrapper<DropdownMenuStyle, DropdownMenuStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuXl(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenu

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuL(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenu

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuM(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenu

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuS(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenu

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuXs(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenu

private val DropdownMenuStyleBuilder.invariantProps: DropdownMenuStyleBuilder
    @Composable
    get() = this
        .shadow(StarDsTheme.shadows.downSoftS)
        .colors {
            backgroundColor(
                SolidColor(StarDsTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
            strokeColor(
                SolidColor(StarDsTheme.colors.outlineDefaultTransparentPrimary).asStatefulValue(),
            )
        }
        .dimensions {
            offset(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_offset))
            strokeWidth(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_stroke_width))
            paddingStart(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_padding_start))
            paddingEnd(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_padding_end))
            paddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_padding_top))
            paddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_padding_bottom))
        }
        .dividerStyle(Divider.Default.style())
        .scrollBarStyle(ScrollBar.S.style())

public val DropdownMenu.Xl: WrapperDropdownMenuXl
    @Composable
    @JvmName("WrapperDropdownMenuXl")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundL)
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_width_xl))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_top_xl))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_bottom_xl))
        }
        .listStyle(DropdownMenuList.Xl.style())
        .wrap(::WrapperDropdownMenuXl)

public val DropdownMenu.L: WrapperDropdownMenuL
    @Composable
    @JvmName("WrapperDropdownMenuL")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundL.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_shapeAdjustment_l),
            ),
        )
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_width_l))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_top_l))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_bottom_l))
        }
        .listStyle(DropdownMenuList.L.style())
        .wrap(::WrapperDropdownMenuL)

public val DropdownMenu.M: WrapperDropdownMenuM
    @Composable
    @JvmName("WrapperDropdownMenuM")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundM)
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_width_m))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_top_m))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_bottom_m))
        }
        .listStyle(DropdownMenuList.M.style())
        .wrap(::WrapperDropdownMenuM)

public val DropdownMenu.S: WrapperDropdownMenuS
    @Composable
    @JvmName("WrapperDropdownMenuS")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(
            StarDsTheme.shapes.roundM.adjustBy(
                all =
                dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_shapeAdjustment_s),
            ),
        )
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_width_s))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_top_s))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_bottom_s))
        }
        .listStyle(DropdownMenuList.S.style())
        .wrap(::WrapperDropdownMenuS)

public val DropdownMenu.Xs: WrapperDropdownMenuXs
    @Composable
    @JvmName("WrapperDropdownMenuXs")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StarDsTheme.shapes.roundS)
        .dimensions {
            width(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_width_xs))
            scrollBarPaddingTop(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_top_xs))
            scrollBarPaddingBottom(dimensionResource(R.dimen.sdkit_cmp_dropdown_menu_scroll_bar_padding_bottom_xs))
        }
        .listStyle(DropdownMenuList.Xs.style())
        .wrap(::WrapperDropdownMenuXs)
