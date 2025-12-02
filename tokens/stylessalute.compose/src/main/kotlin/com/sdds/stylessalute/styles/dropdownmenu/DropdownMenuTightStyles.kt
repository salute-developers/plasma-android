// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.dropdownmenu

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
import com.sdds.stylessalute.styles.divider.Default
import com.sdds.stylessalute.styles.divider.Divider
import com.sdds.stylessalute.styles.list.DropdownMenuListTight
import com.sdds.stylessalute.styles.list.L
import com.sdds.stylessalute.styles.list.M
import com.sdds.stylessalute.styles.list.S
import com.sdds.stylessalute.styles.list.Xs
import com.sdds.stylessalute.styles.scrollbar.S
import com.sdds.stylessalute.styles.scrollbar.ScrollBar
import com.sdds.stylessalute.theme.StylesSaluteTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuTight :
    BuilderWrapper<DropdownMenuStyle, DropdownMenuStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuTightL(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuTightM(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuTightS(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuTightXs(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenuTight

private val DropdownMenuStyleBuilder.invariantProps: DropdownMenuStyleBuilder
    @Composable
    get() = this
        .shadow(StylesSaluteTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(StylesSaluteTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
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

public val DropdownMenuTight.L: WrapperDropdownMenuTightL
    @Composable
    @JvmName("WrapperDropdownMenuTightL")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundL.adjustBy(all = -2.0.dp))
        .dimensions {
            width(200.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListTight.L.style())
        .wrap(::WrapperDropdownMenuTightL)

public val DropdownMenuTight.M: WrapperDropdownMenuTightM
    @Composable
    @JvmName("WrapperDropdownMenuTightM")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM)
        .dimensions {
            width(200.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListTight.M.style())
        .wrap(::WrapperDropdownMenuTightM)

public val DropdownMenuTight.S: WrapperDropdownMenuTightS
    @Composable
    @JvmName("WrapperDropdownMenuTightS")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundM.adjustBy(all = -2.0.dp))
        .dimensions {
            width(160.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListTight.S.style())
        .wrap(::WrapperDropdownMenuTightS)

public val DropdownMenuTight.Xs: WrapperDropdownMenuTightXs
    @Composable
    @JvmName("WrapperDropdownMenuTightXs")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(StylesSaluteTheme.shapes.roundS)
        .dimensions {
            width(160.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .listStyle(DropdownMenuListTight.Xs.style())
        .wrap(::WrapperDropdownMenuTightXs)
