// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.giga.styles.checkboxgroup.L
import com.sdds.plasma.giga.styles.checkboxgroup.M
import com.sdds.plasma.giga.styles.checkboxgroup.S

internal object PlasmaGigaCheckBoxGroupVariationsCompose : ComposeStyleProvider<CheckBoxGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<CheckBoxGroupStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CheckBoxGroup.L.style() },
            "M" to ComposeStyleReference { CheckBoxGroup.M.style() },
            "S" to ComposeStyleReference { CheckBoxGroup.S.style() },
        )
}
