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
    ;

    /**
     * Typed API для подбора стиля check-box-group
     */
    public companion object
}

/**
 * Возможные значения свойства size для check-box-group
 */
public enum class CheckBoxGroupSize {
    L,
    M,
    S,
}

/**
 * Возвращает [CheckBoxGroupStyle] для [CheckBoxGroupStyles]
 */
@Composable
public fun CheckBoxGroupStyles.style(modify: @Composable CheckBoxGroupStyleBuilder.() -> Unit = {}):
    CheckBoxGroupStyle {
    val builder = when (this) {
        CheckBoxGroupStyles.CheckBoxGroupL -> CheckBoxGroup.L
        CheckBoxGroupStyles.CheckBoxGroupM -> CheckBoxGroup.M
        CheckBoxGroupStyles.CheckBoxGroupS -> CheckBoxGroup.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [CheckBoxGroupStyles] для check-box-group
 */
public fun CheckBoxGroupStyles.Companion.resolve(size: CheckBoxGroupSize = CheckBoxGroupSize.L):
    CheckBoxGroupStyles = when {
    size == CheckBoxGroupSize.L -> CheckBoxGroupStyles.CheckBoxGroupL
    size == CheckBoxGroupSize.M -> CheckBoxGroupStyles.CheckBoxGroupM
    size == CheckBoxGroupSize.S -> CheckBoxGroupStyles.CheckBoxGroupS
    else -> error("Unsupported check-box-group style combination")
}

/**
 * Возвращает [CheckBoxGroupStyle] для check-box-group
 */
@Composable
public fun CheckBoxGroupStyles.Companion.style(
    size: CheckBoxGroupSize = CheckBoxGroupSize.L,
    modify: @Composable CheckBoxGroupStyleBuilder.() -> Unit = {},
): CheckBoxGroupStyle =
    resolve(size).style(modify)
