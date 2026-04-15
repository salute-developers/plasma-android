// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.checkbox.CheckBox
import com.sdds.serv.styles.checkbox.Default
import com.sdds.serv.styles.checkbox.L
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.Negative
import com.sdds.serv.styles.checkbox.S

internal object SddsServCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
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
