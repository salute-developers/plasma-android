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
import com.sdds.compose.uikit.PopoverStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.popover.Accent
import com.sdds.serv.styles.popover.Default
import com.sdds.serv.styles.popover.M
import com.sdds.serv.styles.popover.Popover
import com.sdds.serv.styles.popover.PopoverSize
import com.sdds.serv.styles.popover.PopoverStyles
import com.sdds.serv.styles.popover.PopoverView
import com.sdds.serv.styles.popover.S
import com.sdds.serv.styles.popover.resolve

internal object SddsServPopoverVariationsCompose : ComposeStyleProvider<PopoverStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Accent")),
        )

    override val variations: Map<String, ComposeStyleReference<PopoverStyle>> =
        mapOf(
            "Popover.M.Default" to ComposeStyleReference { Popover.M.Default.style() },
            "Popover.M.Accent" to ComposeStyleReference { Popover.M.Accent.style() },
            "Popover.S.Default" to ComposeStyleReference { Popover.S.Default.style() },
            "Popover.S.Accent" to ComposeStyleReference { Popover.S.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return PopoverStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> PopoverSize.M
                "S" -> PopoverSize.S
                else -> PopoverSize.M
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> PopoverView.Default
                "Accent" -> PopoverView.Accent
                else -> PopoverView.Default
            },
        ).key
    }
}
