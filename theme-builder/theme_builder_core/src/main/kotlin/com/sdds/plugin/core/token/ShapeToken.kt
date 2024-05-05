package com.sdds.plugin.core.token

import com.sdds.plugin.core.utils.unsafeLazy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator
import org.gradle.configurationcache.extensions.capitalized

/**
 * Токен формы
 * @see Token
 */
@Serializable
@SerialName("shape")
data class ShapeToken(
    override val displayName: String,
    override val name: String,
    override val tags: Set<String>,
    override val enabled: Boolean,
    override val description: String,
) : Token() {

    /**
     * @see Token.xmlName
     */
    override val xmlName: String by unsafeLazy {
        val nameTokens = name.split(".")
        val nameTokensExcludeScreen = nameTokens.subList(1, nameTokens.size)
        nameTokensExcludeScreen.joinToString("") { it.capitalized() }
    }
}

/**
 * Значение токена формы
 * @author Малышев Александр on 15.03.2024
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
@JsonClassDiscriminator("kind")
sealed class ShapeTokenValue : TokenValue

/**
 * Значение токена round-shape
 * @property cornerRadius радиус скругления углов формы
 */
@Serializable
@SerialName("round")
data class RoundedShapeTokenValue(
    val cornerRadius: Float,
) : ShapeTokenValue()
