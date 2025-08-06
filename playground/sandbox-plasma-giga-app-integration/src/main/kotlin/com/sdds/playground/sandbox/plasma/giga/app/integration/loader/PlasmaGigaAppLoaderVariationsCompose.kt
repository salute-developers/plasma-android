package com.sdds.playground.sandbox.plasma.giga.app.integration.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.loader.Default
import com.sdds.plasma.giga.app.styles.loader.Loader
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppLoaderVariationsCompose :
    ComposeStyleProvider<String, LoaderStyle>() {
    override val variations: Map<String, @Composable () -> LoaderStyle> =
        mapOf(
            "Default" to { Loader.Default.style() },
        )
}
