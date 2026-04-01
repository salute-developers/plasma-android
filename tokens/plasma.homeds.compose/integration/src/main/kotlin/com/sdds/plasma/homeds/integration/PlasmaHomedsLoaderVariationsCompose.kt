// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.loader.Default
import com.sdds.plasma.homeds.styles.loader.Loader

internal object PlasmaHomedsLoaderVariationsCompose : ComposeStyleProvider<LoaderStyle>() {
    override val variations: Map<String, ComposeStyleReference<LoaderStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Loader.Default.style() },
        )
}
