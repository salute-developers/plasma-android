package com.sdds.playground.sandbox.plasma.sd.service.integration.loader

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.loader.Default
import com.sdds.plasma.sd.service.styles.loader.Loader
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceLoaderVariationsCompose :
    ComposeStyleProvider<String, LoaderStyle>() {
    override val variations: Map<String, @Composable () -> LoaderStyle> =
        mapOf(
            "Default" to { Loader.Default.style() },
        )
}
