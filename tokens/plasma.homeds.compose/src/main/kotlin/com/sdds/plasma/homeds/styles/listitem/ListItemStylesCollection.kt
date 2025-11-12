// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.listitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListItemStyle
import com.sdds.compose.uikit.ListItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ListItem
 */
public enum class ListItemStyles(
    public val key: String,
) {
    ListItemS("ListItem.S"),
    ListItemSHasBackground("ListItem.S.HasBackground"),
}

/**
 * Возвращает [ListItemStyle] для [ListItemStyles]
 */
@Composable
public fun ListItemStyles.style(modifyAction: @Composable ListItemStyleBuilder.() -> Unit = {}): ListItemStyle {
    val builder = when (this) {
        ListItemStyles.ListItemS -> ListItem.S
        ListItemStyles.ListItemSHasBackground -> ListItem.S.HasBackground
    }
    return builder.modify(modifyAction).style()
}
