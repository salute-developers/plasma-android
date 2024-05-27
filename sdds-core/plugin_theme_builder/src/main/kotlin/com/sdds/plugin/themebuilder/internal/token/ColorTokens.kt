package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized
import org.gradle.kotlin.dsl.provideDelegate
import java.util.Locale

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
internal data class ColorToken(
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
}

internal fun colorKtName(name: String): String {
    val nameTokens = name.split(".", "-")
    return nameTokens.subList(1, nameTokens.size)
        .joinToString("") { it.capitalized() }
}

/**
 * Название xml атрибута
 */
internal fun ColorToken.attrName() =
    name
        .removePrefix("dark.")
        .removePrefix("light.")
        .techToSnakeCase()
        .split('_')
        .joinToString(separator = "") { it.capitalized() }
        .decapitalize(Locale.getDefault())

/**
 * Предназначен ли токен для светлой темы
 */
internal val ColorToken.isLight: Boolean
    get() = name.startsWith("light")

/**
 * Предназначен ли токен для темной темы
 */
internal val ColorToken.isDark: Boolean
    get() = name.startsWith("dark")
