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
import com.sdds.compose.uikit.CircularProgressBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBar
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBarModeColor
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBarSize
import com.sdds.sbcom.styles.circularprogressbar.CircularProgressBarStyles
import com.sdds.sbcom.styles.circularprogressbar.ModeColorAccent
import com.sdds.sbcom.styles.circularprogressbar.ModeColorDanger
import com.sdds.sbcom.styles.circularprogressbar.ModeColorGlobalWhite
import com.sdds.sbcom.styles.circularprogressbar.ModeColorPrimary
import com.sdds.sbcom.styles.circularprogressbar.ModeColorSecondary
import com.sdds.sbcom.styles.circularprogressbar.Size16
import com.sdds.sbcom.styles.circularprogressbar.Size24
import com.sdds.sbcom.styles.circularprogressbar.Size32
import com.sdds.sbcom.styles.circularprogressbar.Size40
import com.sdds.sbcom.styles.circularprogressbar.resolve

internal object SddsSbcomCircularProgressBarVariationsCompose : ComposeStyleProvider<CircularProgressBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Size40", variants = listOf("Size40", "Size32", "Size24", "Size16")),
            Property.SingleChoiceProperty(name = "modeColor", value = "Primary", variants = listOf("Primary", "Secondary", "GlobalWhite", "Accent", "Danger")),
        )

    override val variations: Map<String, ComposeStyleReference<CircularProgressBarStyle>> =
        mapOf(
            "CircularProgressBar.Size40.ModeColorPrimary" to ComposeStyleReference { CircularProgressBar.Size40.ModeColorPrimary.style() },
            "CircularProgressBar.Size40.ModeColorSecondary" to ComposeStyleReference { CircularProgressBar.Size40.ModeColorSecondary.style() },
            "CircularProgressBar.Size40.ModeColorGlobalWhite" to ComposeStyleReference { CircularProgressBar.Size40.ModeColorGlobalWhite.style() },
            "CircularProgressBar.Size40.ModeColorAccent" to ComposeStyleReference { CircularProgressBar.Size40.ModeColorAccent.style() },
            "CircularProgressBar.Size40.ModeColorDanger" to ComposeStyleReference { CircularProgressBar.Size40.ModeColorDanger.style() },
            "CircularProgressBar.Size32.ModeColorPrimary" to ComposeStyleReference { CircularProgressBar.Size32.ModeColorPrimary.style() },
            "CircularProgressBar.Size32.ModeColorSecondary" to ComposeStyleReference { CircularProgressBar.Size32.ModeColorSecondary.style() },
            "CircularProgressBar.Size32.ModeColorGlobalWhite" to ComposeStyleReference { CircularProgressBar.Size32.ModeColorGlobalWhite.style() },
            "CircularProgressBar.Size32.ModeColorAccent" to ComposeStyleReference { CircularProgressBar.Size32.ModeColorAccent.style() },
            "CircularProgressBar.Size32.ModeColorDanger" to ComposeStyleReference { CircularProgressBar.Size32.ModeColorDanger.style() },
            "CircularProgressBar.Size24.ModeColorPrimary" to ComposeStyleReference { CircularProgressBar.Size24.ModeColorPrimary.style() },
            "CircularProgressBar.Size24.ModeColorSecondary" to ComposeStyleReference { CircularProgressBar.Size24.ModeColorSecondary.style() },
            "CircularProgressBar.Size24.ModeColorGlobalWhite" to ComposeStyleReference { CircularProgressBar.Size24.ModeColorGlobalWhite.style() },
            "CircularProgressBar.Size24.ModeColorAccent" to ComposeStyleReference { CircularProgressBar.Size24.ModeColorAccent.style() },
            "CircularProgressBar.Size24.ModeColorDanger" to ComposeStyleReference { CircularProgressBar.Size24.ModeColorDanger.style() },
            "CircularProgressBar.Size16.ModeColorPrimary" to ComposeStyleReference { CircularProgressBar.Size16.ModeColorPrimary.style() },
            "CircularProgressBar.Size16.ModeColorSecondary" to ComposeStyleReference { CircularProgressBar.Size16.ModeColorSecondary.style() },
            "CircularProgressBar.Size16.ModeColorGlobalWhite" to ComposeStyleReference { CircularProgressBar.Size16.ModeColorGlobalWhite.style() },
            "CircularProgressBar.Size16.ModeColorAccent" to ComposeStyleReference { CircularProgressBar.Size16.ModeColorAccent.style() },
            "CircularProgressBar.Size16.ModeColorDanger" to ComposeStyleReference { CircularProgressBar.Size16.ModeColorDanger.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return CircularProgressBarStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Size40" -> CircularProgressBarSize.Size40
                "Size32" -> CircularProgressBarSize.Size32
                "Size24" -> CircularProgressBarSize.Size24
                "Size16" -> CircularProgressBarSize.Size16
                else -> CircularProgressBarSize.Size40
            },
            modeColor = when (bindings["modeColor"]?.toString()) {
                "Primary" -> CircularProgressBarModeColor.Primary
                "Secondary" -> CircularProgressBarModeColor.Secondary
                "GlobalWhite" -> CircularProgressBarModeColor.GlobalWhite
                "Accent" -> CircularProgressBarModeColor.Accent
                "Danger" -> CircularProgressBarModeColor.Danger
                else -> CircularProgressBarModeColor.Primary
            },
        ).key
    }
}
