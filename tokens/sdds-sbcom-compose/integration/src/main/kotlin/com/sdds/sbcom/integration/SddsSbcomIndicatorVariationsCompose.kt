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
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.StateDanger
import com.sdds.sbcom.styles.indicator.StateGlobalWhite
import com.sdds.sbcom.styles.indicator.StateMute
import com.sdds.sbcom.styles.indicator.StateSuccess
import com.sdds.sbcom.styles.indicator.StateWarning

internal object SddsSbcomIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "StateSuccess" to ComposeStyleReference { Indicator.StateSuccess.style() },
            "StateGlobalWhite" to ComposeStyleReference { Indicator.StateGlobalWhite.style() },
            "StateMute" to ComposeStyleReference { Indicator.StateMute.style() },
            "StateDanger" to ComposeStyleReference { Indicator.StateDanger.style() },
            "StateWarning" to ComposeStyleReference { Indicator.StateWarning.style() },
        )
}
