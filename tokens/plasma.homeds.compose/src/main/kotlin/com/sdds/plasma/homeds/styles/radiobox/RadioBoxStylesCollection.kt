// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.radiobox

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
    RadioBoxL("RadioBox.L"),
    RadioBoxM("RadioBox.M"),
    RadioBoxS("RadioBox.S"),
}

/**
 * Возвращает [RadioBoxStyle] для [RadioBoxStyles]
 */
@Composable
public fun RadioBoxStyles.style(modifyAction: @Composable RadioBoxStyleBuilder.() -> Unit = {}): RadioBoxStyle {
    val builder = when (this) {
        RadioBoxStyles.RadioBoxL -> RadioBox.L
        RadioBoxStyles.RadioBoxM -> RadioBox.M
        RadioBoxStyles.RadioBoxS -> RadioBox.S
    }
    return builder.modify(modifyAction).style()
}
