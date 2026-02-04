package com.sdds.compose.uikit.overlay

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.core.AnimationConstants
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sdds.compose.uikit.overlay.OverlayManager.Companion.OVERLAY_DURATION_SLOW_MILLIS
import kotlinx.coroutines.flow.StateFlow

/**
 * CompositionLocal c [OverlayManager]
 */
val LocalOverlayManager = staticCompositionLocalOf<OverlayManager> { DefaultOverlayManager() }

/**
 * Режим размещения для [OverlayManager]
 */
enum class OverlayPosition {
    TopStart,
    TopCenter,
    TopEnd,
    CenterStart,
    Center,
    CenterEnd,
    BottomStart,
    BottomCenter,
    BottomEnd,
}

internal fun OverlayPosition.isTop(): Boolean =
    this == OverlayPosition.TopStart || this == OverlayPosition.TopEnd || this == OverlayPosition.TopCenter

internal fun OverlayPosition.isBottom(): Boolean =
    this == OverlayPosition.BottomStart || this == OverlayPosition.BottomEnd || this == OverlayPosition.BottomCenter

internal fun OverlayPosition.isStart(): Boolean =
    this == OverlayPosition.TopStart || this == OverlayPosition.CenterStart || this == OverlayPosition.BottomStart

internal fun OverlayPosition.isCenterVertical(): Boolean =
    this == OverlayPosition.Center || this == OverlayPosition.TopCenter || this == OverlayPosition.BottomCenter

internal fun OverlayPosition.isCenterHorizontal(): Boolean =
    this == OverlayPosition.Center || this == OverlayPosition.CenterStart || this == OverlayPosition.CenterEnd

internal fun OverlayPosition.getAnimationSpec(): OverlayAnimationSpec? {
    return when (this) {
        OverlayPosition.TopStart,
        OverlayPosition.CenterStart,
        OverlayPosition.BottomStart,
        -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInStart,
            exit = OverlayAnimationSpec.SlideOutStart,
        )

        OverlayPosition.TopCenter -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInTop,
            exit = OverlayAnimationSpec.DefaultExitTransition,
        )

        OverlayPosition.BottomCenter -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInBottom,
            exit = OverlayAnimationSpec.DefaultExitTransition,
        )

        OverlayPosition.TopEnd,
        OverlayPosition.CenterEnd,
        OverlayPosition.BottomEnd,
        -> OverlayAnimationSpec(
            enter = OverlayAnimationSpec.SlideInEnd,
            exit = OverlayAnimationSpec.SlideOutEnd,
        )

        else -> null
    }
}

/**
 * Элемент overlay
 *
 * @property id идентификатор элемента
 * @property content контент элемента
 * @property position размещение элемента
 * @property durationMillis время жизни элемента
 * @property visible состояние анимации элемента
 * @property animationSpec настройки анимации элемента
 * @property isFocusable способность быть в фокусе
 */
data class OverlayEntry(
    val id: Long = System.currentTimeMillis(),
    val content: @Composable (Long) -> Unit,
    val position: OverlayPosition = OverlayPosition.TopCenter,
    val durationMillis: Long? = null,
    val visible: MutableTransitionState<Boolean> = MutableTransitionState(false),
    val animationSpec: OverlayAnimationSpec? = null,
    val isFocusable: Boolean = false,
)

/**
 * Настройки анимации элемента overlay
 *
 * @property enter анимация появления
 * @property exit анимация исчезновения
 */
data class OverlayAnimationSpec(
    val enter: EnterTransition = DefaultEnterTransition,
    val exit: ExitTransition = DefaultExitTransition,
) {

    internal companion object {
        const val ANIMATION_DURATION = AnimationConstants.DefaultDurationMillis
        val DefaultEnterTransition = fadeIn(tween(ANIMATION_DURATION))
        val DefaultExitTransition = fadeOut(tween(ANIMATION_DURATION))

        val SlideInTop = DefaultEnterTransition + slideInVertically(tween(ANIMATION_DURATION)) { -it }
        val SlideInBottom = DefaultEnterTransition + slideInVertically(tween(ANIMATION_DURATION)) { it }
        val SlideInStart = DefaultEnterTransition + slideInHorizontally(tween(ANIMATION_DURATION)) { -it }
        val SlideInEnd = DefaultEnterTransition + slideInHorizontally(tween(ANIMATION_DURATION)) { it }

        val SlideOutStart = DefaultExitTransition + slideOutHorizontally(tween(ANIMATION_DURATION)) { -it }
        val SlideOutEnd = DefaultExitTransition + slideOutHorizontally(tween(ANIMATION_DURATION)) { it }
    }
}

/**
 * Менеджер для показа notification, toast и т.д.
 */
interface OverlayManager {

    /**
     * Элементы для отображения
     */
    val overlays: StateFlow<List<OverlayEntry>>

    /**
     * Показывает элемент
     *
     * @param position размещение элемента
     * @param durationMillis время жизни элемента
     * @param animationSpec настройки анимации
     * @param content контент
     *
     * @return идентификатор показанного элемента
     */
    fun show(
        position: OverlayPosition = OverlayPosition.TopCenter,
        durationMillis: Long? = OVERLAY_DURATION_SLOW_MILLIS,
        animationSpec: OverlayAnimationSpec? = null,
        isFocusable: Boolean = false,
        content: @Composable (Long) -> Unit,
    ): Long

