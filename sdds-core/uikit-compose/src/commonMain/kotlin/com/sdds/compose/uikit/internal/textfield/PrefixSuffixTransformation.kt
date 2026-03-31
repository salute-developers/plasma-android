package com.sdds.compose.uikit.internal.textfield

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
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
    transparent: Boolean = false,
) : VisualTransformation {

    private val prefixWithWhiteSpace = if (prefix.isNotEmpty()) "$prefix " else ""
    private val suffixWithWhiteSpace = if (suffix.isNotEmpty()) " $suffix" else ""

    private val prefixSpanStyle = if (transparent) {
        prefixTextStyle.copy(color = Color.Transparent)
    } else {
        prefixTextStyle
    }.toSpanStyle()

    private val suffixSpanStyle = if (transparent) {
        suffixTextStyle.copy(color = Color.Transparent)
    } else {
        suffixTextStyle
    }.toSpanStyle()

    private val prefixAnnotated = AnnotatedString(
        text = prefixWithWhiteSpace,
        spanStyle = prefixSpanStyle,
    )

    private val suffixAnnotated = AnnotatedString(
        text = suffixWithWhiteSpace,
        spanStyle = suffixSpanStyle,
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

internal fun prefixSuffixTransformation(
    prefix: String? = null,
    suffix: String? = null,
    prefixTextStyle: TextStyle = TextStyle(),
    suffixTextStyle: TextStyle = TextStyle(),
    transparent: Boolean = false,
): VisualTransformation = if (prefix.isNullOrEmpty() && suffix.isNullOrEmpty()) {
    VisualTransformation.None
} else {
    PrefixSuffixTransformation(
        prefix = prefix.orEmpty(),
        suffix = suffix.orEmpty(),
        prefixTextStyle = prefixTextStyle,
        suffixTextStyle = suffixTextStyle,
        transparent = transparent,
    )
}

@Composable
internal fun rememberPrefixSuffixTransformation(
    prefix: String? = null,
    suffix: String? = null,
    prefixTextStyle: TextStyle = TextStyle(),
    suffixTextStyle: TextStyle = TextStyle(),
    transparent: Boolean = false,
): VisualTransformation {
    return remember(
        prefix,
        suffix,
        prefixTextStyle,
        suffixTextStyle,
        transparent,
    ) {
        prefixSuffixTransformation(
            prefix = prefix,
            suffix = suffix,
            prefixTextStyle = prefixTextStyle,
            suffixTextStyle = suffixTextStyle,
            transparent = transparent,
        )
    }
}
