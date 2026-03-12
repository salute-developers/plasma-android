package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.TabsStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.tabs.Default
import com.sdds.sbcom.styles.tabs.TabsFolder

internal object SddsSbcomTabsFolderVariationsCompose : ComposeStyleProvider<String, TabsStyle>() {
    override val variations: Map<String, @Composable () -> TabsStyle> =
        mapOf(
            "Default" to { TabsFolder.Default.style() },
        )
}
