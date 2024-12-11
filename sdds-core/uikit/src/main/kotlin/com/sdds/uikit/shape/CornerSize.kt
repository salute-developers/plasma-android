package com.sdds.uikit.shape

import android.content.res.TypedArray
import android.graphics.RectF
import android.util.TypedValue

/**
 * Интерфейс, описывающий размер угла для [ShapeModel]
 * @author Малышев Александр on 12.08.2024
 */
interface CornerSize {

    /**
     * Возвращает размер угла согласно границам [bounds], в которые будет вписана форма
     * @param bounds границы [bounds], в которые будет вписана форма
     */
    fun getSize(bounds: RectF): Float
}

/**
 *   Константы с помощью которых определяется относительно какого параметра будет выполнятся скругление
 */
enum class CornerSizeBaseline {
    AUTO,
    WIDTH,
    HEIGHT,
}

/**
 * Возвращает [CornerSize] для значения из [TypedArray] по индексу [index]
 * @param index индекс значения в [TypedArray]
 * @param default [CornerSize] по-умолчанию, если не будет найдено значение в [TypedArray]
 */
fun TypedArray.getCornerSize(
    index: Int,
    baseLine: CornerSizeBaseline,
    default: CornerSize = AbsoluteCornerSize(0f),
): CornerSize {
    val typedValue = peekValue(index) ?: return default
    return when (typedValue.type) {
        TypedValue.TYPE_DIMENSION -> AbsoluteCornerSize(
            TypedValue.complexToDimensionPixelSize(typedValue.data, resources.displayMetrics)
                .toFloat(),
        )

        TypedValue.TYPE_FRACTION -> RelativeCornerSize(typedValue.getFraction(1f, 1f), baseLine)
        else -> default
    }
}
