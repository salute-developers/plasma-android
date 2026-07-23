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
import com.sdds.compose.uikit.ai.AiInputStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.aiinput.AiInputCondensed
import com.sdds.serv.styles.aiinput.AiInputCondensedSize
import com.sdds.serv.styles.aiinput.AiInputStyles
import com.sdds.serv.styles.aiinput.L
import com.sdds.serv.styles.aiinput.M
import com.sdds.serv.styles.aiinput.S
import com.sdds.serv.styles.aiinput.Xl
import com.sdds.serv.styles.aiinput.Xs
import com.sdds.serv.styles.aiinput.resolve

internal object SddsServAiInputCondensedVariationsCompose : ComposeStyleProvider<AiInputStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xs", "S", "M", "L", "Xl")),
        )

    override val variations: Map<String, ComposeStyleReference<AiInputStyle>> =
        mapOf(
            "AiInputCondensed.Xs" to ComposeStyleReference { AiInputCondensed.Xs.style() },
            "AiInputCondensed.S" to ComposeStyleReference { AiInputCondensed.S.style() },
            "AiInputCondensed.M" to ComposeStyleReference { AiInputCondensed.M.style() },
            "AiInputCondensed.L" to ComposeStyleReference { AiInputCondensed.L.style() },
            "AiInputCondensed.Xl" to ComposeStyleReference { AiInputCondensed.Xl.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AiInputStyles.Condensed.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiInputCondensedSize.Xs
                "S" -> AiInputCondensedSize.S
                "M" -> AiInputCondensedSize.M
                "L" -> AiInputCondensedSize.L
                "Xl" -> AiInputCondensedSize.Xl
                else -> AiInputCondensedSize.M
            },
        ).key
    }
}
