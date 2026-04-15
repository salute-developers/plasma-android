// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.integration

import com.sdds.compose.sandbox.ComposeStyleProvider
import com.sdds.compose.sandbox.ComposeStyleReference
import com.sdds.compose.uikit.TextFieldStyle
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.Error
import com.sdkit.star.designsystem.styles.textfield.InnerLabel
import com.sdkit.star.designsystem.styles.textfield.L
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextFieldClear
import com.sdkit.star.designsystem.styles.textfield.Xs

internal object PlasmaStardsTextFieldClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { TextFieldClear.Xs.Default.style() },
            "Xs.Error" to ComposeStyleReference { TextFieldClear.Xs.Error.style() },
            "Xs.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.Xs.OuterLabel.Error.style() },
            "S.Default" to ComposeStyleReference { TextFieldClear.S.Default.style() },
            "S.Error" to ComposeStyleReference { TextFieldClear.S.Error.style() },
            "S.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.S.InnerLabel.Error.style() },
            "M.Default" to ComposeStyleReference { TextFieldClear.M.Default.style() },
            "M.Error" to ComposeStyleReference { TextFieldClear.M.Error.style() },
            "M.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.M.InnerLabel.Error.style() },
            "L.Default" to ComposeStyleReference { TextFieldClear.L.Default.style() },
            "L.Error" to ComposeStyleReference { TextFieldClear.L.Error.style() },
            "L.OuterLabel.Default" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Default.style() },
            "L.OuterLabel.Error" to ComposeStyleReference { TextFieldClear.L.OuterLabel.Error.style() },
            "L.InnerLabel.Default" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Default.style() },
            "L.InnerLabel.Error" to ComposeStyleReference { TextFieldClear.L.InnerLabel.Error.style() },
        )
}
