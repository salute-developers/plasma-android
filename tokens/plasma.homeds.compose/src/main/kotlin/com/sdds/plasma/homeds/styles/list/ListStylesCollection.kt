// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.list

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.ListStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента List
 */
public enum class ListStyles(
    public val key: String,
) {
    ListS("List.S"),
    ListSNoBackground("List.S.NoBackground"),
    ListSNoBackgroundHasItemBackground("List.S.NoBackground.HasItemBackground"),
    ListSHasBackground("List.S.HasBackground"),
    ListNumberedS("ListNumbered.S"),
}

/**
 * Возвращает [ListStyle] для [ListStyles]
 */
@Composable
public fun ListStyles.style(modifyAction: @Composable ListStyleBuilder.() -> Unit = {}): ListStyle {
    val builder = when (this) {
        ListStyles.ListS -> List.S
        ListStyles.ListSNoBackground -> List.S.NoBackground
        ListStyles.ListSNoBackgroundHasItemBackground -> List.S.NoBackground.HasItemBackground
        ListStyles.ListSHasBackground -> List.S.HasBackground
        ListStyles.ListNumberedS -> ListNumbered.S
    }
    return builder.modify(modifyAction).style()
}
