package com.sdds.uikit.internal.textfield.mask

import android.icu.number.LocalizedNumberFormatter
import android.icu.number.NumberFormatter
import android.icu.number.Precision
import android.icu.text.DecimalFormat
import android.icu.text.DecimalFormatSymbols
import android.os.Build
import android.text.TextWatcher
import android.widget.EditText
import androidx.annotation.RequiresApi
import com.redmadrobot.inputmask.MaskedTextChangedListener
import com.redmadrobot.inputmask.helper.AffinityCalculationStrategy
import com.redmadrobot.inputmask.helper.Mask
import com.redmadrobot.inputmask.model.CaretString
import com.redmadrobot.inputmask.model.Notation
import com.sdds.uikit.internal.base.unsafeLazy
import java.math.BigDecimal
import java.util.Locale

internal class NumberInputListener(
    primaryFormat: String,
    affineFormats: List<String> = emptyList(),
    customNotations: List<Notation> = emptyList(),
    affinityCalculationStrategy: AffinityCalculationStrategy = AffinityCalculationStrategy.WHOLE_STRING,
    autocomplete: Boolean = true,
    autoskip: Boolean = false,
    private val field: EditText,
    listener: TextWatcher? = null,
    private val userValueListener: ValueListener? = null,
    rightToLeft: Boolean = false,
    private val groupingSeparator: Char = ' ',
    private val decimalSeparator: Char = ',',
    private val decimalCountRange: IntRange = IntRange(2, 2),
) : MaskedTextChangedListener(
    primaryFormat,
    affineFormats,
    customNotations,
    affinityCalculationStrategy,
    autocomplete,
    autoskip,
    field,
    listener,
    null,
    rightToLeft,
) {

    private val formatter: NumberFormatterDelegate = getFormatter(
        locale = field.textLocale,
        groupingSeparator = groupingSeparator,
        decimalCount = decimalCountRange,
        decimalSeparator = decimalSeparator,
    )

    private val _valueListenerWrapper by unsafeLazy {
        object : ValueListener {
            override fun onTextChanged(
                maskFilled: Boolean,
                extractedValue: String,
                formattedValue: String,
                tailPlaceholder: String,
            ) {
                userValueListener?.onTextChanged(
                    maskFilled,
                    extractedValue,
                    formattedValue,
                    modifyPlaceholder(formattedValue, tailPlaceholder),
                )
            }
        }
    }

    init {
        if (userValueListener != null) {
            this.valueListener = _valueListenerWrapper
        }
    }

    private fun modifyPlaceholder(
        formattedValue: String,
        tailPlaceholder: String,
    ): String {
        val current = formattedValue + tailPlaceholder
        val sanitised = extractNumberAndDecimalSeparator(current)
        val remaining = (decimalCountRange.min() - sanitised.decPart.length).coerceAtLeast(0)
        return when {
            remaining == 0 -> tailPlaceholder
            formattedValue.isEmpty() -> placeholder()
            else -> "$decimalSeparator" + "0".repeat(remaining)
        }
    }

    override fun placeholder(): String {
        val input = "0,"
        val mask = pickMask(
            CaretString(input, input.length, CaretString.CaretGravity.FORWARD(autocomplete)),
        )
        return mask.placeholder()
    }

    override fun pickMask(text: CaretString): Mask {
        val sanitisedNumberString = extractNumberAndDecimalSeparator(text.string)

        val intNumber = try {
            BigDecimal(sanitisedNumberString.intPart.ifEmpty { "0" })
        } catch (e: NumberFormatException) {
            BigDecimal.ZERO
        }
        val intMaskFormat = formatter.format(intNumber)

        val intZero = sanitisedNumberString.intPart.all { it == '0' }
        val notationChar = assignNonZeroNumberNotation()

        var maskFormat = ""
        var first = true
        val hasDecimalInput = text.string.any { it == '.' || it == ',' || it == decimalSeparator }
        var reachedDecimal = false
        intMaskFormat.forEach { c: Char ->
            if (reachedDecimal) return@forEach
            when {
                c.isDigit() -> {
                    if (first && !intZero) {
                        maskFormat += "[$notationChar]"
                        first = false
                    } else {
                        maskFormat += "[0]"
                    }
                }

                c == groupingSeparator -> {
                    maskFormat += "{$c}"
                }

                c == decimalSeparator -> {
                    reachedDecimal = true
                }

                else -> Unit
            }
        }

        if (hasDecimalInput && !decimalCountRange.isEmpty()) {
            maskFormat += "{${sanitisedNumberString.expectedDecimalSeparator}}"
            val decimals = sanitisedNumberString.decPart.length.coerceIn(decimalCountRange)
            repeat(decimals) {
                maskFormat += "[0]"
            }
        }

        affineFormats = listOf(maskFormat)
        return super.pickMask(text)
    }

    private data class SanitisedNumberString(
        val intPart: String,
        val decPart: String,
        val expectedDecimalSeparator: Char,
        val numberOfOccurrencesOfDecimalSeparator: Int,
    )

    private fun extractNumberAndDecimalSeparator(text: String): SanitisedNumberString {
        var digitsAndDecimalSeparators = text.filter { c: Char ->
            c.isDigit() || c == decimalSeparator
        }

        val numberOfOccurrencesOfDecimalSeparator = digitsAndDecimalSeparators
            .count { c: Char -> c == decimalSeparator }
        if (numberOfOccurrencesOfDecimalSeparator > 1) {
            var numberOfReplacements = numberOfOccurrencesOfDecimalSeparator - 1
            digitsAndDecimalSeparators = digitsAndDecimalSeparators.reversed().filter { c: Char ->
                if (!c.isDigit() && numberOfReplacements > 0) {
                    numberOfReplacements -= 1
                    return@filter false
                }
                true
            }.reversed()
        }

        val components = digitsAndDecimalSeparators.split(decimalSeparator)

        var intStr: String
        var decStr = ""

        if (components.size > 1) {
            intStr = components.first()
            decStr = components.last()
        } else {
            intStr = components.first()
        }

        intStr = intStr.ifEmpty { "0" }

        return SanitisedNumberString(
            intStr,
            decStr,
            decimalSeparator,
            numberOfOccurrencesOfDecimalSeparator,
        )
    }

    private fun assignNonZeroNumberNotation(): Char {
        val character = '1'
        customNotations = listOf(
            Notation(
                character,
                "123456789",
                false,
            ),
        )
        return character
    }

    companion object {

        fun installOn(
            primaryFormat: String,
            editText: EditText,
            groupingSeparator: Char,
            decimalSeparator: Char,
            decimalCount: IntRange,
            autocomplete: Boolean = true,
            autoskip: Boolean = false,
            listener: TextWatcher? = null,
            valueListener: ValueListener? = null,
        ): NumberInputListener {
            val maskedListener = NumberInputListener(
                primaryFormat = primaryFormat,
                autocomplete = autocomplete,
                autoskip = autoskip,
                field = editText,
                listener = listener,
                userValueListener = valueListener,
                groupingSeparator = groupingSeparator,
                decimalSeparator = decimalSeparator,
                decimalCountRange = decimalCount,
            )
            editText.addTextChangedListener(maskedListener)
            editText.onFocusChangeListener = maskedListener
            return maskedListener
        }

        private fun getFormatter(
            locale: Locale,
            decimalCount: IntRange,
            groupingSeparator: Char,
            decimalSeparator: Char,
        ): NumberFormatterDelegate {
            val symbols = DecimalFormatSymbols(locale).apply {
                this.groupingSeparator = groupingSeparator
                this.decimalSeparator = decimalSeparator
            }
            return if (Build.VERSION.SDK_INT >= 30) {
                Api30Formatter(
                    NumberFormatter.with()
                        .symbols(symbols)
                        .grouping(NumberFormatter.GroupingStrategy.THOUSANDS)
                        .precision(Precision.minMaxFraction(decimalCount.min(), decimalCount.max()))
                        .locale(locale),
                )
            } else {
                FallbackFormatter(
                    DecimalFormat("#,##0.##", symbols).apply {
                        minimumFractionDigits = decimalCount.min()
                        maximumFractionDigits = decimalCount.max()
                    },
                )
            }
        }
    }
}

private interface NumberFormatterDelegate {

    fun format(value: Number): String
}

@RequiresApi(Build.VERSION_CODES.R)
private class Api30Formatter(private val formatter: LocalizedNumberFormatter) : NumberFormatterDelegate {

    override fun format(value: Number): String {
        return formatter.format(value).toString()
    }
}

private class FallbackFormatter(private val decimalFormat: DecimalFormat) : NumberFormatterDelegate {

    override fun format(value: Number): String {
        return decimalFormat.format(value)
    }
}
