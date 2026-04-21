// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.tabs.Default
import com.sdds.sbcom.styles.tabs.TabsFolder

internal object SddsSbcomTabsFolderVariationsCompose : ComposeStyleProvider<TabsStyle>() {

    override val variations: Map<String, ComposeStyleReference<TabsStyle>> =
        mapOf(
            "TabsFolder.Default" to ComposeStyleReference { TabsFolder.Default.style() },
        )
}
