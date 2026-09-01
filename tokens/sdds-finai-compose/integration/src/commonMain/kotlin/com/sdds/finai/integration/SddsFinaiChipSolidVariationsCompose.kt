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
import com.sdds.finai.styles.chip.ChipSolid
import com.sdds.finai.styles.chip.ChipSolidShape
import com.sdds.finai.styles.chip.ChipSolidSize
import com.sdds.finai.styles.chip.ChipSolidView
import com.sdds.finai.styles.chip.ChipStyles
import com.sdds.finai.styles.chip.Clear
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

internal object SddsFinaiChipSolidVariationsCompose : ComposeStyleProvider<ChipStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("M", "S", "Xs", "Xxs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(
                name = "view",
                value = "Default",
                variants = listOf("Default", "Accent", "Negative", "Positive", "Warning", "Clear"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ChipStyle>> =
        mapOf(
            "ChipSolid.M.Default" to ComposeStyleReference { ChipSolid.M.Default.style() },
            "ChipSolid.M.Accent" to ComposeStyleReference { ChipSolid.M.Accent.style() },
            "ChipSolid.M.Negative" to ComposeStyleReference { ChipSolid.M.Negative.style() },
            "ChipSolid.M.Positive" to ComposeStyleReference { ChipSolid.M.Positive.style() },
            "ChipSolid.M.Warning" to ComposeStyleReference { ChipSolid.M.Warning.style() },
            "ChipSolid.M.Clear" to ComposeStyleReference { ChipSolid.M.Clear.style() },
            "ChipSolid.M.Pilled.Default" to ComposeStyleReference { ChipSolid.M.Pilled.Default.style() },
            "ChipSolid.M.Pilled.Accent" to ComposeStyleReference { ChipSolid.M.Pilled.Accent.style() },
            "ChipSolid.M.Pilled.Negative" to ComposeStyleReference { ChipSolid.M.Pilled.Negative.style() },
            "ChipSolid.M.Pilled.Positive" to ComposeStyleReference { ChipSolid.M.Pilled.Positive.style() },
            "ChipSolid.M.Pilled.Warning" to ComposeStyleReference { ChipSolid.M.Pilled.Warning.style() },
            "ChipSolid.M.Pilled.Clear" to ComposeStyleReference { ChipSolid.M.Pilled.Clear.style() },
            "ChipSolid.S.Default" to ComposeStyleReference { ChipSolid.S.Default.style() },
            "ChipSolid.S.Accent" to ComposeStyleReference { ChipSolid.S.Accent.style() },
            "ChipSolid.S.Negative" to ComposeStyleReference { ChipSolid.S.Negative.style() },
            "ChipSolid.S.Positive" to ComposeStyleReference { ChipSolid.S.Positive.style() },
            "ChipSolid.S.Warning" to ComposeStyleReference { ChipSolid.S.Warning.style() },
            "ChipSolid.S.Clear" to ComposeStyleReference { ChipSolid.S.Clear.style() },
            "ChipSolid.S.Pilled.Default" to ComposeStyleReference { ChipSolid.S.Pilled.Default.style() },
            "ChipSolid.S.Pilled.Accent" to ComposeStyleReference { ChipSolid.S.Pilled.Accent.style() },
            "ChipSolid.S.Pilled.Negative" to ComposeStyleReference { ChipSolid.S.Pilled.Negative.style() },
            "ChipSolid.S.Pilled.Positive" to ComposeStyleReference { ChipSolid.S.Pilled.Positive.style() },
            "ChipSolid.S.Pilled.Warning" to ComposeStyleReference { ChipSolid.S.Pilled.Warning.style() },
            "ChipSolid.S.Pilled.Clear" to ComposeStyleReference { ChipSolid.S.Pilled.Clear.style() },
            "ChipSolid.Xs.Default" to ComposeStyleReference { ChipSolid.Xs.Default.style() },
            "ChipSolid.Xs.Accent" to ComposeStyleReference { ChipSolid.Xs.Accent.style() },
            "ChipSolid.Xs.Negative" to ComposeStyleReference { ChipSolid.Xs.Negative.style() },
            "ChipSolid.Xs.Positive" to ComposeStyleReference { ChipSolid.Xs.Positive.style() },
            "ChipSolid.Xs.Warning" to ComposeStyleReference { ChipSolid.Xs.Warning.style() },
            "ChipSolid.Xs.Clear" to ComposeStyleReference { ChipSolid.Xs.Clear.style() },
            "ChipSolid.Xs.Pilled.Default" to ComposeStyleReference { ChipSolid.Xs.Pilled.Default.style() },
            "ChipSolid.Xs.Pilled.Accent" to ComposeStyleReference { ChipSolid.Xs.Pilled.Accent.style() },
            "ChipSolid.Xs.Pilled.Negative" to ComposeStyleReference { ChipSolid.Xs.Pilled.Negative.style() },
            "ChipSolid.Xs.Pilled.Positive" to ComposeStyleReference { ChipSolid.Xs.Pilled.Positive.style() },
            "ChipSolid.Xs.Pilled.Warning" to ComposeStyleReference { ChipSolid.Xs.Pilled.Warning.style() },
            "ChipSolid.Xs.Pilled.Clear" to ComposeStyleReference { ChipSolid.Xs.Pilled.Clear.style() },
            "ChipSolid.Xxs.Default" to ComposeStyleReference { ChipSolid.Xxs.Default.style() },
            "ChipSolid.Xxs.Accent" to ComposeStyleReference { ChipSolid.Xxs.Accent.style() },
            "ChipSolid.Xxs.Negative" to ComposeStyleReference { ChipSolid.Xxs.Negative.style() },
            "ChipSolid.Xxs.Positive" to ComposeStyleReference { ChipSolid.Xxs.Positive.style() },
            "ChipSolid.Xxs.Warning" to ComposeStyleReference { ChipSolid.Xxs.Warning.style() },
            "ChipSolid.Xxs.Clear" to ComposeStyleReference { ChipSolid.Xxs.Clear.style() },
            "ChipSolid.Xxs.Pilled.Default" to ComposeStyleReference { ChipSolid.Xxs.Pilled.Default.style() },
            "ChipSolid.Xxs.Pilled.Accent" to ComposeStyleReference { ChipSolid.Xxs.Pilled.Accent.style() },
            "ChipSolid.Xxs.Pilled.Negative" to ComposeStyleReference { ChipSolid.Xxs.Pilled.Negative.style() },
            "ChipSolid.Xxs.Pilled.Positive" to ComposeStyleReference { ChipSolid.Xxs.Pilled.Positive.style() },
            "ChipSolid.Xxs.Pilled.Warning" to ComposeStyleReference { ChipSolid.Xxs.Pilled.Warning.style() },
            "ChipSolid.Xxs.Pilled.Clear" to ComposeStyleReference { ChipSolid.Xxs.Pilled.Clear.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipStyles.Solid.resolve(
            size = when (bindings["size"]?.toString()) {
                "M" -> ChipSolidSize.M
                "S" -> ChipSolidSize.S
                "Xs" -> ChipSolidSize.Xs
                "Xxs" -> ChipSolidSize.Xxs
                else -> ChipSolidSize.M
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ChipSolidShape.Default
                "Pilled" -> ChipSolidShape.Pilled
                else -> ChipSolidShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> ChipSolidView.Default
                "Accent" -> ChipSolidView.Accent
                "Negative" -> ChipSolidView.Negative
                "Positive" -> ChipSolidView.Positive
                "Warning" -> ChipSolidView.Warning
                "Clear" -> ChipSolidView.Clear
                else -> ChipSolidView.Default
            },
        ).key
    }
}
