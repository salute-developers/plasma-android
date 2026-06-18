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
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonDisplay
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonDisplaySize
import com.sdkit.star.designsystem.styles.textskeleton.TextSkeletonStyles
import com.sdkit.star.designsystem.styles.textskeleton.resolve

internal object PlasmaStardsTextSkeletonDisplayVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
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
