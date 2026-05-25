// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.switcher.L
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.S
import com.sdds.serv.styles.switcher.Switch
import com.sdds.serv.styles.switcher.SwitchSize
import com.sdds.serv.styles.switcher.SwitchStyles
import com.sdds.serv.styles.switcher.SwitchToggleSize
import com.sdds.serv.styles.switcher.ToggleS
import com.sdds.serv.styles.switcher.resolve

internal object SddsServSwitchVariationsCompose : ComposeStyleProvider<SwitchStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
            Property.SingleChoiceProperty(name = "toggleSize", value = "S", variants = listOf("S")),
        )

    override val variations: Map<String, ComposeStyleReference<SwitchStyle>> =
        mapOf(
            "Switch.L" to ComposeStyleReference { Switch.L.style() },
            "Switch.L.ToggleS" to ComposeStyleReference { Switch.L.ToggleS.style() },
            "Switch.M" to ComposeStyleReference { Switch.M.style() },
            "Switch.M.ToggleS" to ComposeStyleReference { Switch.M.ToggleS.style() },
            "Switch.S" to ComposeStyleReference { Switch.S.style() },
            "Switch.S.ToggleS" to ComposeStyleReference { Switch.S.ToggleS.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SwitchStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SwitchSize.L
                "M" -> SwitchSize.M
                "S" -> SwitchSize.S
                else -> SwitchSize.L
            },
            toggleSize = when (bindings["toggleSize"]?.toString()) {
                "S" -> SwitchToggleSize.S
                else -> SwitchToggleSize.S
            },
        ).key
    }
}
