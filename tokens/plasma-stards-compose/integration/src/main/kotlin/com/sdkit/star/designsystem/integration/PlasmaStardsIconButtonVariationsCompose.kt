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
import com.sdkit.star.designsystem.styles.iconbutton.Clear
import com.sdkit.star.designsystem.styles.iconbutton.Default
import com.sdkit.star.designsystem.styles.iconbutton.IconButton
import com.sdkit.star.designsystem.styles.iconbutton.IconButtonShape
import com.sdkit.star.designsystem.styles.iconbutton.IconButtonSize
import com.sdkit.star.designsystem.styles.iconbutton.IconButtonStyles
import com.sdkit.star.designsystem.styles.iconbutton.IconButtonView
import com.sdkit.star.designsystem.styles.iconbutton.L
import com.sdkit.star.designsystem.styles.iconbutton.M
import com.sdkit.star.designsystem.styles.iconbutton.Pilled
import com.sdkit.star.designsystem.styles.iconbutton.S
import com.sdkit.star.designsystem.styles.iconbutton.Xs
import com.sdkit.star.designsystem.styles.iconbutton.resolve

internal object PlasmaStardsIconButtonVariationsCompose : ComposeStyleProvider<ButtonStyle>() {
    override val bindings: Set<Property<*>> =
        setOf(
            Property.SingleChoiceProperty(name = "size", value = "L", variants = listOf("L", "M", "S", "Xs")),
            Property.SingleChoiceProperty(name = "shape", value = "Default", variants = listOf("Default", "Pilled")),
            Property.SingleChoiceProperty(name = "view", value = "Default", variants = listOf("Default", "Clear")),
        )

    override val variations: Map<String, ComposeStyleReference<ButtonStyle>> =
        mapOf(
            "IconButton.L.Default" to ComposeStyleReference { IconButton.L.Default.style() },
            "IconButton.L.Clear" to ComposeStyleReference { IconButton.L.Clear.style() },
            "IconButton.L.Pilled.Default" to ComposeStyleReference { IconButton.L.Pilled.Default.style() },
            "IconButton.L.Pilled.Clear" to ComposeStyleReference { IconButton.L.Pilled.Clear.style() },
            "IconButton.M.Default" to ComposeStyleReference { IconButton.M.Default.style() },
            "IconButton.M.Clear" to ComposeStyleReference { IconButton.M.Clear.style() },
            "IconButton.M.Pilled.Default" to ComposeStyleReference { IconButton.M.Pilled.Default.style() },
            "IconButton.M.Pilled.Clear" to ComposeStyleReference { IconButton.M.Pilled.Clear.style() },
            "IconButton.S.Default" to ComposeStyleReference { IconButton.S.Default.style() },
            "IconButton.S.Clear" to ComposeStyleReference { IconButton.S.Clear.style() },
            "IconButton.S.Pilled.Default" to ComposeStyleReference { IconButton.S.Pilled.Default.style() },
            "IconButton.S.Pilled.Clear" to ComposeStyleReference { IconButton.S.Pilled.Clear.style() },
            "IconButton.Xs.Default" to ComposeStyleReference { IconButton.Xs.Default.style() },
            "IconButton.Xs.Clear" to ComposeStyleReference { IconButton.Xs.Clear.style() },
            "IconButton.Xs.Pilled.Default" to ComposeStyleReference { IconButton.Xs.Pilled.Default.style() },
            "IconButton.Xs.Pilled.Clear" to ComposeStyleReference { IconButton.Xs.Pilled.Clear.style() },
        )

    override fun resolveStyleKey(bindings: Map<String, Any?>): String {
        return IconButtonStyles.resolve(
            size = when (bindings["size"]?.toString()) {
                "L" -> IconButtonSize.L
                "M" -> IconButtonSize.M
                "S" -> IconButtonSize.S
                "Xs" -> IconButtonSize.Xs
                else -> IconButtonSize.L
            },
            shape = when (bindings["shape"]?.toString()) {
                "Default" -> IconButtonShape.Default
                "Pilled" -> IconButtonShape.Pilled
                else -> IconButtonShape.Default
            },
            view = when (bindings["view"]?.toString()) {
                "Default" -> IconButtonView.Default
                "Clear" -> IconButtonView.Clear
                else -> IconButtonView.Default
            },
        ).key
    }
}
