// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ToolBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.toolbar.HasShadow
import com.sdds.plasma.sd.service.styles.toolbar.L
import com.sdds.plasma.sd.service.styles.toolbar.M
import com.sdds.plasma.sd.service.styles.toolbar.S
import com.sdds.plasma.sd.service.styles.toolbar.ToolBarVertical
import com.sdds.plasma.sd.service.styles.toolbar.Xs

internal object PlasmaB2cToolBarVerticalVariationsCompose : ComposeStyleProvider<ToolBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<ToolBarStyle>> =
        mapOf(
            "L" to ComposeStyleReference { ToolBarVertical.L.style() },
            "L.HasShadow" to ComposeStyleReference { ToolBarVertical.L.HasShadow.style() },
            "M" to ComposeStyleReference { ToolBarVertical.M.style() },
            "M.HasShadow" to ComposeStyleReference { ToolBarVertical.M.HasShadow.style() },
            "S" to ComposeStyleReference { ToolBarVertical.S.style() },
            "S.HasShadow" to ComposeStyleReference { ToolBarVertical.S.HasShadow.style() },
            "Xs" to ComposeStyleReference { ToolBarVertical.Xs.style() },
            "Xs.HasShadow" to ComposeStyleReference { ToolBarVertical.Xs.HasShadow.style() },
        )
}
