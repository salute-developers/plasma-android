// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.indicator.AvatarIndicator
import com.sdds.sbcom.styles.indicator.Size10
import com.sdds.sbcom.styles.indicator.Size12
import com.sdds.sbcom.styles.indicator.Size14
import com.sdds.sbcom.styles.indicator.Size6
import com.sdds.sbcom.styles.indicator.Size8

internal object SddsSbcomAvatarIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "Size14" to ComposeStyleReference { AvatarIndicator.Size14.style() },
            "Size12" to ComposeStyleReference { AvatarIndicator.Size12.style() },
            "Size10" to ComposeStyleReference { AvatarIndicator.Size10.style() },
            "Size8" to ComposeStyleReference { AvatarIndicator.Size8.style() },
            "Size6" to ComposeStyleReference { AvatarIndicator.Size6.style() },
        )
}
