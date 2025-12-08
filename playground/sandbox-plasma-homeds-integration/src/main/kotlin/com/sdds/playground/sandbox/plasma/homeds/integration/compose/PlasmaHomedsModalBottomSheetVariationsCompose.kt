package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.bottomsheet.Default
import com.sdds.plasma.homeds.styles.bottomsheet.ModalBottomSheet
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsModalBottomSheetVariationsCompose : ComposeStyleProvider<String, ModalBottomSheetStyle>() {
    override val variations: Map<String, @Composable () -> ModalBottomSheetStyle> =
        mapOf(
            "Default" to { ModalBottomSheet.Default.style() },
        )
}
