package com.sdds.plugin.core.token

import com.sdds.plugin.core.utils.unsafeLazy
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
data class GradientToken(
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

/**
 * Значение токена градиента
 * @author Малышев Александр on 05.03.2024
 */
@OptIn(ExperimentalSerializationApi::class)
@Serializable
@JsonClassDiscriminator("kind")
sealed class GradientTokenValue : TokenValue

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
data class RadialGradientTokenValue(
    val colors: List<String>,
    val locations: List<Float>,
    val radius: Float,
    val centerX: Float,
    val centerY: Float,
) : GradientTokenValue()

/**
 * Значение токена линейного градиента
 * @property colors цвета градиента
 * @property locations позиции цвета градиента
 * @property angle радиус [0, 1]
 */
@Serializable
@SerialName("linear")
data class LinearGradientTokenValue(
    val colors: List<String>,
    val locations: List<Float>,
    val angle: Float,
) : GradientTokenValue()

/**
 * Значение токена градиента с одним цветом
 * @property background цвет фона
 */
@Serializable
@SerialName("color")
data class BackgroundGradientTokenValue(
    val background: String,
) : GradientTokenValue()

/**
 * Значение токена sweep градиента
 * @property colors цвета градиента
 * @property locations позиции цвета градиента
 * @property startAngle угол начала градиента в градусах
 * @property endAngle угол окончания градиента в градусах
 * @property centerX координата X центра [0, 1]
 * @property centerY координата Y центра [0, 1]
 */
@Serializable
@SerialName("angular")
data class SweepGradientTokenValue(
    val colors: List<String>,
    val locations: List<Float>,
    val startAngle: Float,
    val endAngle: Float,
    val centerX: Float,
    val centerY: Float,
) : GradientTokenValue()
