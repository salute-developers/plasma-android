// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ListStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.list.L
import com.sdds.plasma.sd.service.styles.list.ListTight
import com.sdds.plasma.sd.service.styles.list.M
import com.sdds.plasma.sd.service.styles.list.S
import com.sdds.plasma.sd.service.styles.list.Xl
import com.sdds.plasma.sd.service.styles.list.Xs

internal object PlasmaB2cListTightVariationsCompose : ComposeStyleProvider<ListStyle>() {
    override val variations: Map<String, ComposeStyleReference<ListStyle>> =
        mapOf(
            "Xl" to ComposeStyleReference { ListTight.Xl.style() },
            "L" to ComposeStyleReference { ListTight.L.style() },
            "M" to ComposeStyleReference { ListTight.M.style() },
            "S" to ComposeStyleReference { ListTight.S.style() },
            "Xs" to ComposeStyleReference { ListTight.Xs.style() },
        )
}
