package com.sdds.plugin.core.token

import com.sdds.plugin.core.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Токен шрифта
 * @see Token
 */
@Serializable
@SerialName("fontFamily")
data class FontToken(
    override val displayName: String,
    override val name: String,
    override val tags: Set<String>,
    override val enabled: Boolean,
    override val description: String,
) : Token() {

    override val xmlName: String by unsafeLazy {
        name.split('.').last()
    }

    override val ktName: String by unsafeLazy {
        name.split('.').last()
    }

    /**
     * Параметры шрифта
     * @param link ссылка для скачивания
     * @param fontWeight вес шрифта
     * @param fontStyle стиль шрифта (italic, normal)
     */
    @Serializable
    data class FontVariant(
        val link: String,
        val fontWeight: Int,
        val fontStyle: String,
    )
}

/**
 * Значение токена шрифта
 * @param name семейство шрифтов
 * @param fonts список шрифтов, принадлежащих семейству [name]
 * @see TokenValue
 */
@Serializable
data class FontTokenValue(
    val name: String,
    val fonts: List<FontToken.FontVariant>,
) : TokenValue
