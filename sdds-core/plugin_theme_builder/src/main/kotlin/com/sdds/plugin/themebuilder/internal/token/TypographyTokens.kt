package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized

/**
 * Контракт токенов типографии
 * @property sizes размеры
 * @property types типы
 * @property breakpoints брейкпоинты
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
internal data class TypographyTokensScheme(
    val sizes: List<String>,
    val types: List<String>,
    val breakpoints: List<String>,
)

/**
 * Токен типографии
 * @see Token
 */
@Serializable
@SerialName("typography")
internal data class TypographyToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<TypographyToken.Value>() {

    /**
     * @see Token.xmlName
     */
    override val xmlName: String by unsafeLazy {
        val nameTokens = name.split(".")
        val nameTokensExcludeScreen = nameTokens.subList(1, nameTokens.size)
        nameTokensExcludeScreen.joinToString("") { it.capitalized() }
    }

    /**
     * @see Token.ktName
     */
    override val ktName: String by unsafeLazy { xmlName }

    /**
     * Класс размера экрана
     * @see ScreenClass
     */
    val screenClass: ScreenClass by unsafeLazy {
        when (name.split(".").first()) {
            "screen-s" -> ScreenClass.SMALL
            "screen-m" -> ScreenClass.MEDIUM
            "screen-l" -> ScreenClass.LARGE
            else -> ScreenClass.UNKNOWN
        }
    }

    /**
     * Значение токена типографии
     * @property fontFamily семейство шрифтов
     * @property fontWeight вес шрифта
     * @property fontStyle стиль шрифта
     * @property textSize размер текста
     * @property letterSpacing расстояние между буквами
     * @property lineHeight высота линии
     */
    @Serializable
    internal data class Value(
        val fontFamily: String,
        val fontWeight: Int,
        val fontStyle: String,
        val textSize: Float,
        val letterSpacing: Float,
        val lineHeight: Float,
    ) : TokenValue

    /**
     * Класс размера экрана
     * @property value строковое значение
     */
    internal enum class ScreenClass(val value: String) {
        SMALL("screen-s"),
        MEDIUM("screen-m"),
        LARGE("screen-l"),
        UNKNOWN(""),
        ;

        /**
         * Класс размера по-умолчанию
         */
        val isDefault: Boolean get() = this == UNKNOWN || this == MEDIUM
    }
}
