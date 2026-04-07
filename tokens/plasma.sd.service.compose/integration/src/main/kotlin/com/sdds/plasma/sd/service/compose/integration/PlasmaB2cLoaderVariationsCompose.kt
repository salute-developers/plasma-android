// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.loader.Default
import com.sdds.plasma.sd.service.styles.loader.Loader

internal object PlasmaB2cLoaderVariationsCompose : ComposeStyleProvider<LoaderStyle>() {
    override val variations: Map<String, ComposeStyleReference<LoaderStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Loader.Default.style() },
        )
}
