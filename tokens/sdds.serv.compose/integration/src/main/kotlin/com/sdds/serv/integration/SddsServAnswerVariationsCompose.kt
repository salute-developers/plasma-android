// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ai.AnswerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.answer.Answer
import com.sdds.serv.styles.answer.AnswerSize
import com.sdds.serv.styles.answer.AnswerStyles
import com.sdds.serv.styles.answer.L
import com.sdds.serv.styles.answer.M
import com.sdds.serv.styles.answer.S
import com.sdds.serv.styles.answer.Xl
import com.sdds.serv.styles.answer.Xs
import com.sdds.serv.styles.answer.resolve

internal object SddsServAnswerVariationsCompose : ComposeStyleProvider<AnswerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<AnswerStyle>> =
        mapOf(
            "Answer.Xl" to ComposeStyleReference { Answer.Xl.style() },
            "Answer.L" to ComposeStyleReference { Answer.L.style() },
            "Answer.M" to ComposeStyleReference { Answer.M.style() },
            "Answer.S" to ComposeStyleReference { Answer.S.style() },
            "Answer.Xs" to ComposeStyleReference { Answer.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AnswerStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AnswerSize.Xl
                "L" -> AnswerSize.L
                "M" -> AnswerSize.M
                "S" -> AnswerSize.S
                "Xs" -> AnswerSize.Xs
                else -> AnswerSize.M
            },
        ).key
    }
}
