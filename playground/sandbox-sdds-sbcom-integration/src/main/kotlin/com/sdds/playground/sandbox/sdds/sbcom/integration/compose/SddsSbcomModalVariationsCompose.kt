package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.modal.Default
import com.sdds.sbcom.styles.modal.Modal

internal object SddsSbcomModalVariationsCompose : ComposeStyleProvider<String, ModalStyle>() {
    override val variations: Map<String, @Composable () -> ModalStyle> =
        mapOf(
            "Default" to { Modal.Default.style() },
        )
}
