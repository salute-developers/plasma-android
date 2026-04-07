// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.radiobox.Default
import com.sdds.sbcom.styles.radiobox.RadioBox

internal object SddsSbcomRadioBoxVariationsCompose : ComposeStyleProvider<RadioBoxStyle>() {
    override val variations: Map<String, ComposeStyleReference<RadioBoxStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { RadioBox.Default.style() },
        )
}
