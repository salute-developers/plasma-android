// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.checkbox

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
    CheckBoxDefault("CheckBox.Default"),
    ;

    /**
     * Typed API для подбора стиля check-box
     */
    public companion object
}

/**
 * Возвращает [CheckBoxStyle] для [CheckBoxStyles]
 */
@Composable
public fun CheckBoxStyles.style(modify: @Composable CheckBoxStyleBuilder.() -> Unit = {}): CheckBoxStyle {
    val builder = when (this) {
        CheckBoxStyles.CheckBoxDefault -> CheckBox.Default
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CheckBoxStyles] для check-box
 */
public fun CheckBoxStyles.Companion.resolve(): CheckBoxStyles = CheckBoxStyles.CheckBoxDefault

/**
 * Возвращает [CheckBoxStyle] для check-box
 */
@Composable
public fun CheckBoxStyles.Companion.style(modify: @Composable CheckBoxStyleBuilder.() -> Unit = {}):
    CheckBoxStyle = resolve().style(modify)
