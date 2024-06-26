package com.sdds.plugin.themebuilder.internal.utils

import com.sdds.plugin.themebuilder.internal.exceptions.ThemeBuilderException
import com.sdds.plugin.themebuilder.internal.validator.ColorTokenValidator
import com.sdds.plugin.themebuilder.internal.validator.ColorTokenValidator.colorPaletteRegex
import java.util.Locale

/**
 * Утилита для преобразования цвета в argb формат.
 */
internal object ColorResolver {

    /**
     * Переводит цвет из формата rgba или ссылки на палитру в argb hex значение.
     * Включает в себя валидацию значения цвета.
     *
     * @param tokenValue входное значение цвета
     * @param palette палитра цветов
     * @param hexFormat выходной hex-формат
     *
     * @return Вернет строку в формате argb или null в случае неудачи.
     */
    internal fun resolveColor(
        tokenValue: String,
        tokenName: String,
        palette: Map<String, Map<String, String>>,
        hexFormat: HexFormat,
    ): String {
        ColorTokenValidator.validate(tokenValue, tokenName)
        val isPaletteRef = tokenValue.startsWith('[')
        return if (isPaletteRef) {
            val paletteResult = getPaletteReferenceResult(tokenValue)
            val paletteColor = palette[paletteResult.color]?.get(paletteResult.tone)
                ?: throw ThemeBuilderException(
                    "Can't find color ${paletteResult.color} " +
                        "with tone ${paletteResult.tone} in color palette.",
                )
            paletteColor
                .also { ColorTokenValidator.validate(it, tokenName) }
                .applyAlpha(floatAlpha = paletteResult.alpha, hexFormat = hexFormat)
        } else {
            rgbaToArgbHex(tokenValue, hexFormat)
        }
    }

    /**
     * Формат hex значения цвета.
     */
    internal enum class HexFormat(val hexPrefix: String) {
        XML_HEX("#"),
        INT_HEX("0x"),
    }

    /**
     * Парсит ссылку [paletteReference] на палитру с помощью регулярного выражения
     * и возвращает [PaletteExpressionResult]
     */
    @Suppress("ThrowsCount")
    private fun getPaletteReferenceResult(paletteReference: String): PaletteExpressionResult {
        val groups = colorPaletteRegex.matchEntire(paletteReference)?.groups
        if (groups.isNullOrEmpty()) {
            throw ThemeBuilderException(
                "Color palette reference parsing failed: $paletteReference. Groups is empty.",
            )
        }

        val color: String
        val tone: String
        if (groups.size >= 2) {
            color = groups[1]?.value
                ?: throw ThemeBuilderException("Color palette reference parsing failed: $paletteReference")
            tone = groups[2]?.value
                ?: throw ThemeBuilderException("Color palette reference parsing failed: $paletteReference")
        } else {
            throw ThemeBuilderException("Color palette reference parsing failed: $paletteReference")
        }
        val alpha = if (groups.size >= 4) {
            groups[4]?.value
        } else {
            null
        }

        return PaletteExpressionResult(
            color = color,
            tone = tone,
            alpha = alpha,
        )
    }

    /**
     * Добавляет альфу [floatAlpha] к исходному цвету в hex-формате.
     */
    private fun String.applyAlpha(floatAlpha: String?, hexFormat: HexFormat): String {
        return floatAlpha?.let {
            rgbaToArgbHex(
                hexString = this,
                hexFormat = hexFormat,
                forceAlpha = floatAlpha.toHexAlpha(),
            )
        } ?: rgbaToArgbHex(this, hexFormat)
    }

    /**
     * Преобразует строку с float числом альфы в диапазоне 0f..1f в строку,
     * содержащую hex в диапазоне 0..255.
     */
    private fun String.toHexAlpha(): String {
        return (0xFF * this.toFloat())
            .toInt()
            .toString(16)
            .appendLeadingZeroIfNeed()
            .toUpperCase(Locale.getDefault())
    }

    private fun String.appendLeadingZeroIfNeed() = if (this.length == 1) "0$this" else this

    /**
     * Преобразует строку цвета из формата RGBA или RGB в формат ARGB
     *
     * @param hexString исходная строка в формате RGBA или RGB
     * @param hexFormat см.[HexFormat]
     * @param forceAlpha значение альфы. Будет использовано в качестве альфы, даже если в исходной строке уже есть альфа.
     * Если [forceAlpha]=null, то при добавлении отсутствующей альфы будет использовано значение по умолчанию FF,
     * а при наличии альфы в исходной строке будет использовано исходное значение.
     */
    private fun rgbaToArgbHex(
        hexString: String,
        hexFormat: HexFormat,
        forceAlpha: String? = null,
    ): String {
        val alpha = forceAlpha ?: "FF"
        if (hexString.length == RGB_STR_LENGTH) {
            return when (hexFormat) {
                HexFormat.XML_HEX -> hexString.replace("#", "#$alpha")
                HexFormat.INT_HEX -> hexString.replace("#", "0x$alpha")
            }
        }
        if (hexString.length == RGB_STR_LENGTH_SHORT) {
            return buildString {
                append(hexFormat.hexPrefix)
                append(alpha)
                append("${hexString[1]}${hexString[1]}")
                append("${hexString[2]}${hexString[2]}")
                append("${hexString[3]}${hexString[3]}")
            }
        }

        return buildString {
            append(hexFormat.hexPrefix)
            forceAlpha?.let { append(alpha) }
                ?: append(hexString.subSequence(RGBA_ALPHA_INDEX_START, RGBA_STR_LENGTH))
            append(hexString.subSequence(1, RGBA_ALPHA_INDEX_START))
        }
    }

    /**
     * Модель результата парсинга ссылки на цветовую палитру
     */
    private data class PaletteExpressionResult(
        val color: String,
        val tone: String,
        val alpha: String?,
    )

    private const val RGBA_STR_LENGTH = 9
    private const val RGB_STR_LENGTH = 7
    private const val RGB_STR_LENGTH_SHORT = 4
    private const val RGBA_ALPHA_INDEX_START = 7
}
