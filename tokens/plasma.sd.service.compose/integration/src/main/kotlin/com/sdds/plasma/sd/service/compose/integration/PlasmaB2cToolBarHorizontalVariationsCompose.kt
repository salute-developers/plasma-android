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
import com.sdds.plasma.sd.service.styles.toolbar.ToolBarHorizontal
import com.sdds.plasma.sd.service.styles.toolbar.Xs

internal object PlasmaB2cToolBarHorizontalVariationsCompose : ComposeStyleProvider<ToolBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<ToolBarStyle>> =
        mapOf(
            "L" to ComposeStyleReference { ToolBarHorizontal.L.style() },
            "L.HasShadow" to ComposeStyleReference { ToolBarHorizontal.L.HasShadow.style() },
            "M" to ComposeStyleReference { ToolBarHorizontal.M.style() },
            "M.HasShadow" to ComposeStyleReference { ToolBarHorizontal.M.HasShadow.style() },
            "S" to ComposeStyleReference { ToolBarHorizontal.S.style() },
            "S.HasShadow" to ComposeStyleReference { ToolBarHorizontal.S.HasShadow.style() },
            "Xs" to ComposeStyleReference { ToolBarHorizontal.Xs.style() },
            "Xs.HasShadow" to ComposeStyleReference { ToolBarHorizontal.Xs.HasShadow.style() },
        )
}
