// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.IndicatorStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.indicator.Indicator
import com.sdds.sbcom.styles.indicator.IndicatorDefaultState
import com.sdds.sbcom.styles.indicator.IndicatorStyles
import com.sdds.sbcom.styles.indicator.StateDanger
import com.sdds.sbcom.styles.indicator.StateGlobalWhite
import com.sdds.sbcom.styles.indicator.StateMute
import com.sdds.sbcom.styles.indicator.StateSuccess
import com.sdds.sbcom.styles.indicator.StateWarning
import com.sdds.sbcom.styles.indicator.resolve

internal object SddsSbcomIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "state",
                value = "Success",
                variants = listOf("Success", "GlobalWhite", "Mute", "Danger", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "Indicator.StateSuccess" to ComposeStyleReference { Indicator.StateSuccess.style() },
            "Indicator.StateGlobalWhite" to ComposeStyleReference { Indicator.StateGlobalWhite.style() },
            "Indicator.StateMute" to ComposeStyleReference { Indicator.StateMute.style() },
            "Indicator.StateDanger" to ComposeStyleReference { Indicator.StateDanger.style() },
            "Indicator.StateWarning" to ComposeStyleReference { Indicator.StateWarning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IndicatorStyles.Default.resolve(
            state = when (bindings["state"]?.toString()) {
                "Success" -> IndicatorDefaultState.Success
                "GlobalWhite" -> IndicatorDefaultState.GlobalWhite
                "Mute" -> IndicatorDefaultState.Mute
                "Danger" -> IndicatorDefaultState.Danger
                "Warning" -> IndicatorDefaultState.Warning
                else -> IndicatorDefaultState.Success
            },
        ).key
    }
}
