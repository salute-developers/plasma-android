package com.sdds.testing.vs.image

import android.content.Context
import android.graphics.Color
import android.view.ViewGroup
import com.sdds.testing.R
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.ImageView

/**
 * Фабрика для создания [ImageView]
 */
fun image(
    context: Context,
    style: Int? = null,
): ImageView {
    return ImageView(context.styleWrapper(style))
        .apply {
            layoutParams = ViewGroup.LayoutParams(
                resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_52x),
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            id = R.id.image
            setBackgroundColor(Color.GRAY)
            setImageResource(com.sdds.icons.R.drawable.ic_add_smile_fill_16)
        }
}
