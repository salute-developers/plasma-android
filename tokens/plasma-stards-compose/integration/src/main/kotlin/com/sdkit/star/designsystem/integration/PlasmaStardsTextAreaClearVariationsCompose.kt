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
import com.sdkit.star.designsystem.styles.textarea.L
import com.sdkit.star.designsystem.styles.textarea.M
import com.sdkit.star.designsystem.styles.textarea.OuterLabel
import com.sdkit.star.designsystem.styles.textarea.S
import com.sdkit.star.designsystem.styles.textarea.TextAreaClear
import com.sdkit.star.designsystem.styles.textarea.Xs

internal object PlasmaStardsTextAreaClearVariationsCompose : ComposeStyleProvider<TextFieldStyle>() {
    override val variations: Map<String, ComposeStyleReference<TextFieldStyle>> =
        mapOf(
            "Xs.Default" to ComposeStyleReference { TextAreaClear.Xs.Default.style() },
            "Xs.Error" to ComposeStyleReference { TextAreaClear.Xs.Error.style() },
            "Xs.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Default.style() },
            "Xs.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.Xs.OuterLabel.Error.style() },
            "S.Default" to ComposeStyleReference { TextAreaClear.S.Default.style() },
            "S.Error" to ComposeStyleReference { TextAreaClear.S.Error.style() },
            "S.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Default.style() },
            "S.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.S.OuterLabel.Error.style() },
            "S.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Default.style() },
            "S.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.S.InnerLabel.Error.style() },
            "M.Default" to ComposeStyleReference { TextAreaClear.M.Default.style() },
            "M.Error" to ComposeStyleReference { TextAreaClear.M.Error.style() },
            "M.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Default.style() },
            "M.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.M.OuterLabel.Error.style() },
            "M.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Default.style() },
            "M.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.M.InnerLabel.Error.style() },
            "L.Default" to ComposeStyleReference { TextAreaClear.L.Default.style() },
            "L.Error" to ComposeStyleReference { TextAreaClear.L.Error.style() },
            "L.OuterLabel.Default" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Default.style() },
            "L.OuterLabel.Error" to ComposeStyleReference { TextAreaClear.L.OuterLabel.Error.style() },
            "L.InnerLabel.Default" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Default.style() },
            "L.InnerLabel.Error" to ComposeStyleReference { TextAreaClear.L.InnerLabel.Error.style() },
        )
}
