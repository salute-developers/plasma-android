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
import com.sdkit.star.designsystem.styles.textarea.Default
import com.sdkit.star.designsystem.styles.textarea.Error
import com.sdkit.star.designsystem.styles.textarea.InnerLabel
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextArea
import com.sdkit.star.designsystem.styles.textarea.Xs

internal object PlasmaStardsTextAreaVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { TextArea.Xs.Default.style() },
            "Xs.Error" to ComposeStyleReference { TextArea.Xs.Error.style() },
            "Xs.OuterLabel.Default" to ComposeStyleReference { TextArea.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to ComposeStyleReference { TextArea.Xs.OuterLabel.Error.style() },
            "S.Default" to ComposeStyleReference { TextArea.S.Default.style() },
            "S.Error" to ComposeStyleReference { TextArea.S.Error.style() },
            "S.OuterLabel.Default" to ComposeStyleReference { TextArea.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to ComposeStyleReference { TextArea.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to ComposeStyleReference { TextArea.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to ComposeStyleReference { TextArea.S.InnerLabel.Error.style() },
            "M.Default" to ComposeStyleReference { TextArea.M.Default.style() },
            "M.Error" to ComposeStyleReference { TextArea.M.Error.style() },
            "M.OuterLabel.Default" to ComposeStyleReference { TextArea.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to ComposeStyleReference { TextArea.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to ComposeStyleReference { TextArea.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to ComposeStyleReference { TextArea.M.InnerLabel.Error.style() },
        )
}
