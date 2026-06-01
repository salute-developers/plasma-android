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
import com.sdds.serv.styles.chipgroup.AiAnswerChipGroup
import com.sdds.serv.styles.chipgroup.AiAnswerChipGroupSize
import com.sdds.serv.styles.chipgroup.ChipGroupStyles
import com.sdds.serv.styles.chipgroup.L
import com.sdds.serv.styles.chipgroup.M
import com.sdds.serv.styles.chipgroup.S
import com.sdds.serv.styles.chipgroup.Xs
import com.sdds.serv.styles.chipgroup.resolve

internal object SddsServAiAnswerChipGroupVariationsCompose : ComposeStyleProvider<ChipGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
        )

    override val variations: Map<String, ComposeStyleReference<ChipGroupStyle>> =
        mapOf(
            "AiAnswerChipGroup.L" to ComposeStyleReference { AiAnswerChipGroup.L.style() },
            "AiAnswerChipGroup.M" to ComposeStyleReference { AiAnswerChipGroup.M.style() },
            "AiAnswerChipGroup.S" to ComposeStyleReference { AiAnswerChipGroup.S.style() },
            "AiAnswerChipGroup.Xs" to ComposeStyleReference { AiAnswerChipGroup.Xs.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ChipGroupStyles.AiAnswerChipGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> AiAnswerChipGroupSize.L
                "M" -> AiAnswerChipGroupSize.M
                "S" -> AiAnswerChipGroupSize.S
                "Xs" -> AiAnswerChipGroupSize.Xs
                else -> AiAnswerChipGroupSize.L
            },
        ).key
    }
}
