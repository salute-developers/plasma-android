package com.sdds.playground.sandbox.plasma.giga.app.integration.toast

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

internal object PlasmaGigaAppToastVariationsCompose :
    ComposeStyleProvider<String, ToastStyle>() {
    override val variations: Map<String, @Composable () -> ToastStyle> =
        mapOf(
            "RoundedDefault" to { Toast.Rounded.Default.style() },
            "RoundedNegative" to { Toast.Rounded.Negative.style() },
            "RoundedPositive" to { Toast.Rounded.Positive.style() },
            "PilledDefault" to { Toast.Pilled.Default.style() },
            "PilledNegative" to { Toast.Pilled.Negative.style() },
            "PilledPositive" to { Toast.Pilled.Positive.style() },
        )
}
