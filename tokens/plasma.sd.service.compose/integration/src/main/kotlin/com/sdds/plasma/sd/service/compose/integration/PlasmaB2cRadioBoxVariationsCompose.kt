// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.radiobox.L
import com.sdds.plasma.sd.service.styles.radiobox.M
import com.sdds.plasma.sd.service.styles.radiobox.RadioBox
import com.sdds.plasma.sd.service.styles.radiobox.S

internal object PlasmaB2cRadioBoxVariationsCompose : ComposeStyleProvider<RadioBoxStyle>() {
    override val variations: Map<String, ComposeStyleReference<RadioBoxStyle>> =
        mapOf(
            "L" to ComposeStyleReference { RadioBox.L.style() },
            "M" to ComposeStyleReference { RadioBox.M.style() },
            "S" to ComposeStyleReference { RadioBox.S.style() },
        )
}
