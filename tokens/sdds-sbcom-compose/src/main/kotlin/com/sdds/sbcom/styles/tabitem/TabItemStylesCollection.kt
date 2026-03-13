// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.tabitem

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.TabItemStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента TabItem
 */
public enum class TabItemStyles(
    public val key: String,
) {
    TabItemFolderDefault("TabItemFolder.Default"),
}

/**
 * Возвращает [TabItemStyle] для [TabItemStyles]
 */
@Composable
public fun TabItemStyles.style(modifyAction: @Composable TabItemStyleBuilder.() -> Unit = {}): TabItemStyle {
    val builder = when (this) {
        TabItemStyles.TabItemFolderDefault -> TabItemFolder.Default
    }
    return builder.modify(modifyAction).style()
}
