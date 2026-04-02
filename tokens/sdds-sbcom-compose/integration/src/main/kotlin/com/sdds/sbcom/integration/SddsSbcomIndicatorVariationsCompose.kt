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
import com.sdds.sbcom.styles.indicator.Danger
import com.sdds.sbcom.styles.indicator.GlobalWhite
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.Mute
import com.sdds.sbcom.styles.indicator.Success
import com.sdds.sbcom.styles.indicator.Warning

internal object SddsSbcomIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "Success" to ComposeStyleReference { Indicator.Success.style() },
            "GlobalWhite" to ComposeStyleReference { Indicator.GlobalWhite.style() },
            "Mute" to ComposeStyleReference { Indicator.Mute.style() },
            "Danger" to ComposeStyleReference { Indicator.Danger.style() },
            "Warning" to ComposeStyleReference { Indicator.Warning.style() },
        )
}
