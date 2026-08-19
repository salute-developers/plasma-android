// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.bottomsheet.Default
import com.sdds.finai.styles.bottomsheet.ModalBottomSheet

internal object SddsFinaiModalBottomSheetVariationsCompose : ComposeStyleProvider<ModalBottomSheetStyle>() {

    override val variations: Map<String, ComposeStyleReference<ModalBottomSheetStyle>> =
        mapOf(
            "ModalBottomSheet.Default" to ComposeStyleReference { ModalBottomSheet.Default.style() },
        )
}
