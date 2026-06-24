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
import com.sdds.compose.uikit.TextSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.textskeleton.Default
import com.sdds.plasma.giga.styles.textskeleton.Lighter
import com.sdds.plasma.giga.styles.textskeleton.TextSkeleton
import com.sdds.plasma.giga.styles.textskeleton.TextSkeletonStyles
import com.sdds.plasma.giga.styles.textskeleton.TextSkeletonView
import com.sdds.plasma.giga.styles.textskeleton.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaTextSkeletonVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Lighter")),
        )

    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "TextSkeleton.Default" to ComposeStyleReference { TextSkeleton.Default.style() },
            "TextSkeleton.Lighter" to ComposeStyleReference { TextSkeleton.Lighter.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextSkeletonStyles.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> TextSkeletonView.Default
                "Lighter" -> TextSkeletonView.Lighter
                else -> TextSkeletonView.Default
            },
        ).key
    }
}
