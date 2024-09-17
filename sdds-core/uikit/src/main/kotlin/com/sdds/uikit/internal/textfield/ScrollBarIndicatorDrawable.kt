package com.sdds.uikit.internal.textfield

import android.content.Context
import com.sdds.uikit.R
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel

/**
 * [ShapeDrawable] для отрисовки ScrollBar
 * @author Малышев Александр on 16.09.2024
 */
internal class ScrollBarIndicatorDrawable(context: Context) : ShapeDrawable(createShape(context)) {

    private companion object {

        fun createShape(context: Context): ShapeModel {
            return ShapeModel.create(context, R.style.Sdds_Shape_Round_Circle)
        }
    }
}
