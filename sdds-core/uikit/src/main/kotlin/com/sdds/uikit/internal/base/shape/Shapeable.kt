package com.sdds.uikit.internal.base.shape

import com.sdds.uikit.shape.ShapeModel

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
