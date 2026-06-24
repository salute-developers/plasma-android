// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.Error
import com.sdds.sbcom.styles.textfield.Success
import com.sdds.sbcom.styles.textfield.TextField
import com.sdds.sbcom.styles.textfield.TextFieldDefaultView
import com.sdds.sbcom.styles.textfield.TextFieldStyles
import com.sdds.sbcom.styles.textfield.resolve

internal object SddsSbcomTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Success", "Error"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextField.Default" to ComposeStyleReference { TextField.Default.style() },
            "TextField.Success" to ComposeStyleReference { TextField.Success.style() },
            "TextField.Error" to ComposeStyleReference { TextField.Error.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextFieldStyles.Default.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextFieldDefaultView.Default
                "Success" -> TextFieldDefaultView.Success
                "Error" -> TextFieldDefaultView.Error
                else -> TextFieldDefaultView.Default
            },
        ).key
    }
}
