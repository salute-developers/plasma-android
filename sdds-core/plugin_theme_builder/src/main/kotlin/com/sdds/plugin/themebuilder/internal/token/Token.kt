package com.sdds.plugin.themebuilder.internal.token

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 *
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
abstract class Token<out Value : TokenValue> {
    abstract val displayName: String
    abstract val name: String
    abstract val platform: TokenPlatform
    abstract val tags: Set<String>
    abstract val value: Value?
    abstract val enabled: Boolean
    abstract val description: String

    open val xmlName: String by lazy {
        name.toSnakeCase()
    }
}

fun String.toSnakeCase(): String {
    return replace("[.-]+".toRegex(), "_")
}

interface TokenValue

@Serializable
enum class TokenPlatform {
    @SerialName("android")
    ANDROID,
    @SerialName("web")
    WEB,
    @SerialName("ios")
    IOS;

    companion object {

        fun fromString(value: String?): TokenPlatform? =
            when (value) {
                "android" -> ANDROID
                "ios" -> IOS
                "web" -> WEB
                else -> null
            }
    }
}
