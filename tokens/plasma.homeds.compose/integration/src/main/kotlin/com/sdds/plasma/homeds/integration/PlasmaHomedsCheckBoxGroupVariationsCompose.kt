// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CheckBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.checkboxgroup.CheckBoxGroup
import com.sdds.plasma.homeds.styles.checkboxgroup.L
import com.sdds.plasma.homeds.styles.checkboxgroup.M
import com.sdds.plasma.homeds.styles.checkboxgroup.S

internal object PlasmaHomedsCheckBoxGroupVariationsCompose : ComposeStyleProvider<CheckBoxGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<CheckBoxGroupStyle>> =
        mapOf(
            "L" to ComposeStyleReference { CheckBoxGroup.L.style() },
            "M" to ComposeStyleReference { CheckBoxGroup.M.style() },
            "S" to ComposeStyleReference { CheckBoxGroup.S.style() },
        )
}
