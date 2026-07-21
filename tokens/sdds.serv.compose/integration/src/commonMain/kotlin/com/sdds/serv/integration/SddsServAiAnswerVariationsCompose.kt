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
import com.sdds.compose.uikit.ai.AiAnswerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.aianswer.AiAnswer
import com.sdds.serv.styles.aianswer.AiAnswerSize
import com.sdds.serv.styles.aianswer.AiAnswerStyles
import com.sdds.serv.styles.aianswer.L
import com.sdds.serv.styles.aianswer.M
import com.sdds.serv.styles.aianswer.S
import com.sdds.serv.styles.aianswer.Xl
import com.sdds.serv.styles.aianswer.Xs
import com.sdds.serv.styles.aianswer.resolve

internal object SddsServAiAnswerVariationsCompose : ComposeStyleProvider<AiAnswerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<AiAnswerStyle>> =
        mapOf(
            "AiAnswer.Xl" to ComposeStyleReference { AiAnswer.Xl.style() },
            "AiAnswer.L" to ComposeStyleReference { AiAnswer.L.style() },
            "AiAnswer.M" to ComposeStyleReference { AiAnswer.M.style() },
            "AiAnswer.S" to ComposeStyleReference { AiAnswer.S.style() },
            "AiAnswer.Xs" to ComposeStyleReference { AiAnswer.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AiAnswerStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AiAnswerSize.Xl
                "L" -> AiAnswerSize.L
                "M" -> AiAnswerSize.M
                "S" -> AiAnswerSize.S
                "Xs" -> AiAnswerSize.Xs
                else -> AiAnswerSize.M
            },
        ).key
    }
}
