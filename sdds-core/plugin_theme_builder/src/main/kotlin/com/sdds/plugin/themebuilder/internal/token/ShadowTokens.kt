package com.sdds.plugin.themebuilder.internal.token

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized

/**
 * Контракт токенов теней
 * @property directions направления теней
 * @property types типы теней
 * @property sizes размеры теней
 * @author Малышев Александр on 05.03.2024
 */
@Serializable
internal data class ShadowTokensScheme(
    val directions: Set<String>,
    val types: Set<String>,
    val sizes: Set<String>,
)

/**
 * Токен теней
 * @see Token
 */
@Serializable
@SerialName("shadow")
internal data class ShadowToken(
    override val displayName: String,
    override val name: String,
    override val tags: Set<String>,
    override val enabled: Boolean,
    override val description: String,
) : Token() {

    companion object {

        fun getAttrName(tokenName: String): String =
            "shadow${tokenName.split(".").joinToString(separator = "") { it.capitalized() }}"
    }
}

/**
 * Значение токена тени
 * @property color цвет тени
 * @property offsetX смещение тени по оси X
 * @property offsetY смещение тени по оси Y
 * @property spreadRadius радиус распространения тени
 * @property blurRadius радиус сглаживания границ тени
 */
@Serializable
internal data class ShadowTokenValue(
    val color: String,
    val offsetX: Float,
    val offsetY: Float,
    val spreadRadius: Float,
    val blurRadius: Float,
) : TokenValue
