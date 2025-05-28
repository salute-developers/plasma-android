package com.sdds.playground.sandbox.plasma.sd.service.integration.modal

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.modal.Default
import com.sdds.plasma.sd.service.styles.modal.Modal
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaSdServiceModalVariationsCompose :
    ComposeStyleProvider<String, ModalStyle>() {
    override val variations: Map<String, @Composable () -> ModalStyle> =
        mapOf(
            "Default" to { Modal.Default.style() },
        )
}
