package com.sdds.playground.sandbox.core.vs

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

internal class VerticalSpaceBetweenDecorator(private val spacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildLayoutPosition(view)
        if (position < state.itemCount - 1) {
            outRect.bottom = spacing
        }
    }
}
