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
import com.sdds.serv.styles.aiinput.AiInputExtended
import com.sdds.serv.styles.aiinput.AiInputExtendedSize
import com.sdds.serv.styles.aiinput.AiInputStyles
import com.sdds.serv.styles.aiinput.L
import com.sdds.serv.styles.aiinput.M
import com.sdds.serv.styles.aiinput.S
import com.sdds.serv.styles.aiinput.Xl
import com.sdds.serv.styles.aiinput.Xs
import com.sdds.serv.styles.aiinput.resolve

internal object SddsServAiInputExtendedVariationsCompose : ComposeStyleProvider<AiInputStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xs", "S", "M", "L", "Xl")),
        )

    override val variations: Map<String, ComposeStyleReference<AiInputStyle>> =
        mapOf(
            "AiInputExtended.Xs" to ComposeStyleReference { AiInputExtended.Xs.style() },
            "AiInputExtended.S" to ComposeStyleReference { AiInputExtended.S.style() },
            "AiInputExtended.M" to ComposeStyleReference { AiInputExtended.M.style() },
            "AiInputExtended.L" to ComposeStyleReference { AiInputExtended.L.style() },
            "AiInputExtended.Xl" to ComposeStyleReference { AiInputExtended.Xl.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return AiInputStyles.Extended.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiInputExtendedSize.Xs
                "S" -> AiInputExtendedSize.S
                "M" -> AiInputExtendedSize.M
                "L" -> AiInputExtendedSize.L
                "Xl" -> AiInputExtendedSize.Xl
                else -> AiInputExtendedSize.M
            },
        ).key
    }
}
