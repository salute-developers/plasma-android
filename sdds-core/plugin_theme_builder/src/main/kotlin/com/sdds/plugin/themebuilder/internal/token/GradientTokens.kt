package com.sdds.plugin.themebuilder.internal.token

import com.sdds.plugin.themebuilder.internal.utils.unsafeLazy
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonClassDiscriminator

/**
 * Токен градиента
 * @see Token
 */
@Serializable
@SerialName("gradient")
internal data class GradientToken(
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

internal val GradientToken.isTextGradient: Boolean
    get() = name.contains("text")

/**
 * Значение токена градиента
 * @author Малышев Александр on 05.03.2024
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
@JsonClassDiscriminator("kind")
internal sealed class GradientTokenValue : TokenValue

/**
 * Значение токена радиального градиента
 * @property colors цвета градиента
 * @property locations позиции цвета градиента
 * @property radius радиус [0, 1]
 * @property centerX координата X центра [0, 1]
 * @property centerY координата Y центра [0, 1]
 */
@Serializable
@SerialName("radial")
internal data class RadialGradientTokenValue(
    val colors: List<String> = FallbackColors,
    val locations: List<Float> = FallbackLocations,
    val radius: Float,
    val centerX: Float,
    val centerY: Float,
) : GradientTokenValue()

/**
 * Значение токена линейного градиента
 * @property colors цвета градиента
 * @property locations позиции цвета градиента
 * @property angle радиус [0, 1]
 * @property startPoint точка начала градиента
 * @property endPoint точка конца градиента
 */
@Serializable
@SerialName("linear")
internal data class LinearGradientTokenValue(
    val colors: List<String> = FallbackColors,
    val locations: List<Float> = FallbackLocations,
    val angle: Float,
    val startPoint: GradientPoint? = null,
    val endPoint: GradientPoint? = null,
) : GradientTokenValue()

/**
 * Точка описывающая начало или конец градиента
 */
@Serializable
internal data class GradientPoint(
    val x: Float,
    val y: Float,
)

/**
 * Значение токена градиента с одним цветом
 * @property background цвет фона
 */
@Serializable
@SerialName("color")
internal data class BackgroundGradientTokenValue(
    val background: String,
) : GradientTokenValue()

/**
 * Значение токена sweep градиента
 * @property colors цвета градиента
 * @property locations позиции цвета градиента
 * @property centerX координата X центра [0, 1]
 * @property centerY координата Y центра [0, 1]
 */
@Serializable
@SerialName("angular")
internal data class SweepGradientTokenValue(
    val colors: List<String> = FallbackColors,
    val locations: List<Float> = FallbackLocations,
    val centerX: Float,
    val centerY: Float,
) : GradientTokenValue()

private val FallbackLocations = listOf(0f, 1f)
private val FallbackColors = listOf("#fff", "#000")
