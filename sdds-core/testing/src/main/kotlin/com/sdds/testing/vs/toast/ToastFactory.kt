package com.sdds.testing.vs.toast

import android.content.Context
import android.view.View
import androidx.core.content.ContextCompat
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.Toast
import com.sdds.uikit.overlays.OverlayManager
import com.sdds.uikit.overlays.getAnimationSpec

/**
 * Создает [Toast] с тригером.
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun toastTrigger(
    context: Context,
    style: Int? = null,
    state: ToastUiState = ToastUiState(),
): View {
    val trigger = basicButton(context).apply {
        text = "Show Toast"
        setOnClickListener { toast(context.styleWrapper(style), state).show() }
    }
    return trigger
}

/**
 * Создает [Toast]
 * @param context контекст
 * @param state состояние
 */
fun toast(
    context: Context,
    state: ToastUiState,
): Toast {
    return Toast.simpleToast(
        context = context,
        message = state.text,
        position = state.position,
        duration = OverlayManager.OVERLAY_DURATION_SLOW_MILLIS.takeIf { state.autoDismiss },
        animationSpec = state.position.getAnimationSpec().takeIf { state.hasAnimation },
        contentStart = if (state.hasContentStart) {
            ContextCompat.getDrawable(
                context,
                com.sdds.icons.R.drawable.ic_plasma_24,
            )
        } else {
            null
        },
        contentEnd = if (state.hasContentEnd) {
            ContextCompat.getDrawable(
                context,
                com.sdds.icons.R.drawable.ic_close_24,
            )
        } else {
            null
        },
    )
}
