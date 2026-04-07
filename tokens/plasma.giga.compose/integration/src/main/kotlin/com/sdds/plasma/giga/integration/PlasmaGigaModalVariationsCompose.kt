// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.modal.Default
import com.sdds.plasma.giga.styles.modal.Modal

internal object PlasmaGigaModalVariationsCompose : ComposeStyleProvider<ModalStyle>() {
    override val variations: Map<String, ComposeStyleReference<ModalStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Modal.Default.style() },
        )
}
