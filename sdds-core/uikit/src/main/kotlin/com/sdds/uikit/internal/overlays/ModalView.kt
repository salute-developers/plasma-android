package com.sdds.uikit.internal.overlays

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import com.sdds.uikit.FrameLayout
import com.sdds.uikit.ImageView
import com.sdds.uikit.R

internal open class ModalView @JvmOverloads constructor(
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
    private var _closeIconAlignment: Int = ICON_ALIGNMENT_TOP_END
    private var _closeIconContentPadding: Int = 0

    init {
        context.withStyledAttributes(attrs, R.styleable.ModalView, defStyleAttr, defStyleRes) {
            closeIconView.imageTintList = getColorStateList(R.styleable.ModalView_sd_closeIconTint)
            val icon = getDrawable(R.styleable.ModalView_sd_closeIcon)
            closeIconView.setImageDrawable(icon)
            setHasClose(icon != null)
            _closeIconSize = getDimensionPixelSize(R.styleable.ModalView_sd_closeIconSize, DEFAULT_ICON_SIZE)
            _closeIconContentPadding = getDimensionPixelSize(R.styleable.ModalView_sd_closeIconContentPadding, 0)
            _closeIconContentPadding = getInt(R.styleable.ModalView_sd_closeIconAlignment, ICON_ALIGNMENT_TOP_END)
        }
    }

    fun setContentView(contentView: View?) {
        contentView?.let {
            addView(it)
            it.updateLayoutParams<LayoutParams> {
                if (_closeIconSize > 0) {
                    marginEnd = _closeIconSize + _closeIconContentPadding
                }
                gravity = Gravity.CENTER_VERTICAL
            }
        }
        addView(
            closeIconView,
            LayoutParams(_closeIconSize, _closeIconSize).apply {
                gravity = getIconGravity(_closeIconAlignment)
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
        const val ICON_ALIGNMENT_TOP_END = 0
        const val ICON_ALIGNMENT_CENTER_END = 1

        fun getIconGravity(alignment: Int): Int {
            return when (alignment) {
                ICON_ALIGNMENT_CENTER_END -> Gravity.CENTER_VERTICAL or Gravity.END
                else -> Gravity.TOP or Gravity.END
            }
        }
    }
}
