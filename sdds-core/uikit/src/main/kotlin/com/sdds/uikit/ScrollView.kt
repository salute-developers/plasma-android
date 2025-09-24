package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import com.sdds.uikit.internal.base.isClippedToOutline
import com.sdds.uikit.internal.scrollable.ScrollableDelegate
import com.sdds.uikit.shape.ShapeModel

/**
 * Компонент-контейнер для поддержки вертикального скролла.
 * Компонент также умеет автоматически компенсировать отступы, необходимые для корректной работы селектора фокуса.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes стиль по умолчанию
 * @author Малышев Александр on 19.09.2025
 */
open class ScrollView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0,
) : android.widget.ScrollView(context, attrs, defStyleAttr, defStyleRes) {

    private val _scrollableDelegate = ScrollableDelegate(context, attrs, defStyleAttr, defStyleRes)

    init {
        clipToOutline = context.isClippedToOutline(attrs, defStyleAttr, defStyleRes)
        @Suppress("LeakingThis")
        _scrollableDelegate.init(this, ShapeModel())
        viewTreeObserver.addOnGlobalFocusChangeListener { _, _ ->
            _scrollableDelegate.updateOutlineOnScroll()
        }
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        _scrollableDelegate.onTouchEvent(ev)
        return super.onTouchEvent(ev)
    }

    override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
        super.onScrollChanged(l, t, oldl, oldt)
        _scrollableDelegate.onScrollChanged(l, t, oldl, oldt)
    }

    override fun onDetachedFromWindow() {
        _scrollableDelegate.destroy()
        super.onDetachedFromWindow()
    }
}
