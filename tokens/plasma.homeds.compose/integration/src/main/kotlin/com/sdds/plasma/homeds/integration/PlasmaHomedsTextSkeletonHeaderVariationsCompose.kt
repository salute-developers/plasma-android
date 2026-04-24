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
import com.sdds.plasma.homeds.styles.textskeleton.H1
import com.sdds.plasma.homeds.styles.textskeleton.H2
import com.sdds.plasma.homeds.styles.textskeleton.H3
import com.sdds.plasma.homeds.styles.textskeleton.H4
import com.sdds.plasma.homeds.styles.textskeleton.H5
import com.sdds.plasma.homeds.styles.textskeleton.H6
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonHeader
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonHeaderSize
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonStyles
import com.sdds.plasma.homeds.styles.textskeleton.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsTextSkeletonHeaderVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(
                name = "size",
                value = "H1",
                variants = listOf("H1", "H2", "H3", "H4", "H5", "H6"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "TextSkeletonHeader.H1" to ComposeStyleReference { TextSkeletonHeader.H1.style() },
            "TextSkeletonHeader.H2" to ComposeStyleReference { TextSkeletonHeader.H2.style() },
            "TextSkeletonHeader.H3" to ComposeStyleReference { TextSkeletonHeader.H3.style() },
            "TextSkeletonHeader.H4" to ComposeStyleReference { TextSkeletonHeader.H4.style() },
            "TextSkeletonHeader.H5" to ComposeStyleReference { TextSkeletonHeader.H5.style() },
            "TextSkeletonHeader.H6" to ComposeStyleReference { TextSkeletonHeader.H6.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextSkeletonStyles.Header.resolve(
            size = when (bindings["size"]?.toString()) {
                "H1" -> TextSkeletonHeaderSize.H1
                "H2" -> TextSkeletonHeaderSize.H2
                "H3" -> TextSkeletonHeaderSize.H3
                "H4" -> TextSkeletonHeaderSize.H4
                "H5" -> TextSkeletonHeaderSize.H5
                "H6" -> TextSkeletonHeaderSize.H6
                else -> TextSkeletonHeaderSize.H1
            },
        ).key
    }
}
