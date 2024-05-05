package com.sdds.plugin.core.token

import com.sdds.plugin.core.utils.techToSnakeCase
import com.sdds.plugin.core.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized

/**
 * Токен
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
abstract class Token {
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
    open val xmlName: String by unsafeLazy {
        name.techToSnakeCase()
    }

    /**
     * Название токена для kt-файлов
     */
    open val ktName: String by unsafeLazy {
        name.split(".", "-").joinToString("") { it.capitalized() }
    }
}

/**
 * Интерфейс-маркер для значения токена
 */
internal interface TokenValue

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
