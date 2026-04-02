// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.bottomsheet.Default
import com.sdds.plasma.giga.styles.bottomsheet.ModalBottomSheet

internal object PlasmaGigaModalBottomSheetVariationsCompose : ComposeStyleProvider<ModalBottomSheetStyle>() {
    override val variations: Map<String, ComposeStyleReference<ModalBottomSheetStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { ModalBottomSheet.Default.style() },
        )
}
