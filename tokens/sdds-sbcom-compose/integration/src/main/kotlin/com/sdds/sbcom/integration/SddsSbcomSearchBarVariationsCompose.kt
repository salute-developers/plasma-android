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
import com.sdds.sbcom.styles.textfield.Default
import com.sdds.sbcom.styles.textfield.SearchBar

internal object SddsSbcomSearchBarVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {

    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "SearchBar.Default" to ComposeStyleReference { SearchBar.Default.style() },
        )
}
