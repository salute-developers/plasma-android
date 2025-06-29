package com.sdds.playground.sandbox.plasma.giga.integration.modal

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.modal.Default
import com.sdds.plasma.giga.styles.modal.Modal
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaModalVariationsCompose :
    ComposeStyleProvider<String, ModalStyle>() {
    override val variations: Map<String, @Composable () -> ModalStyle> =
        mapOf(
            "Default" to { Modal.Default.style() },
        )
}
