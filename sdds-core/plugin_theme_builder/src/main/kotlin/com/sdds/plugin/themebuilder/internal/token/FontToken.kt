package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Токен шрифта
 * @see Token
 */
@Serializable
@SerialName("font-family")
internal data class FontToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<FontToken.Value>() {

    override val xmlName: String by unsafeLazy {
        name.split('.').last()
    }

    override val ktName: String by unsafeLazy {
        name.split('.').last()
    }

    /**
     * Значение токена шрифта
     * @param fontFamily семейство шрифтов
     * @param variants список шрифтов, принадлежащих семейству [fontFamily]
     * @see TokenValue
     */
    @Serializable
    internal data class Value(
        val fontFamily: String,
        val variants: List<FontVariant>,
    ) : TokenValue

    /**
     * Параметры шрифта
     * @param link ссылка для скачивания
     * @param fontWeight вес шрифта
     * @param fontStyle стиль шрифта (italic, normal)
     */
    @Serializable
    internal data class FontVariant(
        val link: String,
        val fontWeight: Int,
        val fontStyle: String,
    )
}
