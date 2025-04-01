package com.sdds.playground.sandbox.sdds.serv.integration.bottomsheet

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.bottomsheet.Default
import com.sdds.serv.styles.bottomsheet.ModalBottomSheet

internal object SddsServBottomSheetVariationsCompose : ComposeStyleProvider<String, ModalBottomSheetStyle>() {
    override val variations: Map<String, @Composable () -> ModalBottomSheetStyle> =
        mapOf(
            "Default" to { ModalBottomSheet.Default.style() },
        )
}
