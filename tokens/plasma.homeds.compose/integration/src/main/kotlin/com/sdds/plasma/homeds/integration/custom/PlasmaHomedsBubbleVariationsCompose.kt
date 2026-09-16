@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
)

package com.sdds.plasma.homeds.integration.custom

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.components.bubble.BubbleStyle
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Bubble
import com.sdds.plasma.homeds.styles.customcomponents.bubble.Default

object PlasmaHomedsBubbleVariationsCompose : ComposeStyleProvider<BubbleStyle>() {
    override val variations: Map<String, ComposeStyleReference<BubbleStyle>> =
        mapOf(
            "Bubble.Default" to ComposeStyleReference { Bubble.Default.style() },
        )
}
