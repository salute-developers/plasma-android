// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.SegmentStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.segment.Accent
import com.sdds.serv.styles.segment.L
import com.sdds.serv.styles.segment.M
import com.sdds.serv.styles.segment.Pilled
import com.sdds.serv.styles.segment.Primary
import com.sdds.serv.styles.segment.S
import com.sdds.serv.styles.segment.Secondary
import com.sdds.serv.styles.segment.Segment
import com.sdds.serv.styles.segment.SegmentShape
import com.sdds.serv.styles.segment.SegmentSize
import com.sdds.serv.styles.segment.SegmentStyles
import com.sdds.serv.styles.segment.SegmentView
import com.sdds.serv.styles.segment.Xl
import com.sdds.serv.styles.segment.Xs
import com.sdds.serv.styles.segment.resolve

internal object SddsServSegmentVariationsCompose : ComposeStyleProvider<SegmentStyle>() {
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

    override val variations: Map<String, ComposeStyleReference<SegmentStyle>> =
        mapOf(
            "Segment.Xl.Primary" to ComposeStyleReference { Segment.Xl.Primary.style() },
            "Segment.Xl.Secondary" to ComposeStyleReference { Segment.Xl.Secondary.style() },
            "Segment.Xl.Accent" to ComposeStyleReference { Segment.Xl.Accent.style() },
            "Segment.Xl.Pilled.Primary" to ComposeStyleReference { Segment.Xl.Pilled.Primary.style() },
            "Segment.Xl.Pilled.Secondary" to ComposeStyleReference { Segment.Xl.Pilled.Secondary.style() },
            "Segment.Xl.Pilled.Accent" to ComposeStyleReference { Segment.Xl.Pilled.Accent.style() },
            "Segment.L.Primary" to ComposeStyleReference { Segment.L.Primary.style() },
            "Segment.L.Secondary" to ComposeStyleReference { Segment.L.Secondary.style() },
            "Segment.L.Accent" to ComposeStyleReference { Segment.L.Accent.style() },
            "Segment.L.Pilled.Primary" to ComposeStyleReference { Segment.L.Pilled.Primary.style() },
            "Segment.L.Pilled.Secondary" to ComposeStyleReference { Segment.L.Pilled.Secondary.style() },
            "Segment.L.Pilled.Accent" to ComposeStyleReference { Segment.L.Pilled.Accent.style() },
            "Segment.M.Primary" to ComposeStyleReference { Segment.M.Primary.style() },
            "Segment.M.Secondary" to ComposeStyleReference { Segment.M.Secondary.style() },
            "Segment.M.Accent" to ComposeStyleReference { Segment.M.Accent.style() },
            "Segment.M.Pilled.Primary" to ComposeStyleReference { Segment.M.Pilled.Primary.style() },
            "Segment.M.Pilled.Secondary" to ComposeStyleReference { Segment.M.Pilled.Secondary.style() },
            "Segment.M.Pilled.Accent" to ComposeStyleReference { Segment.M.Pilled.Accent.style() },
            "Segment.S.Primary" to ComposeStyleReference { Segment.S.Primary.style() },
            "Segment.S.Secondary" to ComposeStyleReference { Segment.S.Secondary.style() },
            "Segment.S.Accent" to ComposeStyleReference { Segment.S.Accent.style() },
            "Segment.S.Pilled.Primary" to ComposeStyleReference { Segment.S.Pilled.Primary.style() },
            "Segment.S.Pilled.Secondary" to ComposeStyleReference { Segment.S.Pilled.Secondary.style() },
            "Segment.S.Pilled.Accent" to ComposeStyleReference { Segment.S.Pilled.Accent.style() },
            "Segment.Xs.Primary" to ComposeStyleReference { Segment.Xs.Primary.style() },
            "Segment.Xs.Secondary" to ComposeStyleReference { Segment.Xs.Secondary.style() },
            "Segment.Xs.Accent" to ComposeStyleReference { Segment.Xs.Accent.style() },
            "Segment.Xs.Pilled.Primary" to ComposeStyleReference { Segment.Xs.Pilled.Primary.style() },
            "Segment.Xs.Pilled.Secondary" to ComposeStyleReference { Segment.Xs.Pilled.Secondary.style() },
            "Segment.Xs.Pilled.Accent" to ComposeStyleReference { Segment.Xs.Pilled.Accent.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return SegmentStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xl" -> SegmentSize.Xl
                "L" -> SegmentSize.L
                "M" -> SegmentSize.M
                "S" -> SegmentSize.S
                "Xs" -> SegmentSize.Xs
                else -> SegmentSize.Xl
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> SegmentShape.Default
                "Pilled" -> SegmentShape.Pilled
                else -> SegmentShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Primary" -> SegmentView.Primary
                "Secondary" -> SegmentView.Secondary
                "Accent" -> SegmentView.Accent
                else -> SegmentView.Primary
            },
        ).key
    }
}
