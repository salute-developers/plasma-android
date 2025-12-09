// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.list

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.listitem.ListNumberedItem
import com.sdds.plasma.homeds.styles.listitem.S
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperListNumbered : BuilderWrapper<ListStyle, ListStyleBuilder>

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperListNumberedS(
    public override val builder: ListStyleBuilder,
) : WrapperListNumbered

private val ListStyleBuilder.invariantProps: ListStyleBuilder
    @Composable
    get() = this

public val ListNumbered.S: WrapperListNumberedS
    @Composable
    @JvmName("WrapperListNumberedS")
    get() = ListStyle.builder(this)
        .invariantProps
        .listItemStyle(ListNumberedItem.S.style())
        .dimensions {
            gap(12.0.dp)
        }
        .wrap(::WrapperListNumberedS)
