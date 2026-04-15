// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.list.L
import com.sdds.plasma.giga.styles.list.ListTight
import com.sdds.plasma.giga.styles.list.M
import com.sdds.plasma.giga.styles.list.S
import com.sdds.plasma.giga.styles.list.Xl
import com.sdds.plasma.giga.styles.list.Xs

internal object PlasmaGigaListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { ListTight.Xl.style() },
            "L" to ComposeStyleReference { ListTight.L.style() },
            "M" to ComposeStyleReference { ListTight.M.style() },
            "S" to ComposeStyleReference { ListTight.S.style() },
            "Xs" to ComposeStyleReference { ListTight.Xs.style() },
        )
}
