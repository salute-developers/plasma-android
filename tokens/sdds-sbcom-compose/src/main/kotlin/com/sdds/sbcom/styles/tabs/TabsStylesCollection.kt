// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.tabs

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.TabsStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Tabs
 */
public enum class TabsStyles(
    public val key: String,
) {
    TabsFolderDefault("TabsFolder.Default"),
}

/**
 * Возвращает [TabsStyle] для [TabsStyles]
 */
@Composable
public fun TabsStyles.style(modifyAction: @Composable TabsStyleBuilder.() -> Unit = {}): TabsStyle {
    val builder = when (this) {
        TabsStyles.TabsFolderDefault -> TabsFolder.Default
    }
    return builder.modify(modifyAction).style()
}
