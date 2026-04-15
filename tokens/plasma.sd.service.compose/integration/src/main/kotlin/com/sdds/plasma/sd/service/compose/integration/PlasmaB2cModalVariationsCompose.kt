// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.modal.Default
import com.sdds.plasma.sd.service.styles.modal.Modal

internal object PlasmaB2cModalVariationsCompose : ComposeStyleProvider<ModalStyle>() {
    override val variations: Map<String, ComposeStyleReference<ModalStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Modal.Default.style() },
        )
}
