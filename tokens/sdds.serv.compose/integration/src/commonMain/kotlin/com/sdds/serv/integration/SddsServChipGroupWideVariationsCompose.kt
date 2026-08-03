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
import com.sdds.compose.uikit.ChipGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.chipgroup.Accent
import com.sdds.serv.styles.chipgroup.ChipGroupStyles
import com.sdds.serv.styles.chipgroup.ChipGroupWide
import com.sdds.serv.styles.chipgroup.ChipGroupWideShape
import com.sdds.serv.styles.chipgroup.ChipGroupWideSize
import com.sdds.serv.styles.chipgroup.ChipGroupWideView
import com.sdds.serv.styles.chipgroup.Default
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.Negative
import com.sdds.serv.styles.chipgroup.Pilled
import com.sdds.serv.styles.chipgroup.Positive
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Secondary
import com.sdds.serv.styles.chipgroup.Warning
import com.sdds.serv.styles.chipgroup.Xs
import com.sdds.serv.styles.chipgroup.resolve

internal object SddsServChipGroupWideVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Secondary", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "ChipGroupWide.L.Default" to ComposeStyleReference { ChipGroupWide.L.Default.style() },
            "ChipGroupWide.L.Accent" to ComposeStyleReference { ChipGroupWide.L.Accent.style() },
            "ChipGroupWide.L.Negative" to ComposeStyleReference { ChipGroupWide.L.Negative.style() },
            "ChipGroupWide.L.Positive" to ComposeStyleReference { ChipGroupWide.L.Positive.style() },
            "ChipGroupWide.L.Secondary" to ComposeStyleReference { ChipGroupWide.L.Secondary.style() },
            "ChipGroupWide.L.Warning" to ComposeStyleReference { ChipGroupWide.L.Warning.style() },
            "ChipGroupWide.L.Pilled.Default" to ComposeStyleReference { ChipGroupWide.L.Pilled.Default.style() },
            "ChipGroupWide.L.Pilled.Accent" to ComposeStyleReference { ChipGroupWide.L.Pilled.Accent.style() },
            "ChipGroupWide.L.Pilled.Negative" to ComposeStyleReference { ChipGroupWide.L.Pilled.Negative.style() },
            "ChipGroupWide.L.Pilled.Positive" to ComposeStyleReference { ChipGroupWide.L.Pilled.Positive.style() },
            "ChipGroupWide.L.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.L.Pilled.Secondary.style() },
            "ChipGroupWide.L.Pilled.Warning" to ComposeStyleReference { ChipGroupWide.L.Pilled.Warning.style() },
            "ChipGroupWide.M.Default" to ComposeStyleReference { ChipGroupWide.M.Default.style() },
            "ChipGroupWide.M.Accent" to ComposeStyleReference { ChipGroupWide.M.Accent.style() },
            "ChipGroupWide.M.Negative" to ComposeStyleReference { ChipGroupWide.M.Negative.style() },
            "ChipGroupWide.M.Positive" to ComposeStyleReference { ChipGroupWide.M.Positive.style() },
            "ChipGroupWide.M.Secondary" to ComposeStyleReference { ChipGroupWide.M.Secondary.style() },
            "ChipGroupWide.M.Warning" to ComposeStyleReference { ChipGroupWide.M.Warning.style() },
            "ChipGroupWide.M.Pilled.Default" to ComposeStyleReference { ChipGroupWide.M.Pilled.Default.style() },
            "ChipGroupWide.M.Pilled.Accent" to ComposeStyleReference { ChipGroupWide.M.Pilled.Accent.style() },
            "ChipGroupWide.M.Pilled.Negative" to ComposeStyleReference { ChipGroupWide.M.Pilled.Negative.style() },
            "ChipGroupWide.M.Pilled.Positive" to ComposeStyleReference { ChipGroupWide.M.Pilled.Positive.style() },
            "ChipGroupWide.M.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.M.Pilled.Secondary.style() },
            "ChipGroupWide.M.Pilled.Warning" to ComposeStyleReference { ChipGroupWide.M.Pilled.Warning.style() },
            "ChipGroupWide.S.Default" to ComposeStyleReference { ChipGroupWide.S.Default.style() },
            "ChipGroupWide.S.Accent" to ComposeStyleReference { ChipGroupWide.S.Accent.style() },
            "ChipGroupWide.S.Negative" to ComposeStyleReference { ChipGroupWide.S.Negative.style() },
            "ChipGroupWide.S.Positive" to ComposeStyleReference { ChipGroupWide.S.Positive.style() },
            "ChipGroupWide.S.Secondary" to ComposeStyleReference { ChipGroupWide.S.Secondary.style() },
            "ChipGroupWide.S.Warning" to ComposeStyleReference { ChipGroupWide.S.Warning.style() },
            "ChipGroupWide.S.Pilled.Default" to ComposeStyleReference { ChipGroupWide.S.Pilled.Default.style() },
            "ChipGroupWide.S.Pilled.Accent" to ComposeStyleReference { ChipGroupWide.S.Pilled.Accent.style() },
            "ChipGroupWide.S.Pilled.Negative" to ComposeStyleReference { ChipGroupWide.S.Pilled.Negative.style() },
            "ChipGroupWide.S.Pilled.Positive" to ComposeStyleReference { ChipGroupWide.S.Pilled.Positive.style() },
            "ChipGroupWide.S.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.S.Pilled.Secondary.style() },
            "ChipGroupWide.S.Pilled.Warning" to ComposeStyleReference { ChipGroupWide.S.Pilled.Warning.style() },
            "ChipGroupWide.Xs.Default" to ComposeStyleReference { ChipGroupWide.Xs.Default.style() },
            "ChipGroupWide.Xs.Accent" to ComposeStyleReference { ChipGroupWide.Xs.Accent.style() },
            "ChipGroupWide.Xs.Negative" to ComposeStyleReference { ChipGroupWide.Xs.Negative.style() },
            "ChipGroupWide.Xs.Positive" to ComposeStyleReference { ChipGroupWide.Xs.Positive.style() },
            "ChipGroupWide.Xs.Secondary" to ComposeStyleReference { ChipGroupWide.Xs.Secondary.style() },
            "ChipGroupWide.Xs.Warning" to ComposeStyleReference { ChipGroupWide.Xs.Warning.style() },
            "ChipGroupWide.Xs.Pilled.Default" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Default.style() },
            "ChipGroupWide.Xs.Pilled.Accent" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Accent.style() },
            "ChipGroupWide.Xs.Pilled.Negative" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Negative.style() },
            "ChipGroupWide.Xs.Pilled.Positive" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Positive.style() },
            "ChipGroupWide.Xs.Pilled.Secondary" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Secondary.style() },
            "ChipGroupWide.Xs.Pilled.Warning" to ComposeStyleReference { ChipGroupWide.Xs.Pilled.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.Wide.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ChipGroupWideSize.L
                "M" -> ChipGroupWideSize.M
                "S" -> ChipGroupWideSize.S
                "Xs" -> ChipGroupWideSize.Xs
                else -> ChipGroupWideSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipGroupWideShape.Default
                "Pilled" -> ChipGroupWideShape.Pilled
                else -> ChipGroupWideShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipGroupWideView.Default
                "Accent" -> ChipGroupWideView.Accent
                "Negative" -> ChipGroupWideView.Negative
                "Positive" -> ChipGroupWideView.Positive
                "Secondary" -> ChipGroupWideView.Secondary
                "Warning" -> ChipGroupWideView.Warning
                else -> ChipGroupWideView.Default
            },
        ).key
    }
}
