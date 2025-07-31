package com.sdds.compose.uikit

import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import kotlin.math.roundToInt

/**
 * Компонент Loader
 * Компонент, который используется для уведомления пользователей о том, что загрузка началась.
 * Может отображать бесконечный прогресс [Spinner] или конечный [CircularProgressBar].
 * @param modifier модификатор
 * @param style стиль компонента
 * @param spinnerStyle стиль [Spinner] (для удобства равен стилю из [style])
 * @param circularProgressStyle стиль [CircularProgressBar] (для удобства равен стилю из [style])
 * @param animationSpec спецификация для анимирования [Spinner]
 * @param progress значение прогресса от 0.0 до 1.0
 * @param value текст надписи
 * @param valueSuffix суффикс текста
 * @param trackEnabled включен ли трек
 * @param loaderType что отображается в данный момент [Spinner] или [CircularProgressBar]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Loader(
    modifier: Modifier = Modifier,
    style: LoaderStyle = LocalLoaderStyle.current,
    spinnerStyle: SpinnerStyle = style.spinnerStyle,
    circularProgressStyle: CircularProgressBarStyle = style.circularProgressStyle,
    animationSpec: InfiniteRepeatableSpec<Float> = DefaultSpinnerAnimationSpec,
    progress: Float,
    value: String = "${(progress * 100).roundToInt()}",
    valueSuffix: String = "%",
    trackEnabled: Boolean? = null,
    loaderType: LoaderType = LoaderType.Spinner,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val spinnerSize = spinnerStyle.dimensions.size
    val progressWidth = circularProgressStyle.dimensions.width
    val progressHeight = circularProgressStyle.dimensions.height

    Box(
        modifier = modifier
            .requiredHeight(maxOf(spinnerSize, progressHeight))
            .requiredWidth(maxOf(spinnerSize, progressWidth)),
    ) {
        when (loaderType) {
            LoaderType.Spinner -> Spinner(
                style = spinnerStyle,
                animationSpec = animationSpec,
                interactionSource = interactionSource,
            )

            else -> CircularProgressBar(
                progress = progress,
                style = circularProgressStyle,
                value = value,
                valueSuffix = valueSuffix,
                trackEnabled = trackEnabled,
                interactionSource = interactionSource,
            )
        }
    }
}

/**
 * Компонент Loader
 * Компонент, который используется для уведомления пользователей о том, что загрузка началась.
 * Может отображать бесконечный прогресс [Spinner] или конечный [CircularProgressBar].
 * @param modifier модификатор
 * @param style стиль компонента
 * @param spinnerStyle стиль [Spinner] (для удобства равен стилю из [style])
 * @param circularProgressStyle стиль [CircularProgressBar] (для удобства равен стилю из [style])
 * @param animationSpec спецификация для анимирования [Spinner]
 * @param progress значение прогресса от 0.0 до 1.0
 * @param valueContent центральный контент
 * @param trackEnabled включен ли трек
 * @param loaderType что отображается в данный момент [Spinner] или [CircularProgressBar]
 * @param interactionSource источник взаимодействий
 */
@Composable
fun Loader(
    modifier: Modifier = Modifier,
    style: LoaderStyle = LocalLoaderStyle.current,
    spinnerStyle: SpinnerStyle = style.spinnerStyle,
    circularProgressStyle: CircularProgressBarStyle = style.circularProgressStyle,
    animationSpec: InfiniteRepeatableSpec<Float> = DefaultSpinnerAnimationSpec,
    progress: Float,
    valueContent: (@Composable () -> Unit)?,
    trackEnabled: Boolean? = null,
    loaderType: LoaderType = LoaderType.Spinner,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val spinnerSize = spinnerStyle.dimensions.size
    val progressWidth = circularProgressStyle.dimensions.width
    val progressHeight = circularProgressStyle.dimensions.height

    Box(
        modifier = modifier
            .requiredHeight(maxOf(spinnerSize, progressHeight))
            .requiredWidth(maxOf(spinnerSize, progressWidth)),
    ) {
        when (loaderType) {
            LoaderType.Spinner -> Spinner(
                style = spinnerStyle,
                animationSpec = animationSpec,
                interactionSource = interactionSource,
            )

            else -> CircularProgressBar(
                progress = progress,
                style = circularProgressStyle,
                valueContent = valueContent,
                trackEnabled = trackEnabled,
                interactionSource = interactionSource,
            )
        }
    }
}

/**
 * Тип отображаемого прогресса.
 */
enum class LoaderType {

    /**
     * Конечный тип загрузки, используется [CircularProgressBar]
     */
    Progress,

    /**
     * Бесконечный тип загрузки, используется [Spinner]
     */
    Spinner,
}

private const val ANIMATION_DURATION = 1000
private val DefaultSpinnerAnimationSpec: InfiniteRepeatableSpec<Float> =
    infiniteRepeatable(
        animation = tween(
            durationMillis = ANIMATION_DURATION,
            easing = LinearEasing,
        ),
    )
