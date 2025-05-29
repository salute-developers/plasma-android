package com.sdds.testing.vs.overlay

import android.content.Context
import android.view.Gravity
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.core.view.isVisible
import com.sdds.testing.R
import com.sdds.testing.vs.button.basicButton
import com.sdds.testing.vs.button.iconButton
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.OverlayView

/**
 * Создает компонент [OverlayView]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun overlayView(
    context: Context,
    style: Int? = null,
    state: OverlayUiState = OverlayUiState(),
): OverlayView {
    return OverlayView(context.styleWrapper(style))
        .applyState(state)
        .apply {
            id = R.id.overlay
        }
}

/**
 * Создает [OverlayView] с контейнером и тригером.
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun overlayWithTrigger(
    context: Context,
    style: Int? = null,
    state: OverlayUiState = OverlayUiState(),
): ViewGroup {
    val overlayView = overlayView(context, style, state).apply {
        val overlay = this
        val hideButton = iconButton(context).apply {
            setIconResource(com.sdds.icons.R.drawable.ic_close_24)
            setOnClickListener { overlay.isVisible = false }
        }
        setOnClickListener { overlay.isVisible = false }
        addView(
            hideButton,
            FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply {
                gravity = Gravity.TOP or Gravity.END
                val margin = resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_2x)
                setMargins(margin, margin, margin, margin)
            },
        )
    }
    val trigger = basicButton(context).apply {
        text = "Show Overlay"
        setOnClickListener { overlayView.isVisible = true }
    }
    return FrameLayout(context).apply {
        layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
        addView(
            trigger,
            FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT).apply {
                gravity = Gravity.CENTER
            },
        )
        addView(overlayView)
        overlayView.isVisible = false
    }
}

/**
 * Применяет [OverlayUiState] к [OverlayView]
 */
fun OverlayView.applyState(state: OverlayUiState) = this
