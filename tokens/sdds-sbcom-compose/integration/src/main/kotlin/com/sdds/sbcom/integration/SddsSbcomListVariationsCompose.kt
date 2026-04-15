// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.list.Default
import com.sdds.sbcom.styles.list.List

internal object SddsSbcomListVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { List.Default.style() },
        )
}
