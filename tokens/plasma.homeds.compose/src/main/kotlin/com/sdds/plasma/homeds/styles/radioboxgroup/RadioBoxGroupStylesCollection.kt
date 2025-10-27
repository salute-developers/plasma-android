// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.radioboxgroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.RadioBoxGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента RadioBoxGroup
 */
public enum class RadioBoxGroupStyles(
    public val key: String,
) {
    RadioBoxGroupM("RadioBoxGroup.M"),
    RadioBoxGroupS("RadioBoxGroup.S"),
}

/**
 * Возвращает [RadioBoxGroupStyle] для [RadioBoxGroupStyles]
 */
@Composable
public fun RadioBoxGroupStyles.style(
    modifyAction: @Composable RadioBoxGroupStyleBuilder.() -> Unit =
        {},
): RadioBoxGroupStyle {
    val builder = when (this) {
        RadioBoxGroupStyles.RadioBoxGroupM -> RadioBoxGroup.M
        RadioBoxGroupStyles.RadioBoxGroupS -> RadioBoxGroup.S
    }
    return builder.modify(modifyAction).style()
}
