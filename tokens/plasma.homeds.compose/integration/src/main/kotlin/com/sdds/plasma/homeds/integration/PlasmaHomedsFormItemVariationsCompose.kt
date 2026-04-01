// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.formitem.Default
import com.sdds.plasma.homeds.styles.formitem.FormItem
import com.sdds.plasma.homeds.styles.formitem.Negative
import com.sdds.plasma.homeds.styles.formitem.Positive
import com.sdds.plasma.homeds.styles.formitem.Warning

internal object PlasmaHomedsFormItemVariationsCompose : ComposeStyleProvider<FormItemStyle>() {
    override val variations: Map<String, ComposeStyleReference<FormItemStyle>> =
        mapOf(
            "Default" to ComposeStyleReference { FormItem.Default.style() },
            "Positive" to ComposeStyleReference { FormItem.Positive.style() },
            "Negative" to ComposeStyleReference { FormItem.Negative.style() },
            "Warning" to ComposeStyleReference { FormItem.Warning.style() },
        )
}
