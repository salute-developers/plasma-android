package com.sdds.uikit.shape

import android.util.AttributeSet
import android.view.View
import com.sdds.uikit.internal.base.shape.ShapeHelper

/**
 * Интерфейс описывающий объект, который имеет [ShapeModel]]
 * @author Малышев Александр on 12.09.2024
 */
interface Shapeable {

    /**
     * Форма объекта
     */
    val shape: ShapeModel?
}

/**
 * Возвращает для @receiver делегат [Shapeable], с помощью которого можно установить [ShapeModel], либо через
 * атрибуты [attributeSet], либо через [Shapeable.shape].
 */
fun View.shapeable(attributeSet: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0): Shapeable =
    ShapeHelper(this, attributeSet, defStyleAttr, defStyleRes)

internal fun View.shapeHelper(attributeSet: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0) =
    ShapeHelper(this, attributeSet, defStyleAttr, defStyleRes)
