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
import com.sdds.serv.styles.buttongroup.AiAnswerIconButtonGroup
import com.sdds.serv.styles.buttongroup.AiAnswerIconButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServAiAnswerIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xs", "S", "M", "L")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "AiAnswerIconButtonGroup.Xs" to ComposeStyleReference { AiAnswerIconButtonGroup.Xs.style() },
            "AiAnswerIconButtonGroup.S" to ComposeStyleReference { AiAnswerIconButtonGroup.S.style() },
            "AiAnswerIconButtonGroup.M" to ComposeStyleReference { AiAnswerIconButtonGroup.M.style() },
            "AiAnswerIconButtonGroup.L" to ComposeStyleReference { AiAnswerIconButtonGroup.L.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.AiAnswerIconButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiAnswerIconButtonGroupSize.Xs
                "S" -> AiAnswerIconButtonGroupSize.S
                "M" -> AiAnswerIconButtonGroupSize.M
                "L" -> AiAnswerIconButtonGroupSize.L
                else -> AiAnswerIconButtonGroupSize.M
            },
        ).key
    }
}
