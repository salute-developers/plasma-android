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
import com.sdkit.star.designsystem.styles.listitem.L
import com.sdkit.star.designsystem.styles.listitem.ListItem
import com.sdkit.star.designsystem.styles.listitem.M
import com.sdkit.star.designsystem.styles.listitem.S
import com.sdkit.star.designsystem.styles.listitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperList : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperListL(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListM(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListS(
    public override val builder: ListStyleBuilder,
) : WrapperList

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperListXs(
    public override val builder: ListStyleBuilder,
) : WrapperList

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this

public val List.L: WrapperListL
    @Composable
    @JvmName("WrapperListL")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.L.style())
        .wrap(::WrapperListL)

public val List.M: WrapperListM
    @Composable
    @JvmName("WrapperListM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.M.style())
        .wrap(::WrapperListM)

public val List.S: WrapperListS
    @Composable
    @JvmName("WrapperListS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.S.style())
        .wrap(::WrapperListS)

public val List.Xs: WrapperListXs
    @Composable
    @JvmName("WrapperListXs")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.Xs.style())
        .wrap(::WrapperListXs)
