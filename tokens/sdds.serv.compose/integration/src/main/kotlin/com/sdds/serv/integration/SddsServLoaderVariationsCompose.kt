// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.loader.Default
import com.sdds.serv.styles.loader.Loader

internal object SddsServLoaderVariationsCompose : ComposeStyleProvider<LoaderStyle>() {
    override val variations: Map<String, ComposeStyleReference<LoaderStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Loader.Default.style() },
        )
}
