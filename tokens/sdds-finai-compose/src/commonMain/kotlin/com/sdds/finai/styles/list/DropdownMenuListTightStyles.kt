// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.finai.styles.divider.Default
import com.sdds.finai.styles.divider.Divider
import com.sdds.finai.styles.listitem.Default
import com.sdds.finai.styles.listitem.DropdownMenuItemTight
import com.sdds.finai.styles.listitem.M
import com.sdds.finai.styles.listitem.S
import com.sdds.finai.styles.listitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuListTight : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuListTightM(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuListTightS(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuListTightXs(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListTight

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())

public val DropdownMenuListTight.M: WrapperDropdownMenuListTightM
    @Composable
    @JvmName("WrapperDropdownMenuListTightM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemTight.M.Default.style())
        .wrap(::WrapperDropdownMenuListTightM)

public val DropdownMenuListTight.S: WrapperDropdownMenuListTightS
    @Composable
    @JvmName("WrapperDropdownMenuListTightS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemTight.S.Default.style())
        .wrap(::WrapperDropdownMenuListTightS)

public val DropdownMenuListTight.Xs: WrapperDropdownMenuListTightXs
    @Composable
    @JvmName("WrapperDropdownMenuListTightXs")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemTight.Xs.Default.style())
        .wrap(::WrapperDropdownMenuListTightXs)
