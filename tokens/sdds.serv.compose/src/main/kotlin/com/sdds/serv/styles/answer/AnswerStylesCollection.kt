// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.answer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ai.AnswerStyle
import com.sdds.compose.uikit.ai.AnswerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Answer
 */
public enum class AnswerStyles(
    public val key: String,
) {
    AnswerXl("Answer.Xl"),
    AnswerL("Answer.L"),
    AnswerM("Answer.M"),
    AnswerS("Answer.S"),
    AnswerXs("Answer.Xs"),
    ;

    /**
     * Typed API для подбора стиля answer
     */
    public companion object
}

/**
 * Возможные значения свойства size для answer
 */
public enum class AnswerSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [AnswerStyle] для [AnswerStyles]
 */
@Composable
public fun AnswerStyles.style(modify: @Composable AnswerStyleBuilder.() -> Unit = {}): AnswerStyle {
    val builder = when (this) {
        AnswerStyles.AnswerXl -> Answer.Xl
        AnswerStyles.AnswerL -> Answer.L
        AnswerStyles.AnswerM -> Answer.M
        AnswerStyles.AnswerS -> Answer.S
        AnswerStyles.AnswerXs -> Answer.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AnswerStyles] для answer
 */
public fun AnswerStyles.Companion.resolve(size: AnswerSize = AnswerSize.M): AnswerStyles = when {
    size == AnswerSize.Xl -> AnswerStyles.AnswerXl
    size == AnswerSize.L -> AnswerStyles.AnswerL
    size == AnswerSize.M -> AnswerStyles.AnswerM
    size == AnswerSize.S -> AnswerStyles.AnswerS
    size == AnswerSize.Xs -> AnswerStyles.AnswerXs
    else -> error("Unsupported answer style combination")
}

/**
 * Возвращает [AnswerStyle] для answer
 */
@Composable
public fun AnswerStyles.Companion.style(
    size: AnswerSize = AnswerSize.M,
    modify: @Composable
    AnswerStyleBuilder.() -> Unit = {},
): AnswerStyle = resolve(size).style(modify)
