// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.divider

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.DividerStyle
import com.sdds.compose.uikit.DividerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Divider
 */
public enum class DividerStyles(
    public val key: String,
) {
    DividerDefault("Divider.Default"),
}

/**
 * Возвращает [DividerStyle] для [DividerStyles]
 */
@Composable
public fun DividerStyles.style(modifyAction: @Composable DividerStyleBuilder.() -> Unit = {}): DividerStyle {
    val builder = when (this) {
        DividerStyles.DividerDefault -> Divider.Default
    }
    return builder.modify(modifyAction).style()
}
