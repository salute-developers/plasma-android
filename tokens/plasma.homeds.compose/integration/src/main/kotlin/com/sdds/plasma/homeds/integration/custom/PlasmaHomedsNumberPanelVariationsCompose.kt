@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
)

package com.sdds.plasma.homeds.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.numberpanel.NumberPanelStyle
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Humidity
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.M
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.NumberPanel
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.S
import com.sdds.plasma.homeds.styles.customcomponents.numberpanel.Xs

object PlasmaHomedsNumberPanelVariationsCompose : ComposeStyleProvider<NumberPanelStyle>() {
    override val variations: Map<String, ComposeStyleReference<NumberPanelStyle>> =
        mapOf(
            "NumberPanel.Xs" to ComposeStyleReference { NumberPanel.Xs.style() },
            "NumberPanel.S" to ComposeStyleReference { NumberPanel.S.style() },
            "NumberPanel.M" to ComposeStyleReference { NumberPanel.M.style() },
            "NumberPanel.Xs.Humidity" to ComposeStyleReference { NumberPanel.Xs.Humidity.style() },
            "NumberPanel.S.Humidity" to ComposeStyleReference { NumberPanel.S.Humidity.style() },
            "NumberPanel.M.Humidity" to ComposeStyleReference { NumberPanel.M.Humidity.style() },
        )
}
