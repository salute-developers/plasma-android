package com.sdds.plugin.core.token

import com.sdds.plugin.core.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized

/**
 * Контракт токенов цвета
 * @property category категория цвета
 * @property mode режим темы {dark, light}
 * @property subcategories подкатегории
 */
@Serializable
internal data class ColorTokensScheme(
    val category: Set<String>,
    val mode: Set<String>,
    val subcategories: Set<String>,
)

/**
 * Токен цвета
 * @see Token
 */
@Serializable
@SerialName("color")
data class ColorToken(
    override val displayName: String,
    override val name: String,
    override val tags: Set<String>,
    override val enabled: Boolean,
    override val description: String,
) : Token() {

    /**
     * @see Token.ktName
     */
    override val ktName: String by unsafeLazy {
        colorKtName(name)
    }

    /**
     * Значение токена цвета
     * @property origin значение цвета
     */
    @Serializable
    internal data class Value(val origin: String) : TokenValue
}

internal fun colorKtName(name: String): String {
    val nameTokens = name.split(".", "-")
    return nameTokens.subList(1, nameTokens.size)
        .joinToString("") { it.capitalized() }
}

/**
 * Предназначен ли токен для светлой темы
 */
val ColorToken.isLight: Boolean
    get() = name.startsWith("light")

/**
 * Предназначен ли токен для темной темы
 */
val ColorToken.isDark: Boolean
    get() = name.startsWith("dark")
