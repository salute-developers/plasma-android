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
import com.sdds.serv.styles.buttongroup.ButtonGroupIconButtonGroupGap
import com.sdds.serv.styles.buttongroup.ButtonGroupIconButtonGroupShape
import com.sdds.serv.styles.buttongroup.ButtonGroupIconButtonGroupSize
import com.sdds.serv.styles.buttongroup.ButtonGroupStyles
import com.sdds.serv.styles.buttongroup.Default
import com.sdds.serv.styles.buttongroup.Dense
import com.sdds.serv.styles.buttongroup.IconButtonGroup
import com.sdds.serv.styles.buttongroup.L
import com.sdds.serv.styles.buttongroup.M
import com.sdds.serv.styles.buttongroup.NoGap
import com.sdds.serv.styles.buttongroup.Pilled
import com.sdds.serv.styles.buttongroup.S
import com.sdds.serv.styles.buttongroup.Segmented
import com.sdds.serv.styles.buttongroup.Wide
import com.sdds.serv.styles.buttongroup.Xs
import com.sdds.serv.styles.buttongroup.resolve

internal object SddsServIconButtonGroupVariationsCompose : ComposeStyleProvider<ButtonGroupStyle>() {
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
            "IconButtonGroup.Xs" to ComposeStyleReference { IconButtonGroup.Xs.style() },
            "IconButtonGroup.Xs.Wide" to ComposeStyleReference { IconButtonGroup.Xs.Wide.style() },
            "IconButtonGroup.Xs.Wide.Default" to ComposeStyleReference { IconButtonGroup.Xs.Wide.Default.style() },
            "IconButtonGroup.Xs.Wide.Pilled" to ComposeStyleReference { IconButtonGroup.Xs.Wide.Pilled.style() },
            "IconButtonGroup.Xs.Wide.Segmented" to ComposeStyleReference { IconButtonGroup.Xs.Wide.Segmented.style() },
            "IconButtonGroup.Xs.Dense" to ComposeStyleReference { IconButtonGroup.Xs.Dense.style() },
            "IconButtonGroup.Xs.Dense.Default" to ComposeStyleReference { IconButtonGroup.Xs.Dense.Default.style() },
            "IconButtonGroup.Xs.Dense.Pilled" to ComposeStyleReference { IconButtonGroup.Xs.Dense.Pilled.style() },
            "IconButtonGroup.Xs.Dense.Segmented" to ComposeStyleReference { IconButtonGroup.Xs.Dense.Segmented.style() },
            "IconButtonGroup.Xs.NoGap" to ComposeStyleReference { IconButtonGroup.Xs.NoGap.style() },
            "IconButtonGroup.Xs.NoGap.Default" to ComposeStyleReference { IconButtonGroup.Xs.NoGap.Default.style() },
            "IconButtonGroup.Xs.NoGap.Pilled" to ComposeStyleReference { IconButtonGroup.Xs.NoGap.Pilled.style() },
            "IconButtonGroup.Xs.NoGap.Segmented" to ComposeStyleReference { IconButtonGroup.Xs.NoGap.Segmented.style() },
            "IconButtonGroup.S" to ComposeStyleReference { IconButtonGroup.S.style() },
            "IconButtonGroup.S.Wide" to ComposeStyleReference { IconButtonGroup.S.Wide.style() },
            "IconButtonGroup.S.Wide.Default" to ComposeStyleReference { IconButtonGroup.S.Wide.Default.style() },
            "IconButtonGroup.S.Wide.Pilled" to ComposeStyleReference { IconButtonGroup.S.Wide.Pilled.style() },
            "IconButtonGroup.S.Wide.Segmented" to ComposeStyleReference { IconButtonGroup.S.Wide.Segmented.style() },
            "IconButtonGroup.S.Dense" to ComposeStyleReference { IconButtonGroup.S.Dense.style() },
            "IconButtonGroup.S.Dense.Default" to ComposeStyleReference { IconButtonGroup.S.Dense.Default.style() },
            "IconButtonGroup.S.Dense.Pilled" to ComposeStyleReference { IconButtonGroup.S.Dense.Pilled.style() },
            "IconButtonGroup.S.Dense.Segmented" to ComposeStyleReference { IconButtonGroup.S.Dense.Segmented.style() },
            "IconButtonGroup.S.NoGap" to ComposeStyleReference { IconButtonGroup.S.NoGap.style() },
            "IconButtonGroup.S.NoGap.Default" to ComposeStyleReference { IconButtonGroup.S.NoGap.Default.style() },
            "IconButtonGroup.S.NoGap.Pilled" to ComposeStyleReference { IconButtonGroup.S.NoGap.Pilled.style() },
            "IconButtonGroup.S.NoGap.Segmented" to ComposeStyleReference { IconButtonGroup.S.NoGap.Segmented.style() },
            "IconButtonGroup.M" to ComposeStyleReference { IconButtonGroup.M.style() },
            "IconButtonGroup.M.Wide" to ComposeStyleReference { IconButtonGroup.M.Wide.style() },
            "IconButtonGroup.M.Wide.Default" to ComposeStyleReference { IconButtonGroup.M.Wide.Default.style() },
            "IconButtonGroup.M.Wide.Pilled" to ComposeStyleReference { IconButtonGroup.M.Wide.Pilled.style() },
            "IconButtonGroup.M.Wide.Segmented" to ComposeStyleReference { IconButtonGroup.M.Wide.Segmented.style() },
            "IconButtonGroup.M.Dense" to ComposeStyleReference { IconButtonGroup.M.Dense.style() },
            "IconButtonGroup.M.Dense.Default" to ComposeStyleReference { IconButtonGroup.M.Dense.Default.style() },
            "IconButtonGroup.M.Dense.Pilled" to ComposeStyleReference { IconButtonGroup.M.Dense.Pilled.style() },
            "IconButtonGroup.M.Dense.Segmented" to ComposeStyleReference { IconButtonGroup.M.Dense.Segmented.style() },
            "IconButtonGroup.M.NoGap" to ComposeStyleReference { IconButtonGroup.M.NoGap.style() },
            "IconButtonGroup.M.NoGap.Default" to ComposeStyleReference { IconButtonGroup.M.NoGap.Default.style() },
            "IconButtonGroup.M.NoGap.Pilled" to ComposeStyleReference { IconButtonGroup.M.NoGap.Pilled.style() },
            "IconButtonGroup.M.NoGap.Segmented" to ComposeStyleReference { IconButtonGroup.M.NoGap.Segmented.style() },
            "IconButtonGroup.L" to ComposeStyleReference { IconButtonGroup.L.style() },
            "IconButtonGroup.L.Wide" to ComposeStyleReference { IconButtonGroup.L.Wide.style() },
            "IconButtonGroup.L.Wide.Default" to ComposeStyleReference { IconButtonGroup.L.Wide.Default.style() },
            "IconButtonGroup.L.Wide.Pilled" to ComposeStyleReference { IconButtonGroup.L.Wide.Pilled.style() },
            "IconButtonGroup.L.Wide.Segmented" to ComposeStyleReference { IconButtonGroup.L.Wide.Segmented.style() },
            "IconButtonGroup.L.Dense" to ComposeStyleReference { IconButtonGroup.L.Dense.style() },
            "IconButtonGroup.L.Dense.Default" to ComposeStyleReference { IconButtonGroup.L.Dense.Default.style() },
            "IconButtonGroup.L.Dense.Pilled" to ComposeStyleReference { IconButtonGroup.L.Dense.Pilled.style() },
            "IconButtonGroup.L.Dense.Segmented" to ComposeStyleReference { IconButtonGroup.L.Dense.Segmented.style() },
            "IconButtonGroup.L.NoGap" to ComposeStyleReference { IconButtonGroup.L.NoGap.style() },
            "IconButtonGroup.L.NoGap.Default" to ComposeStyleReference { IconButtonGroup.L.NoGap.Default.style() },
            "IconButtonGroup.L.NoGap.Pilled" to ComposeStyleReference { IconButtonGroup.L.NoGap.Pilled.style() },
            "IconButtonGroup.L.NoGap.Segmented" to ComposeStyleReference { IconButtonGroup.L.NoGap.Segmented.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return ButtonGroupStyles.IconButtonGroup.resolve(
            size = when (bindings["size"]?.toString()) {
                "Xs" -> ButtonGroupIconButtonGroupSize.Xs
                "S" -> ButtonGroupIconButtonGroupSize.S
                "M" -> ButtonGroupIconButtonGroupSize.M
                "L" -> ButtonGroupIconButtonGroupSize.L
                else -> ButtonGroupIconButtonGroupSize.Xs
            },
            gap = when (bindings["gap"]?.toString()) {
                "Wide" -> ButtonGroupIconButtonGroupGap.Wide
                "Dense" -> ButtonGroupIconButtonGroupGap.Dense
                "None" -> ButtonGroupIconButtonGroupGap.None
                else -> ButtonGroupIconButtonGroupGap.Wide
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> ButtonGroupIconButtonGroupShape.Default
                "Pilled" -> ButtonGroupIconButtonGroupShape.Pilled
                "Segmented" -> ButtonGroupIconButtonGroupShape.Segmented
                else -> ButtonGroupIconButtonGroupShape.Default
            },
        ).key
    }
}
