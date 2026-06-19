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
import com.sdds.sbcom.styles.indicator.IndicatorDefaultSize
import com.sdds.sbcom.styles.indicator.IndicatorDefaultState
import com.sdds.sbcom.styles.indicator.IndicatorStyles
import com.sdds.sbcom.styles.indicator.Size10
import com.sdds.sbcom.styles.indicator.Size12
import com.sdds.sbcom.styles.indicator.Size14
import com.sdds.sbcom.styles.indicator.Size6
import com.sdds.sbcom.styles.indicator.Size8
import com.sdds.sbcom.styles.indicator.StateAccent
import com.sdds.sbcom.styles.indicator.StateDanger
import com.sdds.sbcom.styles.indicator.StateGlobalWhite
import com.sdds.sbcom.styles.indicator.StateMute
import com.sdds.sbcom.styles.indicator.StateWarning
import com.sdds.sbcom.styles.indicator.resolve

internal object SddsSbcomIndicatorVariationsCompose : ComposeStyleProvider<IndicatorStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "state",
                value = "Accent",
                variants = listOf("Accent", "GlobalWhite", "Mute", "Danger", "Warning"),
            ),
            Property.SingleChoiceProperty(
                name = "size",
                value = "Size8",
                variants = listOf("Size14", "Size12", "Size10", "Size8", "Size6"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<IndicatorStyle>> =
        mapOf(
            "Indicator.Size14.StateAccent" to ComposeStyleReference { Indicator.Size14.StateAccent.style() },
            "Indicator.Size14.StateGlobalWhite" to ComposeStyleReference { Indicator.Size14.StateGlobalWhite.style() },
            "Indicator.Size14.StateMute" to ComposeStyleReference { Indicator.Size14.StateMute.style() },
            "Indicator.Size14.StateDanger" to ComposeStyleReference { Indicator.Size14.StateDanger.style() },
            "Indicator.Size14.StateWarning" to ComposeStyleReference { Indicator.Size14.StateWarning.style() },
            "Indicator.Size12.StateAccent" to ComposeStyleReference { Indicator.Size12.StateAccent.style() },
            "Indicator.Size12.StateGlobalWhite" to ComposeStyleReference { Indicator.Size12.StateGlobalWhite.style() },
            "Indicator.Size12.StateMute" to ComposeStyleReference { Indicator.Size12.StateMute.style() },
            "Indicator.Size12.StateDanger" to ComposeStyleReference { Indicator.Size12.StateDanger.style() },
            "Indicator.Size12.StateWarning" to ComposeStyleReference { Indicator.Size12.StateWarning.style() },
            "Indicator.Size10.StateAccent" to ComposeStyleReference { Indicator.Size10.StateAccent.style() },
            "Indicator.Size10.StateGlobalWhite" to ComposeStyleReference { Indicator.Size10.StateGlobalWhite.style() },
            "Indicator.Size10.StateMute" to ComposeStyleReference { Indicator.Size10.StateMute.style() },
            "Indicator.Size10.StateDanger" to ComposeStyleReference { Indicator.Size10.StateDanger.style() },
            "Indicator.Size10.StateWarning" to ComposeStyleReference { Indicator.Size10.StateWarning.style() },
            "Indicator.Size8.StateAccent" to ComposeStyleReference { Indicator.Size8.StateAccent.style() },
            "Indicator.Size8.StateGlobalWhite" to ComposeStyleReference { Indicator.Size8.StateGlobalWhite.style() },
            "Indicator.Size8.StateMute" to ComposeStyleReference { Indicator.Size8.StateMute.style() },
            "Indicator.Size8.StateDanger" to ComposeStyleReference { Indicator.Size8.StateDanger.style() },
            "Indicator.Size8.StateWarning" to ComposeStyleReference { Indicator.Size8.StateWarning.style() },
            "Indicator.Size6.StateAccent" to ComposeStyleReference { Indicator.Size6.StateAccent.style() },
            "Indicator.Size6.StateGlobalWhite" to ComposeStyleReference { Indicator.Size6.StateGlobalWhite.style() },
            "Indicator.Size6.StateMute" to ComposeStyleReference { Indicator.Size6.StateMute.style() },
            "Indicator.Size6.StateDanger" to ComposeStyleReference { Indicator.Size6.StateDanger.style() },
            "Indicator.Size6.StateWarning" to ComposeStyleReference { Indicator.Size6.StateWarning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IndicatorStyles.Default.resolve(
            state = when (bindings["state"]?.toString()) {
                "Accent" -> IndicatorDefaultState.Accent
                "GlobalWhite" -> IndicatorDefaultState.GlobalWhite
                "Mute" -> IndicatorDefaultState.Mute
                "Danger" -> IndicatorDefaultState.Danger
                "Warning" -> IndicatorDefaultState.Warning
                else -> IndicatorDefaultState.Accent
            },
            size = when (bindings["size"]?.toString()) {
                "Size14" -> IndicatorDefaultSize.Size14
                "Size12" -> IndicatorDefaultSize.Size12
                "Size10" -> IndicatorDefaultSize.Size10
                "Size8" -> IndicatorDefaultSize.Size8
                "Size6" -> IndicatorDefaultSize.Size6
                else -> IndicatorDefaultSize.Size8
            },
        ).key
    }
}
