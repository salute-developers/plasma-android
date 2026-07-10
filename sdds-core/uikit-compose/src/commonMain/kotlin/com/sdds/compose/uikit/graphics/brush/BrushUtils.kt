package com.sdds.compose.uikit.graphics.brush

import androidx.compose.animation.core.AnimationVector4D
import androidx.compose.animation.core.TwoWayConverter
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.colorspace.ColorSpace
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.interactions.transform

/**
 * Преобразует [Color] в [Brush].
 */
fun Color.asBrush(): Brush = SolidColor(this)

/**
 * Преобразует [Color] в шейдерную кисть.
 */
fun Color.asShaderBrush(): Brush = Brush.linearGradient(0f to this, 1f to this)

/**
 * Преобразует [Color] в [StatefulValue] c [Brush].
 */
fun Color.asStatefulBrush(): StatefulValue<Brush> = asBrush().asStatefulValue()

/**
 * Преобразует [StatefulValue] c [Color] в [StatefulValue] c [Brush].
 */
fun StatefulValue<Color>.asStatefulBrush(): StatefulValue<Brush> =
    transform { it.asBrush() }

/**
 * Создает [Brush] из текущего цвета и позволяет более гибко определить дополнитнльные цвета для состояний
 * @receiver [Color] текущий цвет
 * @param colorStates цвета для каждого стейта
 */
fun Color.asStatefulBrush(vararg colorStates: Pair<Set<ValueState>, Color>): StatefulValue<Brush> {
    return StatefulValue(
        states = colorStates.map { it.first },
        values = colorStates.map { it.second.asBrush() },
        defaultValue = this.asBrush(),
    )
}

/**
 * Конвертер [SolidColor] в векторное представление для анимации.
 */
@Suppress("DestructuringDeclarationWithTooManyEntries")
val SolidColorVectorConverter: (colorSpace: ColorSpace) -> TwoWayConverter<SolidColor, AnimationVector4D> =
    { colorSpace ->
        TwoWayConverter(
            convertToVector = { solidColor ->
                val (l, a, b, alpha) = solidColor.value.convert(ColorSpaces.Oklab)
                AnimationVector4D(alpha, l, a, b)
            },
            convertFromVector = { vector ->
                val color = Color(
                    vector.v2.coerceIn(0f, 1f), // L (red)
                    vector.v3.coerceIn(-0.5f, 0.5f), // a (blue)
                    vector.v4.coerceIn(-0.5f, 0.5f), // b (green)
                    vector.v1.coerceIn(0f, 1f), // alpha
                    ColorSpaces.Oklab,
                ).convert(colorSpace)
                SolidColor(color)
            },
        )
    }
