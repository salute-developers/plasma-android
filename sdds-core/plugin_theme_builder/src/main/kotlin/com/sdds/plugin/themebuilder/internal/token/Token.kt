package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.techToSnakeCase
import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import org.gradle.configurationcache.extensions.capitalized

/**
 * Токен
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
internal abstract class Token {
    /**
     * Название для отображения
     */
    abstract val displayName: String

    /**
     * Техническое название токена
     */
    abstract val name: String

    /**
     * Тэги для поиска
     */
    abstract val tags: Set<String>

    /**
     * Флаг доступности токена
     */
    abstract val enabled: Boolean

    /**
     * Описание токена
     */
    abstract val description: String

    /**
     * Название токена для xml-файлов
     */
    open val xmlName: String by unsafeLazy { getXmlName(name) }

    /**
     * Название токена для kt-файлов
     */
    open val ktName: String by unsafeLazy { getKtName(name) }

    companion object {

        fun getXmlName(techName: String): String {
            return techName.techToSnakeCase()
        }

        fun getKtName(techName: String): String {
            return techName.split(".", "-").joinToString("") { it.capitalized() }
        }
    }
}

@Serializable
internal object Unknown : Token() {
    override val displayName: String = ""
    override val name: String = ""
    override val tags: Set<String> = emptySet()
    override val enabled: Boolean = false
    override val description: String = ""
}

/**
 * Интерфейс-маркер для значения токена
 */
internal sealed interface TokenValue

/**
 * Целевая платформа токена
 */
@Serializable
enum class TokenPlatform {
    @SerialName("android")
    ANDROID,

    @SerialName("web")
    WEB,

    @SerialName("ios")
    IOS,

    ;

    companion object {

        /**
         * Возвращает [TokenPlatform] по значению [value]
         */
        fun fromString(value: String?): TokenPlatform? =
            when (value) {
                "android" -> ANDROID
                "ios" -> IOS
                "web" -> WEB
                else -> null
            }
    }
}

/**
 * Информация о сгенерированном токене
 * @param type тип токена
 * @param name техническое название токена
 * @param displayName название для отображения
 * @param description описание токена
 * @param reference название токена для файлов целефого фреймворка
 * @param themeReference ссылка на токен в теме
 * @param value значение токена
 */
@Serializable
internal data class GeneratedTokenInfo(
    val type: String,
    val name: String,
    val displayName: String,
    val description: String,
    val reference: String,
    val themeReference: String,
    val value: JsonElement,
)

internal fun TokenValue.toJson(): JsonElement =
    when (this) {
        is ColorTokenValue -> Json.encodeToJsonElement(ColorTokenValue.serializer(), this)
        is TypographyTokenValue -> Json.encodeToJsonElement(TypographyTokenValue.serializer(), this)
        is ShapeTokenValue -> Json.encodeToJsonElement(ShapeTokenValue.serializer(), this)
        is ShadowTokenValue -> Json.encodeToJsonElement(ShadowTokenValue.serializer(), this)
        is SpacingTokenValue -> Json.encodeToJsonElement(SpacingTokenValue.serializer(), this)
        is GradientTokenValue -> Json.encodeToJsonElement(GradientTokenValue.serializer(), this)
        is FontTokenValue -> Json.encodeToJsonElement(FontTokenValue.serializer(), this)
    }
