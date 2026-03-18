package com.sdds.sandbox

import android.content.Context
import android.view.ContextThemeWrapper
import android.view.FocusFinder
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.compose.foundation.focusGroup
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.key
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import com.sdds.compose.sandbox.ComposeBaseStory

/**
 * Абстрактный базовый класс для создания историй [View] компонентов в Compose-сторибуке.
 *
 * Предоставляет инфраструктуру для управления состоянием, стилями и отображением
 * компонентов в интерактивной среде разработки. Автоматически интегрируется с
 * ViewModel и системой Scaffold для обеспечения работы панели управления свойствами.
 *
 * @param State тип состояния пользовательского интерфейса, который должен реализовывать [UiState]
 * @param V тип компонента, должен наследоваться от [View]
 *
 * @param component уникальный ключ компонента для идентификации в сторибуке
 * @param defaultState начальное состояние истории
 * @param propertiesProducer провайдер свойств для генерации настраиваемых параметров
 *                          в панели управления. По умолчанию создается из [defaultState]
 * @param stateTransformer трансформер для обработки изменений состояния.
 *                         По умолчанию создается из [defaultState]
 *
 * @see BaseStory
 * @see ComposeBaseStory
 */
abstract class ViewBaseStory<State : UiState, V : View>(
    override val component: ComponentKey,
    override val defaultState: State,
    override val propertiesProducer: PropertiesProducer<State> = defaultState.producer(),
    override val stateTransformer: StateTransformer<State> = defaultState.transformer(),
) : ComposeBaseStory<State, ViewStyle>(component, defaultState, propertiesProducer, stateTransformer) {

    @Composable
    override fun BoxScope.Content(
        style: ViewStyle,
        state: State,
    ) {
        var forceRecreateToken by remember(style) { mutableIntStateOf(0) }
        LaunchedEffect(state) {
            if (shouldRecreateComponentOnStateUpdate(state)) {
                forceRecreateToken++
            }
        }
        key(style, forceRecreateToken) {
            AndroidView(
                modifier = Modifier.focusGroup(),
                factory = { ctx ->
                    val content = getComponent(ContextThemeWrapper(ctx, style.res))
                    FocusLockedHost(ctx).apply {
                        setContent(content)
                    }
                },
                update = { view ->
                    @Suppress("UNCHECKED_CAST")
                    onComponentUpdate(view.requireContent() as V, state)
                },
            )
        }
    }

    /**
     * Функция, создающая компонент [V]
     * @param context контекст, с переопределенным стилем компонента [V]
     */
    abstract fun getComponent(context: Context): V

    /**
     * Функция, обновляющая компонент [V] при помощи состояния [State]
     * @param component компонент [V]
     * @param state состояние компонент [State]
     */
    abstract fun onComponentUpdate(component: V, state: State)

    /**
     * Функция позволяет решить, нужно ли пересоздать компонент при изменении [state]
     * По умолчанию false
     */
    open fun shouldRecreateComponentOnStateUpdate(state: State): Boolean = false
}

/**
 * Системы фокусов Compose и View конфликтуют, поэтому созданна данная обертка.
 * [FocusLockedHost] блокирует преждевременное снятие фокуса
 */
private class FocusLockedHost(
    context: Context,
) : FrameLayout(context) {

    init {
        descendantFocusability = ViewGroup.FOCUS_AFTER_DESCENDANTS
        isFocusable = false
        isFocusableInTouchMode = false
        clipChildren = false
        clipToPadding = false
    }

    fun setContent(view: View) {
        removeAllViews()
        addView(
            view,
            LayoutParams(
                LayoutParams.WRAP_CONTENT,
                LayoutParams.WRAP_CONTENT,
            ),
        )
    }

    fun requireContent(): View = getChildAt(0)
        ?: error("FocusLockedHost has no content")

    override fun focusSearch(focused: View?, direction: Int): View? {
        if (focused != null && isDescendant(focused)) {
            val internalNext = FocusFinder.getInstance().findNextFocus(this, focused, direction)
            if (internalNext != null && internalNext !== focused && isDescendant(internalNext)) {
                return internalNext
            }
        }
        return super.focusSearch(focused, direction)
    }

    @Suppress("NestedBlockDepth")
    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        if (event.action == KeyEvent.ACTION_DOWN) {
            val direction = event.toFocusDirection()
            if (direction != null) {
                val focused = findFocus()
                if (focused != null && focused !== this && isDescendant(focused)) {
                    val internalNext = FocusFinder.getInstance().findNextFocus(this, focused, direction)
                    if (internalNext != null && internalNext !== focused && isDescendant(internalNext)) {
                        return internalNext.requestFocus()
                    }
                }
            }
        }
        return super.dispatchKeyEvent(event)
    }

    private fun isDescendant(view: View): Boolean {
        var current: View? = view
        while (current != null) {
            if (current === this) return true
            current = (current.parent as? View)
        }
        return false
    }

    private fun KeyEvent.toFocusDirection(): Int? = when (keyCode) {
        KeyEvent.KEYCODE_DPAD_LEFT -> View.FOCUS_LEFT
        KeyEvent.KEYCODE_DPAD_RIGHT -> View.FOCUS_RIGHT
        KeyEvent.KEYCODE_DPAD_UP -> View.FOCUS_UP
        KeyEvent.KEYCODE_DPAD_DOWN -> View.FOCUS_DOWN
        else -> null
    }
}
