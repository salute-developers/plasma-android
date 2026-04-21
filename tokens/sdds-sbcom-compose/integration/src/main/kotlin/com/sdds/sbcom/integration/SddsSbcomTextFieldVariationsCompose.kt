// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.TextField

internal object SddsSbcomTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "TextField.Default" to ComposeStyleReference { TextField.Default.style() },
        )
}
