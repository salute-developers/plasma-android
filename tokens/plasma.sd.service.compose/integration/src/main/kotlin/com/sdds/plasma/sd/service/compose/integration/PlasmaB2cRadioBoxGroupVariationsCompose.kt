// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.radioboxgroup.M
import com.sdds.plasma.sd.service.styles.radioboxgroup.RadioBoxGroup
import com.sdds.plasma.sd.service.styles.radioboxgroup.S

internal object PlasmaB2cRadioBoxGroupVariationsCompose : ComposeStyleProvider<RadioBoxGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<RadioBoxGroupStyle>> =
        mapOf(
            "M" to ComposeStyleReference { RadioBoxGroup.M.style() },
            "S" to ComposeStyleReference { RadioBoxGroup.S.style() },
        )
}
