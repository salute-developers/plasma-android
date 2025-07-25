package com.sdds.uikit.internal.navigationdrawer

import android.animation.ValueAnimator
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.DescendantOffsetUtils
import com.sdds.uikit.NavigationDrawer
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.AnimationUtils.lerp
import com.sdds.uikit.shape.ShapeDrawable
import com.sdds.uikit.shape.ShapeModel
import com.sdds.uikit.shape.Shapeable

internal class ItemSelectorDecorator(
    private val navigationDrawer: NavigationDrawer,
    private val recyclerView: RecyclerView,
    private val color: ColorStateList? = null,
) {
    private val background: ShapeDrawable = ShapeDrawable().apply { setTintList(color) }
    private var _itemShapeModel: ShapeModel? = null

    private val targetBounds = Rect()
    private val animatedBounds = Rect()
    private val containerBounds = Rect()
    private val newBounds = Rect()
    private val fromBounds = Rect()

    private var animator: ValueAnimator? = ValueAnimator.ofFloat(0f, 1f).apply {
        duration = AnimationUtils.DEFAULT_DURATION
        interpolator = AnimationUtils.ACCELERATE_DECELERATE_INTERPOLATOR
        addUpdateListener { animation ->
            val progress = animation.animatedValue as Float

            animatedBounds.set(
                lerp(fromBounds.left, newBounds.left, progress),
                lerp(fromBounds.top, newBounds.top, progress),
                lerp(fromBounds.right, newBounds.right, progress),
                lerp(fromBounds.bottom, newBounds.bottom, progress),
            )
            navigationDrawer.invalidate()
        }
        start()
    }

    var bounds: Rect
        get() = animatedBounds
        set(value) {
            animatedBounds.set(value)
        }

    fun clear() {
        animator?.cancel()
        animatedBounds.setEmpty()
        targetBounds.setEmpty()
        newBounds.setEmpty()
        fromBounds.setEmpty()
    }

    @Suppress("RestrictedApi")
    fun moveToView(targetView: View) {
        if (targetView == recyclerView || targetView.parent != recyclerView) {
            clear()
            navigationDrawer.invalidate()
            return
        }
        val targetShape = (targetView as? Shapeable)?.shape
        if (targetShape != _itemShapeModel && targetShape != null) {
            _itemShapeModel = targetShape
            background.setShapeModel(targetShape)
        }

        newBounds.setEmpty()
        DescendantOffsetUtils.getDescendantRect(navigationDrawer, targetView, newBounds)

        if (targetBounds == newBounds) return

        if (targetView.parent == recyclerView) {
            containerBounds.set(
                recyclerView.left,
                recyclerView.top,
                recyclerView.right,
                recyclerView.bottom,
            )
            if (containerBounds.bottom < newBounds.top || containerBounds.bottom < newBounds.bottom) {
                newBounds.offsetTo(
                    newBounds.left,
                    containerBounds.bottom - newBounds.height(),
                )
            }
            if (containerBounds.top > newBounds.bottom || containerBounds.top > newBounds.top) {
                newBounds.offsetTo(
                    newBounds.left,
                    containerBounds.top,
                )
            }
        }

        animator?.cancel()
        fromBounds.set(targetBounds)
        targetBounds.set(newBounds)

        if (animatedBounds.isEmpty) {
            animatedBounds.set(newBounds)
            navigationDrawer.invalidate()
            return
        }
        animator?.start()
    }

    fun draw(canvas: Canvas) {
        if (!animatedBounds.isEmpty) {
            background.bounds = animatedBounds
            background.draw(canvas)
        }
    }
}
