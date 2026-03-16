package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.tabitem.Default
import com.sdds.sbcom.styles.tabitem.TabItemFolder

internal object SddsSbcomTabItemFolderVariationsCompose : ComposeStyleProvider<String, TabItemStyle>() {
    override val variations: Map<String, @Composable () -> TabItemStyle> =
        mapOf(
            "Default" to { TabItemFolder.Default.style() },
        )
}
