// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.checkbox.CheckBox
import com.sdds.plasma.giga.styles.checkbox.Default
import com.sdds.plasma.giga.styles.checkbox.L
import com.sdds.plasma.giga.styles.checkbox.M
import com.sdds.plasma.giga.styles.checkbox.Negative
import com.sdds.plasma.giga.styles.checkbox.S

internal object PlasmaGigaCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
    override val variations: Map<String, ComposeStyleReference<CheckBoxStyle>> =
        mapOf(
            "L.Default" to ComposeStyleReference { CheckBox.L.Default.style() },
            "L.Negative" to ComposeStyleReference { CheckBox.L.Negative.style() },
            "M.Default" to ComposeStyleReference { CheckBox.M.Default.style() },
            "M.Negative" to ComposeStyleReference { CheckBox.M.Negative.style() },
            "S.Default" to ComposeStyleReference { CheckBox.S.Default.style() },
            "S.Negative" to ComposeStyleReference { CheckBox.S.Negative.style() },
        )
}
