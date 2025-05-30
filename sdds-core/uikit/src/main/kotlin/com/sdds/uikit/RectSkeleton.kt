package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet

/**
 * Компонент-заглушка с эффектом мерцания.
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @author Малышев Александр on 30.05.2025
 */
open class RectSkeleton @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_rectSkeletonStyle,
    defStyleRes: Int = R.style.Sdds_Components_RectSkeleton,
) : ShimmerLayout(context, attrs, defStyleAttr, defStyleRes)
