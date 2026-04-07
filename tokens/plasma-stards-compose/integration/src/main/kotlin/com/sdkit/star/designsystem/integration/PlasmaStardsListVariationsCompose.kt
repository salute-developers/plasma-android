// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.list.L
import com.sdkit.star.designsystem.styles.list.List
import com.sdkit.star.designsystem.styles.list.M
import com.sdkit.star.designsystem.styles.list.S
import com.sdkit.star.designsystem.styles.list.Xs

internal object PlasmaStardsListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "L" to ComposeStyleReference { List.L.style() },
            "M" to ComposeStyleReference { List.M.style() },
            "S" to ComposeStyleReference { List.S.style() },
            "Xs" to ComposeStyleReference { List.Xs.style() },
        )
}
