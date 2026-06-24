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
import com.sdds.sbcom.styles.textfield.AlternativeField
import com.sdds.sbcom.styles.textfield.Default

internal object SddsSbcomAlternativeFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "AlternativeField.Default" to ComposeStyleReference { AlternativeField.Default.style() },
        )
}
