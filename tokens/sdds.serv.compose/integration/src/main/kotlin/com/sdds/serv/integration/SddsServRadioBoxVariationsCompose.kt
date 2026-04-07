// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.radiobox.L
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.RadioBox
import com.sdds.serv.styles.radiobox.S

internal object SddsServRadioBoxVariationsCompose : ComposeStyleProvider<RadioBoxStyle>() {
    override val variations: Map<String, ComposeStyleReference<RadioBoxStyle>> =
        mapOf(
            "L" to ComposeStyleReference { RadioBox.L.style() },
            "M" to ComposeStyleReference { RadioBox.M.style() },
            "S" to ComposeStyleReference { RadioBox.S.style() },
        )
}
