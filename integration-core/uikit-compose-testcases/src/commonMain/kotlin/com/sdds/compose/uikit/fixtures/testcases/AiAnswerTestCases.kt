package com.sdds.compose.uikit.fixtures.testcases

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ai.AiAnswer
import com.sdds.compose.uikit.ai.AiAnswerError
import com.sdds.compose.uikit.ai.AiAnswerErrorScope
import com.sdds.compose.uikit.ai.AiAnswerLoading
import com.sdds.compose.uikit.ai.AiAnswerLoadingScope
import com.sdds.compose.uikit.ai.AiAnswerState
import com.sdds.compose.uikit.ai.AiAnswerStyle
import com.sdds.compose.uikit.Button
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.imageVectorSource
import com.sdds.compose.uikit.internal.common.FlowRowScope
import com.sdds.compose.uikit.Text
import com.sdds.icons.compose.CopyOutline24
import com.sdds.icons.compose.DislikeOutline24
import com.sdds.icons.compose.LikeOutline24
import com.sdds.icons.compose.SddsIcons

/**
 * Тест-кейсы для компонента [AiAnswer]
 */

/**
 * PLASMA-T2656
 */
@Composable
fun AiAnswerHasActionsStartEndSuggestions(
    style: AiAnswerStyle,
) {
    AiAnswerCommon(
        style = style,
        title = { Text("Ответ ассистента") },
        content = {
            Text("SDDS Compose позволяет собрать ответ из обычных composable-слотов.")
        },
        actionsStart = {
            button { IconButton(iconSource = imageVectorSource(SddsIcons.CopyOutline24), onClick = {}) }
            button { IconButton(iconSource = imageVectorSource(SddsIcons.LikeOutline24), onClick = {}) }
            button { IconButton(iconSource = imageVectorSource(SddsIcons.DislikeOutline24), onClick = {}) }
        },
        actionsEnd = {
            button { Button(label = "Повторить", onClick = {}) }
        },
        suggestions = {
            Chip(label = "Подробнее", onClick = {})
            Chip(label = "Кратко", onClick = {})
        },
    )
}

/**
 * PLASMA-T2657
 */
@Composable
fun AiAnswerErrorState(
    style: AiAnswerStyle,
) {
    AiAnswerCommon(
        style = style,
        state = AiAnswerState.Error,
        error = {
            AiAnswerError(
                title = { Text("Ответ недоступен") },
                text = { Text("Попробуйте изменить запрос.") },
            )
        },
    )
}

/**
 * PLASMA-T2658
 */
@Composable
fun AiAnswerLoadingState(
    style: AiAnswerStyle,
) {
    AiAnswerCommon(
        style = style,
        state = AiAnswerState.Loading,
        loading = {
            AiAnswerLoading(text = { Text("Генерирую ответ...") })
        },
    )
}

/**
 * PLASMA-T2659
 */
@Composable
fun AiAnswerNoTitleHasActionsEndHasSuggestions(
    style: AiAnswerStyle,
) {
    AiAnswerCommon(
        style = style,
        title = null,
        content = {
            Text("SDDS Compose позволяет собрать ответ из обычных composable-слотов.")
        },
        actionsEnd = {
            button { Button(label = "Повторить", onClick = {}) }
        },
        suggestions = {
            Chip(label = "Подробнее", onClick = {})
            Chip(label = "Кратко", onClick = {})
        },
    )
}

/**
 * PLASMA-T2660
 */
@Composable
fun AiAnswerLongTitleHasActionsStartHasSuggestions(
    style: AiAnswerStyle,
) {
    AiAnswerCommon(
        style = style,
        title = {
            Text(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                    "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                    "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                    "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor",
            )
        },
        content = {
            Text("SDDS Compose позволяет собрать ответ из обычных composable-слотов.")
        },
        actionsStart = {
            button { IconButton(iconSource = imageVectorSource(SddsIcons.CopyOutline24), onClick = {}) }
            button { IconButton(iconSource = imageVectorSource(SddsIcons.LikeOutline24), onClick = {}) }
            button { IconButton(iconSource = imageVectorSource(SddsIcons.DislikeOutline24), onClick = {}) }
        },
        suggestions = {
            Chip(label = "Подробнее", onClick = {})
            Chip(label = "Кратко", onClick = {})
        },
    )
}

/**
 * PLASMA-T2661
 */
@Composable
fun AiAnswerHasActionsStartEnd(
    style: AiAnswerStyle,
) {
    AiAnswerCommon(
        style = style,
        title = { Text("Ответ ассистента") },
        content = {
            Text("SDDS Compose позволяет собрать ответ из обычных composable-слотов.")
        },
        actionsStart = {
            button { IconButton(iconSource = imageVectorSource(SddsIcons.CopyOutline24), onClick = {}) }
            button { IconButton(iconSource = imageVectorSource(SddsIcons.LikeOutline24), onClick = {}) }
            button { IconButton(iconSource = imageVectorSource(SddsIcons.DislikeOutline24), onClick = {}) }
        },
        actionsEnd = {
            button { Button(label = "Повторить", onClick = {}) }
        },
    )
}

/**
 * Общий тест-кейс
 */
@Composable
fun AiAnswerCommon(
    style: AiAnswerStyle,
    state: AiAnswerState = AiAnswerState.Default,
    title: @Composable (() -> Unit)? = null,
    content: @Composable (() -> Unit)? = null,
    actionsStart: (ButtonGroupScope.() -> Unit)? = null,
    actionsEnd: (ButtonGroupScope.() -> Unit)? = null,
    suggestions: (@Composable FlowRowScope.() -> Unit)? = null,
    loading: (@Composable AiAnswerLoadingScope.() -> Unit)? = null,
    error: (@Composable AiAnswerErrorScope.() -> Unit)? = null,
) {
    AiAnswer(
        style = style,
        state = state,
        title = title,
        content = content,
        actionsStart = actionsStart,
        actionsEnd = actionsEnd,
        suggestions = suggestions,
        loading = loading,
        error = error,
    )
}
