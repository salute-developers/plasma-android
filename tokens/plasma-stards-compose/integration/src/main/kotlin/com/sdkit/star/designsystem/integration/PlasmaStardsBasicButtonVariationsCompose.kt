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
import com.sdds.compose.uikit.ButtonStyle
import com.sdds.compose.uikit.style.style
import com.sdds.sandbox.Property
import com.sdkit.star.designsystem.styles.basicbutton.BasicButton
import com.sdkit.star.designsystem.styles.basicbutton.BasicButtonSize
import com.sdkit.star.designsystem.styles.basicbutton.BasicButtonStyles
import com.sdkit.star.designsystem.styles.basicbutton.BasicButtonView
import com.sdkit.star.designsystem.styles.basicbutton.Clear
import com.sdkit.star.designsystem.styles.basicbutton.Default
import com.sdkit.star.designsystem.styles.basicbutton.L
import com.sdkit.star.designsystem.styles.basicbutton.M
import com.sdkit.star.designsystem.styles.basicbutton.S
import com.sdkit.star.designsystem.styles.basicbutton.Xs
import com.sdkit.star.designsystem.styles.basicbutton.resolve

internal object PlasmaStardsBasicButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Clear")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "BasicButton.L.Default" to ComposeStyleReference { BasicButton.L.Default.style() },
            "BasicButton.L.Clear" to ComposeStyleReference { BasicButton.L.Clear.style() },
            "BasicButton.M.Default" to ComposeStyleReference { BasicButton.M.Default.style() },
            "BasicButton.M.Clear" to ComposeStyleReference { BasicButton.M.Clear.style() },
            "BasicButton.S.Default" to ComposeStyleReference { BasicButton.S.Default.style() },
            "BasicButton.S.Clear" to ComposeStyleReference { BasicButton.S.Clear.style() },
            "BasicButton.Xs.Default" to ComposeStyleReference { BasicButton.Xs.Default.style() },
            "BasicButton.Xs.Clear" to ComposeStyleReference { BasicButton.Xs.Clear.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return BasicButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> BasicButtonSize.L
                "M" -> BasicButtonSize.M
                "S" -> BasicButtonSize.S
                "Xs" -> BasicButtonSize.Xs
                else -> BasicButtonSize.L
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> BasicButtonView.Default
                "Clear" -> BasicButtonView.Clear
                else -> BasicButtonView.Default
            },
        ).key
    }
}
