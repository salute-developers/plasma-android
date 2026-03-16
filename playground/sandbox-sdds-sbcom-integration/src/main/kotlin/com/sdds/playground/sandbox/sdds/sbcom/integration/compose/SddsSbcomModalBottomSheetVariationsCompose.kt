package com.sdds.playground.sandbox.sdds.sbcom.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ModalBottomSheetStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.sbcom.styles.bottomsheet.Default
import com.sdds.sbcom.styles.bottomsheet.ModalBottomSheet

internal object SddsSbcomModalBottomSheetVariationsCompose : ComposeStyleProvider<String, ModalBottomSheetStyle>() {
    override val variations: Map<String, @Composable () -> ModalBottomSheetStyle> =
        mapOf(
            "Default" to { ModalBottomSheet.Default.style() },
        )
}
