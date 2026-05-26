package com.sdds.compose.uikit.ai

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ai.motion.AnswerMotionStyle
import com.sdds.compose.uikit.ai.motion.rememberAnswerMotion
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.ai.AnswerContent
import com.sdds.compose.uikit.internal.ai.AnswerError
import com.sdds.compose.uikit.internal.ai.AnswerLoading
import com.sdds.compose.uikit.internal.common.FlowRowScope
import com.sdds.compose.uikit.motion.Motion

/**
 * Семантическое состояние [Answer].
 */
enum class AnswerState : ValueState {
    /**
     * Обычное состояние ответа.
     */
    Default,

    /**
     * Состояние ошибки.
     */
    Error,

    /**
     * Состояние загрузки.
     */
    Loading,
}

/**
 * Scope для custom error-контента [Answer].
 */
interface AnswerErrorScope {
    /**
     * Текущее состояние [Answer].
     */
    val state: AnswerState

    /**
     * Текущий стиль [Answer].
     */
    val style: AnswerStyle

    /**
     * Текущие motion-настройки [Answer].
     */
    val motion: Motion<AnswerMotionStyle>
}

/**
 * Scope для custom loading-контента [Answer].
 */
interface AnswerLoadingScope {
    /**
     * Текущее состояние [Answer].
     */
    val state: AnswerState

    /**
     * Текущий стиль [Answer].
     */
    val style: AnswerStyle

    /**
     * Текущие motion-настройки [Answer].
     */
    val motion: Motion<AnswerMotionStyle>
}

/**
 * Компонент для отображения LLM-ответа, загрузки или ошибки.
 *
 * [Answer] не парсит markdown, citations, streaming chunks и не владеет data model ответа.
 * Потребитель передаёт нужный renderer через [content], действия через [actionsStart]/[actionsEnd],
 * а suggestions через [suggestions].
 *
 * @param modifier модификатор.
 * @param state семантическое состояние компонента.
 * @param title optional title-slot для [AnswerState.Default].
 * @param content optional content-slot для [AnswerState.Default].
 * @param actionsStart стартовые действия внутри отдельного [com.sdds.compose.uikit.ButtonGroup].
 * @param actionsEnd конечные действия внутри отдельного [com.sdds.compose.uikit.ButtonGroup].
 * @param suggestions suggestions внутри [com.sdds.compose.uikit.ChipGroup].
 * @param loading custom loading-slot; при отсутствии используется [AnswerLoading].
 * @param error custom error-slot; при отсутствии используется [AnswerError].
 * @param style стиль компонента.
 * @param motion motion компонента.
 */
@Composable
fun Answer(
    modifier: Modifier = Modifier,
    style: AnswerStyle = LocalAnswerStyle.current,
    state: AnswerState = AnswerState.Default,
    title: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    actionsStart: (ButtonGroupScope.() -> Unit)? = null,
    actionsEnd: (ButtonGroupScope.() -> Unit)? = null,
    suggestions: (@Composable FlowRowScope.() -> Unit)? = null,
    loading: (@Composable AnswerLoadingScope.() -> Unit)? = null,
    error: (@Composable AnswerErrorScope.() -> Unit)? = null,
    motion: Motion<AnswerMotionStyle> = rememberAnswerMotion(state = state),
) {
    AnswerContent(
        modifier = modifier,
        state = state,
        title = title,
        content = content,
        actionsStart = actionsStart,
        actionsEnd = actionsEnd,
        suggestions = suggestions,
        loading = loading,
        error = error,
        style = style,
        motion = motion,
    )
}

/**
 * Рендерит default Note-based error-контент для [Answer].
 *
 * @param title слот заголовка ошибки.
 * @param modifier модификатор.
 * @param text слот текста ошибки.
 */
@Composable
fun AnswerErrorScope.AnswerError(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    text: (@Composable () -> Unit)? = null,
) {
    AnswerError(
        modifier = modifier,
        title = title,
        text = text,
        style = style,
    )
}

/**
 * Рендерит default Spinner-based loading-контент для [Answer].
 *
 * @param text слот loading-текста.
 * @param modifier модификатор.
 */
@Composable
fun AnswerLoadingScope.AnswerLoading(
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    AnswerLoading(
        modifier = modifier,
        text = text,
        style = style,
        motion = motion,
    )
}
