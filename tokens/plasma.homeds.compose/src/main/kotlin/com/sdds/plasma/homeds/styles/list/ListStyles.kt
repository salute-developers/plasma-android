// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.listitem.ListItem
import com.sdds.plasma.homeds.styles.listitem.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperList : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListS(
    public override val builder: ListStyleBuilder,
) : WrapperList

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this

public val List.S: WrapperListS
    @Composable
    @JvmName("WrapperListS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListItem.S.style())
        .wrap(::WrapperListS)
