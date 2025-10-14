package com.sdds.playground.sandbox.plasma.giga.app.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.app.styles.toast.Default
import com.sdds.plasma.giga.app.styles.toast.Negative
import com.sdds.plasma.giga.app.styles.toast.Pilled
import com.sdds.plasma.giga.app.styles.toast.Positive
import com.sdds.plasma.giga.app.styles.toast.Rounded
import com.sdds.plasma.giga.app.styles.toast.Toast
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaGigaAppToastVariationsCompose : ComposeStyleProvider<String, ToastStyle>() {
    override val variations: Map<String, @Composable () -> ToastStyle> =
        mapOf(
            "Rounded.Default" to { Toast.Rounded.Default.style() },
            "Rounded.Positive" to { Toast.Rounded.Positive.style() },
            "Rounded.Negative" to { Toast.Rounded.Negative.style() },
            "Pilled.Default" to { Toast.Pilled.Default.style() },
            "Pilled.Positive" to { Toast.Pilled.Positive.style() },
            "Pilled.Negative" to { Toast.Pilled.Negative.style() },
        )
}
