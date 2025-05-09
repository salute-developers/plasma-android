package com.sdds.playground.sandbox.core.vs

import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import androidx.core.view.children
import androidx.core.view.marginLeft
import androidx.core.view.marginTop
import androidx.core.view.updateMargins
import com.sdds.uikit.FrameLayout
import com.sdds.uikit.dp

internal class DrawerFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
) : FrameLayout(context, attrs, defStyle) {

    private var drawerView: View? = null
    private var drawerOpened: Boolean = false
    private val _offset: Int = 20.dp
    private val _drawerMargin: Int = 2.dp
    private val drawerAnimation: ValueAnimator by lazy {
        ValueAnimator().apply {
            setDuration(200)
            addUpdateListener { animator ->
                val value = animator.animatedValue as Float
                drawerView?.translationX = value
                this@DrawerFrameLayout.children.filter { it != drawerView }.forEach {
                    it.translationX = value
                }
                invalidate()
            }
        }
    }

    override fun onFinishInflate() {
        super.onFinishInflate()

        for (i in 0 until childCount) {
            val child = getChildAt(i)
            val lp = child.layoutParams as? LayoutParams
            if (lp?.gravity == Gravity.START) {
                drawerView = child
            } else {
                lp?.updateMargins(_offset + _drawerMargin)
                child.layoutParams = lp
            }
        }

        viewTreeObserver?.addOnGlobalFocusChangeListener { _, _ ->
            val drawer = drawerView ?: return@addOnGlobalFocusChangeListener
            val drawerOpen = drawer.hasFocus()
            if (drawerOpened != drawerOpen) {
                drawerOpened = drawerOpen
                if (drawerOpened) {
                    drawerAnimation.setFloatValues(0f, drawer.width.toFloat() - _offset)
                } else {
                    drawerAnimation.setFloatValues(drawer.width.toFloat() - _offset, 0f)
                }
                drawerAnimation.start()
            }
        }
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        for (i in 0 until childCount) {
            val child = getChildAt(i)

            val childWidth = child.measuredWidth
            val childHeight = child.measuredHeight
            val childTop = child.marginTop + paddingTop
            val childLeft = if (child == drawerView) {
                -childWidth + child.marginLeft + _offset + paddingLeft
            } else {
                child.marginLeft + paddingLeft
            }
            child.layout(childLeft, childTop, childLeft + childWidth, childTop + childHeight)
        }
    }
}
