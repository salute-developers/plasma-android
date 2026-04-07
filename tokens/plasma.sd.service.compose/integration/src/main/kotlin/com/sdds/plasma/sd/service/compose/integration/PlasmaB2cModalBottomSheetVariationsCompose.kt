// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.bottomsheet.Default
import com.sdds.plasma.sd.service.styles.bottomsheet.ModalBottomSheet

internal object PlasmaB2cModalBottomSheetVariationsCompose : ComposeStyleProvider<ModalBottomSheetStyle>() {
    override val variations: Map<String, ComposeStyleReference<ModalBottomSheetStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { ModalBottomSheet.Default.style() },
        )
}
