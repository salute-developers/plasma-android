package com.sdds.compose.uikit.ai

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sdds.api.info.compose.ApiName
import com.sdds.api.info.compose.ApiStateSet
import com.sdds.compose.uikit.ButtonGroupScope
import com.sdds.compose.uikit.ai.motion.AiAnswerMotionStyle
import com.sdds.compose.uikit.ai.motion.rememberAiAnswerMotion
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.ai.AiAnswerContent
import com.sdds.compose.uikit.internal.ai.AiAnswerError
import com.sdds.compose.uikit.internal.ai.AiAnswerLoading
import com.sdds.compose.uikit.internal.common.FlowRowScope
import com.sdds.compose.uikit.motion.Motion

/**
 * Семантическое состояние [AiAnswer].
 */
@ApiStateSet(components = ["AiAnswer"])
enum class AiAnswerState : ValueState {
    /**
     * Обычное состояние ответа.
     */
    @ApiName(name = "default")
    Default,

    /**
     * Состояние ошибки.
     */
    @ApiName(name = "error")
    Error,

    /**
     * Состояние загрузки.
     */
    @ApiName(name = "loading")
    Loading,
}

/**
 * Scope для custom error-контента [AiAnswer].
 */
interface AiAnswerErrorScope {
    /**
     * Текущее состояние [AiAnswer].
     */
    val state: AiAnswerState

    /**
     * Текущий стиль [AiAnswer].
     */
    val style: AiAnswerStyle

    /**
     * Текущие motion-настройки [AiAnswer].
     */
    val motion: Motion<AiAnswerMotionStyle>
}

/**
 * Scope для custom loading-контента [AiAnswer].
 */
interface AiAnswerLoadingScope {
    /**
     * Текущее состояние [AiAnswer].
     */
    val state: AiAnswerState

    /**
     * Текущий стиль [AiAnswer].
     */
    val style: AiAnswerStyle

    /**
     * Текущие motion-настройки [AiAnswer].
     */
    val motion: Motion<AiAnswerMotionStyle>
}

/**
 * Компонент для отображения LLM-ответа, загрузки или ошибки.
 *
 * [AiAnswer] не парсит markdown, citations, streaming chunks и не владеет data model ответа.
 * Потребитель передаёт нужный renderer через [content], действия через [actionsStart]/[actionsEnd],
 * а suggestions через [suggestions].
 *
 * @param modifier модификатор.
 * @param state семантическое состояние компонента.
 * @param title optional title-slot для [AiAnswerState.Default].
 * @param content optional content-slot для [AiAnswerState.Default].
 * @param actionsStart стартовые действия внутри отдельного [com.sdds.compose.uikit.ButtonGroup].
 * @param actionsEnd конечные действия внутри отдельного [com.sdds.compose.uikit.ButtonGroup].
 * @param suggestions suggestions внутри [com.sdds.compose.uikit.ChipGroup].
 * @param loading custom loading-slot; при отсутствии используется [AiAnswerLoading].
 * @param error custom error-slot; при отсутствии используется [AiAnswerError].
 * @param style стиль компонента.
 * @param motion motion компонента.
 */
@Composable
fun AiAnswer(
    modifier: Modifier = Modifier,
    style: AiAnswerStyle = LocalAiAnswerStyle.current,
    state: AiAnswerState = AiAnswerState.Default,
    title: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    actionsStart: (ButtonGroupScope.() -> Unit)? = null,
    actionsEnd: (ButtonGroupScope.() -> Unit)? = null,
    suggestions: (@Composable FlowRowScope.() -> Unit)? = null,
    loading: (@Composable AiAnswerLoadingScope.() -> Unit)? = null,
    error: (@Composable AiAnswerErrorScope.() -> Unit)? = null,
    motion: Motion<AiAnswerMotionStyle> = rememberAiAnswerMotion(state = state),
) {
    AiAnswerContent(
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
 * Рендерит default Note-based error-контент для [AiAnswer].
 *
 * @param title слот заголовка ошибки.
 * @param modifier модификатор.
 * @param text слот текста ошибки.
 */
@Composable
fun AiAnswerErrorScope.AiAnswerError(
    title: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    text: (@Composable () -> Unit)? = null,
) {
    AiAnswerError(
        modifier = modifier,
        title = title,
        text = text,
        style = style,
    )
}

/**
 * Рендерит default Spinner-based loading-контент для [AiAnswer].
 *
 * @param text слот loading-текста.
 * @param modifier модификатор.
 */
@Composable
fun AiAnswerLoadingScope.AiAnswerLoading(
    text: @Composable () -> Unit,
    modifier: Modifier = Modifier,
) {
    AiAnswerLoading(
        modifier = modifier,
        text = text,
        style = style,
        motion = motion,
    )
}
