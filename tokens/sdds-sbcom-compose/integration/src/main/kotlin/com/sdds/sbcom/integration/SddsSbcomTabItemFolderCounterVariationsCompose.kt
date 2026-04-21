// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CounterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.counter.Default
import com.sdds.sbcom.styles.counter.TabItemFolderCounter

internal object SddsSbcomTabItemFolderCounterVariationsCompose : ComposeStyleProvider<CounterStyle>() {

    override val variations: Map<String, ComposeStyleReference<CounterStyle>> =
        mapOf(
            "TabItemFolderCounter.Default" to ComposeStyleReference { TabItemFolderCounter.Default.style() },
        )
}
