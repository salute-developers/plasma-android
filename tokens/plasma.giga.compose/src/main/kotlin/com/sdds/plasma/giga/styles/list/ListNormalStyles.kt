// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.styles.listitem.L
import com.sdds.plasma.giga.styles.listitem.ListItemNormal
import com.sdds.plasma.giga.styles.listitem.M
import com.sdds.plasma.giga.styles.listitem.S
import com.sdds.plasma.giga.styles.listitem.Xl
import com.sdds.plasma.giga.styles.listitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListNormal : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperListNormalXl(
    public override val builder: ListStyleBuilder,
) : WrapperListNormal

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperListNormalL(
    public override val builder: ListStyleBuilder,
) : WrapperListNormal

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListNormalM(
    public override val builder: ListStyleBuilder,
) : WrapperListNormal

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListNormalS(
    public override val builder: ListStyleBuilder,
) : WrapperListNormal

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperListNormalXs(
    public override val builder: ListStyleBuilder,
) : WrapperListNormal

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this

public val ListNormal.Xl: WrapperListNormalXl
    @Composable
    @JvmName("WrapperListNormalXl")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemNormal.Xl.style())
        .wrap(::WrapperListNormalXl)

public val ListNormal.L: WrapperListNormalL
    @Composable
    @JvmName("WrapperListNormalL")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemNormal.L.style())
        .wrap(::WrapperListNormalL)

public val ListNormal.M: WrapperListNormalM
    @Composable
    @JvmName("WrapperListNormalM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemNormal.M.style())
        .wrap(::WrapperListNormalM)

public val ListNormal.S: WrapperListNormalS
    @Composable
    @JvmName("WrapperListNormalS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemNormal.S.style())
        .wrap(::WrapperListNormalS)

public val ListNormal.Xs: WrapperListNormalXs
    @Composable
    @JvmName("WrapperListNormalXs")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemNormal.Xs.style())
        .wrap(::WrapperListNormalXs)
