package com.sdds.uikit.fixtures.stories.notificationcontent

import android.content.Context
import android.widget.LinearLayout
import androidx.annotation.StyleRes
import com.sdds.uikit.NotificationContent
import com.sdds.uikit.fixtures.stories.button.ButtonUiState
import com.sdds.uikit.fixtures.stories.button.buttonGroup
import com.sdds.uikit.fixtures.styleWrapper

/**
 * Создает [NotificationContent]
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun notificationContent(
    context: Context,
    @StyleRes style: Int? = null,
    state: NotificationContentUiState = NotificationContentUiState(),
): NotificationContent {
    return NotificationContent(context.styleWrapper(style))
        .applyState(state)
}

/**
 * Применяет [NotificationContentUiState] к [NotificationContent]
 */
fun NotificationContent.applyState(state: NotificationContentUiState) = apply {
    clipChildren = false
    isFocusable = false
    isFocusableInTouchMode = false
    title = state.title
    text = state.text
    buttonGroup?.let { removeView(it) }
    if (state.hasActions) {
        addView(
            buttonGroup(context, state = ButtonUiState(amount = 2)),
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT,
            ),
        )
    }
}
