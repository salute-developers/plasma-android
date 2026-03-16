// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.sbcom.styles.counter

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.CounterStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Counter
 */
public enum class CounterStyles(
    public val key: String,
) {
    CounterPrimary("Counter.Primary"),
    CounterSecondary("Counter.Secondary"),
    CounterAccent("Counter.Accent"),
    CounterDanger("Counter.Danger"),
}

/**
 * Возвращает [CounterStyle] для [CounterStyles]
 */
@Composable
public fun CounterStyles.style(modifyAction: @Composable CounterStyleBuilder.() -> Unit = {}): CounterStyle {
    val builder = when (this) {
        CounterStyles.CounterPrimary -> Counter.Primary
        CounterStyles.CounterSecondary -> Counter.Secondary
        CounterStyles.CounterAccent -> Counter.Accent
        CounterStyles.CounterDanger -> Counter.Danger
    }
    return builder.modify(modifyAction).style()
}
