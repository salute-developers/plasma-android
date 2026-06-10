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
import com.sdds.serv.styles.buttongroup.BasicButtonGroup
import com.sdds.serv.styles.buttongroup.BasicButtonGroupGap
import com.sdds.serv.styles.buttongroup.BasicButtonGroupShape
import com.sdds.serv.styles.buttongroup.BasicButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Segmented
import com.sdds.serv.styles.buttongroup.Wide
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.Xxs
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServBasicButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "Xxs", variants = listOf("Xxs", "Xs", "S", "M", "L")),
            Property.SingleChoiceProperty(name = "gap", value = "Wide", variants = listOf("Wide", "Dense", "None")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Segmented")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonGroupStyle>> =
        mapOf(
            "BasicButtonGroup.Xxs" to ComposeStyleReference { BasicButtonGroup.Xxs.style() },
            "BasicButtonGroup.Xxs.Wide" to ComposeStyleReference { BasicButtonGroup.Xxs.Wide.style() },
            "BasicButtonGroup.Xxs.Wide.Default" to ComposeStyleReference { BasicButtonGroup.Xxs.Wide.Default.style() },
            "BasicButtonGroup.Xxs.Wide.Segmented" to ComposeStyleReference { BasicButtonGroup.Xxs.Wide.Segmented.style() },
            "BasicButtonGroup.Xxs.Dense" to ComposeStyleReference { BasicButtonGroup.Xxs.Dense.style() },
            "BasicButtonGroup.Xxs.Dense.Default" to ComposeStyleReference { BasicButtonGroup.Xxs.Dense.Default.style() },
            "BasicButtonGroup.Xxs.Dense.Segmented" to ComposeStyleReference { BasicButtonGroup.Xxs.Dense.Segmented.style() },
            "BasicButtonGroup.Xxs.NoGap" to ComposeStyleReference { BasicButtonGroup.Xxs.NoGap.style() },
            "BasicButtonGroup.Xxs.NoGap.Default" to ComposeStyleReference { BasicButtonGroup.Xxs.NoGap.Default.style() },
            "BasicButtonGroup.Xxs.NoGap.Segmented" to ComposeStyleReference { BasicButtonGroup.Xxs.NoGap.Segmented.style() },
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
        return ButtonGroupStyles.BasicButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xxs" -> BasicButtonGroupSize.Xxs
                "Xs" -> BasicButtonGroupSize.Xs
                "S" -> BasicButtonGroupSize.S
                "M" -> BasicButtonGroupSize.M
                "L" -> BasicButtonGroupSize.L
                else -> BasicButtonGroupSize.Xxs
            },
            gap = when (bindings["gap"]?.toString()) {
                "Wide" -> BasicButtonGroupGap.Wide
                "Dense" -> BasicButtonGroupGap.Dense
                "None" -> BasicButtonGroupGap.None
                else -> BasicButtonGroupGap.Wide
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> BasicButtonGroupShape.Default
                "Segmented" -> BasicButtonGroupShape.Segmented
                else -> BasicButtonGroupShape.Default
            },
        ).key
    }
}
