// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.switcher.HasBackground
import com.sdkit.star.designsystem.styles.switcher.L
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.S
import com.sdkit.star.designsystem.styles.switcher.Switch
import com.sdkit.star.designsystem.styles.switcher.SwitchSize
import com.sdkit.star.designsystem.styles.switcher.SwitchStyles
import com.sdkit.star.designsystem.styles.switcher.resolve

internal object PlasmaStardsSwitchVariationsCompose : ComposeStyleProvider<SwitchStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<SwitchStyle>> =
        mapOf(
            "Switch.L" to ComposeStyleReference { Switch.L.style() },
            "Switch.L.HasBackground" to ComposeStyleReference { Switch.L.HasBackground.style() },
            "Switch.M" to ComposeStyleReference { Switch.M.style() },
            "Switch.M.HasBackground" to ComposeStyleReference { Switch.M.HasBackground.style() },
            "Switch.S" to ComposeStyleReference { Switch.S.style() },
            "Switch.S.HasBackground" to ComposeStyleReference { Switch.S.HasBackground.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SwitchStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> SwitchSize.L
                "M" -> SwitchSize.M
                "S" -> SwitchSize.S
                else -> SwitchSize.L
            },
        ).key
    }
}
