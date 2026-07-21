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
import com.sdds.compose.uikit.EditableStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.editable.AiUserMessageEditable
import com.sdds.serv.styles.editable.AiUserMessageEditableSize
import com.sdds.serv.styles.editable.EditableStyles
import com.sdds.serv.styles.editable.L
import com.sdds.serv.styles.editable.M
import com.sdds.serv.styles.editable.S
import com.sdds.serv.styles.editable.Xl
import com.sdds.serv.styles.editable.Xs
import com.sdds.serv.styles.editable.resolve

internal object SddsServAiUserMessageEditableVariationsCompose : ComposeStyleProvider<EditableStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xl", "L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<EditableStyle>> =
        mapOf(
            "AiUserMessageEditable.Xl" to ComposeStyleReference { AiUserMessageEditable.Xl.style() },
            "AiUserMessageEditable.L" to ComposeStyleReference { AiUserMessageEditable.L.style() },
            "AiUserMessageEditable.M" to ComposeStyleReference { AiUserMessageEditable.M.style() },
            "AiUserMessageEditable.S" to ComposeStyleReference { AiUserMessageEditable.S.style() },
            "AiUserMessageEditable.Xs" to ComposeStyleReference { AiUserMessageEditable.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return EditableStyles.AiUserMessageEditable.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> AiUserMessageEditableSize.Xl
                "L" -> AiUserMessageEditableSize.L
                "M" -> AiUserMessageEditableSize.M
                "S" -> AiUserMessageEditableSize.S
                "Xs" -> AiUserMessageEditableSize.Xs
                else -> AiUserMessageEditableSize.M
            },
        ).key
    }
}
