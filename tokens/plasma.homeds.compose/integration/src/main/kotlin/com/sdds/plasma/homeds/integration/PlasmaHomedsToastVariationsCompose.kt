// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.toast.Default
import com.sdds.plasma.homeds.styles.toast.Negative
import com.sdds.plasma.homeds.styles.toast.Positive
import com.sdds.plasma.homeds.styles.toast.Toast

internal object PlasmaHomedsToastVariationsCompose : ComposeStyleProvider<ToastStyle>() {
    override val variations: Map<String, ComposeStyleReference<ToastStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { Toast.Default.style() },
            "Positive" to ComposeStyleReference { Toast.Positive.style() },
            "Negative" to ComposeStyleReference { Toast.Negative.style() },
        )
}
