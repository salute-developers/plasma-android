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
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.plasma.homeds.styles.buttongroup.BasicButtonGroup
import com.sdds.plasma.homeds.styles.buttongroup.ButtonGroupBasicButtonGroupGap
import com.sdds.plasma.homeds.styles.buttongroup.ButtonGroupBasicButtonGroupShape
import com.sdds.plasma.homeds.styles.buttongroup.ButtonGroupBasicButtonGroupSize
import com.sdds.plasma.homeds.styles.buttongroup.ButtonGroupStyles
import com.sdds.plasma.homeds.styles.buttongroup.Default
import com.sdds.plasma.homeds.styles.buttongroup.Dense
import com.sdds.plasma.homeds.styles.buttongroup.M
import com.sdds.plasma.homeds.styles.buttongroup.NoGap
import com.sdds.plasma.homeds.styles.buttongroup.S
import com.sdds.plasma.homeds.styles.buttongroup.Segmented
import com.sdds.plasma.homeds.styles.buttongroup.Wide
import com.sdds.plasma.homeds.styles.buttongroup.Xs
import com.sdds.plasma.homeds.styles.buttongroup.resolve
import com.sdds.sandbox.Property

internal object PlasmaHomedsBasicButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xs", variants = listOf("Xs", "S", "M")),
            Property.SingleChoiceProperty(name = "gap", value = "None", variants = listOf("None", "Wide", "Dense")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Segmented")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "BasicButtonGroup.Xs" to ComposeStyleReference { BasicButtonGroup.Xs.style() },
            "BasicButtonGroup.Xs.Wide" to ComposeStyleReference { BasicButtonGroup.Xs.Wide.style() },
            "BasicButtonGroup.Xs.Wide.Default" to ComposeStyleReference { BasicButtonGroup.Xs.Wide.Default.style() },
            "BasicButtonGroup.Xs.Wide.Segmented" to ComposeStyleReference { BasicButtonGroup.Xs.Wide.Segmented.style() },
            "BasicButtonGroup.Xs.Dense" to ComposeStyleReference { BasicButtonGroup.Xs.Dense.style() },
            "BasicButtonGroup.Xs.Dense.Default" to ComposeStyleReference { BasicButtonGroup.Xs.Dense.Default.style() },
            "BasicButtonGroup.Xs.Dense.Segmented" to ComposeStyleReference { BasicButtonGroup.Xs.Dense.Segmented.style() },
            "BasicButtonGroup.Xs.NoGap" to ComposeStyleReference { BasicButtonGroup.Xs.NoGap.style() },
            "BasicButtonGroup.Xs.NoGap.Default" to ComposeStyleReference { BasicButtonGroup.Xs.NoGap.Default.style() },
            "BasicButtonGroup.Xs.NoGap.Segmented" to ComposeStyleReference { BasicButtonGroup.Xs.NoGap.Segmented.style() },
            "BasicButtonGroup.S" to ComposeStyleReference { BasicButtonGroup.S.style() },
            "BasicButtonGroup.S.Wide" to ComposeStyleReference { BasicButtonGroup.S.Wide.style() },
            "BasicButtonGroup.S.Wide.Default" to ComposeStyleReference { BasicButtonGroup.S.Wide.Default.style() },
            "BasicButtonGroup.S.Wide.Segmented" to ComposeStyleReference { BasicButtonGroup.S.Wide.Segmented.style() },
            "BasicButtonGroup.S.Dense" to ComposeStyleReference { BasicButtonGroup.S.Dense.style() },
            "BasicButtonGroup.S.Dense.Default" to ComposeStyleReference { BasicButtonGroup.S.Dense.Default.style() },
            "BasicButtonGroup.S.Dense.Segmented" to ComposeStyleReference { BasicButtonGroup.S.Dense.Segmented.style() },
            "BasicButtonGroup.S.NoGap" to ComposeStyleReference { BasicButtonGroup.S.NoGap.style() },
            "BasicButtonGroup.S.NoGap.Default" to ComposeStyleReference { BasicButtonGroup.S.NoGap.Default.style() },
            "BasicButtonGroup.S.NoGap.Segmented" to ComposeStyleReference { BasicButtonGroup.S.NoGap.Segmented.style() },
            "BasicButtonGroup.M" to ComposeStyleReference { BasicButtonGroup.M.style() },
            "BasicButtonGroup.M.Wide" to ComposeStyleReference { BasicButtonGroup.M.Wide.style() },
            "BasicButtonGroup.M.Wide.Default" to ComposeStyleReference { BasicButtonGroup.M.Wide.Default.style() },
            "BasicButtonGroup.M.Wide.Segmented" to ComposeStyleReference { BasicButtonGroup.M.Wide.Segmented.style() },
            "BasicButtonGroup.M.Dense" to ComposeStyleReference { BasicButtonGroup.M.Dense.style() },
            "BasicButtonGroup.M.Dense.Default" to ComposeStyleReference { BasicButtonGroup.M.Dense.Default.style() },
            "BasicButtonGroup.M.Dense.Segmented" to ComposeStyleReference { BasicButtonGroup.M.Dense.Segmented.style() },
            "BasicButtonGroup.M.NoGap" to ComposeStyleReference { BasicButtonGroup.M.NoGap.style() },
            "BasicButtonGroup.M.NoGap.Default" to ComposeStyleReference { BasicButtonGroup.M.NoGap.Default.style() },
            "BasicButtonGroup.M.NoGap.Segmented" to ComposeStyleReference { BasicButtonGroup.M.NoGap.Segmented.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.BasicButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> ButtonGroupBasicButtonGroupSize.Xs
                "S" -> ButtonGroupBasicButtonGroupSize.S
                "M" -> ButtonGroupBasicButtonGroupSize.M
                else -> ButtonGroupBasicButtonGroupSize.Xs
            },
            gap = when (bindings["gap"]?.toString()) {
                "None" -> ButtonGroupBasicButtonGroupGap.None
                "Wide" -> ButtonGroupBasicButtonGroupGap.Wide
                "Dense" -> ButtonGroupBasicButtonGroupGap.Dense
                else -> ButtonGroupBasicButtonGroupGap.None
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ButtonGroupBasicButtonGroupShape.Default
                "Segmented" -> ButtonGroupBasicButtonGroupShape.Segmented
                else -> ButtonGroupBasicButtonGroupShape.Default
            },
        ).key
    }
}
