package com.sdds.uikit.internal.navigationbar

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.LinearLayout.HORIZONTAL
import androidx.core.content.withStyledAttributes
import androidx.core.view.isGone
import androidx.core.view.isVisible
import com.sdds.uikit.R

internal class CustomCenteringLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ViewGroup(context, attrs) {

    private val actionStart = FrameLayout(context).apply {
        layoutParams = MarginLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )
    }
    private val actionEnd = FrameLayout(context).apply {
        layoutParams = MarginLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )
    }
    private val centerContent = LinearLayout(context).apply {
        orientation = HORIZONTAL
        layoutParams = MarginLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )
    }

    var centering: CenteringStrategy = CenteringStrategy.RELATIVE
        set(value) {
            if (field != value) {
                field = value
                requestLayout()
            }
        }

    init {
        addView(actionStart)
        addView(centerContent)
        addView(actionEnd)
    }

    enum class CenteringStrategy {
        RELATIVE, ABSOLUTE
    }

    override fun generateLayoutParams(attrs: AttributeSet?): LayoutParams? {
        return MarginLayoutParams(context, attrs)
    }

    override fun generateDefaultLayoutParams(): LayoutParams? {
        return MarginLayoutParams(
            LayoutParams.WRAP_CONTENT,
            LayoutParams.WRAP_CONTENT
        )
    }

    override fun checkLayoutParams(p: LayoutParams?): Boolean {
        return p is MarginLayoutParams
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val verPaddings = paddingTop + paddingBottom
        val horPaddings = paddingStart + paddingEnd
        var widthUsed = 0

        fun measureActions(child: View) {
            if (child.isGone && centering == CenteringStrategy.RELATIVE) return
            (this.layoutParams as MarginLayoutParams)
            measureChildWithMargins(
                child,
                widthMeasureSpec,
                widthUsed,
                heightMeasureSpec,
                0
            )
            widthUsed += child.measuredWidth
        }
        measureActions(actionStart)
        measureActions(actionEnd)
        val maxActionWidth = maxOf(actionStart.measuredWidth, actionEnd.measuredWidth)
        if (centering == CenteringStrategy.RELATIVE) widthUsed = 2 * maxActionWidth
        measureChildWithMargins(
            centerContent,
            widthMeasureSpec,
            widthUsed,
            heightMeasureSpec,
            0
        )
        widthUsed += centerContent.measuredWidth + verPaddings
        val heightUsed = horPaddings +
                maxOf(actionStart.measuredHeight, actionEnd.measuredHeight, centerContent.measuredHeight)
        setMeasuredDimension(
            resolveSize(widthUsed, widthMeasureSpec),
            resolveSize(heightUsed, heightMeasureSpec)
        )
    }

    override fun onLayout(chaged: Boolean, l: Int, t: Int, r: Int, b: Int) {
        val centerY = (b - t) / 2
        val actionStartW = if (actionStart.isVisible) actionStart.measuredWidth else 0
        val actionStartH = if (actionStart.isVisible) actionStart.measuredHeight else 0

        val actionEndW = if (actionEnd.isVisible) actionEnd.measuredWidth else 0
        val actionEndH = if (actionEnd.isVisible) actionEnd.measuredHeight else 0

        val contentW = centerContent.measuredWidth
        val contentH = centerContent.measuredHeight

        fun viewTop(viewHeight: Int) = (centerY - viewHeight) / 2
        var left = paddingStart

        if (centering == CenteringStrategy.RELATIVE) {
            var top = viewTop(actionStartH)
            if (actionStart.isVisible) {
                actionStart.layout(left, top, left + actionStartW, top + actionStartH)
                left += actionStartW
            }
            top = viewTop(contentH)
            centerContent.layout(left, top, left + contentW, top + contentH)
            left += contentW
            top = viewTop(actionEndH)
            if (actionEnd.isVisible) actionEnd.layout(left, top, left + actionEndW, top + actionEndH)
        } else {
            var top = viewTop(actionStartH)
            if (actionStart.isVisible) actionStart.layout(left, top, left + actionStartW, top + actionStartH)
            top = viewTop(actionEndH)
            left = (r - l) - paddingEnd - actionEndW
            if (actionEnd.isVisible) actionEnd.layout(left, top, left + actionEndW, top + actionEndH)
            top = viewTop(contentH)
            left = (r - l) / 2 - contentW
            centerContent.layout(left, top, left + contentW, top + contentH)
        }
    }

    fun removeActionStart() {
        actionStart.removeAllViews()
    }

    fun removeActionEnd() {
        actionEnd.removeAllViews()
    }

    fun removeCenterContent() {
        centerContent.removeAllViews()
    }

    override fun removeAllViews() {
        removeActionStart()
        removeActionEnd()
        removeCenterContent()
    }

    override fun removeView(view: View?) {
        if (view != actionStart && view != actionEnd && view != centerContent) {
            super.removeView(view)
        }
    }

    fun setActionStart(view: View?) {
        removeActionStart()
        actionStart.addView(view)
    }

    fun setActionEnd(view: View?) {
        removeActionEnd()
        actionEnd.addView(view)
    }

    fun setCenterContent(view: View?) {
        removeCenterContent()
        centerContent.addView(view)
    }

    fun addCenterContent(view: View?) {
        centerContent.addView(view)
    }
}