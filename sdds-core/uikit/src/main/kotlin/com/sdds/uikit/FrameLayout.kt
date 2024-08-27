package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.internal.base.shape.ShapeHelper
import android.widget.FrameLayout as AndroidFrameLayout

/**
 * Реализация [FrameLayout] с поддержкой ShapeModel.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 27.08.2024
 */
@Suppress("LeakingThis")
open class FrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AndroidFrameLayout(context, attrs, defStyleAttr) {

    init {
        ShapeHelper(this, attrs, defStyleAttr)
        clipToOutline = true
    }
}
