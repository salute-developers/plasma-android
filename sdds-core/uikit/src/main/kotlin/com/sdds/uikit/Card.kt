package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

/**
 * Представляет компонент карточки на основе [FlowLayout]
 *
 * @param context контекст
 * @param attrs набор XML-атрибутов
 * @param defStyleAttr атрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
open class Card @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_cardStyle,
    defStyleRes: Int = R.style.Sdds_Components_Card,
) : FlowLayout(context, attrs, defStyleAttr, defStyleRes) {

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        val modifiedView = if (child != null && child is CardContent) {
            CardContent.Wrapper(context, child)
        } else {
            child
        }
        super.addView(modifiedView, index, params)
    }
}
