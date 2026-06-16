// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.textskeleton.L
import com.sdkit.star.designsystem.styles.textskeleton.M
import com.sdkit.star.designsystem.styles.textskeleton.S
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonStyles
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonText
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonTextSize
import com.sdkit.star.designsystem.styles.textskeleton.Xs
import com.sdkit.star.designsystem.styles.textskeleton.resolve

internal object PlasmaStardsTextSkeletonTextVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
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
