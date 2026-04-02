// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RadioBoxGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.radioboxgroup.M
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroup
import com.sdkit.star.designsystem.styles.radioboxgroup.S

internal object PlasmaStardsRadioBoxGroupVariationsCompose : ComposeStyleProvider<RadioBoxGroupStyle>() {
    override val variations: Map<String, ComposeStyleReference<RadioBoxGroupStyle>> =
        mapOf(
            "M" to ComposeStyleReference { RadioBoxGroup.M.style() },
            "S" to ComposeStyleReference { RadioBoxGroup.S.style() },
        )
}
