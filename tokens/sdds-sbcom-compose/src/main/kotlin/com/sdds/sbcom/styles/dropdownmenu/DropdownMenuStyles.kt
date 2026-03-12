// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.dropdownmenu

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownMenuStyle
import com.sdds.compose.uikit.DropdownMenuStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider
import com.sdds.sbcom.styles.scrollbar.Default
import com.sdds.sbcom.styles.scrollbar.ScrollBar
import com.sdds.sbcom.theme.SddsSbComTheme
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
        .shadow(SddsSbComTheme.shadows.downHardM)
        .colors {
            backgroundColor(
                SolidColor(SddsSbComTheme.colors.surfaceDefaultSolidCard).asStatefulValue(),
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
        .scrollBarStyle(ScrollBar.Default.style())
        .wrap(::WrapperDropdownMenuDefault)
