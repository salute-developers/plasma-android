// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.Default
import com.sdkit.star.designsystem.styles.checkbox.L
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkbox.Negative
import com.sdkit.star.designsystem.styles.checkbox.S

internal object PlasmaStardsCheckBoxVariationsCompose : ComposeStyleProvider<CheckBoxStyle>() {
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
