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
    ;

    /**
     * Typed API для подбора стиля check-box
     */
    public companion object
}

/**
 * Возможные значения свойства size для check-box
 */
public enum class CheckBoxSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства view для check-box
 */
public enum class CheckBoxView {
    Default,
    Negative,
}

/**
 * Возвращает [CheckBoxStyle] для [CheckBoxStyles]
 */
@Composable
public fun CheckBoxStyles.style(modify: @Composable CheckBoxStyleBuilder.() -> Unit = {}): CheckBoxStyle {
    val builder = when (this) {
        CheckBoxStyles.CheckBoxLDefault -> CheckBox.L.Default
        CheckBoxStyles.CheckBoxLNegative -> CheckBox.L.Negative
        CheckBoxStyles.CheckBoxMDefault -> CheckBox.M.Default
        CheckBoxStyles.CheckBoxMNegative -> CheckBox.M.Negative
        CheckBoxStyles.CheckBoxSDefault -> CheckBox.S.Default
        CheckBoxStyles.CheckBoxSNegative -> CheckBox.S.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CheckBoxStyles] для check-box
 */
public fun CheckBoxStyles.Companion.resolve(
    size: CheckBoxSize = CheckBoxSize.L,
    view: CheckBoxView =
        CheckBoxView.Default,
): CheckBoxStyles = when {
    size == CheckBoxSize.L && view == CheckBoxView.Default -> CheckBoxStyles.CheckBoxLDefault
    size == CheckBoxSize.L && view == CheckBoxView.Negative -> CheckBoxStyles.CheckBoxLNegative
    size == CheckBoxSize.M && view == CheckBoxView.Default -> CheckBoxStyles.CheckBoxMDefault
    size == CheckBoxSize.M && view == CheckBoxView.Negative -> CheckBoxStyles.CheckBoxMNegative
    size == CheckBoxSize.S && view == CheckBoxView.Default -> CheckBoxStyles.CheckBoxSDefault
    size == CheckBoxSize.S && view == CheckBoxView.Negative -> CheckBoxStyles.CheckBoxSNegative
    else -> error("Unsupported check-box style combination")
}

/**
 * Возвращает [CheckBoxStyle] для check-box
 */
@Composable
public fun CheckBoxStyles.Companion.style(
    size: CheckBoxSize = CheckBoxSize.L,
    view: CheckBoxView = CheckBoxView.Default,
    modify: @Composable CheckBoxStyleBuilder.() -> Unit = {},
): CheckBoxStyle = resolve(size, view).style(modify)
