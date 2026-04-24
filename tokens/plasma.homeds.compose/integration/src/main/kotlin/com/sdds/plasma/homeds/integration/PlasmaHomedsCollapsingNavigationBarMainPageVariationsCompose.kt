// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.CollapsingNavigationBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.CollapsingNavigationBarMainPage
import com.sdds.plasma.homeds.styles.collapsingnavigationbar.Default

internal object PlasmaHomedsCollapsingNavigationBarMainPageVariationsCompose : ComposeStyleProvider<CollapsingNavigationBarStyle>() {

    override val variations: Map<String, ComposeStyleReference<CollapsingNavigationBarStyle>> =
        mapOf(
            "CollapsingNavigationBarMainPage.Default" to ComposeStyleReference { CollapsingNavigationBarMainPage.Default.style() },
        )
}
