package com.sdds.compose.uikit.mask

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Маска с предустановленным форматом времени.
 *
 * @property pattern паттерн форматирования времени
 * @property separator разделитель
 * @property maskMode режим отображения маски [TextFieldMaskMode]
 */
data class TimeMask(
    override val pattern: List<String> = listOf("ЧЧ", "ММ"),
    override val separator: Char = ':',
    override val maskMode: TextFieldMaskMode = TextFieldMaskMode.Always,
) : DateTimeMask(pattern, separator, maskMode)

/**
 * Маска с предустановленным форматом даты.
 *
 * @property pattern паттерн форматирования даты
 * @property separator разделитель
 * @property maskMode режим отображения маски [TextFieldMaskMode]
 */
data class DateMask(
    override val pattern: List<String> = listOf("ДД", "ММ", "ГГ"),
    override val separator: Char = '.',
    override val maskMode: TextFieldMaskMode = TextFieldMaskMode.Always,
) : DateTimeMask(pattern, separator, maskMode)

/**
 * Базовая маска с предустановленным форматом даты/времени.
 *
 * @property pattern паттерн форматирования даты/времени
 * @property separator разделитель
 * @property maskMode режим отображения маски [TextFieldMaskMode]
 */
abstract class DateTimeMask(
    open val pattern: List<String>,
    open val separator: Char,
    open val maskMode: TextFieldMaskMode,
) : TextFieldMask {

    override fun getVisualTransformation(mainColor: Color, hintColor: Color): VisualTransformation {
        return DateTimeMaskTransformation(
            pattern = pattern,
            delimiter = separator,
            maskMode = maskMode,
            hintColor = hintColor,
            mainColor = mainColor,
        )
    }

    override fun preFilterInput(text: String): String {
        return text
            .filter { it.isDigit() }
            .take(pattern.sumOf { it.length })
    }
}

private class DateTimeMaskTransformation(
    pattern: List<String>,
    delimiter: Char,
    maskMode: TextFieldMaskMode,
    hintColor: Color,
    mainColor: Color,
) : VisualTransformation {

    private val mask = pattern
        .joinToString(delimiter.toString())

    private val maskCharSet = pattern
        .map { it.first() }
        .toSet()

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
            offsetMapping = DateTimeMaskOffsetMapping(
                mask = mask,
                originalText = text,
                maskCharSet = maskCharSet,
            ),
        )
    }

    private fun formatWithMask(text: AnnotatedString, mask: String): AnnotatedString {
        if (text.isEmpty()) return AnnotatedString("")
        var cleanIndex = 0
        var nonFilledMaskCharIndex = 0

        val maskStringBuilder = StringBuilder(mask)
        for (maskCharIndex in mask.indices) {
            if (cleanIndex >= text.length) {
                nonFilledMaskCharIndex = maskCharIndex
                break
            }

            if (maskCharSet.contains(mask[maskCharIndex])) {
                maskStringBuilder[maskCharIndex] = text[cleanIndex]
                cleanIndex++
            } else {
                maskStringBuilder[maskCharIndex] = mask[maskCharIndex]
            }
            if (maskCharIndex == mask.lastIndex) nonFilledMaskCharIndex = mask.length
        }

        return buildAnnotatedString {
            append(maskStringBuilder)

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

private class DateTimeMaskOffsetMapping(
    private val mask: String,
    private val originalText: AnnotatedString,
    private val maskCharSet: Set<Char>,
) :
    OffsetMapping {
    override fun originalToTransformed(offset: Int): Int {
        if (originalText.isEmpty()) return 0
        var cleanChars = 0
        var resultIndex = 0

        for (i in mask.indices) {
            if (cleanChars >= offset) break

            when {
                maskCharSet.contains(mask[i]) -> {
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
            if (maskCharSet.contains(mask[i])) {
                cleanChars++
            }
        }

        return cleanChars
    }
}
