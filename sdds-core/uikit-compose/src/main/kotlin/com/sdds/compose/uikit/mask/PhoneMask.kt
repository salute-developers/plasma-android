package com.sdds.compose.uikit.mask

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Маска с предустановленным форматом телефона.
 *
 * @property mask строка, описывающая формат телефона
 * @property digitPlaceholder символ подсказки для еще не введенных символов
 * @property maskMode режим отображения маски [TextFieldMaskMode]
 */
data class PhoneMask(
    val mask: String = "+7 (###) ###-##-##",
    val digitPlaceholder: Char = '0',
    val maskMode: TextFieldMaskMode = TextFieldMaskMode.Always,
) : TextFieldMask {

    override fun preFilterInput(text: String): String {
        return text
            .filterIndexed { index, char -> char.isDigit() || (index == 0 && char == '-') }
            .take(mask.count { it == '#' })
    }

    override fun getVisualTransformation(mainColor: Color, hintColor: Color): VisualTransformation {
        return PhoneMaskTransformation(
            mask = mask,
            digitPlaceholder = digitPlaceholder,
            maskMode = maskMode,
            mainColor = mainColor,
            hintColor = hintColor,
        )
    }
}

private class PhoneMaskTransformation(
    private val mask: String,
    private val digitPlaceholder: Char,
    maskMode: TextFieldMaskMode,
    hintColor: Color,
    mainColor: Color,
) : VisualTransformation {

    private val mainSpanStyle = SpanStyle(color = mainColor)
    private val hintSpanStyle = SpanStyle(
        color = when (maskMode) {
            TextFieldMaskMode.Always -> hintColor
            TextFieldMaskMode.OnInput -> Color.Transparent
        },
    )

    override fun filter(text: AnnotatedString): TransformedText {
        val formattedText = formatWithMask(text, mask)

        return TransformedText(
            text = formattedText,
            offsetMapping = PhoneMaskOffsetMapping(mask = mask, originalText = text),
        )
    }

    private fun formatWithMask(text: AnnotatedString, mask: String): AnnotatedString {
        val cleanText = text.filter { it.isDigit() }
        if (cleanText.isEmpty()) return AnnotatedString("")
        var cleanIndex = 0
        var nonFilledMaskCharIndex = 0

        val maskStringBuilder = StringBuilder(mask)
        for (maskCharIndex in mask.indices) {
            if (cleanIndex >= cleanText.length) {
                nonFilledMaskCharIndex = maskCharIndex
                break
            }

            if (mask[maskCharIndex] == '#') {
                maskStringBuilder[maskCharIndex] = cleanText[cleanIndex]
                cleanIndex++
            } else {
                maskStringBuilder[maskCharIndex] = mask[maskCharIndex]
            }
            if (maskCharIndex == mask.lastIndex) nonFilledMaskCharIndex = mask.length
        }

        return buildAnnotatedString {
            append(maskStringBuilder.toString().replace('#', digitPlaceholder))

            addStyle(
                style = mainSpanStyle,
                start = 0,
                end = nonFilledMaskCharIndex,
            )

            addStyle(
                style = hintSpanStyle,
                start = nonFilledMaskCharIndex,
                end = mask.length,
            )
        }
    }
}

private class PhoneMaskOffsetMapping(
    private val mask: String,
    private val originalText: AnnotatedString,
) :
    OffsetMapping {
    override fun originalToTransformed(offset: Int): Int {
        if (originalText.isEmpty()) return 0
        var cleanChars = 0
        var resultIndex = 0

        for (i in mask.indices) {
            if (cleanChars >= offset) break

            when (mask[i]) {
                '#' -> {
                    cleanChars++
                    resultIndex++
                }

                else -> resultIndex++
            }
        }

        return resultIndex
    }

    override fun transformedToOriginal(offset: Int): Int {
        var cleanChars = 0

        for (i in 0 until offset) {
            if (cleanChars >= originalText.length) break
            if (mask[i] == '#') {
                cleanChars++
            }
        }

        return cleanChars
    }
}
