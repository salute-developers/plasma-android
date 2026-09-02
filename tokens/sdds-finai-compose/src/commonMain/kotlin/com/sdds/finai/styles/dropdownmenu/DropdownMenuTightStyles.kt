// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.dropdownmenu

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
import com.sdds.finai.styles.divider.Default
import com.sdds.finai.styles.divider.Divider
import com.sdds.finai.styles.dropdownemptystate.DropdownEmptyState
import com.sdds.finai.styles.dropdownemptystate.HasButton
import com.sdds.finai.styles.dropdownemptystate.M
import com.sdds.finai.styles.dropdownemptystate.S
import com.sdds.finai.styles.dropdownemptystate.Xs
import com.sdds.finai.styles.list.DropdownMenuListTight
import com.sdds.finai.styles.list.M
import com.sdds.finai.styles.list.S
import com.sdds.finai.styles.list.Xs
import com.sdds.finai.styles.scrollbar.Default
import com.sdds.finai.styles.scrollbar.ScrollBar
import com.sdds.finai.theme.SddsFinAiTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuTight :
    BuilderWrapper<DropdownMenuStyle, DropdownMenuStyleBuilder>

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
        .shadow(SddsFinAiTheme.shadows.downHardM)
        .dividerStyle(Divider.Default.style())
        .scrollBarStyle(ScrollBar.Default.style())
        .colors {
            backgroundColor(SolidColor(SddsFinAiTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
        }
        .dimensions {
            offset(8.0.dp)
            paddingStart(2.0.dp)
            paddingEnd(2.0.dp)
            paddingTop(2.0.dp)
            paddingBottom(2.0.dp)
        }

public val DropdownMenuTight.M: WrapperDropdownMenuTightM
    @Composable
    @JvmName("WrapperDropdownMenuTightM")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS)
        .listStyle(DropdownMenuListTight.M.style())
        .emptyStateStyle(DropdownEmptyState.M.HasButton.style())
        .dimensions {
            width(195.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuTightM)

public val DropdownMenuTight.S: WrapperDropdownMenuTightS
    @Composable
    @JvmName("WrapperDropdownMenuTightS")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundS.adjustBy(all = -2.0.dp))
        .listStyle(DropdownMenuListTight.S.style())
        .emptyStateStyle(DropdownEmptyState.S.HasButton.style())
        .dimensions {
            width(195.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuTightS)

public val DropdownMenuTight.Xs: WrapperDropdownMenuTightXs
    @Composable
    @JvmName("WrapperDropdownMenuTightXs")
    get() = DropdownMenuStyle.builder(this)
        .invariantProps
        .shape(SddsFinAiTheme.shapes.roundXs)
        .listStyle(DropdownMenuListTight.Xs.style())
        .emptyStateStyle(DropdownEmptyState.Xs.HasButton.style())
        .dimensions {
            width(195.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuTightXs)
