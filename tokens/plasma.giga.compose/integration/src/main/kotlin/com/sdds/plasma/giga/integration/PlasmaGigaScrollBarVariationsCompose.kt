// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.giga.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ScrollBarStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.scrollbar.M
import com.sdds.plasma.giga.styles.scrollbar.S
import com.sdds.plasma.giga.styles.scrollbar.ScrollBar
import com.sdds.plasma.giga.styles.scrollbar.ScrollBarSize
import com.sdds.plasma.giga.styles.scrollbar.ScrollBarStyles
import com.sdds.plasma.giga.styles.scrollbar.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaScrollBarVariationsCompose : ComposeStyleProvider<ScrollBarStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<ScrollBarStyle>> =
        mapOf(
            "ScrollBar.S" to ComposeStyleReference { ScrollBar.S.style() },
            "ScrollBar.M" to ComposeStyleReference { ScrollBar.M.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ScrollBarStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> ScrollBarSize.M
                "S" -> ScrollBarSize.S
                else -> ScrollBarSize.M
            },
        ).key
    }
}
