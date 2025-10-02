package com.sdds.testing.vs.codeinput

import com.sdds.testing.R
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.CodeField
import com.sdds.uikit.CodeInput

/**
 * Тест-кейсы для [CodeInput]
 */
@Suppress("UndocumentedPublicFunction")
abstract class CodeInputTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2105
     */
    abstract fun testCodeInputLCodeLengthFourCaptionLeft()

    /**
     * PLASMA-T2106
     */
    abstract fun testCodeInputMCodeLengthFiveCaptionCenter()

    /**
     * PLASMA-T2108
     */
    abstract fun testCodeInputSCodeLengthSixCaptionCenter()

    /**
     * PLASMA-T2109
     */
    abstract fun testCodeInputLCodeLengthSixNoCaption()

    /**
     * PLASMA-T2110
     */
    abstract fun testCodeInputCodeMLengthSixHidden()

    /**
     * PLASMA-T2111
     */
    abstract fun testCodeInputLCodeLengthSixRemoveSymbol()

    /**
     * PLASMA-T2115
     */
    abstract fun testCodeInputLCodeLengthSixRemoveCode()

    /**
     * PLASMA-T2116
     */
    abstract fun testCodeInputLCodeLengthSixErrorKeep()

    /**
     * PLASMA-T2221
     */
    abstract fun testCodeInputLCorrectCode()

    /**
     * PLASMA-T2244
     */
    abstract fun testCodeInputLLongText()

    fun ComponentScope.codeInputCodeLengthFourCaptionLeft(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthFourCaptionLeft",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Start,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_input
        }

    fun ComponentScope.codeInputCodeLengthFiveCaptionCenter(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthFiveCaptionCenter",
                errorItem = "q",
                codeLength = 5,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_input
        }

    fun ComponentScope.codeInputCodeLengthSixCaptionCenter(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthSixCaptionCenter",
                errorItem = "q",
                codeLength = 6,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_input
        }

    fun ComponentScope.codeInputCodeLengthSixNoCaption(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthSixNoCaption",
                errorItem = "q",
                codeLength = 6,
                hidden = false,
                caption = "",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_input
        }

    fun ComponentScope.codeInputCodeLengthSixHidden(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthSixCaptionCenter",
                errorItem = "q",
                codeLength = 6,
                hidden = true,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_input
        }

    fun ComponentScope.codeInputCodeLengthSixRemoveSymbol(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthSixRemoveSymbol",
                errorItem = "q",
                codeLength = 6,
                hidden = false,
                caption = "Caption",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Remove,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Remove,
            ),
        ).apply {
            id = R.id.code_input
        }

    fun ComponentScope.codeInputCodeLengthFourCaptionCenter(style: Int): CodeInput =
        codeInput(
            style = style,
            context = context,
            state = CodeInputUiState(
                variant = "CodeInputCodeLengthFourCaptionCenter",
                errorItem = "q",
                codeLength = 4,
                hidden = false,
                caption = "Here is a very long caption to test the code input component",
                enabled = true,
                captionAlignment = CodeField.CaptionAlignment.Center,
                focusGain = true,
                charValidateBehavior = CodeField.CharErrorBehavior.Keep,
                codeValidateBehavior = CodeField.CodeErrorBehavior.Keep,
            ),
        ).apply {
            id = R.id.code_input
        }
}
