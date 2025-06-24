// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.sd.service.styles.divider.Default
import com.sdds.plasma.sd.service.styles.divider.Divider
import com.sdds.plasma.sd.service.styles.listitem.Default
import com.sdds.plasma.sd.service.styles.listitem.DropdownMenuItemNormal
import com.sdds.plasma.sd.service.styles.listitem.L
import com.sdds.plasma.sd.service.styles.listitem.M
import com.sdds.plasma.sd.service.styles.listitem.S
import com.sdds.plasma.sd.service.styles.listitem.Xl
import com.sdds.plasma.sd.service.styles.listitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuListNormal : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuListNormalXl(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuListNormalL(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuListNormalM(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuListNormalS(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuListNormalXs(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuListNormal

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())

public val DropdownMenuListNormal.Xl: WrapperDropdownMenuListNormalXl
    @Composable
    @JvmName("WrapperDropdownMenuListNormalXl")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemNormal.Xl.Default.style())
        .wrap(::WrapperDropdownMenuListNormalXl)

public val DropdownMenuListNormal.L: WrapperDropdownMenuListNormalL
    @Composable
    @JvmName("WrapperDropdownMenuListNormalL")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemNormal.L.Default.style())
        .wrap(::WrapperDropdownMenuListNormalL)

public val DropdownMenuListNormal.M: WrapperDropdownMenuListNormalM
    @Composable
    @JvmName("WrapperDropdownMenuListNormalM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemNormal.M.Default.style())
        .wrap(::WrapperDropdownMenuListNormalM)

public val DropdownMenuListNormal.S: WrapperDropdownMenuListNormalS
    @Composable
    @JvmName("WrapperDropdownMenuListNormalS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemNormal.S.Default.style())
        .wrap(::WrapperDropdownMenuListNormalS)

public val DropdownMenuListNormal.Xs: WrapperDropdownMenuListNormalXs
    @Composable
    @JvmName("WrapperDropdownMenuListNormalXs")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItemNormal.Xs.Default.style())
        .wrap(::WrapperDropdownMenuListNormalXs)
