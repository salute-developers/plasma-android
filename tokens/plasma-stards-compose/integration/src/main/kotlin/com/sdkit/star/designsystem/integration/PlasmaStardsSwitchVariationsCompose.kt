// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SwitchStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.switcher.HasBackground
import com.sdkit.star.designsystem.styles.switcher.L
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.S
import com.sdkit.star.designsystem.styles.switcher.Switch

internal object PlasmaStardsSwitchVariationsCompose : ComposeStyleProvider<SwitchStyle>() {
    override val variations: Map<String, ComposeStyleReference<SwitchStyle>> =
        mapOf(
            "L" to ComposeStyleReference { Switch.L.style() },
            "L.HasBackground" to ComposeStyleReference { Switch.L.HasBackground.style() },
            "M" to ComposeStyleReference { Switch.M.style() },
            "M.HasBackground" to ComposeStyleReference { Switch.M.HasBackground.style() },
            "S" to ComposeStyleReference { Switch.S.style() },
            "S.HasBackground" to ComposeStyleReference { Switch.S.HasBackground.style() },
        )
}
