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
import com.sdds.serv.styles.buttongroup.AiInputIconButtonGroup
import com.sdds.serv.styles.buttongroup.AiInputIconButtonGroupGap
import com.sdds.serv.styles.buttongroup.AiInputIconButtonGroupShape
import com.sdds.serv.styles.buttongroup.AiInputIconButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.Pilled
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Segmented
import com.sdds.serv.styles.buttongroup.Wide
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServAiInputIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(name = "gap", value = "Wide", variants = listOf("Wide", "Dense", "None")),
            Property.SingleChoiceProperty(
                name = "shape",
                value = "Default",
                variants = listOf("Default", "Pilled", "Segmented"),
            ),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "AiInputIconButtonGroup.Xs" to ComposeStyleReference { AiInputIconButtonGroup.Xs.style() },
            "AiInputIconButtonGroup.Xs.Wide" to ComposeStyleReference { AiInputIconButtonGroup.Xs.Wide.style() },
            "AiInputIconButtonGroup.Xs.Wide.Default" to ComposeStyleReference { AiInputIconButtonGroup.Xs.Wide.Default.style() },
            "AiInputIconButtonGroup.Xs.Wide.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.Xs.Wide.Pilled.style() },
            "AiInputIconButtonGroup.Xs.Wide.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.Xs.Wide.Segmented.style()
            },
            "AiInputIconButtonGroup.Xs.Dense" to ComposeStyleReference { AiInputIconButtonGroup.Xs.Dense.style() },
            "AiInputIconButtonGroup.Xs.Dense.Default" to ComposeStyleReference { AiInputIconButtonGroup.Xs.Dense.Default.style() },
            "AiInputIconButtonGroup.Xs.Dense.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.Xs.Dense.Pilled.style() },
            "AiInputIconButtonGroup.Xs.Dense.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.Xs.Dense.Segmented.style()
            },
            "AiInputIconButtonGroup.Xs.NoGap" to ComposeStyleReference { AiInputIconButtonGroup.Xs.NoGap.style() },
            "AiInputIconButtonGroup.Xs.NoGap.Default" to ComposeStyleReference { AiInputIconButtonGroup.Xs.NoGap.Default.style() },
            "AiInputIconButtonGroup.Xs.NoGap.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.Xs.NoGap.Pilled.style() },
            "AiInputIconButtonGroup.Xs.NoGap.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.Xs.NoGap.Segmented.style()
            },
            "AiInputIconButtonGroup.S" to ComposeStyleReference { AiInputIconButtonGroup.S.style() },
            "AiInputIconButtonGroup.S.Wide" to ComposeStyleReference { AiInputIconButtonGroup.S.Wide.style() },
            "AiInputIconButtonGroup.S.Wide.Default" to ComposeStyleReference { AiInputIconButtonGroup.S.Wide.Default.style() },
            "AiInputIconButtonGroup.S.Wide.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.S.Wide.Pilled.style() },
            "AiInputIconButtonGroup.S.Wide.Segmented" to ComposeStyleReference { AiInputIconButtonGroup.S.Wide.Segmented.style() },
            "AiInputIconButtonGroup.S.Dense" to ComposeStyleReference { AiInputIconButtonGroup.S.Dense.style() },
            "AiInputIconButtonGroup.S.Dense.Default" to ComposeStyleReference { AiInputIconButtonGroup.S.Dense.Default.style() },
            "AiInputIconButtonGroup.S.Dense.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.S.Dense.Pilled.style() },
            "AiInputIconButtonGroup.S.Dense.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.S.Dense.Segmented.style()
            },
            "AiInputIconButtonGroup.S.NoGap" to ComposeStyleReference { AiInputIconButtonGroup.S.NoGap.style() },
            "AiInputIconButtonGroup.S.NoGap.Default" to ComposeStyleReference { AiInputIconButtonGroup.S.NoGap.Default.style() },
            "AiInputIconButtonGroup.S.NoGap.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.S.NoGap.Pilled.style() },
            "AiInputIconButtonGroup.S.NoGap.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.S.NoGap.Segmented.style()
            },
            "AiInputIconButtonGroup.M" to ComposeStyleReference { AiInputIconButtonGroup.M.style() },
            "AiInputIconButtonGroup.M.Wide" to ComposeStyleReference { AiInputIconButtonGroup.M.Wide.style() },
            "AiInputIconButtonGroup.M.Wide.Default" to ComposeStyleReference { AiInputIconButtonGroup.M.Wide.Default.style() },
            "AiInputIconButtonGroup.M.Wide.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.M.Wide.Pilled.style() },
            "AiInputIconButtonGroup.M.Wide.Segmented" to ComposeStyleReference { AiInputIconButtonGroup.M.Wide.Segmented.style() },
            "AiInputIconButtonGroup.M.Dense" to ComposeStyleReference { AiInputIconButtonGroup.M.Dense.style() },
            "AiInputIconButtonGroup.M.Dense.Default" to ComposeStyleReference { AiInputIconButtonGroup.M.Dense.Default.style() },
            "AiInputIconButtonGroup.M.Dense.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.M.Dense.Pilled.style() },
            "AiInputIconButtonGroup.M.Dense.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.M.Dense.Segmented.style()
            },
            "AiInputIconButtonGroup.M.NoGap" to ComposeStyleReference { AiInputIconButtonGroup.M.NoGap.style() },
            "AiInputIconButtonGroup.M.NoGap.Default" to ComposeStyleReference { AiInputIconButtonGroup.M.NoGap.Default.style() },
            "AiInputIconButtonGroup.M.NoGap.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.M.NoGap.Pilled.style() },
            "AiInputIconButtonGroup.M.NoGap.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.M.NoGap.Segmented.style()
            },
            "AiInputIconButtonGroup.L" to ComposeStyleReference { AiInputIconButtonGroup.L.style() },
            "AiInputIconButtonGroup.L.Wide" to ComposeStyleReference { AiInputIconButtonGroup.L.Wide.style() },
            "AiInputIconButtonGroup.L.Wide.Default" to ComposeStyleReference { AiInputIconButtonGroup.L.Wide.Default.style() },
            "AiInputIconButtonGroup.L.Wide.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.L.Wide.Pilled.style() },
            "AiInputIconButtonGroup.L.Wide.Segmented" to ComposeStyleReference { AiInputIconButtonGroup.L.Wide.Segmented.style() },
            "AiInputIconButtonGroup.L.Dense" to ComposeStyleReference { AiInputIconButtonGroup.L.Dense.style() },
            "AiInputIconButtonGroup.L.Dense.Default" to ComposeStyleReference { AiInputIconButtonGroup.L.Dense.Default.style() },
            "AiInputIconButtonGroup.L.Dense.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.L.Dense.Pilled.style() },
            "AiInputIconButtonGroup.L.Dense.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.L.Dense.Segmented.style()
            },
            "AiInputIconButtonGroup.L.NoGap" to ComposeStyleReference { AiInputIconButtonGroup.L.NoGap.style() },
            "AiInputIconButtonGroup.L.NoGap.Default" to ComposeStyleReference { AiInputIconButtonGroup.L.NoGap.Default.style() },
            "AiInputIconButtonGroup.L.NoGap.Pilled" to ComposeStyleReference { AiInputIconButtonGroup.L.NoGap.Pilled.style() },
            "AiInputIconButtonGroup.L.NoGap.Segmented" to ComposeStyleReference {
                AiInputIconButtonGroup.L.NoGap.Segmented.style()
            },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.AiInputIconButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> AiInputIconButtonGroupSize.Xs
                "S" -> AiInputIconButtonGroupSize.S
                "M" -> AiInputIconButtonGroupSize.M
                "L" -> AiInputIconButtonGroupSize.L
                else -> AiInputIconButtonGroupSize.Xs
            },
            gap = when (bindings["gap"]?.toString()) {
                "Wide" -> AiInputIconButtonGroupGap.Wide
                "Dense" -> AiInputIconButtonGroupGap.Dense
                "None" -> AiInputIconButtonGroupGap.None
                else -> AiInputIconButtonGroupGap.Wide
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> AiInputIconButtonGroupShape.Default
                "Pilled" -> AiInputIconButtonGroupShape.Pilled
                "Segmented" -> AiInputIconButtonGroupShape.Segmented
                else -> AiInputIconButtonGroupShape.Default
            },
        ).key
    }
}
