package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.list.HasBackground
import com.sdds.plasma.homeds.styles.list.HasItemBackground
import com.sdds.plasma.homeds.styles.list.List
import com.sdds.plasma.homeds.styles.list.NoBackground
import com.sdds.plasma.homeds.styles.list.S
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsListVariationsCompose : ComposeStyleProvider<String, ListStyle>() {
    override val variations: Map<String, @Composable () -> ListStyle> =
        mapOf(
            "S" to { List.S.style() },
            "S.NoBackground" to { List.S.NoBackground.style() },
            "S.NoBackground.HasItemBackground" to { List.S.NoBackground.HasItemBackground.style() },
            "S.HasBackground" to { List.S.HasBackground.style() },
        )
}
