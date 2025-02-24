package com.sdds.playground.sandbox.plasma.stards.integration.button.link

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object StarDsLinkButtonVariationsCompose : ComposeStyleProvider<String, ButtonStyle>() {

    override val variations: Map<String, @Composable () -> ButtonStyle> = emptyMap()
}
