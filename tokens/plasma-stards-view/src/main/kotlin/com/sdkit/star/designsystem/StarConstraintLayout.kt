package com.sdkit.star.designsystem

import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable
import com.sdds.uikit.shape.shapeable

/**
 * ConstraintLayout из дизайн-системы
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Александр Малышев on 21.07.2023
 */
class StarConstraintLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr), Shapeable {

    private val shaper: Shapeable = shapeable(attrs, defStyleAttr)

    override val shape: ShapeModel?
        get() = shaper.shape
}
