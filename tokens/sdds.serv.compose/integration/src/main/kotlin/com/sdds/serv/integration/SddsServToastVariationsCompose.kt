// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ToastStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.toast.Default
import com.sdds.serv.styles.toast.Negative
import com.sdds.serv.styles.toast.Pilled
import com.sdds.serv.styles.toast.Positive
import com.sdds.serv.styles.toast.Rounded
import com.sdds.serv.styles.toast.Toast
import com.sdds.serv.styles.toast.ToastShape
import com.sdds.serv.styles.toast.ToastStyles
import com.sdds.serv.styles.toast.ToastView
import com.sdds.serv.styles.toast.resolve

internal object SddsServToastVariationsCompose : ComposeStyleProvider<ToastStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "shape", value = "Rounded", variants = listOf("Rounded", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Positive", "Negative"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ToastStyle>> =
        mapOf(
            "Toast.Rounded.Default" to ComposeStyleReference { Toast.Rounded.Default.style() },
            "Toast.Rounded.Positive" to ComposeStyleReference { Toast.Rounded.Positive.style() },
            "Toast.Rounded.Negative" to ComposeStyleReference { Toast.Rounded.Negative.style() },
            "Toast.Pilled.Default" to ComposeStyleReference { Toast.Pilled.Default.style() },
            "Toast.Pilled.Positive" to ComposeStyleReference { Toast.Pilled.Positive.style() },
            "Toast.Pilled.Negative" to ComposeStyleReference { Toast.Pilled.Negative.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ToastStyles.resolve(
            shape = when (bindings["shape"]?.toString()) {
                "Rounded" -> ToastShape.Rounded
                "Pilled" -> ToastShape.Pilled
                else -> ToastShape.Rounded
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ToastView.Default
                "Positive" -> ToastView.Positive
                "Negative" -> ToastView.Negative
                else -> ToastView.Default
            },
        ).key
    }
}
