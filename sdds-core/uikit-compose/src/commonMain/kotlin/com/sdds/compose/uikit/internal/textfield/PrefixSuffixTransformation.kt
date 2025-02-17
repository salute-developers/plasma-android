package com.sdds.compose.uikit.internal.textfield

import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation

internal class PrefixSuffixTransformation(
    prefix: String = "",
    suffix: String = "",
    prefixTextStyle: TextStyle = TextStyle(),
    suffixTextStyle: TextStyle = TextStyle(),
) : VisualTransformation {

    private val prefixWithWhiteSpace = if (prefix.isNotEmpty()) "$prefix " else ""
    private val suffixWithWhiteSpace = if (suffix.isNotEmpty())" $suffix" else ""

    private val prefixAnnotated = AnnotatedString(
        text = prefixWithWhiteSpace,
        spanStyle = prefixTextStyle.toSpanStyle(),
    )

    private val suffixAnnotated = AnnotatedString(
        text = suffixWithWhiteSpace,
        spanStyle = suffixTextStyle.toSpanStyle(),
    )
    override fun filter(text: AnnotatedString): TransformedText {
        val result = prefixAnnotated + text + suffixAnnotated

        val textWithPrefixSuffixMapping = object : OffsetMapping {
            override fun originalToTransformed(offset: Int): Int {
                return offset + prefixWithWhiteSpace.length
            }

            override fun transformedToOriginal(offset: Int): Int {
                if (offset > prefixWithWhiteSpace.length + text.length) return text.length
                if (offset < prefixWithWhiteSpace.length) return 0
                return offset - prefixWithWhiteSpace.length
            }
        }

        return TransformedText(result, textWithPrefixSuffixMapping)
    }
}
