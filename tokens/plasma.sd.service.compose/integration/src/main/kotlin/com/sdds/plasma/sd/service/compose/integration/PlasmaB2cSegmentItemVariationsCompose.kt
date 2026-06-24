// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.sd.service.compose.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SegmentItemStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.sd.service.styles.segmentitem.Accent
import com.sdds.plasma.sd.service.styles.segmentitem.L
import com.sdds.plasma.sd.service.styles.segmentitem.M
import com.sdds.plasma.sd.service.styles.segmentitem.Pilled
import com.sdds.plasma.sd.service.styles.segmentitem.Primary
import com.sdds.plasma.sd.service.styles.segmentitem.S
import com.sdds.plasma.sd.service.styles.segmentitem.Secondary
import com.sdds.plasma.sd.service.styles.segmentitem.SegmentItem
import com.sdds.plasma.sd.service.styles.segmentitem.SegmentItemShape
import com.sdds.plasma.sd.service.styles.segmentitem.SegmentItemSize
import com.sdds.plasma.sd.service.styles.segmentitem.SegmentItemStyles
import com.sdds.plasma.sd.service.styles.segmentitem.SegmentItemView
import com.sdds.plasma.sd.service.styles.segmentitem.Xl
import com.sdds.plasma.sd.service.styles.segmentitem.Xs
import com.sdds.plasma.sd.service.styles.segmentitem.resolve
import com.sdds.sandbox.Property

internal object PlasmaB2cSegmentItemVariationsCompose : ComposeStyleProvider<SegmentItemStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xl", variants = listOf("Xl", "L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Primary",
                variants = listOf("Primary", "Secondary", "Accent"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<SegmentItemStyle>> =
        mapOf(
            "SegmentItem.Xl.Primary" to ComposeStyleReference { SegmentItem.Xl.Primary.style() },
            "SegmentItem.Xl.Secondary" to ComposeStyleReference { SegmentItem.Xl.Secondary.style() },
            "SegmentItem.Xl.Accent" to ComposeStyleReference { SegmentItem.Xl.Accent.style() },
            "SegmentItem.Xl.Pilled.Primary" to ComposeStyleReference { SegmentItem.Xl.Pilled.Primary.style() },
            "SegmentItem.Xl.Pilled.Secondary" to ComposeStyleReference { SegmentItem.Xl.Pilled.Secondary.style() },
            "SegmentItem.Xl.Pilled.Accent" to ComposeStyleReference { SegmentItem.Xl.Pilled.Accent.style() },
            "SegmentItem.L.Primary" to ComposeStyleReference { SegmentItem.L.Primary.style() },
            "SegmentItem.L.Secondary" to ComposeStyleReference { SegmentItem.L.Secondary.style() },
            "SegmentItem.L.Accent" to ComposeStyleReference { SegmentItem.L.Accent.style() },
            "SegmentItem.L.Pilled.Primary" to ComposeStyleReference { SegmentItem.L.Pilled.Primary.style() },
            "SegmentItem.L.Pilled.Secondary" to ComposeStyleReference { SegmentItem.L.Pilled.Secondary.style() },
            "SegmentItem.L.Pilled.Accent" to ComposeStyleReference { SegmentItem.L.Pilled.Accent.style() },
            "SegmentItem.M.Primary" to ComposeStyleReference { SegmentItem.M.Primary.style() },
            "SegmentItem.M.Secondary" to ComposeStyleReference { SegmentItem.M.Secondary.style() },
            "SegmentItem.M.Accent" to ComposeStyleReference { SegmentItem.M.Accent.style() },
            "SegmentItem.M.Pilled.Primary" to ComposeStyleReference { SegmentItem.M.Pilled.Primary.style() },
            "SegmentItem.M.Pilled.Secondary" to ComposeStyleReference { SegmentItem.M.Pilled.Secondary.style() },
            "SegmentItem.M.Pilled.Accent" to ComposeStyleReference { SegmentItem.M.Pilled.Accent.style() },
            "SegmentItem.S.Primary" to ComposeStyleReference { SegmentItem.S.Primary.style() },
            "SegmentItem.S.Secondary" to ComposeStyleReference { SegmentItem.S.Secondary.style() },
            "SegmentItem.S.Accent" to ComposeStyleReference { SegmentItem.S.Accent.style() },
            "SegmentItem.S.Pilled.Primary" to ComposeStyleReference { SegmentItem.S.Pilled.Primary.style() },
            "SegmentItem.S.Pilled.Secondary" to ComposeStyleReference { SegmentItem.S.Pilled.Secondary.style() },
            "SegmentItem.S.Pilled.Accent" to ComposeStyleReference { SegmentItem.S.Pilled.Accent.style() },
            "SegmentItem.Xs.Primary" to ComposeStyleReference { SegmentItem.Xs.Primary.style() },
            "SegmentItem.Xs.Secondary" to ComposeStyleReference { SegmentItem.Xs.Secondary.style() },
            "SegmentItem.Xs.Accent" to ComposeStyleReference { SegmentItem.Xs.Accent.style() },
            "SegmentItem.Xs.Pilled.Primary" to ComposeStyleReference { SegmentItem.Xs.Pilled.Primary.style() },
            "SegmentItem.Xs.Pilled.Secondary" to ComposeStyleReference { SegmentItem.Xs.Pilled.Secondary.style() },
            "SegmentItem.Xs.Pilled.Accent" to ComposeStyleReference { SegmentItem.Xs.Pilled.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SegmentItemStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SegmentItemSize.Xl
                "L" -> SegmentItemSize.L
                "M" -> SegmentItemSize.M
                "S" -> SegmentItemSize.S
                "Xs" -> SegmentItemSize.Xs
                else -> SegmentItemSize.Xl
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> SegmentItemShape.Default
                "Pilled" -> SegmentItemShape.Pilled
                else -> SegmentItemShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Primary" -> SegmentItemView.Primary
                "Secondary" -> SegmentItemView.Secondary
                "Accent" -> SegmentItemView.Accent
                else -> SegmentItemView.Primary
            },
        ).key
    }
}
