package com.sdds.uikit.internal.overlays

import android.content.Context
import android.util.AttributeSet
import com.sdds.uikit.R

internal class NotificationView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_notificationStyle,
    defStyleRes: Int = R.style.Sdds_Components_Notification,
) : ModalView(context, attrs, defStyleAttr, defStyleRes)
