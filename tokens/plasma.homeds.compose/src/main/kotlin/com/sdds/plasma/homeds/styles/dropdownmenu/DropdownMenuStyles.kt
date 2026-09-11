// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownMenuStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.divider.Default
import com.sdds.plasma.homeds.styles.divider.Divider
import com.sdds.plasma.homeds.styles.dropdownloadingstate.Default
import com.sdds.plasma.homeds.styles.dropdownloadingstate.DropdownLoadingState
import com.sdds.plasma.homeds.styles.list.Default
import com.sdds.plasma.homeds.styles.list.DropdownMenuList
import com.sdds.plasma.homeds.styles.scrollbar.S
import com.sdds.plasma.homeds.styles.scrollbar.ScrollBar
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenu : BuilderWrapper<DropdownMenuStyle, DropdownMenuStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDropdownMenuDefault(
    public override val builder: DropdownMenuStyleBuilder,
) : WrapperDropdownMenu

public val DropdownMenu.Default: WrapperDropdownMenuDefault
    @Composable
    @JvmName("WrapperDropdownMenuDefault")
    get() = DropdownMenuStyle.builder(this)
        .shape(PlasmaHomeDsTheme.shapes.roundXl)
        .shadow(PlasmaHomeDsTheme.shadows.downSoftS)
        .listStyle(DropdownMenuList.Default.style())
        .dividerStyle(Divider.Default.style())
        .scrollBarStyle(ScrollBar.S.style())
        .loadingStateStyle(DropdownLoadingState.Default.style())
        .colors {
            backgroundColor(SolidColor(PlasmaHomeDsTheme.colors.surfaceDefaultSolidCard).asStatefulValue())
            strokeColor(SolidColor(PlasmaHomeDsTheme.colors.outlineDefaultTransparentPrimary).asStatefulValue())
        }
        .dimensions {
            width(200.0.dp)
            offset(8.0.dp)
            strokeWidth(1.0.dp)
            paddingStart(0.0.dp)
            paddingEnd(0.0.dp)
            paddingTop(6.0.dp)
            paddingBottom(6.0.dp)
            scrollBarPaddingTop(6.0.dp)
            scrollBarPaddingBottom(8.0.dp)
        }
        .wrap(::WrapperDropdownMenuDefault)
