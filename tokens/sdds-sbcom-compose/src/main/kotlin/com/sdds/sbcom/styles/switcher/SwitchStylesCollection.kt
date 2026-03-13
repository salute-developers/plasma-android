// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.switcher

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.SwitchStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Switch
 */
public enum class SwitchStyles(
    public val key: String,
) {
    SwitchDefault("Switch.Default"),
}

/**
 * Возвращает [SwitchStyle] для [SwitchStyles]
 */
@Composable
public fun SwitchStyles.style(modifyAction: @Composable SwitchStyleBuilder.() -> Unit = {}): SwitchStyle {
    val builder = when (this) {
        SwitchStyles.SwitchDefault -> Switch.Default
    }
    return builder.modify(modifyAction).style()
}
