// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.scrollbar.Default
import com.sdds.sbcom.styles.scrollbar.ScrollBar

internal object SddsSbcomScrollBarVariationsCompose : ComposeStyleProvider<ScrollBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<ScrollBarStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { ScrollBar.Default.style() },
        )
}
