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
    CheckBoxVariantDefault("CheckBox.VariantDefault"),
    CheckBoxVariantPoll("CheckBox.VariantPoll"),
    ;

    /**
     * Typed API для подбора стиля check-box
     */
    public companion object
}

/**
 * Возможные значения свойства variant для check-box
 */
public enum class CheckBoxVariant {
    Default,
    Poll,
}

/**
 * Возвращает [CheckBoxStyle] для [CheckBoxStyles]
 */
@Composable
public fun CheckBoxStyles.style(modify: @Composable CheckBoxStyleBuilder.() -> Unit = {}): CheckBoxStyle {
    val builder = when (this) {
        CheckBoxStyles.CheckBoxVariantDefault -> CheckBox.VariantDefault
        CheckBoxStyles.CheckBoxVariantPoll -> CheckBox.VariantPoll
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CheckBoxStyles] для check-box
 */
public fun CheckBoxStyles.Companion.resolve(variant: CheckBoxVariant = CheckBoxVariant.Default): CheckBoxStyles = when {
    variant == CheckBoxVariant.Default -> CheckBoxStyles.CheckBoxVariantDefault
    variant == CheckBoxVariant.Poll -> CheckBoxStyles.CheckBoxVariantPoll
    else -> error("Unsupported check-box style combination")
}

/**
 * Возвращает [CheckBoxStyle] для check-box
 */
@Composable
public fun CheckBoxStyles.Companion.style(
    variant: CheckBoxVariant = CheckBoxVariant.Default,
    modify: @Composable CheckBoxStyleBuilder.() -> Unit = {},
): CheckBoxStyle =
    resolve(variant).style(modify)
