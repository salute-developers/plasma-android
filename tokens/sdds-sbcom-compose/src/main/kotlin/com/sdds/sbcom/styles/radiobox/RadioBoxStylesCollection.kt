// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.radiobox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.RadioBoxStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента RadioBox
 */
public enum class RadioBoxStyles(
    public val key: String,
) {
    RadioBoxDefault("RadioBox.Default"),
}

/**
 * Возвращает [RadioBoxStyle] для [RadioBoxStyles]
 */
@Composable
public fun RadioBoxStyles.style(modifyAction: @Composable RadioBoxStyleBuilder.() -> Unit = {}): RadioBoxStyle {
    val builder = when (this) {
        RadioBoxStyles.RadioBoxDefault -> RadioBox.Default
    }
    return builder.modify(modifyAction).style()
}
