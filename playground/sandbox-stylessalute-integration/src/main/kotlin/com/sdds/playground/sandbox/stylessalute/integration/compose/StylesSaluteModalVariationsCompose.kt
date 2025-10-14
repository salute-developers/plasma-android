package com.sdds.playground.sandbox.stylessalute.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.modal.Default
import com.sdds.stylessalute.styles.modal.Modal

internal object StylesSaluteModalVariationsCompose : ComposeStyleProvider<String, ModalStyle>() {
    override val variations: Map<String, @Composable () -> ModalStyle> =
        mapOf(
            "Default" to { Modal.Default.style() },
        )
}
