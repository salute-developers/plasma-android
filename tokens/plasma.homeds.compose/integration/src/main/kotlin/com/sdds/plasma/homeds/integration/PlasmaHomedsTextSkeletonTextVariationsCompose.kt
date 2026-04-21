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
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonStyles
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonText
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonTextSize
import com.sdds.plasma.homeds.styles.textskeleton.Xs
import com.sdds.plasma.homeds.styles.textskeleton.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsTextSkeletonTextVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "TextSkeletonText.L" to ComposeStyleReference { TextSkeletonText.L.style() },
            "TextSkeletonText.M" to ComposeStyleReference { TextSkeletonText.M.style() },
            "TextSkeletonText.S" to ComposeStyleReference { TextSkeletonText.S.style() },
            "TextSkeletonText.Xs" to ComposeStyleReference { TextSkeletonText.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextSkeletonStyles.Text.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TextSkeletonTextSize.L
                "M" -> TextSkeletonTextSize.M
                "S" -> TextSkeletonTextSize.S
                "Xs" -> TextSkeletonTextSize.Xs
                else -> TextSkeletonTextSize.L
            },
        ).key
    }
}
