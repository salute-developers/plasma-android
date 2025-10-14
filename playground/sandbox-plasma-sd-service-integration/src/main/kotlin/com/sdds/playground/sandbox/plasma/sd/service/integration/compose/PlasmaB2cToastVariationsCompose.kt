package com.sdds.playground.sandbox.plasma.sd.service.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.toast.Default
import com.sdds.plasma.sd.service.styles.toast.Negative
import com.sdds.plasma.sd.service.styles.toast.Pilled
import com.sdds.plasma.sd.service.styles.toast.Positive
import com.sdds.plasma.sd.service.styles.toast.Rounded
import com.sdds.plasma.sd.service.styles.toast.Toast
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaB2cToastVariationsCompose : ComposeStyleProvider<String, ToastStyle>() {
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
