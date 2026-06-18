// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "UndocumentedPublicFunction",
    "CyclomaticComplexMethod",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.buttongroup.BasicButtonGroup
import com.sdkit.star.designsystem.styles.buttongroup.ButtonGroupGap
import com.sdkit.star.designsystem.styles.buttongroup.ButtonGroupShape
import com.sdkit.star.designsystem.styles.buttongroup.ButtonGroupSize
import com.sdkit.star.designsystem.styles.buttongroup.ButtonGroupStyles
import com.sdkit.star.designsystem.styles.buttongroup.Default
import com.sdkit.star.designsystem.styles.buttongroup.Dense
import com.sdkit.star.designsystem.styles.buttongroup.L
import com.sdkit.star.designsystem.styles.buttongroup.M
import com.sdkit.star.designsystem.styles.buttongroup.NoGap
import com.sdkit.star.designsystem.styles.buttongroup.S
import com.sdkit.star.designsystem.styles.buttongroup.Segmented
import com.sdkit.star.designsystem.styles.buttongroup.Wide
import com.sdkit.star.designsystem.styles.buttongroup.Xs
import com.sdkit.star.designsystem.styles.buttongroup.resolve

internal object PlasmaStardsBasicButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "gap", value = "Wide", variants = listOf("Wide", "Dense", "None")),
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
            "BasicButtonGroup.L" to ComposeStyleReference { BasicButtonGroup.L.style() },
            "BasicButtonGroup.L.Wide" to ComposeStyleReference { BasicButtonGroup.L.Wide.style() },
            "BasicButtonGroup.L.Wide.Default" to ComposeStyleReference { BasicButtonGroup.L.Wide.Default.style() },
            "BasicButtonGroup.L.Wide.Segmented" to ComposeStyleReference { BasicButtonGroup.L.Wide.Segmented.style() },
            "BasicButtonGroup.L.Dense" to ComposeStyleReference { BasicButtonGroup.L.Dense.style() },
            "BasicButtonGroup.L.Dense.Default" to ComposeStyleReference { BasicButtonGroup.L.Dense.Default.style() },
            "BasicButtonGroup.L.Dense.Segmented" to ComposeStyleReference { BasicButtonGroup.L.Dense.Segmented.style() },
            "BasicButtonGroup.L.NoGap" to ComposeStyleReference { BasicButtonGroup.L.NoGap.style() },
            "BasicButtonGroup.L.NoGap.Default" to ComposeStyleReference { BasicButtonGroup.L.NoGap.Default.style() },
            "BasicButtonGroup.L.NoGap.Segmented" to ComposeStyleReference { BasicButtonGroup.L.NoGap.Segmented.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> ButtonGroupSize.L
                "M" -> ButtonGroupSize.M
                "S" -> ButtonGroupSize.S
                "Xs" -> ButtonGroupSize.Xs
                else -> ButtonGroupSize.L
            },
            gap = when (bindings["gap"]?.toString()) {
                "Wide" -> ButtonGroupGap.Wide
                "Dense" -> ButtonGroupGap.Dense
                "None" -> ButtonGroupGap.None
                else -> ButtonGroupGap.Wide
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ButtonGroupShape.Default
                "Segmented" -> ButtonGroupShape.Segmented
                else -> ButtonGroupShape.Default
            },
        ).key
    }
}
