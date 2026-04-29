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
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonBody
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonBodySize
import com.sdds.plasma.homeds.styles.textskeleton.TextSkeletonStyles
import com.sdds.plasma.homeds.styles.textskeleton.Xs
import com.sdds.plasma.homeds.styles.textskeleton.Xxs
import com.sdds.plasma.homeds.styles.textskeleton.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsTextSkeletonBodyVariationsCompose : ComposeStyleProvider<TextSkeletonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs", "Xxs")),
        )

    override val variations: Map<String, ComposeStyleReference<TextSkeletonStyle>> =
        mapOf(
            "TextSkeletonBody.L" to ComposeStyleReference { TextSkeletonBody.L.style() },
            "TextSkeletonBody.M" to ComposeStyleReference { TextSkeletonBody.M.style() },
            "TextSkeletonBody.S" to ComposeStyleReference { TextSkeletonBody.S.style() },
            "TextSkeletonBody.Xs" to ComposeStyleReference { TextSkeletonBody.Xs.style() },
            "TextSkeletonBody.Xxs" to ComposeStyleReference { TextSkeletonBody.Xxs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return TextSkeletonStyles.Body.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> TextSkeletonBodySize.L
                "M" -> TextSkeletonBodySize.M
                "S" -> TextSkeletonBodySize.S
                "Xs" -> TextSkeletonBodySize.Xs
                "Xxs" -> TextSkeletonBodySize.Xxs
                else -> TextSkeletonBodySize.L
            },
        ).key
    }
}
