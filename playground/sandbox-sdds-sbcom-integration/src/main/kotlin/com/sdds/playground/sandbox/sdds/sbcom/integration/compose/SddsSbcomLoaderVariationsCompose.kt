package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.loader.Default
import com.sdds.sbcom.styles.loader.Loader

internal object SddsSbcomLoaderVariationsCompose : ComposeStyleProvider<String, LoaderStyle>() {
    override val variations: Map<String, @Composable () -> LoaderStyle> =
        mapOf(
            "Default" to { Loader.Default.style() },
        )
}
