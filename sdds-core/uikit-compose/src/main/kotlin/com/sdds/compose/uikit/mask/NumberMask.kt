package com.sdds.compose.uikit.mask

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Маска с предустановленным числовым форматом.
 *
 * @property decimalScale количество знаков после запятой
 * @property decimalSeparator разделитель дробной части
 * @property decimalSeparatorAliases список допустимых разделителей.
 * При вводе разделителя из этого списка, он будет заменен на [decimalSeparator]
 * @property thousandGroupSeparator разделитель разрядов
 * @property digitsPerGroup количество цифр в группе разрядов
 */
data class NumberMask(
    val decimalScale: Int = 2,
    val decimalSeparator: String = ",",
    val decimalSeparatorAliases: List<String> = listOf(".", ",", "б", "ю", "/"),
    val thousandGroupSeparator: String = " ",
    val digitsPerGroup: Int = 3,
) : TextFieldMask {

    init {
        check(digitsPerGroup > 0) { "digitsPerGroup must be greater than 0" }
    }

    override fun getVisualTransformation(mainColor: Color, hintColor: Color): VisualTransformation {
        return NumberMaskTransformation(
            mainColor = mainColor,
            thousandSeparator = thousandGroupSeparator,
            digitsPerGroup = digitsPerGroup,
            decimalSeparator = decimalSeparator,
            decimalScale = decimalScale,
            decimalSeparatorKeys = decimalSeparatorAliases,
        )
    }

    override fun preFilterInput(text: String): String {
        return text
            .removeSpaces()
            .removeDuplicateSign('-')
            .keepSingleSeparator(decimalSeparatorAliases)
            .take(maxInputLength(text))
    }

    @Suppress("SpreadOperator")
    private fun maxInputLength(text: String): Int {
        val tokens = text.split(*decimalSeparatorAliases.toTypedArray(), limit = 2)
        return tokens[0].length + decimalSeparator.length + decimalScale
    }
}

@Suppress("SpreadOperator")
private class NumberMaskTransformation(
    mainColor: Color,
    private val thousandSeparator: String,
    private val digitsPerGroup: Int,
    private val decimalSeparator: String,
    private val decimalScale: Int,
    private val decimalSeparatorKeys: List<String>,
) : VisualTransformation {

    private val mainSpanStyle = SpanStyle(color = mainColor)

    override fun filter(text: AnnotatedString): TransformedText {
        val formattedText = formatWithMask(text)

        return TransformedText(
            text = formattedText,
            offsetMapping = NumberOffsetMapping(
                text = text,
                formattedText = formattedText,
                digitsPerGroup = digitsPerGroup,
                decimalSeparatorKeys = decimalSeparatorKeys,
                decimalSeparator = decimalSeparator,
            ),
        )
    }

    private fun formatWithMask(text: AnnotatedString): AnnotatedString {
        val integerFractionalTokens = text.split(*decimalSeparatorKeys.toTypedArray(), limit = 2)
        val integerPart = integerFractionalTokens[0]
        val formattedIntegerPart = integerPart
            .formatWithSpaces(
                separator = thousandSeparator,
                digitsPerGroup = digitsPerGroup,
            )
        val hasSeparator = integerFractionalTokens.size > 1
        val fractionalPart = if (hasSeparator && integerFractionalTokens[1].isNotEmpty()) {
            integerFractionalTokens[1]
        } else {
            ""
        }
        val constrainedFractionalPart = fractionalPart.take(decimalScale)
        val separatorOrEmpty = if (hasSeparator) decimalSeparator else ""

        return AnnotatedString(
            formattedIntegerPart + separatorOrEmpty + constrainedFractionalPart,
            mainSpanStyle,
        )
    }
}

