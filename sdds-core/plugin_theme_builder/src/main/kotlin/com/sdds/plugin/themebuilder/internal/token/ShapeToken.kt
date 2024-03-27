package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.gradle.configurationcache.extensions.capitalized

/**
 * Значение токена формы
 * @author Малышев Александр on 15.03.2024
 */
internal interface ShapeTokenValue : TokenValue {

    /**
     * Радиус скругления углов
     */
    val cornerRadius: Float
}

/**
 * Токен формы
 * @see Token
 */
@Serializable
@SerialName("round-shape")
internal data class RoundedShapeToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String,
) : Token<RoundedShapeToken.Value>() {

    /**
     * @see Token.xmlName
     */
    override val xmlName: String by unsafeLazy {
        val nameTokens = name.split(".")
        val nameTokensExcludeScreen = nameTokens.subList(1, nameTokens.size)
        nameTokensExcludeScreen.joinToString("") { it.capitalized() }
    }

    /**
     * Значение токена round-shape
     * @property cornerRadius радиус скругления углов формы
     */
    @Serializable
    data class Value(
        override val cornerRadius: Float,
    ) : ShapeTokenValue
}
