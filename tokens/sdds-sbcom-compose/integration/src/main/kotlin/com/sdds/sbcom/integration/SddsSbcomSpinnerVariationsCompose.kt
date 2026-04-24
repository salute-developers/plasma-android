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
import com.sdds.compose.uikit.SpinnerStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.spinner.ModeColorAccent
import com.sdds.sbcom.styles.spinner.ModeColorDanger
import com.sdds.sbcom.styles.spinner.ModeColorGlobalWhite
import com.sdds.sbcom.styles.spinner.ModeColorPrimary
import com.sdds.sbcom.styles.spinner.ModeColorSecondary
import com.sdds.sbcom.styles.spinner.Size16
import com.sdds.sbcom.styles.spinner.Size24
import com.sdds.sbcom.styles.spinner.Size32
import com.sdds.sbcom.styles.spinner.Size40
import com.sdds.sbcom.styles.spinner.Spinner
import com.sdds.sbcom.styles.spinner.SpinnerModeColor
import com.sdds.sbcom.styles.spinner.SpinnerSize
import com.sdds.sbcom.styles.spinner.SpinnerStyles
import com.sdds.sbcom.styles.spinner.resolve

internal object SddsSbcomSpinnerVariationsCompose : ComposeStyleProvider<SpinnerStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "Size40",
                variants = listOf("Size40", "Size32", "Size24", "Size16"),
            ),
            Property.SingleChoiceProperty(
                name = "modeColor",
                value = "Primary",
                variants = listOf("Primary", "Secondary", "GlobalWhite", "Accent", "Danger"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<SpinnerStyle>> =
        mapOf(
            "Spinner.Size40.ModeColorPrimary" to ComposeStyleReference { Spinner.Size40.ModeColorPrimary.style() },
            "Spinner.Size40.ModeColorSecondary" to ComposeStyleReference { Spinner.Size40.ModeColorSecondary.style() },
            "Spinner.Size40.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size40.ModeColorGlobalWhite.style() },
            "Spinner.Size40.ModeColorAccent" to ComposeStyleReference { Spinner.Size40.ModeColorAccent.style() },
            "Spinner.Size40.ModeColorDanger" to ComposeStyleReference { Spinner.Size40.ModeColorDanger.style() },
            "Spinner.Size32.ModeColorPrimary" to ComposeStyleReference { Spinner.Size32.ModeColorPrimary.style() },
            "Spinner.Size32.ModeColorSecondary" to ComposeStyleReference { Spinner.Size32.ModeColorSecondary.style() },
            "Spinner.Size32.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size32.ModeColorGlobalWhite.style() },
            "Spinner.Size32.ModeColorAccent" to ComposeStyleReference { Spinner.Size32.ModeColorAccent.style() },
            "Spinner.Size32.ModeColorDanger" to ComposeStyleReference { Spinner.Size32.ModeColorDanger.style() },
            "Spinner.Size24.ModeColorPrimary" to ComposeStyleReference { Spinner.Size24.ModeColorPrimary.style() },
            "Spinner.Size24.ModeColorSecondary" to ComposeStyleReference { Spinner.Size24.ModeColorSecondary.style() },
            "Spinner.Size24.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size24.ModeColorGlobalWhite.style() },
            "Spinner.Size24.ModeColorAccent" to ComposeStyleReference { Spinner.Size24.ModeColorAccent.style() },
            "Spinner.Size24.ModeColorDanger" to ComposeStyleReference { Spinner.Size24.ModeColorDanger.style() },
            "Spinner.Size16.ModeColorPrimary" to ComposeStyleReference { Spinner.Size16.ModeColorPrimary.style() },
            "Spinner.Size16.ModeColorSecondary" to ComposeStyleReference { Spinner.Size16.ModeColorSecondary.style() },
            "Spinner.Size16.ModeColorGlobalWhite" to ComposeStyleReference { Spinner.Size16.ModeColorGlobalWhite.style() },
            "Spinner.Size16.ModeColorAccent" to ComposeStyleReference { Spinner.Size16.ModeColorAccent.style() },
            "Spinner.Size16.ModeColorDanger" to ComposeStyleReference { Spinner.Size16.ModeColorDanger.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SpinnerStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size40" -> SpinnerSize.Size40
                "Size32" -> SpinnerSize.Size32
                "Size24" -> SpinnerSize.Size24
                "Size16" -> SpinnerSize.Size16
                else -> SpinnerSize.Size40
            },
            modeColor = when (bindings["modeColor"]?.toString()) {
                "Primary" -> SpinnerModeColor.Primary
                "Secondary" -> SpinnerModeColor.Secondary
                "GlobalWhite" -> SpinnerModeColor.GlobalWhite
                "Accent" -> SpinnerModeColor.Accent
                "Danger" -> SpinnerModeColor.Danger
                else -> SpinnerModeColor.Primary
            },
        ).key
    }
}
