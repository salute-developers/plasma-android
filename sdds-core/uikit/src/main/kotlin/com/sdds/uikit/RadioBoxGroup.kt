package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.RadioGroup
import androidx.core.view.marginTop
import androidx.core.view.updateMarginsRelative

/**
 * Группа [RadioBox].
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по-умолчанию
 * @param defStyleRes стиль по-умолчанию
 * @author Малышев Александр on 29.08.2024
 */
open class RadioBoxGroup @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_radioBoxGroupStyle,
    defStyleRes: Int = R.style.Sdds_Components_RadioBoxGroup,
) : RadioGroup(context, attrs) {

    private var _itemSpacing: Int

    init {
        val typedArray = context.obtainStyledAttributes(attrs, R.styleable.RadioBoxGroup, defStyleAttr, defStyleRes)
        _itemSpacing = typedArray.getDimensionPixelSize(R.styleable.RadioBoxGroup_sd_itemSpacing, 0)
        typedArray.recycle()
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        params?.applySpacing(childCount)
        super.addView(child, index, params)
    }

    private fun ViewGroup.LayoutParams.applySpacing(index: Int) {
        (this as? MarginLayoutParams)?.run {
            if (orientation == VERTICAL) {
                val top = if (index == 0) marginTop else marginTop + _itemSpacing
                updateMarginsRelative(top = top)
            } else {
                val start = if (index == 0) marginStart else marginStart + _itemSpacing
                updateMarginsRelative(start = start)
            }
        }
    }
}
