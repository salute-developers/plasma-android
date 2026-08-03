package com.sdds.compose.uikit.internal

import androidx.compose.foundation.gestures.AnchoredDraggableDefaults
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.gestures.snapTo
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CancellationException

/**
 * Направления, в которых [SwipeToDismissBox] может быть смахнут и скрыт.
 */
internal enum class SwipeToDismissBoxValue {
    /**
     * Может быть скрыт свайпом в направлении чтения (Start → End).
     */
    StartToEnd,

    /**
     * Может быть скрыт свайпом в обратном направлении чтения (End → Start).
     */
    EndToStart,

    /**
     * В данный момент не может быть скрыт.
     */
    Settled,
}

/**
 * Состояние composable-компонента [SwipeToDismissBox].
 *
 * @param initialValue Начальное состояние.
 * @param positionalThreshold Пороговое расстояние, используемое для определения целевого
 * состояния во время свайпа и при завершении жеста. Значение задаётся как расстояние
 * от начальной точки и всегда должно быть положительным.
 */
internal class SwipeToDismissBoxState(
    initialValue: SwipeToDismissBoxValue,
    internal var positionalThreshold: (totalDistance: Float) -> Float,
) {

    internal val anchoredDraggableState: AnchoredDraggableState<SwipeToDismissBoxValue> =
        AnchoredDraggableState(initialValue)
    internal val offset: Float
        get() = anchoredDraggableState.offset

    /**
     * Возвращает текущий offset.
     *
     * @throws IllegalStateException если offset ещё не инициализирован
     */
    fun requireOffset(): Float = anchoredDraggableState.requireOffset()

    /**
     * Текущее значение состояния [SwipeToDismissBoxState].
     */
    val currentValue: SwipeToDismissBoxValue
        get() = anchoredDraggableState.currentValue

    /**
     * Целевое состояние. Это ближайшее состояние к текущему offset (с учётом порогов).
     * Если нет активных взаимодействий (анимаций или свайпов), совпадает с currentValue.
     */
    val targetValue: SwipeToDismissBoxValue
        get() = anchoredDraggableState.targetValue

    /**
     * Значение, в котором [SwipeToDismissBoxState] в данный момент находится в состоянии покоя.
     * При переходе через несколько якорей, например A -> B -> C, settledValue остаётся прежним,
     * пока не достигнет якоря, в то время как currentValue обновляется к ближайшему якорю.
     */
    val settledValue: SwipeToDismissBoxValue
        get() = anchoredDraggableState.settledValue

    /**
     * Направление (если есть), в котором компонент был или сейчас смахивается для скрытия.
     *
     * Используйте это для изменения фона [SwipeToDismissBox], если хотите разные действия
     * с каждой стороны.
     */
    val dismissDirection: SwipeToDismissBoxValue
        get() =
            when {
                offset == 0f || offset.isNaN() -> SwipeToDismissBoxValue.Settled
                offset > 0f -> SwipeToDismissBoxValue.StartToEnd
                else -> SwipeToDismissBoxValue.EndToStart
            }

    /**
     * Устанавливает состояние без анимации и приостанавливает выполнение, пока не установится.
     *
     * @param targetValue Новое целевое состояние.
     * @throws CancellationException если операция была отменена.
     */
    suspend fun snapTo(targetValue: SwipeToDismissBoxValue) {
        anchoredDraggableState.snapTo(targetValue)
    }

    /**
     * Сброс компонента в исходное положение с анимацией и приостановкой, пока сброс не завершится
     * или анимация не будет отменена. Метод выбрасывает [CancellationException], если анимация
     * прервана.
     *
     * @return причина завершения анимации сброса.
     * @throws CancellationException если анимация была отменена.
     */
    suspend fun reset() =
        anchoredDraggableState.animateTo(targetValue = SwipeToDismissBoxValue.Settled)

    /**
     * Скрыть компонент в заданном [direction] с анимацией и приостановкой. Метод выбрасывает
     * [CancellationException], если анимация прервана.
     *
     * @param direction Направление скрытия.
     * @throws CancellationException если анимация была отменена.
     */
    suspend fun dismiss(direction: SwipeToDismissBoxValue) {
        anchoredDraggableState.animateTo(targetValue = direction)
    }

    internal companion object {

        /**
         * Стандартная реализация [saver] для [SwipeToDismissBoxState].
         */
        fun saver(positionalThreshold: (totalDistance: Float) -> Float) =
            Saver<SwipeToDismissBoxState, SwipeToDismissBoxValue>(
                save = { it.currentValue },
                restore = { SwipeToDismissBoxState(it, positionalThreshold) },
            )
    }
}

