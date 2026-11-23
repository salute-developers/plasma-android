package com.sdds.uikit.internal.focusselector

import android.view.View

/**
 * Возвращает копию этого drawable state без [android.R.attr.state_focused], если окно [view]
 * не имеет фокуса ([View.hasWindowFocus]); иначе возвращает этот же массив без изменений.
 *
 * State-массив вью хранит только положительные id включённых состояний (см. android.util.StateSet),
 * поэтому «сообщить о потере фокуса» — значит удалить запись [android.R.attr.state_focused]:
 * после этого пункты селекторов с state_focused="true" перестают матчиться, а state_focused="false" —
 * начинают, и все фокусные подсветки (фон/текст/рамка/stateListAnimator) гаснут синхронно.
 *
 * Исходный массив не мутируется: базовый View может возвращать общий закэшированный массив
 * состояний из android.util.StateSet. Пустые (нулевые) элементы, оставшиеся от
 * [View.mergeDrawableStates], в копии отбрасываются.
 *
 * [View.isInEditMode] исключает подавление в превью разметки, где окно недоступно по определению.
 */
internal fun IntArray.withoutFocusedIfWindowUnfocused(view: View): IntArray {
    if (view.isInEditMode || view.hasWindowFocus()) return this
    if (indexOf(android.R.attr.state_focused) < 0) return this
    return filter { it != 0 && it != android.R.attr.state_focused }.toIntArray()
}
