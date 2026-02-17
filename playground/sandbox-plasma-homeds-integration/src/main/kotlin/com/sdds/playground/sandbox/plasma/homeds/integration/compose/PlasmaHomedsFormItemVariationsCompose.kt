package com.sdds.playground.sandbox.plasma.homeds.integration.compose

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FormItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.formitem.Default
import com.sdds.plasma.homeds.styles.formitem.FormItem
import com.sdds.plasma.homeds.styles.formitem.Negative
import com.sdds.plasma.homeds.styles.formitem.Positive
import com.sdds.plasma.homeds.styles.formitem.Warning
import com.sdds.playground.sandbox.core.integration.ComposeStyleProvider

internal object PlasmaHomedsFormItemVariationsCompose : ComposeStyleProvider<String, FormItemStyle>() {
    override val variations: Map<String, @Composable () -> FormItemStyle> =
        mapOf(
            "Default" to { FormItem.Default.style() },
            "Positive" to { FormItem.Positive.style() },
            "Negative" to { FormItem.Negative.style() },
            "Warning" to { FormItem.Warning.style() },
        )
}
