package com.sdds.uikit.shape

import android.graphics.Path
import android.graphics.RectF

/**
 * Провайдер [Path] для [ShapeModel]
 * @author Малышев Александр on 20.08.2024
 */
internal class ShapeModelPathProvider {

    /**
     * Рассчитывает [Path] для [shapeModel] в границах [bounds].
     * Результат записывается в [path]
     */
    fun providePath(shapeModel: ShapeModel?, bounds: RectF, path: Path) {
        if (shapeModel == null || shapeModel.cornerFamily != ShapeModel.CornerFamily.ROUNDED) {
            path.rewind()
            path.addRect(bounds, Path.Direction.CW)
            path.close()
            return
        }

        val topLeft = shapeModel.cornerSizeTopLeft.getSize(bounds)
        val topRight = shapeModel.cornerSizeTopRight.getSize(bounds)
        val bottomRight = shapeModel.cornerSizeBottomRight.getSize(bounds)
        val bottomLeft = shapeModel.cornerSizeBottomLeft.getSize(bounds)
        path.rewind()
        path.addRoundRect(
            bounds,
            floatArrayOf(
                topLeft,
                topLeft,
                topRight,
                topRight,
                bottomRight,
                bottomRight,
                bottomLeft,
                bottomLeft,
            ),
            Path.Direction.CW,
        )
        path.close()
    }
}
