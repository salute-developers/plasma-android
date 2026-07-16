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
import com.sdds.serv.styles.buttongroup.AiUserMessageEmbeddedIconButtonGroup
import com.sdds.serv.styles.buttongroup.AiUserMessageEmbeddedIconButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServAiUserMessageEmbeddedIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("S", "M")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "AiUserMessageEmbeddedIconButtonGroup.S" to ComposeStyleReference { AiUserMessageEmbeddedIconButtonGroup.S.style() },
            "AiUserMessageEmbeddedIconButtonGroup.M" to ComposeStyleReference { AiUserMessageEmbeddedIconButtonGroup.M.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.AiUserMessageEmbeddedIconButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "S" -> AiUserMessageEmbeddedIconButtonGroupSize.S
                "M" -> AiUserMessageEmbeddedIconButtonGroupSize.M
                else -> AiUserMessageEmbeddedIconButtonGroupSize.M
            },
        ).key
    }
}
