package com.sdds.plugin.themebuilder.internal.token

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ColorTokensScheme(
    val category: Set<String>,
    val mode: Set<String>,
    val subcategories: Set<String>,
)

/**
 *
 * @author Малышев Александр on 05.03.2024
 */
interface GradientTokenValue : TokenValue {
    val colors: List<String>
    val locations: List<Float>
}

@Serializable
@SerialName("radial-gradient")
data class RadialGradientToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String
) : Token<RadialGradientToken.Value>() {

    @Serializable
    data class Value(
        override val colors: List<String>,
        override val locations: List<Float>,
        val radius: Float
    ) : GradientTokenValue
}

@Serializable
@SerialName("sweep-gradient")
data class SweepGradientToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String
) : Token<SweepGradientToken.Value>() {

    @Serializable
    data class Value(
        override val colors: List<String>,
        override val locations: List<Float>,
        val startAngle: Float,
        val endAngle: Float
    ) : GradientTokenValue
}

@Serializable
@SerialName("linear-gradient")
data class LinearGradientToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String
) : Token<LinearGradientToken.Value>() {

    @Serializable
    data class Value(
        override val colors: List<String>,
        override val locations: List<Float>,
        val angle: Float
    ) : GradientTokenValue
}

@Serializable
@SerialName("color")
data class ColorToken(
    override val displayName: String,
    override val name: String,
    override val platform: TokenPlatform,
    override val tags: Set<String>,
    override val value: Value?,
    override val enabled: Boolean,
    override val description: String
) : Token<ColorToken.Value>() {

    @Serializable
    data class Value(val origin: String) : TokenValue
}