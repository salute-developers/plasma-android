// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.list.HasBackground
import com.sdds.plasma.homeds.styles.list.HasItemBackground
import com.sdds.plasma.homeds.styles.list.List
import com.sdds.plasma.homeds.styles.list.NoBackground
import com.sdds.plasma.homeds.styles.list.S

internal object PlasmaHomedsListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "S" to ComposeStyleReference { List.S.style() },
            "S.NoBackground" to ComposeStyleReference { List.S.NoBackground.style() },
            "S.NoBackground.HasItemBackground" to ComposeStyleReference { List.S.NoBackground.HasItemBackground.style() },
            "S.HasBackground" to ComposeStyleReference { List.S.HasBackground.style() },
        )
}
