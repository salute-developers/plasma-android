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
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.S
import com.sdkit.star.designsystem.styles.textfield.TextField
import com.sdkit.star.designsystem.styles.textfield.Xs

internal object PlasmaStardsTextFieldVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { TextField.Xs.Default.style() },
            "Xs.Error" to ComposeStyleReference { TextField.Xs.Error.style() },
            "Xs.OuterLabel.Default" to ComposeStyleReference { TextField.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to ComposeStyleReference { TextField.Xs.OuterLabel.Error.style() },
            "S.Default" to ComposeStyleReference { TextField.S.Default.style() },
            "S.Error" to ComposeStyleReference { TextField.S.Error.style() },
            "S.OuterLabel.Default" to ComposeStyleReference { TextField.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to ComposeStyleReference { TextField.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to ComposeStyleReference { TextField.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to ComposeStyleReference { TextField.S.InnerLabel.Error.style() },
            "M.Default" to ComposeStyleReference { TextField.M.Default.style() },
            "M.Error" to ComposeStyleReference { TextField.M.Error.style() },
            "M.OuterLabel.Default" to ComposeStyleReference { TextField.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to ComposeStyleReference { TextField.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to ComposeStyleReference { TextField.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to ComposeStyleReference { TextField.M.InnerLabel.Error.style() },
        )
}
