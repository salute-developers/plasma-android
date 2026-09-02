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
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.modal.Default
import com.sdds.finai.styles.modal.Modal

internal object SddsFinaiModalVariationsCompose : ComposeStyleProvider<ModalStyle>() {

    override val variations: Map<String, ComposeStyleReference<ModalStyle>> =
        mapOf(
            "Modal.Default" to ComposeStyleReference { Modal.Default.style() },
        )
}
