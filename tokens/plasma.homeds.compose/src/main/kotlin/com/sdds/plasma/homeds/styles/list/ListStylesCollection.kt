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
import kotlin.Boolean
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
    ;

    /**
     * Typed API для подбора стиля list
     */
    public object Default

    /**
     * Typed API для подбора стиля list-numbered
     */
    public object Numbered
}

/**
 * Возможные значения свойства size для list
 */
public enum class ListDefaultSize {
    S,
}

/**
 * Возможные значения свойства size для list-numbered
 */
public enum class ListNumberedSize {
    S,
}

/**
 * Возвращает [ListStyle] для [ListStyles]
 */
@Composable
public fun ListStyles.style(modify: @Composable ListStyleBuilder.() -> Unit = {}): ListStyle {
    val builder = when (this) {
        ListStyles.ListS -> List.S
        ListStyles.ListSNoBackground -> List.S.NoBackground
        ListStyles.ListSNoBackgroundHasItemBackground -> List.S.NoBackground.HasItemBackground
        ListStyles.ListSHasBackground -> List.S.HasBackground
        ListStyles.ListNumberedS -> ListNumbered.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ListStyles] для list
 */
public fun ListStyles.Default.resolve(
    size: ListDefaultSize = ListDefaultSize.S,
    hasBackground: Boolean = false,
    hasItemBackground: Boolean = false,
): ListStyles = when {
    size == ListDefaultSize.S && hasBackground == false && hasItemBackground == true ->
        ListStyles.ListSNoBackgroundHasItemBackground
    size == ListDefaultSize.S && hasBackground == false -> ListStyles.ListSNoBackground
    size == ListDefaultSize.S && hasBackground == true -> ListStyles.ListSHasBackground
    size == ListDefaultSize.S -> ListStyles.ListS
    else -> error("Unsupported list style combination")
}

/**
 * Возвращает [ListStyle] для list
 */
@Composable
public fun ListStyles.Default.style(
    size: ListDefaultSize = ListDefaultSize.S,
    hasBackground: Boolean = false,
    hasItemBackground: Boolean = false,
    modify: @Composable ListStyleBuilder.() -> Unit = {},
): ListStyle = resolve(size, hasBackground, hasItemBackground).style(modify)

/**
 * Возвращает экземпляр [ListStyles] для list-numbered
 */
public fun ListStyles.Numbered.resolve(size: ListNumberedSize = ListNumberedSize.S): ListStyles =
    when {
        size == ListNumberedSize.S -> ListStyles.ListNumberedS
        else -> error("Unsupported list-numbered style combination")
    }

/**
 * Возвращает [ListStyle] для list-numbered
 */
@Composable
public fun ListStyles.Numbered.style(
    size: ListNumberedSize = ListNumberedSize.S,
    modify: @Composable ListStyleBuilder.() -> Unit = {},
): ListStyle =
    resolve(size).style(modify)
