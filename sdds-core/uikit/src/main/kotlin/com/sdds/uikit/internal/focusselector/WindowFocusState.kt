package com.sdds.uikit.internal.focusselector

import android.view.View

/**
 * Возвращает копию drawable state [this] без [android.R.attr.state_focused], если окно
 * не имеет фокуса ([hasWindowFocus]); иначе возвращает этот же массив без изменений.
 *
 * State-массив вью хранит только положительные id включённых состояний (см. android.util.StateSet),
 * поэтому «сообщить о потере фокуса» — значит удалить запись [android.R.attr.state_focused]:
 * после этого пункты селекторов с state_focused="true" перестают матчиться, а state_focused="false" —
 * начинают, и все фокусные подсветки (фон/текст/рамка/stateListAnimator) гаснут синхронно.
 *
 * Исходный массив не мутируется: базовый View может возвращать общий закэшированный массив
 * состояний из android.util.StateSet.
 *
 * Хвостовые нули — зарезервированная через onCreateDrawableState(extraSpace) ёмкость:
 * [View.mergeDrawableStates] пишет новые состояния в-плейс в эти слоты. Классы, чей
 * onCreateDrawableState мержит свои состояния ПОСЛЕ возврата из фильтрующего родителя
 * (Avatar, Note, SegmentItem, ListView и др.), при удалении нулей пишут за границу массива
 * (ArrayIndexOutOfBoundsException), поэтому нули в копии сохраняются.
 *
 * Функция чистая (зависимости от [View] вынесены в вызывающий код) — тестируется на JVM без Robolectric.
 * [isInEditMode] исключает подавление в превью разметки, где окно недоступно по определению.
 */
internal fun IntArray.withoutFocusedIfWindowUnfocused(isInEditMode: Boolean, hasWindowFocus: Boolean): IntArray {
    if (isInEditMode || hasWindowFocus) return this
    if (indexOf(android.R.attr.state_focused) < 0) return this
    return filter { it != android.R.attr.state_focused }.toIntArray()
}

/**
 * Эффективное фокусное состояние для scale-анимации — второго «привода» фокуса,
 * не завязанного на drawable state.
 *
 * При включённой реактивности ([windowFocusResponsive]) компонент считается в фокусе
 * только когда фокус вью совпадает с фокусом окна — тот же критерий, что
 * [withoutFocusedIfWindowUnfocused] применяет к фону/рамке. Иначе программный
 * [View.requestFocus] под другим окном увеличил бы компонент, оставив фон/рамку не
 * подсвеченными («полуфокус»). При выключенном флаге равно [focused] (историческое поведение).
 */
internal fun effectiveFocus(windowFocusResponsive: Boolean, hasWindowFocus: Boolean, focused: Boolean): Boolean =
    focused && (!windowFocusResponsive || hasWindowFocus)

/**
 * Инфраструктурная обвязка [effectiveFocus] для компонентов: читает флаг из настроек
 * селектора фокуса и фокус окна у [view].
 */
internal fun HasFocusSelector.effectiveFocus(view: View, focused: Boolean): Boolean =
    effectiveFocus(settings.windowFocusResponsive, view.hasWindowFocus(), focused)
