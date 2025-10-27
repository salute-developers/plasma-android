// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.checkbox

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.CheckBoxStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента CheckBox
 */
public enum class CheckBoxStyles(
    public val key: String,
) {
    CheckBoxLDefault("CheckBox.L.Default"),
    CheckBoxLNegative("CheckBox.L.Negative"),
    CheckBoxMDefault("CheckBox.M.Default"),
    CheckBoxMNegative("CheckBox.M.Negative"),
    CheckBoxSDefault("CheckBox.S.Default"),
    CheckBoxSNegative("CheckBox.S.Negative"),
}

/**
 * Возвращает [CheckBoxStyle] для [CheckBoxStyles]
 */
@Composable
public fun CheckBoxStyles.style(modifyAction: @Composable CheckBoxStyleBuilder.() -> Unit = {}): CheckBoxStyle {
    val builder = when (this) {
        CheckBoxStyles.CheckBoxLDefault -> CheckBox.L.Default
        CheckBoxStyles.CheckBoxLNegative -> CheckBox.L.Negative
        CheckBoxStyles.CheckBoxMDefault -> CheckBox.M.Default
        CheckBoxStyles.CheckBoxMNegative -> CheckBox.M.Negative
        CheckBoxStyles.CheckBoxSDefault -> CheckBox.S.Default
        CheckBoxStyles.CheckBoxSNegative -> CheckBox.S.Negative
    }
    return builder.modify(modifyAction).style()
}
