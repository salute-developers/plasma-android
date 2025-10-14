package com.sdds.playground.sandbox.sdds.serv.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Negative
import com.sdds.serv.styles.toast.Pilled
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast

internal object SddsServToastVariationsCompose : ComposeStyleProvider<String, ToastStyle>() {
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
