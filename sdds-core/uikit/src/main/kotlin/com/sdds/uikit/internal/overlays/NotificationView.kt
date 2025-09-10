package com.sdds.uikit.internal.overlays

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import com.sdds.uikit.R

internal class NotificationView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_notificationStyle,
    defStyleRes: Int = R.style.Sdds_Components_Notification,
) : ModalView(
    wrapper(context, attrs, defStyleAttr, defStyleRes),
    attrs,
    defStyleAttr,
    defStyleRes,
) {
    companion object {
        internal fun wrapper(
            context: Context,
            attrs: AttributeSet?,
            defStyleAttr: Int,
            defStyleRes: Int,
        ): Context {
            val typedArray =
                context.obtainStyledAttributes(
                    attrs,
                    R.styleable.Notification,
                    defStyleAttr,
                    defStyleRes,
                )
            val notificationContentStyleOverlay =
                typedArray.getResourceId(
                    R.styleable.Notification_sd_notificationContentStyleOverlay,
                    0,
                )
            val themeOverlay =
                if (notificationContentStyleOverlay != 0) {
                    ContextThemeWrapper(context, notificationContentStyleOverlay)
                } else {
                    context
                }
            typedArray.recycle()
            return themeOverlay
        }
    }
}
