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
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.textskeleton.L
import com.sdds.plasma.homeds.styles.textskeleton.M
import com.sdds.plasma.homeds.styles.textskeleton.S
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonDisplay
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonDisplaySize
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonStyles
import com.sdds.plasma.homeds.styles.textskeleton.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsTextSkeletonDisplayVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S")),
        )

    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "TextSkeletonDisplay.L" to ComposeStyleReference { TextSkeletonDisplay.L.style() },
            "TextSkeletonDisplay.M" to ComposeStyleReference { TextSkeletonDisplay.M.style() },
            "TextSkeletonDisplay.S" to ComposeStyleReference { TextSkeletonDisplay.S.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextSkeletonStyles.Display.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TextSkeletonDisplaySize.L
                "M" -> TextSkeletonDisplaySize.M
                "S" -> TextSkeletonDisplaySize.S
                else -> TextSkeletonDisplaySize.L
            },
        ).key
    }
}
