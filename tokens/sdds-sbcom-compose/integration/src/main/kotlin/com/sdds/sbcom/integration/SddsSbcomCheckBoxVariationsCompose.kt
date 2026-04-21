// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.checkbox.CheckBox
import com.sdds.sbcom.styles.checkbox.Default

internal object SddsSbcomCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {

    override val variations: Map<String, ComposeStyleReference<CheckBoxStyle>> =
        mapOf(
            "CheckBox.Default" to ComposeStyleReference { CheckBox.Default.style() },
        )
}
