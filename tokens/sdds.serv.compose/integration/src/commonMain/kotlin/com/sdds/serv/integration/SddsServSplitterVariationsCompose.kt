// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SplitterStyle
import com.sdds.compose.uikit.style.style
import com.sdds.serv.styles.splitter.Default
import com.sdds.serv.styles.splitter.Splitter

internal object SddsServSplitterVariationsCompose : ComposeStyleProvider<SplitterStyle>() {

    override val variations: Map<String, ComposeStyleReference<SplitterStyle>> =
        mapOf(
            "Splitter.Default" to ComposeStyleReference { Splitter.Default.style() },
        )
}
