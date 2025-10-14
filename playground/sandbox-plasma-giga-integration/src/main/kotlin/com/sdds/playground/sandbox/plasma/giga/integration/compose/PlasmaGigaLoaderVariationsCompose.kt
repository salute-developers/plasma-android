package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.loader.Default
import com.sdds.plasma.giga.styles.loader.Loader
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaLoaderVariationsCompose : ComposeStyleProvider<String, LoaderStyle>() {
    override val variations: Map<String, @Composable () -> LoaderStyle> =
        mapOf(
            "Default" to { Loader.Default.style() },
        )
}
