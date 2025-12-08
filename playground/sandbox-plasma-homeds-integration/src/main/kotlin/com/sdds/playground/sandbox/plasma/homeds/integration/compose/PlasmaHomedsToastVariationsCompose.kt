package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.toast.Default
import com.sdds.plasma.homeds.styles.toast.Negative
import com.sdds.plasma.homeds.styles.toast.Positive
import com.sdds.plasma.homeds.styles.toast.Toast
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsToastVariationsCompose : ComposeStyleProvider<String, ToastStyle>() {
    override val variations: Map<String, @Composable () -> ToastStyle> =
        mapOf(
            "Default" to { Toast.Default.style() },
            "Positive" to { Toast.Positive.style() },
            "Negative" to { Toast.Negative.style() },
        )
}
