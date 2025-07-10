// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.styles.divider.Default
import com.sdkit.star.designsystem.styles.divider.Divider
import com.sdkit.star.designsystem.styles.listitem.Default
import com.sdkit.star.designsystem.styles.listitem.DropdownMenuItem
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xl
import com.sdkit.star.designsystem.styles.listitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownMenuList : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperDropdownMenuListXl(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuList

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperDropdownMenuListL(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuList

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperDropdownMenuListM(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuList

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperDropdownMenuListS(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuList

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperDropdownMenuListXs(
    public override val builder: ListStyleBuilder,
) : WrapperDropdownMenuList

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this
        .dividerStyle(Divider.Default.style())

public val DropdownMenuList.Xl: WrapperDropdownMenuListXl
    @Composable
    @JvmName("WrapperDropdownMenuListXl")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItem.Xl.Default.style())
        .wrap(::WrapperDropdownMenuListXl)

public val DropdownMenuList.L: WrapperDropdownMenuListL
    @Composable
    @JvmName("WrapperDropdownMenuListL")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItem.L.Default.style())
        .wrap(::WrapperDropdownMenuListL)

public val DropdownMenuList.M: WrapperDropdownMenuListM
    @Composable
    @JvmName("WrapperDropdownMenuListM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItem.M.Default.style())
        .wrap(::WrapperDropdownMenuListM)

public val DropdownMenuList.S: WrapperDropdownMenuListS
    @Composable
    @JvmName("WrapperDropdownMenuListS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItem.S.Default.style())
        .wrap(::WrapperDropdownMenuListS)

public val DropdownMenuList.Xs: WrapperDropdownMenuListXs
    @Composable
    @JvmName("WrapperDropdownMenuListXs")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(DropdownMenuItem.Xs.Default.style())
        .wrap(::WrapperDropdownMenuListXs)
