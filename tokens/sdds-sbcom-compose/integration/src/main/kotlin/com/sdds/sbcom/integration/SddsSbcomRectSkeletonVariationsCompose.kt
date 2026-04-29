// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.sbcom.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.RectSkeletonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.sbcom.styles.rectskeleton.Default
import com.sdds.sbcom.styles.rectskeleton.Pulse
import com.sdds.sbcom.styles.rectskeleton.RectSkeleton
import com.sdds.sbcom.styles.rectskeleton.RectSkeletonStyles
import com.sdds.sbcom.styles.rectskeleton.RectSkeletonType
import com.sdds.sbcom.styles.rectskeleton.resolve

internal object SddsSbcomRectSkeletonVariationsCompose : ComposeStyleProvider<RectSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "type", value = "Default", variants = listOf("Default", "Pulse")),
        )

    override val variations: Map<String, ComposeStyleReference<RectSkeletonStyle>> =
        mapOf(
            "RectSkeleton.Default" to ComposeStyleReference { RectSkeleton.Default.style() },
            "RectSkeleton.Pulse" to ComposeStyleReference { RectSkeleton.Pulse.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return RectSkeletonStyles.resolve(
            type = when (bindings["type"]?.toString()) {
                "Default" -> RectSkeletonType.Default
                "Pulse" -> RectSkeletonType.Pulse
                else -> RectSkeletonType.Default
            },
        ).key
    }
}
