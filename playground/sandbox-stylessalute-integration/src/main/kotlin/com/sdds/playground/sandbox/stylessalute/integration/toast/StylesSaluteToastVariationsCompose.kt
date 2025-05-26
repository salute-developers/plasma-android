package com.sdds.playground.sandbox.stylessalute.integration.toast

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.stylessalute.styles.toast.Pilled
import com.sdds.stylessalute.styles.toast.Rounded
import com.sdds.stylessalute.styles.toast.Toast

internal object StylesSaluteToastVariationsCompose :
    ComposeStyleProvider<String, ToastStyle>() {
    override val variations: Map<String, @Composable () -> ToastStyle> =
        mapOf(
            "Rounded" to { Toast.Rounded.style() },
            "Pilled" to { Toast.Pilled.style() },
        )
}
