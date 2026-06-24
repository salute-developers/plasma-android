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
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.giga.styles.rectskeleton.Default
import com.sdds.plasma.giga.styles.rectskeleton.Lighter
import com.sdds.plasma.giga.styles.rectskeleton.RectSkeleton
import com.sdds.plasma.giga.styles.rectskeleton.RectSkeletonStyles
import com.sdds.plasma.giga.styles.rectskeleton.RectSkeletonView
import com.sdds.plasma.giga.styles.rectskeleton.resolve
import com.sdds.sandbox.Property

internal object PlasmaGigaRectSkeletonVariationsCompose : ComposeStyleProvider<RectSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Lighter")),
        )

    override val variations: Map<String, ComposeStyleReference<RectSkeletonStyle>> =
        mapOf(
            "RectSkeleton.Default" to ComposeStyleReference { RectSkeleton.Default.style() },
            "RectSkeleton.Lighter" to ComposeStyleReference { RectSkeleton.Lighter.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return RectSkeletonStyles.resolve(
            view = when (bindings["view"]?.toString()) {
                "Default" -> RectSkeletonView.Default
                "Lighter" -> RectSkeletonView.Lighter
                else -> RectSkeletonView.Default
            },
        ).key
    }
}
