// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.sbcom.styles.divider.Default
import com.sdds.sbcom.styles.divider.Divider
import com.sdds.sbcom.styles.listitem.Default
import com.sdds.sbcom.styles.listitem.DropdownMenuItem
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuList : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDropdownMenuListDefault(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuList

public val DropdownMenuList.Default: WrapperDropdownMenuListDefault
    @Composable
    @JvmName("WrapperDropdownMenuListDefault")
    get() = ListStyle.builder(this)
        .listItemStyle(DropdownMenuItem.Default.style())
        .dividerStyle(Divider.Default.style())
        .wrap(::WrapperDropdownMenuListDefault)
