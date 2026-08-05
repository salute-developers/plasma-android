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
import com.sdds.serv.styles.buttongroup.AiHeaderEmbeddedIconButtonGroup
import com.sdds.serv.styles.buttongroup.AiHeaderEmbeddedIconButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Xl
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServAiHeaderEmbeddedIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("S", "M", "L", "Xl")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "AiHeaderEmbeddedIconButtonGroup.S" to ComposeStyleReference { AiHeaderEmbeddedIconButtonGroup.S.style() },
            "AiHeaderEmbeddedIconButtonGroup.M" to ComposeStyleReference { AiHeaderEmbeddedIconButtonGroup.M.style() },
            "AiHeaderEmbeddedIconButtonGroup.L" to ComposeStyleReference { AiHeaderEmbeddedIconButtonGroup.L.style() },
            "AiHeaderEmbeddedIconButtonGroup.Xl" to ComposeStyleReference { AiHeaderEmbeddedIconButtonGroup.Xl.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> AiHeaderEmbeddedIconButtonGroupSize.S
                "M" -> AiHeaderEmbeddedIconButtonGroupSize.M
                "L" -> AiHeaderEmbeddedIconButtonGroupSize.L
                "Xl" -> AiHeaderEmbeddedIconButtonGroupSize.Xl
                else -> AiHeaderEmbeddedIconButtonGroupSize.M
            },
        ).key
    }
}
