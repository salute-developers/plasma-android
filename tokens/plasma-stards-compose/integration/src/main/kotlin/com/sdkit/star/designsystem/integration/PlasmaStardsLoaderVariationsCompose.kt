// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.LoaderStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.loader.Default
import com.sdkit.star.designsystem.styles.loader.Loader

internal object PlasmaStardsLoaderVariationsCompose : ComposeStyleProvider<LoaderStyle>() {
    override val variations: Map<String, ComposeStyleReference<LoaderStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Loader.Default.style() },
        )
}
