// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.checkboxgroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.CheckBoxGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CheckBoxGroup
 */
public enum class CheckBoxGroupStyles(
    public val key: String,
) {
    CheckBoxGroupL("CheckBoxGroup.L"),
    CheckBoxGroupM("CheckBoxGroup.M"),
    CheckBoxGroupS("CheckBoxGroup.S"),
}

/**
 * Возвращает [CheckBoxGroupStyle] для [CheckBoxGroupStyles]
 */
@Composable
public fun CheckBoxGroupStyles.style(
    modifyAction: @Composable CheckBoxGroupStyleBuilder.() -> Unit =
        {},
): CheckBoxGroupStyle {
    val builder = when (this) {
        CheckBoxGroupStyles.CheckBoxGroupL -> CheckBoxGroup.L
        CheckBoxGroupStyles.CheckBoxGroupM -> CheckBoxGroup.M
        CheckBoxGroupStyles.CheckBoxGroupS -> CheckBoxGroup.S
    }
    return builder.modify(modifyAction).style()
}
