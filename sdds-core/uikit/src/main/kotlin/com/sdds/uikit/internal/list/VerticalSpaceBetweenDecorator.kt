package com.sdds.uikit.internal.list

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

internal class VerticalSpaceBetweenDecorator(private val spacing: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildLayoutPosition(view)
        when (position) {
            0 -> outRect.bottom = spacing / 2
            state.itemCount - 1 -> outRect.top = spacing / 2
            else -> {
                outRect.top = spacing / 2
                outRect.bottom = spacing / 2
            }
        }
    }
}
