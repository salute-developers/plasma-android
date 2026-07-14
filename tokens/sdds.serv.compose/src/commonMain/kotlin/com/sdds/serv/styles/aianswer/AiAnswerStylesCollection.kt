// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.aianswer

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ai.AiAnswerStyle
import com.sdds.compose.uikit.ai.AiAnswerStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента AiAnswer
 */
public enum class AiAnswerStyles(
    public val key: String,
) {
    AiAnswerXl("AiAnswer.Xl"),
    AiAnswerL("AiAnswer.L"),
    AiAnswerM("AiAnswer.M"),
    AiAnswerS("AiAnswer.S"),
    AiAnswerXs("AiAnswer.Xs"),
    ;

    /**
     * Typed API для подбора стиля ai-answer
     */
    public companion object
}

/**
 * Возможные значения свойства size для ai-answer
 */
public enum class AiAnswerSize {
    Xl,
    L,
    M,
    S,
    Xs,
}

/**
 * Возвращает [AiAnswerStyle] для [AiAnswerStyles]
 */
@Composable
public fun AiAnswerStyles.style(modify: @Composable AiAnswerStyleBuilder.() -> Unit = {}): AiAnswerStyle {
    val builder = when (this) {
        AiAnswerStyles.AiAnswerXl -> AiAnswer.Xl
        AiAnswerStyles.AiAnswerL -> AiAnswer.L
        AiAnswerStyles.AiAnswerM -> AiAnswer.M
        AiAnswerStyles.AiAnswerS -> AiAnswer.S
        AiAnswerStyles.AiAnswerXs -> AiAnswer.Xs
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [AiAnswerStyles] для ai-answer
 */
public fun AiAnswerStyles.Companion.resolve(size: AiAnswerSize = AiAnswerSize.M): AiAnswerStyles =
    when {
        size == AiAnswerSize.Xl -> AiAnswerStyles.AiAnswerXl
        size == AiAnswerSize.L -> AiAnswerStyles.AiAnswerL
        size == AiAnswerSize.M -> AiAnswerStyles.AiAnswerM
        size == AiAnswerSize.S -> AiAnswerStyles.AiAnswerS
        size == AiAnswerSize.Xs -> AiAnswerStyles.AiAnswerXs
        else -> error("Unsupported ai-answer style combination")
    }

/**
 * Возвращает [AiAnswerStyle] для ai-answer
 */
@Composable
public fun AiAnswerStyles.Companion.style(
    size: AiAnswerSize = AiAnswerSize.M,
    modify: @Composable
    AiAnswerStyleBuilder.() -> Unit = {},
): AiAnswerStyle = resolve(size).style(modify)
