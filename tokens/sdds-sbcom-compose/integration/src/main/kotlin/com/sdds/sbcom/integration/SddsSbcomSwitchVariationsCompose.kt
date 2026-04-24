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
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.switcher.Default
import com.sdds.sbcom.styles.switcher.Switch

internal object SddsSbcomSwitchVariationsCompose : ComposeStyleProvider<SwitchStyle>() {

    override val variations: Map<String, ComposeStyleReference<SwitchStyle>> =
        mapOf(
            "Switch.Default" to ComposeStyleReference { Switch.Default.style() },
        )
}
