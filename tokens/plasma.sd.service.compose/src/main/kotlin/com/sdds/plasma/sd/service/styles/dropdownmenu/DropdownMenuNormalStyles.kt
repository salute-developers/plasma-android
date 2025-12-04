// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownMenuStyleBuilder
import com.sdds.compose.uikit.adjustBy
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.divider.Default
import com.sdds.plasma.sd.service.styles.divider.Divider
import com.sdds.plasma.sd.service.styles.dropdownemptystate.DropdownEmptyState
import com.sdds.plasma.sd.service.styles.dropdownemptystate.HasButton
import com.sdds.plasma.sd.service.styles.dropdownemptystate.L
import com.sdds.plasma.sd.service.styles.dropdownemptystate.M
import com.sdds.plasma.sd.service.styles.dropdownemptystate.S
import com.sdds.plasma.sd.service.styles.dropdownemptystate.Xl
import com.sdds.plasma.sd.service.styles.dropdownemptystate.Xs
import com.sdds.plasma.sd.service.styles.list.DropdownMenuListNormal
import com.sdds.plasma.sd.service.styles.list.L
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.list.S
import com.sdds.plasma.sd.service.styles.list.Xl
import com.sdds.plasma.sd.service.styles.list.Xs
import com.sdds.plasma.sd.service.styles.scrollbar.S
import com.sdds.plasma.sd.service.styles.scrollbar.ScrollBar
import com.sdds.plasma.sd.service.theme.PlasmaSdServiceTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuNormal :
    BuilderWrapper<DropdownMenuStyle, DropdownMenuStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuNormalXl(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuNormalL(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuNormalM(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuNormalS(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuNormalXs(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuNormal

private val DropdownMenuStyleBuilder.invariantProps: DropdownMenuStyleBuilder
    @Composable
    get() = this
        .shadow(PlasmaSdServiceTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(PlasmaSdServiceTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
            )
        }
        .dimensions {
            offset(8.0.dp)
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }
        .dividerStyle(Divider.Default.style())
        .scrollBarStyle(ScrollBar.S.style())

public val DropdownMenuNormal.Xl: WrapperDropdownMenuNormalXl
    @Composable
    @JvmName("WrapperDropdownMenuNormalXl")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL)
        .dimensions {
            width(200.0.dp)
            scrollBarPaddingTop(10.0.dp)
            scrollBarPaddingBottom(12.0.dp)
        }
        .listStyle(DropdownMenuListNormal.Xl.style())
        .emptyStateStyle(DropdownEmptyState.Xl.HasButton.style())
        .wrap(::WrapperDropdownMenuNormalXl)

public val DropdownMenuNormal.L: WrapperDropdownMenuNormalL
    @Composable
    @JvmName("WrapperDropdownMenuNormalL")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            width(200.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListNormal.L.style())
        .emptyStateStyle(DropdownEmptyState.L.HasButton.style())
        .wrap(::WrapperDropdownMenuNormalL)

public val DropdownMenuNormal.M: WrapperDropdownMenuNormalM
    @Composable
    @JvmName("WrapperDropdownMenuNormalM")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM)
        .dimensions {
            width(200.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListNormal.M.style())
        .emptyStateStyle(DropdownEmptyState.M.HasButton.style())
        .wrap(::WrapperDropdownMenuNormalM)

public val DropdownMenuNormal.S: WrapperDropdownMenuNormalS
    @Composable
    @JvmName("WrapperDropdownMenuNormalS")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            width(160.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListNormal.S.style())
        .emptyStateStyle(DropdownEmptyState.S.HasButton.style())
        .wrap(::WrapperDropdownMenuNormalS)

public val DropdownMenuNormal.Xs: WrapperDropdownMenuNormalXs
    @Composable
    @JvmName("WrapperDropdownMenuNormalXs")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(PlasmaSdServiceTheme.shapes.roundS)
        .dimensions {
            width(160.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListNormal.Xs.style())
        .emptyStateStyle(DropdownEmptyState.Xs.HasButton.style())
        .wrap(::WrapperDropdownMenuNormalXs)
