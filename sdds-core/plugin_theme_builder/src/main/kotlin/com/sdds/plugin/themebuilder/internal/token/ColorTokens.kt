package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
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
 * Интерфейс значения градиента
 * @author Малышев Александр on 05.03.2024
 */
internal interface GradientTokenValue : TokenValue {

    /**
     * Цвета градиента
     */
    val colors: List<String>

    /**
     * Позиции цветов градиента
     */
    val locations: List<Float>
}

/**
 * Токен радиального градиента
 * @see Token
 */
@Serializable
@SerialName("radial-gradient")
internal data class RadialGradientToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<RadialGradientToken.Value>() {

    /**
     * @see Token.ktName
     */
    override val ktName: String by unsafeLazy {
        colorKtName(name)
    }

    /**
     * Значение токена радиального градиента
     * @property colors цвета градиента
     * @property locations позиции цвета градиента
     * @property radius радиус [0, 1]
     * @property centerX координата X центра [0, 1]
     * @property centerY координата Y центра [0, 1]
     */
    @Serializable
    internal data class Value(
        override val colors: List<String>,
        override val locations: List<Float>,
        val radius: Float,
        val centerX: Float,
        val centerY: Float,
    ) : GradientTokenValue
}

/**
 * Токен sweep градиента
 * @see Token
 */
@Serializable
@SerialName("sweep-gradient")
internal data class SweepGradientToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<SweepGradientToken.Value>() {

    /**
     * @see Token.ktName
     */
    override val ktName: String by unsafeLazy {
        colorKtName(name)
    }

    /**
     * Значение токена swepp градиента
     * @property colors цвета градиента
     * @property locations позиции цвета градиента
     * @property startAngle угол начала градиента в градусах
     * @property endAngle угол окончания градиента в градусах
     * @property centerX координата X центра [0, 1]
     * @property centerY координата Y центра [0, 1]
     */
    @Serializable
    internal data class Value(
        override val colors: List<String>,
        override val locations: List<Float>,
        val startAngle: Float,
        val endAngle: Float,
        val centerX: Float,
        val centerY: Float,
    ) : GradientTokenValue
}

/**
 * Токен линейного градиента
 * @see Token
 */
@Serializable
@SerialName("linear-gradient")
internal data class LinearGradientToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<LinearGradientToken.Value>() {

    /**
     * @see Token.ktName
     */
    override val ktName: String by unsafeLazy {
        colorKtName(name)
    }

    /**
     * Значение токена линейного градиента
     * @property colors цвета градиента
     * @property locations позиции цвета градиента
     * @property angle угол градиента в градусах
     */
    @Serializable
    internal data class Value(
        override val colors: List<String>,
        override val locations: List<Float>,
        val angle: Float,
    ) : GradientTokenValue
}

/**
 * Токен цвета
 * @see Token
 */
@Serializable
@SerialName("color")
internal data class ColorToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<ColorToken.Value>() {

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

private fun colorKtName(name: String): String {
    val nameTokens = name.split(".", "-")
    return nameTokens.subList(1, nameTokens.size)
        .joinToString("") { it.capitalized() }
}
