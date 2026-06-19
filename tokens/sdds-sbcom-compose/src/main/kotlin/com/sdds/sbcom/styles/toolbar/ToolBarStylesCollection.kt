// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.toolbar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.ToolBarStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ToolBar
 */
public enum class ToolBarStyles(
    public val key: String,
) {
    ToolBarTypeDefault("ToolBar.TypeDefault"),
    ToolBarTypeGroup("ToolBar.TypeGroup"),
    ;

    /**
     * Typed API для подбора стиля tool-bar
     */
    public companion object
}

/**
 * Возможные значения свойства type для tool-bar
 */
public enum class ToolBarType {
    Default,
    Group,
}

/**
 * Возвращает [ToolBarStyle] для [ToolBarStyles]
 */
@Composable
public fun ToolBarStyles.style(modify: @Composable ToolBarStyleBuilder.() -> Unit = {}): ToolBarStyle {
    val builder = when (this) {
        ToolBarStyles.ToolBarTypeDefault -> ToolBar.TypeDefault
        ToolBarStyles.ToolBarTypeGroup -> ToolBar.TypeGroup
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ToolBarStyles] для tool-bar
 */
public fun ToolBarStyles.Companion.resolve(type: ToolBarType = ToolBarType.Default): ToolBarStyles =
    when {
        type == ToolBarType.Default -> ToolBarStyles.ToolBarTypeDefault
        type == ToolBarType.Group -> ToolBarStyles.ToolBarTypeGroup
        else -> error("Unsupported tool-bar style combination")
    }

/**
 * Возвращает [ToolBarStyle] для tool-bar
 */
@Composable
public fun ToolBarStyles.Companion.style(
    type: ToolBarType = ToolBarType.Default,
    modify: @Composable ToolBarStyleBuilder.() -> Unit = {},
): ToolBarStyle =
    resolve(type).style(modify)