    /**
     * Удаляет элемент с идентификатором [id]
     */
    fun remove(id: Long)

    /**
     * Очистить все элементы
     */
    fun clear()

    /**
     * Добавляет слушатель события dismiss
     */
    fun addOnDismissListener(listener: OnDismissListener)

    /**
     * Удаляет слушатель события dismiss
     */
    fun removeOnDismissListener(listener: OnDismissListener)

    /**
     * Показывает элемент [entry]
     * @return возвращает идентификатор [entry]
     */
    fun show(entry: OverlayEntry): Long

    /**
     * Слушатель события отмены/закрытия [OverlayEntry]
     */
    interface OnDismissListener {

        /**
         * Колбэк срабатывания события отмены/закрытия [entry]
         */
        fun onDismiss(entry: OverlayEntry)
    }

    companion object {
        /**
         * Время жизни 3 сек.
         */
        const val OVERLAY_DURATION_SLOW_MILLIS = 3000L

        /**
         * Время жизни 1 сек.
         */
        const val OVERLAY_DURATION_FAST_MILLIS = 1000L
    }
}

/**
 * Показывает toast
 *
 * @param position размещение toast
 * @param durationMillis время жизни toast
 * @param animationSpec настройки анимации
 * @param content контент toast
 */
fun OverlayManager.showToast(
    onDismiss: (Long) -> Unit,
    position: OverlayPosition = OverlayPosition.BottomCenter,
    durationMillis: Long? = OVERLAY_DURATION_SLOW_MILLIS,
    animationSpec: OverlayAnimationSpec? = null,
    content: @Composable (Long) -> Unit,
): Long {
    val animation = animationSpec ?: position.getAnimationSpec()
    val entryToShow = OverlayEntry(
        position = position,
        durationMillis = durationMillis,
        animationSpec = animation,
        isFocusable = false,
        content = content,
    )
    addOnDismissListener(
        object : OverlayManager.OnDismissListener {
            override fun onDismiss(entry: OverlayEntry) {
                if (entryToShow.id == entry.id) {
                    onDismiss(entry.id)
                    removeOnDismissListener(this)
                }
            }
        },
    )
    return show(entryToShow)
}

/**
 * Показывает toast
 *
 * @param position размещение toast
 * @param durationMillis время жизни toast
 * @param animationSpec настройки анимации
 * @param content контент toast
 */
fun OverlayManager.showToast(
    position: OverlayPosition = OverlayPosition.BottomCenter,
    durationMillis: Long? = OVERLAY_DURATION_SLOW_MILLIS,
    animationSpec: OverlayAnimationSpec? = null,
    content: @Composable (Long) -> Unit,
): Long {
    val animation = animationSpec ?: position.getAnimationSpec()
    return show(
        position = position,
        durationMillis = durationMillis,
        animationSpec = animation,
        isFocusable = false,
        content = content,
    )
}

/**
 * Показывает notification
 *
 * @param position размещение notification
 * @param durationMillis время жизни notification
 * @param animationSpec настройки анимации
 * @param content контент notification
 */
fun OverlayManager.showNotification(
    onDismiss: (Long) -> Unit,
    position: OverlayPosition = OverlayPosition.BottomEnd,
    durationMillis: Long? = OVERLAY_DURATION_SLOW_MILLIS,
    animationSpec: OverlayAnimationSpec? = null,
    isFocusable: Boolean = false,
    content: @Composable (Long) -> Unit,
): Long {
    val animation = animationSpec ?: position.getAnimationSpec()
    val entryToShow = OverlayEntry(
        position = position,
        durationMillis = durationMillis,
        animationSpec = animation,
        isFocusable = isFocusable,
        content = content,
    )
    addOnDismissListener(
        object : OverlayManager.OnDismissListener {
            override fun onDismiss(entry: OverlayEntry) {
                if (entryToShow.id == entry.id) {
                    onDismiss(entry.id)
                    removeOnDismissListener(this)
                }
            }
        },
    )
    return show(entryToShow)
}

/**
 * Показывает notification
 *
 * @param position размещение notification
 * @param durationMillis время жизни notification
 * @param animationSpec настройки анимации
 * @param content контент notification
 */
fun OverlayManager.showNotification(
    position: OverlayPosition = OverlayPosition.BottomEnd,
    durationMillis: Long? = OVERLAY_DURATION_SLOW_MILLIS,
    animationSpec: OverlayAnimationSpec? = null,
    isFocusable: Boolean = false,
    content: @Composable (Long) -> Unit,
): Long {
    val animation = animationSpec ?: position.getAnimationSpec()
    return show(
        position = position,
        durationMillis = durationMillis,
        animationSpec = animation,
        isFocusable = isFocusable,
        content = content,
    )
}

/**
 * Создает и запоминает [OverlayManager]
 */
@Composable
fun overlayManager(lifecycle: OverlayManagerLifecycle = OverlayManagerLifecycle.ViewModelScoped): OverlayManager {
    return when (lifecycle) {
        OverlayManagerLifecycle.ComposableScoped -> {
            val scope = rememberCoroutineScope()
            remember { DefaultOverlayManager(scope) }
        }

        OverlayManagerLifecycle.ViewModelScoped -> {
            viewModel { ViewModelBasedOverlayManager() }
        }
    }
}

/**
 * Жизненный цикл [OverlayManager]
 */
enum class OverlayManagerLifecycle {
    ComposableScoped,
    ViewModelScoped,
}