/**
 * Создаёт и [remember] состояние [SwipeToDismissBoxState].
 *
 * @param initialValue Начальное состояние.
 * @param positionalThreshold Пороговое расстояние, используемое для определения целевого
 * состояния во время свайпа и при завершении жеста. Значение задаётся как расстояние
 * от начальной точки и всегда должно быть положительным.
 */
@Composable
internal fun rememberSwipeToDismissBoxState(
    initialValue: SwipeToDismissBoxValue = SwipeToDismissBoxValue.Settled,
    positionalThreshold: (totalDistance: Float) -> Float = DefaultPositionalThreshold,
): SwipeToDismissBoxState {
    return rememberSaveable(
        saver = SwipeToDismissBoxState.saver(positionalThreshold = positionalThreshold),
    ) {
        SwipeToDismissBoxState(initialValue, positionalThreshold)
    }
}

/**
 * Composable-компонент, который можно скрыть свайпом влево или вправо.
 *
 * @param state Состояние компонента.
 * @param backgroundContent Composable, расположенный позади [content] и показывающийся при свайпе.
 * Используйте [state] для разных фонов с каждой стороны.
 * @param modifier Необязательный [Modifier] для компонента.
 * @param enableDismissFromStartToEnd Разрешить скрытие свайпом с начала в конец.
 * @param enableDismissFromEndToStart Разрешить скрытие свайпом с конца в начало.
 * @param gesturesEnabled Разрешить взаимодействие через жесты свайпа для скрытия.
 * @param onDismiss Опциональный callback, вызываемый при скрытии [content]. Параметр — направление
 * скрытия.
 * @param content Контент, который можно скрыть свайпом.
 */
@Composable
internal fun SwipeToDismissBox(
    state: SwipeToDismissBoxState,
    backgroundContent: @Composable RowScope.() -> Unit,
    modifier: Modifier = Modifier,
    enableDismissFromStartToEnd: Boolean = true,
    enableDismissFromEndToStart: Boolean = true,
    gesturesEnabled: Boolean = true,
    onDismiss: (SwipeToDismissBoxValue) -> Unit = {},
    content: @Composable RowScope.() -> Unit,
) {
    Box(
        modifier = modifier.anchoredDraggable(
            state = state.anchoredDraggableState,
            orientation = Orientation.Horizontal,
            enabled = gesturesEnabled && state.settledValue == SwipeToDismissBoxValue.Settled,
            flingBehavior = AnchoredDraggableDefaults.flingBehavior(
                state = state.anchoredDraggableState,
                positionalThreshold = state.positionalThreshold,
            ),
        ),
        propagateMinConstraints = true,
    ) {
        Row(content = backgroundContent, modifier = Modifier.matchParentSize())
        Row(
            content = content,
            modifier = Modifier
                .graphicsLayer {
                    val offsetX = state.offset
                        .takeIf { it.isFinite() }
                        ?: 0f
                    translationX = offsetX
                }
                .swipeDismissAnchors(state, enableDismissFromStartToEnd, enableDismissFromEndToStart),
        )
    }
    LaunchedEffect(state.settledValue, onDismiss) {
        if (state.settledValue != SwipeToDismissBoxValue.Settled) {
            onDismiss(state.dismissDirection)
        }
    }
}

private val DefaultPositionalThreshold: (totalDistance: Float) -> Float
    @Composable get() = with(LocalDensity.current) { { 56.dp.toPx() } }

private fun Modifier.swipeDismissAnchors(
    state: SwipeToDismissBoxState,
    enableDismissFromStartToEnd: Boolean = true,
    enableDismissFromEndToStart: Boolean = true,
): Modifier = onSizeChanged { size ->
    val newAnchors = DraggableAnchors {
        val width = size.width.toFloat()
        SwipeToDismissBoxValue.Settled at 0f
        if (enableDismissFromStartToEnd) {
            SwipeToDismissBoxValue.StartToEnd at width
        }
        if (enableDismissFromEndToStart) {
            SwipeToDismissBoxValue.EndToStart at -width
        }
    }
    val isInitialized = state.anchoredDraggableState.anchors.size > 0
    val previousValue = state.currentValue
    val targetValue = state.targetValue
    val newTarget =
        if (!isInitialized && newAnchors.hasPositionFor(previousValue)) {
            previousValue
        } else if (newAnchors.hasPositionFor(targetValue)) {
            targetValue
        } else {
            SwipeToDismissBoxValue.Settled
        }

    state.anchoredDraggableState.updateAnchors(newAnchors, newTarget)
}
