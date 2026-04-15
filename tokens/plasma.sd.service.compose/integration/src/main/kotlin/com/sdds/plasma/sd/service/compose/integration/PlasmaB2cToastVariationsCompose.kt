// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.toast.Default
import com.sdds.plasma.sd.service.styles.toast.Negative
import com.sdds.plasma.sd.service.styles.toast.Pilled
import com.sdds.plasma.sd.service.styles.toast.Positive
import com.sdds.plasma.sd.service.styles.toast.Rounded
import com.sdds.plasma.sd.service.styles.toast.Toast

internal object PlasmaB2cToastVariationsCompose : ComposeStyleProvider<ToastStyle>() {
    override val variations: Map<String, ComposeStyleReference<ToastStyle>> =
        mapOf(
            "Rounded.Default" to ComposeStyleReference { Toast.Rounded.Default.style() },
            "Rounded.Positive" to ComposeStyleReference { Toast.Rounded.Positive.style() },
            "Rounded.Negative" to ComposeStyleReference { Toast.Rounded.Negative.style() },
            "Pilled.Default" to ComposeStyleReference { Toast.Pilled.Default.style() },
            "Pilled.Positive" to ComposeStyleReference { Toast.Pilled.Positive.style() },
            "Pilled.Negative" to ComposeStyleReference { Toast.Pilled.Negative.style() },
        )
}
