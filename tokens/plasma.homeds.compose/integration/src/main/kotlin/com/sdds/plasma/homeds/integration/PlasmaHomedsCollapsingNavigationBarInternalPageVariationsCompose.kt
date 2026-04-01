// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarInternalPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.Default

internal object PlasmaHomedsCollapsingNavigationBarInternalPageVariationsCompose : ComposeStyleProvider<CollapsingNavigationBarStyle>() {
    override val variations: Map<String, ComposeStyleReference<CollapsingNavigationBarStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { CollapsingNavigationBarInternalPage.Default.style() },
        )
}
