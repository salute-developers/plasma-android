package com.sdds.playground.sandbox.plasma.giga.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.bottomsheet.Default
import com.sdds.plasma.giga.styles.bottomsheet.ModalBottomSheet
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaModalBottomSheetVariationsCompose : ComposeStyleProvider<String, ModalBottomSheetStyle>() {
    override val variations: Map<String, @Composable () -> ModalBottomSheetStyle> =
        mapOf(
            "Default" to { ModalBottomSheet.Default.style() },
        )
}
