package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.bottomsheet.Default
import com.sdds.plasma.sd.service.styles.bottomsheet.ModalBottomSheet
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cModalBottomSheetVariationsCompose : ComposeStyleProvider<String, ModalBottomSheetStyle>() {
    override val variations: Map<String, @Composable () -> ModalBottomSheetStyle> =
        mapOf(
            "Default" to { ModalBottomSheet.Default.style() },
        )
}
