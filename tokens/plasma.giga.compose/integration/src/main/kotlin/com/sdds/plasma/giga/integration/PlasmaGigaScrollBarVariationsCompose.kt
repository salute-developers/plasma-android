// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.scrollbar.M
import com.sdds.plasma.giga.styles.scrollbar.S
import com.sdds.plasma.giga.styles.scrollbar.ScrollBar

internal object PlasmaGigaScrollBarVariationsCompose : ComposeStyleProvider<ScrollBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<ScrollBarStyle>> =
        mapOf(
            "S" to ComposeStyleReference { ScrollBar.S.style() },
            "M" to ComposeStyleReference { ScrollBar.M.style() },
        )
}
