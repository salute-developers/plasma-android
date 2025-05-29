package com.sdds.uikit.internal.overlays

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import com.sdds.uikit.FrameLayout
import com.sdds.uikit.ImageView
import com.sdds.uikit.R

internal class ModalView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_modalStyle,
    defStyleRes: Int = R.style.Sdds_Components_Modal,
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    private var _closeIconSize: Int = DEFAULT_ICON_SIZE
    private val closeIconView: ImageView = ImageView(context).apply {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            defaultFocusHighlightEnabled = false
        }
    }

    init {
        context.withStyledAttributes(attrs, R.styleable.ModalView, defStyleAttr, defStyleRes) {
            closeIconView.imageTintList = getColorStateList(R.styleable.ModalView_sd_closeIconTint)
            val icon = getDrawable(R.styleable.ModalView_sd_closeIcon)
            closeIconView.setImageDrawable(icon)
            setHasClose(icon != null)
            _closeIconSize = getDimensionPixelSize(R.styleable.ModalView_sd_closeIconSize, DEFAULT_ICON_SIZE)
        }
    }

    fun setContentView(contentView: View?) {
        contentView?.let { addView(it) }
        addView(
            closeIconView,
            LayoutParams(_closeIconSize, _closeIconSize).apply {
                gravity = Gravity.TOP or Gravity.END
            },
        )
    }

    fun setHasClose(hasClose: Boolean) {
        closeIconView.isVisible = hasClose
    }

    fun setCloseIconClickListener(listener: OnClickListener) {
        closeIconView.setOnClickListener(listener)
    }

    private companion object {
        const val DEFAULT_ICON_SIZE = LayoutParams.WRAP_CONTENT
    }
}