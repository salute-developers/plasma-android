// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.app.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.giga.app.styles.listitem.L
import com.sdds.plasma.giga.app.styles.listitem.ListItemTight
import com.sdds.plasma.giga.app.styles.listitem.M
import com.sdds.plasma.giga.app.styles.listitem.S
import com.sdds.plasma.giga.app.styles.listitem.Xl
import com.sdds.plasma.giga.app.styles.listitem.Xs
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListTight : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации Xl
 */
@JvmInline
public value class WrapperListTightXl(
    public override val builder: ListStyleBuilder,
) : WrapperListTight

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperListTightL(
    public override val builder: ListStyleBuilder,
) : WrapperListTight

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperListTightM(
    public override val builder: ListStyleBuilder,
) : WrapperListTight

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListTightS(
    public override val builder: ListStyleBuilder,
) : WrapperListTight

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperListTightXs(
    public override val builder: ListStyleBuilder,
) : WrapperListTight

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this

public val ListTight.Xl: WrapperListTightXl
    @Composable
    @JvmName("WrapperListTightXl")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemTight.Xl.style())
        .wrap(::WrapperListTightXl)

public val ListTight.L: WrapperListTightL
    @Composable
    @JvmName("WrapperListTightL")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemTight.L.style())
        .wrap(::WrapperListTightL)

public val ListTight.M: WrapperListTightM
    @Composable
    @JvmName("WrapperListTightM")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemTight.M.style())
        .wrap(::WrapperListTightM)

public val ListTight.S: WrapperListTightS
    @Composable
    @JvmName("WrapperListTightS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemTight.S.style())
        .wrap(::WrapperListTightS)

public val ListTight.Xs: WrapperListTightXs
    @Composable
    @JvmName("WrapperListTightXs")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItemTight.Xs.style())
        .wrap(::WrapperListTightXs)