private class NumberOffsetMapping(
    private val text: AnnotatedString,
    private val formattedText: AnnotatedString,
    private val digitsPerGroup: Int,
    private val decimalSeparatorKeys: List<String>,
    private val decimalSeparator: String,
) : OffsetMapping {
    val originalIntegerPart = text.getIntegerPart(decimalSeparatorKeys)
    val fullGroupCount = originalIntegerPart.filterMinus().length / digitsPerGroup
    val separatorCount =
        if (originalIntegerPart.filterMinus().length % digitsPerGroup > 0) {
            fullGroupCount
        } else {
            (fullGroupCount - 1).coerceAtLeast(0)
        }

    override fun originalToTransformed(offset: Int): Int {
        if (offset > originalIntegerPart.lastIndex) {
            return offset + separatorCount
        }
        val indexFromIntegerEnd = originalIntegerPart.lastIndex - offset
        val isGroupFromEndFull =
            (indexFromIntegerEnd + 1) % digitsPerGroup == 0
        val totalGroupCount = separatorCount + 1
        val groupIndexFromIntegerEnd =
            ((indexFromIntegerEnd + 1) / digitsPerGroup + (if (isGroupFromEndFull) 0 else 1)) - 1
        val groupIndexFromIntegerStart =
            (totalGroupCount - (groupIndexFromIntegerEnd + 1)).coerceAtLeast(0)
        return offset + groupIndexFromIntegerStart
    }

    override fun transformedToOriginal(offset: Int): Int {
        val formattedIntegerPart = formattedText.getIntegerPart(decimalSeparatorKeys)
        val fractionalPart = text.getFractionalPart(decimalSeparatorKeys)
        val formattedDecimalSeparatorStart =
            formattedText.length - decimalSeparator.length - fractionalPart.length + 1
        val originalDecimalSeparatorStart =
            text.length - decimalSeparator.length - fractionalPart.length + 1
        val hasFractionalPart =
            fractionalPart.isNotEmpty() || formattedText.contains(decimalSeparator)
        if (hasFractionalPart && offset >= formattedDecimalSeparatorStart) {
            return originalDecimalSeparatorStart + (offset - formattedDecimalSeparatorStart)
        }
        var digitIndex = 0
        for (i in formattedIntegerPart.indices) {
            if (i >= offset) break
            if (formattedText[i].isDigit() || formattedText[i] == '-') {
                digitIndex++
            }
        }
        return digitIndex
    }
}

private fun String.formatWithSpaces(
    separator: String,
    digitsPerGroup: Int,
): String {
    val formattedString = this
        .filterMinus()
        .reversed()
        .chunked(digitsPerGroup)
        .joinToString(separator)
        .reversed()
    return formattedString.addMinusIfNegative(this.isNegative())
}

private fun String.isNegative(): Boolean {
    return this.startsWith('-')
}

private fun String.filterMinus(): String {
    return this.removePrefix("-")
}

private fun String.addMinusIfNegative(isNegative: Boolean): String {
    return "${if (isNegative) "-" else ""}$this"
}

@Suppress("SpreadOperator")
private fun AnnotatedString.getIntegerPart(delimiters: List<String>): String {
    val tokens = split(*delimiters.toTypedArray(), limit = 2)
    return tokens[0]
}

@Suppress("SpreadOperator")
private fun AnnotatedString.getFractionalPart(delimiters: List<String>): String {
    val tokens = split(*delimiters.toTypedArray(), limit = 2)
    return if (tokens.size == 2) tokens[1] else ""
}

private fun String.removeDuplicateSign(charToRemove: Char): String {
    var found = false
    return this.filter {
        if (it == charToRemove) {
            if (!found) {
                found = true
                true
            } else {
                false
            }
        } else {
            true
        }
    }
}

private fun String.keepSingleSeparator(separators: List<String>): String {
    if (this.isEmpty() || separators.isEmpty()) return this
    val escapedSeparators = separators.map { Regex.escape(it) }
    val pattern = escapedSeparators.joinToString("|")
    val regex = Regex("($pattern)+")
    return regex.replace(this) { matchResult ->
        matchResult.value.take(
            matchResult.value.indexOfFirst {
                it !in matchResult.value[0].toString()
            }.takeIf { it != -1 } ?: 1,
        )
    }
}

private fun String.removeSpaces(): String {
    return this.filter { it != ' ' }
}
