package com.sdds.testing.vs.codefield

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.CodeField

/**
 * Тест-кейсы для [CodeField]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CodeFieldTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2026
     */
    abstract fun testCodeFieldLDefaultCodeLengthFour()

    /**
     * PLASMA-T2027
     */
    abstract fun testCodeFieldMSegmented()

    /**
     * PLASMA-T2028
     */
    abstract fun testCodeeFieldLCodeLengthSixNoCaption()

    /**
     * PLASMA-T2029
     */
    abstract fun testCodeFieldMSegmentedCodeLengthSix()

    /**
     * PLASMA-T2041
     */
    abstract fun testCodeFieldLHiddenCode()

    /**
     * PLASMA-T2218
     */
    abstract fun testCodeFieldLInputWrongCode()

    /**
     * PLASMA-T2219
     */
    abstract fun testCodeFieldLInputLetter()

    /**
     * PLASMA-T2243
     */
    abstract fun testCodeFieldLongText()

    /**
     * PLASMA-T2034
     */
    abstract fun testCodeFieldLInputWrongCodeRemove()

    /**
     * PLASMA-T2033
     */
    abstract fun testCodeFieldDisabled()

    /**
     * PLASMA-T2297
     */
    abstract fun testCodeFieldLInputCorrectCode()

    fun ComponentScope.codeFieldCodeLengthFour(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Start,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeLengthFiveCaptionCenter(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 5,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeHidden(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 4,
                hidden = true,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeLengthSix(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 6,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeLengthSixNoCaption(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 6,
                hidden = false,
                caption = "",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeLongText(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Here is a very long caption to test the code field component",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeLengthFourKeep(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldCodeLengthFourRemove(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }

    fun ComponentScope.codeFieldDisabled(style: Int): CodeField =
        codeField(
            style = style,
            context = context,
            state = CodeFieldUiState(
                variant = "",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Caption",
                enabled = false,
                captionAlignment = CodeField.CaptionAlignment.Center,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_field
        }
}
