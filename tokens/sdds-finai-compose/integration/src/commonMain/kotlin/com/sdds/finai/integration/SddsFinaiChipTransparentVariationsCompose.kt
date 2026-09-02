// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdds.finai.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ChipStyle
import com.sdds.compose.uikit.style.style
import com.sdds.finai.styles.chip.Accent
import com.sdds.finai.styles.chip.ChipStyles
import com.sdds.finai.styles.chip.ChipTransparent
import com.sdds.finai.styles.chip.ChipTransparentShape
import com.sdds.finai.styles.chip.ChipTransparentSize
import com.sdds.finai.styles.chip.ChipTransparentView
import com.sdds.finai.styles.chip.Default
import com.sdds.finai.styles.chip.M
import com.sdds.finai.styles.chip.Negative
import com.sdds.finai.styles.chip.Pilled
import com.sdds.finai.styles.chip.Positive
import com.sdds.finai.styles.chip.S
import com.sdds.finai.styles.chip.Warning
import com.sdds.finai.styles.chip.Xs
import com.sdds.finai.styles.chip.Xxs
import com.sdds.finai.styles.chip.resolve
import com.sdds.sandbox.Property

internal object SddsFinaiChipTransparentVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Warning"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "ChipTransparent.M.Default" to ComposeStyleReference { ChipTransparent.M.Default.style() },
            "ChipTransparent.M.Accent" to ComposeStyleReference { ChipTransparent.M.Accent.style() },
            "ChipTransparent.M.Negative" to ComposeStyleReference { ChipTransparent.M.Negative.style() },
            "ChipTransparent.M.Positive" to ComposeStyleReference { ChipTransparent.M.Positive.style() },
            "ChipTransparent.M.Warning" to ComposeStyleReference { ChipTransparent.M.Warning.style() },
            "ChipTransparent.M.Pilled.Default" to ComposeStyleReference { ChipTransparent.M.Pilled.Default.style() },
            "ChipTransparent.M.Pilled.Accent" to ComposeStyleReference { ChipTransparent.M.Pilled.Accent.style() },
            "ChipTransparent.M.Pilled.Negative" to ComposeStyleReference { ChipTransparent.M.Pilled.Negative.style() },
            "ChipTransparent.M.Pilled.Positive" to ComposeStyleReference { ChipTransparent.M.Pilled.Positive.style() },
            "ChipTransparent.M.Pilled.Warning" to ComposeStyleReference { ChipTransparent.M.Pilled.Warning.style() },
            "ChipTransparent.S.Default" to ComposeStyleReference { ChipTransparent.S.Default.style() },
            "ChipTransparent.S.Accent" to ComposeStyleReference { ChipTransparent.S.Accent.style() },
            "ChipTransparent.S.Negative" to ComposeStyleReference { ChipTransparent.S.Negative.style() },
            "ChipTransparent.S.Positive" to ComposeStyleReference { ChipTransparent.S.Positive.style() },
            "ChipTransparent.S.Warning" to ComposeStyleReference { ChipTransparent.S.Warning.style() },
            "ChipTransparent.S.Pilled.Default" to ComposeStyleReference { ChipTransparent.S.Pilled.Default.style() },
            "ChipTransparent.S.Pilled.Accent" to ComposeStyleReference { ChipTransparent.S.Pilled.Accent.style() },
            "ChipTransparent.S.Pilled.Negative" to ComposeStyleReference { ChipTransparent.S.Pilled.Negative.style() },
            "ChipTransparent.S.Pilled.Positive" to ComposeStyleReference { ChipTransparent.S.Pilled.Positive.style() },
            "ChipTransparent.S.Pilled.Warning" to ComposeStyleReference { ChipTransparent.S.Pilled.Warning.style() },
            "ChipTransparent.Xs.Default" to ComposeStyleReference { ChipTransparent.Xs.Default.style() },
            "ChipTransparent.Xs.Accent" to ComposeStyleReference { ChipTransparent.Xs.Accent.style() },
            "ChipTransparent.Xs.Negative" to ComposeStyleReference { ChipTransparent.Xs.Negative.style() },
            "ChipTransparent.Xs.Positive" to ComposeStyleReference { ChipTransparent.Xs.Positive.style() },
            "ChipTransparent.Xs.Warning" to ComposeStyleReference { ChipTransparent.Xs.Warning.style() },
            "ChipTransparent.Xs.Pilled.Default" to ComposeStyleReference { ChipTransparent.Xs.Pilled.Default.style() },
            "ChipTransparent.Xs.Pilled.Accent" to ComposeStyleReference { ChipTransparent.Xs.Pilled.Accent.style() },
            "ChipTransparent.Xs.Pilled.Negative" to ComposeStyleReference { ChipTransparent.Xs.Pilled.Negative.style() },
            "ChipTransparent.Xs.Pilled.Positive" to ComposeStyleReference { ChipTransparent.Xs.Pilled.Positive.style() },
            "ChipTransparent.Xs.Pilled.Warning" to ComposeStyleReference { ChipTransparent.Xs.Pilled.Warning.style() },
            "ChipTransparent.Xxs.Default" to ComposeStyleReference { ChipTransparent.Xxs.Default.style() },
            "ChipTransparent.Xxs.Accent" to ComposeStyleReference { ChipTransparent.Xxs.Accent.style() },
            "ChipTransparent.Xxs.Negative" to ComposeStyleReference { ChipTransparent.Xxs.Negative.style() },
            "ChipTransparent.Xxs.Positive" to ComposeStyleReference { ChipTransparent.Xxs.Positive.style() },
            "ChipTransparent.Xxs.Warning" to ComposeStyleReference { ChipTransparent.Xxs.Warning.style() },
            "ChipTransparent.Xxs.Pilled.Default" to ComposeStyleReference { ChipTransparent.Xxs.Pilled.Default.style() },
            "ChipTransparent.Xxs.Pilled.Accent" to ComposeStyleReference { ChipTransparent.Xxs.Pilled.Accent.style() },
            "ChipTransparent.Xxs.Pilled.Negative" to ComposeStyleReference { ChipTransparent.Xxs.Pilled.Negative.style() },
            "ChipTransparent.Xxs.Pilled.Positive" to ComposeStyleReference { ChipTransparent.Xxs.Pilled.Positive.style() },
            "ChipTransparent.Xxs.Pilled.Warning" to ComposeStyleReference { ChipTransparent.Xxs.Pilled.Warning.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.Transparent.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> ChipTransparentSize.M
                "S" -> ChipTransparentSize.S
                "Xs" -> ChipTransparentSize.Xs
                "Xxs" -> ChipTransparentSize.Xxs
                else -> ChipTransparentSize.M
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipTransparentShape.Default
                "Pilled" -> ChipTransparentShape.Pilled
                else -> ChipTransparentShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipTransparentView.Default
                "Accent" -> ChipTransparentView.Accent
                "Negative" -> ChipTransparentView.Negative
                "Positive" -> ChipTransparentView.Positive
                "Warning" -> ChipTransparentView.Warning
                else -> ChipTransparentView.Default
            },
        ).key
    }
}
