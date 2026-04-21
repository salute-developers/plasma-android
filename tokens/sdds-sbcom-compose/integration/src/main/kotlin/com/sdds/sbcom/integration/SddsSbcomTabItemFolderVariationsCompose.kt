// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.tabitem.Default
import com.sdds.sbcom.styles.tabitem.TabItemFolder

internal object SddsSbcomTabItemFolderVariationsCompose : ComposeStyleProvider<TabItemStyle>() {

    override val variations: Map<String, ComposeStyleReference<TabItemStyle>> =
        mapOf(
            "TabItemFolder.Default" to ComposeStyleReference { TabItemFolder.Default.style() },
        )
}
