// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sbcom.styles.collapsingnavigationbar.CollapsingNavigationBarInternalPage
import com.sdds.sbcom.styles.collapsingnavigationbar.Default

internal object SddsSbcomCollapsingNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<CollapsingNavigationBarStyle>() {

    override val variations: Map<String, ComposeStyleReference<CollapsingNavigationBarStyle>> =
        mapOf(
            "CollapsingNavigationBarInternalPage.Default" to ComposeStyleReference { CollapsingNavigationBarInternalPage.Default.style() },
        )
}
