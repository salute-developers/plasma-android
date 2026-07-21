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
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.EmbeddedIconButtonGroup
import com.sdds.serv.styles.buttongroup.EmbeddedIconButtonGroupGap
import com.sdds.serv.styles.buttongroup.EmbeddedIconButtonGroupSize
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Wide
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServEmbeddedIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "M", variants = listOf("Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(name = "gap", value = "Wide", variants = listOf("Wide", "Dense", "None")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "EmbeddedIconButtonGroup.Xs" to ComposeStyleReference { EmbeddedIconButtonGroup.Xs.style() },
            "EmbeddedIconButtonGroup.Xs.Wide" to ComposeStyleReference { EmbeddedIconButtonGroup.Xs.Wide.style() },
            "EmbeddedIconButtonGroup.Xs.Dense" to ComposeStyleReference { EmbeddedIconButtonGroup.Xs.Dense.style() },
            "EmbeddedIconButtonGroup.Xs.NoGap" to ComposeStyleReference { EmbeddedIconButtonGroup.Xs.NoGap.style() },
            "EmbeddedIconButtonGroup.S" to ComposeStyleReference { EmbeddedIconButtonGroup.S.style() },
            "EmbeddedIconButtonGroup.S.Wide" to ComposeStyleReference { EmbeddedIconButtonGroup.S.Wide.style() },
            "EmbeddedIconButtonGroup.S.Dense" to ComposeStyleReference { EmbeddedIconButtonGroup.S.Dense.style() },
            "EmbeddedIconButtonGroup.S.NoGap" to ComposeStyleReference { EmbeddedIconButtonGroup.S.NoGap.style() },
            "EmbeddedIconButtonGroup.M" to ComposeStyleReference { EmbeddedIconButtonGroup.M.style() },
            "EmbeddedIconButtonGroup.M.Wide" to ComposeStyleReference { EmbeddedIconButtonGroup.M.Wide.style() },
            "EmbeddedIconButtonGroup.M.Dense" to ComposeStyleReference { EmbeddedIconButtonGroup.M.Dense.style() },
            "EmbeddedIconButtonGroup.M.NoGap" to ComposeStyleReference { EmbeddedIconButtonGroup.M.NoGap.style() },
            "EmbeddedIconButtonGroup.L" to ComposeStyleReference { EmbeddedIconButtonGroup.L.style() },
            "EmbeddedIconButtonGroup.L.Wide" to ComposeStyleReference { EmbeddedIconButtonGroup.L.Wide.style() },
            "EmbeddedIconButtonGroup.L.Dense" to ComposeStyleReference { EmbeddedIconButtonGroup.L.Dense.style() },
            "EmbeddedIconButtonGroup.L.NoGap" to ComposeStyleReference { EmbeddedIconButtonGroup.L.NoGap.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.EmbeddedIconButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> EmbeddedIconButtonGroupSize.Xs
                "S" -> EmbeddedIconButtonGroupSize.S
                "M" -> EmbeddedIconButtonGroupSize.M
                "L" -> EmbeddedIconButtonGroupSize.L
                else -> EmbeddedIconButtonGroupSize.M
            },
            gap = when (bindings["gap"]?.toString()) {
                "Wide" -> EmbeddedIconButtonGroupGap.Wide
                "Dense" -> EmbeddedIconButtonGroupGap.Dense
                "None" -> EmbeddedIconButtonGroupGap.None
                else -> EmbeddedIconButtonGroupGap.Wide
            },
        ).key
    }
}
