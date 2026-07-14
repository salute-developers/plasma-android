// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.icontabitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента IconTabItem
 */
public enum class IconTabItemStyles(
    public val key: String,
) {
    IconTabItemL("IconTabItem.L"),
    IconTabItemM("IconTabItem.M"),
    IconTabItemS("IconTabItem.S"),
    IconTabItemXs("IconTabItem.Xs"),
    ;

    /**
     * Typed API для подбора стиля icon-tab-item
     */
    public companion object
}

/**
 * Возможные значения свойства size для icon-tab-item
 */
public enum class IconTabItemSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [TabItemStyle] для [IconTabItemStyles]
 */
@Composable
public fun IconTabItemStyles.style(modify: @Composable TabItemStyleBuilder.() -> Unit = {}): TabItemStyle {
    val builder = when (this) {
        IconTabItemStyles.IconTabItemL -> IconTabItem.L
        IconTabItemStyles.IconTabItemM -> IconTabItem.M
        IconTabItemStyles.IconTabItemS -> IconTabItem.S
        IconTabItemStyles.IconTabItemXs -> IconTabItem.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [IconTabItemStyles] для icon-tab-item
 */
public fun IconTabItemStyles.Companion.resolve(size: IconTabItemSize = IconTabItemSize.L): IconTabItemStyles = when {
    size == IconTabItemSize.L -> IconTabItemStyles.IconTabItemL
    size == IconTabItemSize.M -> IconTabItemStyles.IconTabItemM
    size == IconTabItemSize.S -> IconTabItemStyles.IconTabItemS
    size == IconTabItemSize.Xs -> IconTabItemStyles.IconTabItemXs
    else -> error("Unsupported icon-tab-item style combination")
}

/**
 * Возвращает [TabItemStyle] для icon-tab-item
 */
@Composable
public fun IconTabItemStyles.Companion.style(
    size: IconTabItemSize = IconTabItemSize.L,
    modify: @Composable TabItemStyleBuilder.() -> Unit = {},
): TabItemStyle =
    resolve(size).style(modify)
