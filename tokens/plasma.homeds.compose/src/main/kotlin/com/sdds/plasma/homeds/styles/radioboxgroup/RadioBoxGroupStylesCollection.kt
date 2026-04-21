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
    ;

    /**
     * Typed API для подбора стиля radio-box-group
     */
    public companion object
}

/**
 * Возможные значения свойства size для radio-box-group
 */
public enum class RadioBoxGroupSize {
    M,
    S,
}

/**
 * Возвращает [RadioBoxGroupStyle] для [RadioBoxGroupStyles]
 */
@Composable
public fun RadioBoxGroupStyles.style(modify: @Composable RadioBoxGroupStyleBuilder.() -> Unit = {}):
    RadioBoxGroupStyle {
    val builder = when (this) {
        RadioBoxGroupStyles.RadioBoxGroupM -> RadioBoxGroup.M
        RadioBoxGroupStyles.RadioBoxGroupS -> RadioBoxGroup.S
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [RadioBoxGroupStyles] для radio-box-group
 */
public fun RadioBoxGroupStyles.Companion.resolve(size: RadioBoxGroupSize = RadioBoxGroupSize.M):
    RadioBoxGroupStyles = when {
    size == RadioBoxGroupSize.M -> RadioBoxGroupStyles.RadioBoxGroupM
    size == RadioBoxGroupSize.S -> RadioBoxGroupStyles.RadioBoxGroupS
    else -> error("Unsupported radio-box-group style combination")
}

/**
 * Возвращает [RadioBoxGroupStyle] для radio-box-group
 */
@Composable
public fun RadioBoxGroupStyles.Companion.style(
    size: RadioBoxGroupSize = RadioBoxGroupSize.M,
    modify: @Composable RadioBoxGroupStyleBuilder.() -> Unit = {},
): RadioBoxGroupStyle =
    resolve(size).style(modify)
