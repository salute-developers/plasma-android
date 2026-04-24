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
    ;

    /**
     * Typed API для подбора стиля radio-box
     */
    public companion object
}

/**
 * Возможные значения свойства size для radio-box
 */
public enum class RadioBoxSize {
    L,
    M,
    S,
}

/**
 * Возвращает [RadioBoxStyle] для [RadioBoxStyles]
 */
@Composable
public fun RadioBoxStyles.style(modify: @Composable RadioBoxStyleBuilder.() -> Unit = {}): RadioBoxStyle {
    val builder = when (this) {
        RadioBoxStyles.RadioBoxL -> RadioBox.L
        RadioBoxStyles.RadioBoxM -> RadioBox.M
        RadioBoxStyles.RadioBoxS -> RadioBox.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [RadioBoxStyles] для radio-box
 */
public fun RadioBoxStyles.Companion.resolve(size: RadioBoxSize = RadioBoxSize.L): RadioBoxStyles =
    when {
        size == RadioBoxSize.L -> RadioBoxStyles.RadioBoxL
        size == RadioBoxSize.M -> RadioBoxStyles.RadioBoxM
        size == RadioBoxSize.S -> RadioBoxStyles.RadioBoxS
        else -> error("Unsupported radio-box style combination")
    }

/**
 * Возвращает [RadioBoxStyle] для radio-box
 */
@Composable
public fun RadioBoxStyles.Companion.style(
    size: RadioBoxSize = RadioBoxSize.L,
    modify: @Composable
    RadioBoxStyleBuilder.() -> Unit = {},
): RadioBoxStyle = resolve(size).style(modify)
