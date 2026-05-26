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
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.buttongroup.AiAnswerBasicButtonGroup
import com.sdds.serv.styles.buttongroup.AiAnswerBasicButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServAiAnswerBasicButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xs", "S", "M", "L")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "AiAnswerBasicButtonGroup.Xs" to ComposeStyleReference { AiAnswerBasicButtonGroup.Xs.style() },
            "AiAnswerBasicButtonGroup.S" to ComposeStyleReference { AiAnswerBasicButtonGroup.S.style() },
            "AiAnswerBasicButtonGroup.M" to ComposeStyleReference { AiAnswerBasicButtonGroup.M.style() },
            "AiAnswerBasicButtonGroup.L" to ComposeStyleReference { AiAnswerBasicButtonGroup.L.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.AiAnswerBasicButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiAnswerBasicButtonGroupSize.Xs
                "S" -> AiAnswerBasicButtonGroupSize.S
                "M" -> AiAnswerBasicButtonGroupSize.M
                "L" -> AiAnswerBasicButtonGroupSize.L
                else -> AiAnswerBasicButtonGroupSize.M
            },
        ).key
    }
}
