// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.radioboxgroup.M
import com.sdds.serv.styles.radioboxgroup.RadioBoxGroup
import com.sdds.serv.styles.radioboxgroup.S

internal object SddsServRadioBoxGroupVariationsCompose : ComposeStyleProvider<RadioBoxGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<RadioBoxGroupStyle>> =
        mapOf(
            "M" to ComposeStyleReference { RadioBoxGroup.M.style() },
            "S" to ComposeStyleReference { RadioBoxGroup.S.style() },
        )
}
