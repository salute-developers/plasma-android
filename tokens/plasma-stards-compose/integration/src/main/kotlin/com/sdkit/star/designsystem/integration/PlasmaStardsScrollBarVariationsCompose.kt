// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.scrollbar.M
import com.sdkit.star.designsystem.styles.scrollbar.S
import com.sdkit.star.designsystem.styles.scrollbar.ScrollBar

internal object PlasmaStardsScrollBarVariationsCompose : ComposeStyleProvider<ScrollBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<ScrollBarStyle>> =
        mapOf(
            "S" to ComposeStyleReference { ScrollBar.S.style() },
            "M" to ComposeStyleReference { ScrollBar.M.style() },
        )
}
