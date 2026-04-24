// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
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
import com.sdds.plasma.homeds.styles.toast.ToastStyles
import com.sdds.plasma.homeds.styles.toast.ToastView
import com.sdds.plasma.homeds.styles.toast.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsToastVariationsCompose : ComposeStyleProvider<ToastStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ToastStyle>> =
        mapOf(
            "Toast.Default" to ComposeStyleReference { Toast.Default.style() },
            "Toast.Positive" to ComposeStyleReference { Toast.Positive.style() },
            "Toast.Negative" to ComposeStyleReference { Toast.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ToastStyles.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> ToastView.Default
                "Positive" -> ToastView.Positive
                "Negative" -> ToastView.Negative
                else -> ToastView.Default
            },
        ).key
    }
}
