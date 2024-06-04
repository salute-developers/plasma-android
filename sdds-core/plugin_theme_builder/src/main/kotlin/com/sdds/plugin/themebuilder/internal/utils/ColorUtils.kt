package com.sdds.plugin.themebuilder.internal.utils

private const val RGBA_STR_LENGTH = 9
private const val RGB_STR_LENGTH = 7
private const val RGBA_ALPHA_INDEX_START = 7

/**
 * Переводит цвет из формата rgba или ссылки на палитру в argb hex значение
 *
 * @param tokenValue входное значение цвета
 * @param palette палитра цветов
 * @param hexFormat выходной hex-формат
 *
 * @return Вернет строку в формате argb или null в случае неудачи.
 */
internal fun resolveColor(
    tokenValue: String,
    palette: Map<String, Map<String, String>>,
    hexFormat: HexFormat,
): String? {
    val isPaletteRef = tokenValue.startsWith('[') && tokenValue.endsWith(']')
    val rgbaHex = if (isPaletteRef) {
        val paletteTokens = tokenValue
            .removePrefix("[")
            .removeSuffix("]")
            .split('.')
        val (color, tone) = paletteTokens
            .subList(1, paletteTokens.size)
        palette[color]?.get(tone)
    } else {
        tokenValue
    }
    return rgbaHex?.let { colorToArgbHex(it, hexFormat) }
}

/**
 * Формат hex значения цвета.
 */
internal enum class HexFormat(val hexPrefix: String) {
    XML_HEX("#"),
    INT_HEX("0x"),
}

/**
 * Преобразует строку цвета [rgba] вида #FFFFFFE5 в строку вида #E5FFFFFF или 0xE5FFFFFF
 * в зависимости от [hexFormat].
 * Также изменяет порядковый номер альфа-канала или добавляет его, если он отсутствует
 * в исходной строке. Т.е. RGBA -> ARGB или RGB -> ARGB
 */
private fun colorToArgbHex(rgba: String, hexFormat: HexFormat): String {
    if (rgba.length == RGB_STR_LENGTH) {
        return when (hexFormat) {
            HexFormat.XML_HEX -> rgba.replace("#", "#FF")
            HexFormat.INT_HEX -> rgba.replace("#", "0xFF")
        }
    }
    if (rgba.length != RGBA_STR_LENGTH) {
        return when (hexFormat) {
            HexFormat.XML_HEX -> rgba
            HexFormat.INT_HEX -> rgba.replace("#", "0x")
        }
    }

    return buildString {
        append(hexFormat.hexPrefix)
        append(rgba.subSequence(RGBA_ALPHA_INDEX_START, RGBA_STR_LENGTH))
        append(rgba.subSequence(1, RGBA_ALPHA_INDEX_START))
    }
}
